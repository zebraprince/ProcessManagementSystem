package com.chinasofti.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.domain.Project;
import com.chinasofti.service.ITechProService;
import com.chinasofti.web.struts.form.TechForm;
import com.chinasofti.web.struts.form.User1Form;
import com.chinasofti.web.struts.form.UserForm;
import com.sun.java_cup.internal.internal_error;

public class TechProService implements ITechProService {
	 
	private final int CompanyNum = 3;
	
	private ProjectDAO projectDAO= new ProjectDAO();
	
	public ProjectDAO getProjectDAO(){
		return projectDAO;
	}
	
	public void setProjectDAO(ProjectDAO dao){
		projectDAO = dao;
	}
	
	public String doChange(String str){
		
		if(Integer.parseInt(str)<=9)
			str = "0" + str;
		
		return str;
	}
	
	public List<Project> showProject() {

		List<Project> list = projectDAO.findAll();
		return list;
	}
	
	public String[] getDateStrings(String sDate, String eDate, int flag){
		
		List<Project> lsPro = showProject();
		int size = lsPro.size();
		List<String> lsDate = new ArrayList<String>();
		List<String> strDate = new ArrayList<String>();
		
		if(flag==0)
			for(int i = size-1; i>=0; i--)
				if((lsPro.get(i).getStartdate())!=null)
					lsDate.add(lsPro.get(i).getStartdate());
		
		if(flag==1)
			for(int i = size-1; i>=0; i--)
				lsDate.add(lsPro.get(i).getFoupasdate());
		
		int newSize = lsDate.size();
		
		for(int j = newSize-1; j>=0; j--){
			if(lsDate.size()!=0){
			String str = lsDate.get(j);
			if((str!=null) && (str.compareTo(sDate)>=0) && (str.compareTo(eDate)<=0))
				strDate.add(str);
			}
		}
		
		String[] wanted = new String[strDate.size()];
		wanted = strDate.toArray(wanted);
		
		return wanted;
	}
	
	public int[] schForBlock(User1Form form){
		
		//wanted, 0 for companyA, 1 for companyB, 2 for companyC
		int[] wanted = new int[CompanyNum];
		
		String sMonth = doChange(form.getUmonth());
		String sDay = doChange(form.getUday());
		String eMonth = doChange(form.getUemonth());
		String eDay = doChange(form.getUeday());
		String sDate = form.getUyear() + sMonth + sDay;
		String eDate = form.getUeyear() + eMonth + eDay;
		
		String[] wantedStr = getDateStrings(sDate, eDate, 0);
		int size = wantedStr.length;
		List<Project> list = new ArrayList<Project>();
		List<Project> tempList = new ArrayList<Project>();
		
		for(int i = size-1; i>=0; i--){
			tempList = projectDAO.findByStartdate(wantedStr[i]);
			list = union(tempList , list);
		}
		
		for(int i = CompanyNum-1, j = CompanyNum; i>=0; i--, j--){
			tempList = projectDAO.findByB("" + j);
			tempList = mergeList(tempList, list);
			wanted[i] = tempList.size();
		}
		
		return wanted;
	}
	
	public int[] schForCircle(UserForm form){
		
		int[] wanted = new int[CompanyNum];
		
		String type = form.getReftype();
		int typeInt = Integer.parseInt(type);
		String tempYear = form.getRefyear();
		
		String sDate = tempYear + "0101";
		String eDate = tempYear + "1231";
		
		String[] allDate = getDateStrings(sDate, eDate, 1);
		int size = allDate.length;
		List<Project> list = new ArrayList<Project>();
		List<Project> tempList = new ArrayList<Project>();
		
		for(int i = size-1; i>=0; i--){
			tempList = projectDAO.findByFoupasdate(allDate[i]);
			list = union(tempList , list);
		}

		tempList = projectDAO.findByFirtype(typeInt);
		list = mergeList(list, tempList);
		
		for(int i = CompanyNum-1, j = CompanyNum; i>=0; i--, j--){
			tempList = projectDAO.findByB(j +"");
			tempList = mergeList(tempList, list);
			wanted[i] = tempList.size();
		}
		
		return wanted;
	}
	
	/* (non-Javadoc)
	 * @see com.chinasofti.service.impl.ITechProService#search(com.chinasofti.web.struts.form.TechForm)
	 */
	public List search(TechForm form){
		
		String setime = form.getSetime();
		String sname = form.getSname();
		String suname = form.getSuname();
		String smodle = form.getSmodle();
		String stype = form.getStype();
		String stime = form.getStime();
		
		List l1 = new ArrayList();
		List list = new ArrayList();
		
		if(stime!=""){
			l1 = projectDAO.findByFirdate(stime);
			if(l1.size()==0)
				return l1;
			else {
				if(list.size()!=0)
					list = mergeList(list, l1);
				else 
					list = l1;
			}
		}
		
		if(sname!=""){
			l1 = projectDAO.findByPname(sname);
			if(l1.size()==0)
				return l1;
			else {
				if(list.size()!=0)
					list = mergeList(list, l1);
				else 
					list = l1;
			}
		}
		
		if(suname!=""){
			l1 = projectDAO.findByA(suname);
			if(l1.size()==0)
				return l1;
			else {
				if(list.size()!=0)
					list = mergeList(list, l1);
				else 
					list = l1;
			}
		}
		
		if(stype!=""){
			l1 = projectDAO.findByFirtype(Integer.parseInt(stype));
			if(l1.size()==0)
				return l1;
			else {
				if(list.size()!=0)
					list = mergeList(list, l1);
				else 
					list = l1;
			}
		}
		
		if(smodle!=""){
			l1 = projectDAO.findByState(Integer.parseInt(smodle));
			if(l1.size()==0)
				return l1;
			else {
				if(list.size()!=0)
					list = mergeList(list, l1);
				else 
					list = l1;
			}
		}
		
		if(setime!=""){
			l1 = projectDAO.findByFirpasdate(setime);
			l1 = union(l1, projectDAO.findBySecpasdate(setime));
			l1 = union(l1, projectDAO.findByThipasdate(setime));
			l1 = union(l1, projectDAO.findByFoupasdate(setime));
			l1 = union(l1, projectDAO.findByFivpasdate(setime));
			
			if(l1.size()==0)
				return l1;
			else {
				if(list.size()!=0)
					list = mergeList(list, l1);
				else 
					list = l1;
			}
		}

		return list;
	}
	
	public List mergeList(List l1, List l2){
		
		List list = new ArrayList();
		int size1 = l1.size();
		int size2 = l2.size();
		
		for(int i = size1-1; i>=0; i--)
			for(int j = size2-1; j>=0; j--)
				if (((Project)l1.get(i)).equals((Project)l2.get(j))){
					list.add(l1.get(i));
					System.out.println(((Project)l1.get(i)).getPid());
				}
		
		return list;
	}
	
	public List union(List l1, List l2){
		
		int size1 = l1.size();
		int size2 = l2.size();
		List list = new ArrayList();
		
		if(size1==0)
			return l2;
		else{
		for(int i = size1-1; i>=0; i--)
			list.add(l1.get(i));
		
		for(int j = size2-1; j>=0; j--){
			boolean flag = false;
			for(int k = size1-1; k>=0; k--){
				if(((Project)l1.get(k)).equals((Project)l2.get(j))){
					flag = true;
					break;
				}
			}
			if(!flag)
				list.add(l2.get(j));
		}
	}
		return list;
	}
}
