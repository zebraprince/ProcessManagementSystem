package com.chinasofti.service.impl;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.domain.Project;
import com.chinasofti.service.IShenqingliebiaoService;

import java.util.*;
public class ShenqingliebiaoService implements IShenqingliebiaoService{
	private ProjectDAO projectDAO;

	public void setProjectDAO(ProjectDAO projectDAO) {
		this.projectDAO = projectDAO;
	}

	public List<List<String>> getAllInfo(int uid) {
		List<List<String>> resultList = new ArrayList<List<String>>();

		List<Project> projectList = projectDAO.findByUid(uid);
		for (int i = 0; i <projectList.size(); i++) {

			List<String> tempList = new ArrayList<String>();

			tempList.add(String.valueOf(projectList.get(i).getPid()));
			tempList.add(String.valueOf(projectList.get(i).getPname()));
			tempList.add(String.valueOf(projectList.get(i).getFirdate()));
			tempList.add(String.valueOf(projectList.get(i).getState()));

			resultList.add(tempList);

		}

		return resultList;
	}

}
