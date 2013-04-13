package com.chinasofti.service.impl;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.domain.Project;
import com.chinasofti.service.IShenpiLookupService;
import com.chinasofti.web.struts.form.LookupForm;
import com.sun.java_cup.internal.internal_error;

public class ShenpiLookupService implements IShenpiLookupService{
    private ProjectDAO projectDAO;
    public void setProjectDAO(ProjectDAO projectDAO){
    	this.projectDAO=projectDAO;
    }
	public String[] lookup(LookupForm lookupForm) {
		int  pid=Integer.parseInt(lookupForm.getPid());
		int  item=Integer.parseInt(lookupForm.getItem());
		int  state=Integer.parseInt(lookupForm.getRank());
		String[] strings=new String[3];
		strings[0]=String.valueOf(pid);
		strings[1]=lookupForm.getPname();
	    strings[2]=getInfo(pid, item, state);
			return strings;

		}
	public String getInfo(int pid, int item, int state) {

		Project project = projectDAO.findById(pid);
		String resultString = "";

		if (item == 1) {
			resultString += "项目申请人:" + project.getA() + "\n";
			resultString += "项目所需时间:" + project.getFirtime() + "\n";
			resultString += "项目类型:" + project.getFirtype() + "\n";
			resultString += "申报经费：" + project.getFircost() + "\n";
			resultString += "立项目的以及内容" + project.getFirgoal() + "\n";

			if (state == 1) {

			} else if (state == 2) {

				resultString += "分公司科长审批意见:" + project.getFirfirop() + "\n";

			} else if (state == 3) {
				resultString += "分公司科长审批意见:" + project.getFirfirop() + "\n";
				resultString += "分公司领导审批意见：" + project.getFirsecop() + "\n";
			} else if (state == 4) {
				resultString += "分公司科长审批意见:" + project.getFirfirop() + "\n";
				resultString += "分公司领导审批意见：" + project.getFirsecop() + "\n";
				resultString += "总公司工作人员审批意见：" + project.getFirthiop() + "\n";
			} else if (state == 5) {
				resultString += "分公司科长审批意见:" + project.getFirfirop() + "\n";
				resultString += "分公司领导审批意见：" + project.getFirsecop() + "\n";
				resultString += "总公司工作人员审批意见：" + project.getFirthiop() + "\n";
				resultString += "总公司科长审批意见：" + project.getFirfouop() + "\n";
			}
		}

		else if (item == 2) {
			resultString += "项目申请人：" + project.getA() + "\n";
			resultString += "承担单位：" + project.getSuffer() + "\n";
			resultString += "协作单位：" + project.getCoo() + "\n";
			resultString += "合同开始时间：" + project.getStartdate() + "\n";
			resultString += "合同结束时间" + project.getEnddate() + "\n";
			resultString += "甲方项目负责人：" + project.getPersonA() + "\n";
			resultString += "乙方项目负责人：" + project.getPersonB() + "\n";
			resultString += "预计投资：" + project.getProinvest() + "\n";
			resultString += "支付情况：" + project.getCostrep() + "\n";

			if (state == 1) {

			} else if (state == 2) {

				resultString += "分公司科长审批意见:" + project.getSecfirop() + "\n";

			} else if (state == 3) {
				resultString += "分公司科长审批意见:" + project.getSecfirop() + "\n";
				resultString += "分公司领导审批意见：" + project.getSecsecop() + "\n";
			} else if (state == 4) {
				resultString += "分公司科长审批意见:" + project.getSecfirop() + "\n";
				resultString += "分公司领导审批意见：" + project.getSecsecop() + "\n";
				resultString += "总公司工作人员审批意见：" + project.getSechtiop() + "\n";
			} else if (state == 5) {
				resultString += "分公司科长审批意见:" + project.getSecfirop() + "\n";
				resultString += "分公司领导审批意见：" + project.getSecsecop() + "\n";
				resultString += "总公司工作人员审批意见：" + project.getSechtiop() + "\n";
				resultString += "总公司科长审批意见：" + project.getSecfouop() + "\n";
			}

		} else if (item == 3) {
			resultString += "项目申请人：" + project.getA() + "\n";
			resultString += "支付情况：" + project.getCostrep() + "\n";
			resultString += "完成进度：" + project.getProrep() + "\n";

			if (state == 1) {

			} else if (state == 2) {

				resultString += "分公司科长审批意见:" + project.getThifirop() + "\n";

			} else if (state == 3) {
				resultString += "分公司科长审批意见:" + project.getThifirop() + "\n";
				resultString += "分公司领导审批意见：" + project.getThisecop() + "\n";
			} else if (state == 4) {
				resultString += "分公司科长审批意见:" + project.getThifirop() + "\n";
				resultString += "分公司领导审批意见：" + project.getThisecop() + "\n";
				resultString += "总公司工作人员审批意见：" + project.getThithiop() + "\n";
			} else if (state == 5) {
				resultString += "分公司科长审批意见:" + project.getThifirop() + "\n";
				resultString += "分公司领导审批意见：" + project.getThisecop() + "\n";
				resultString += "总公司工作人员审批意见：" + project.getThithiop() + "\n";
				resultString += "总公司科长审批意见：" + project.getThifouop() + "\n";
			}

		} else if (item == 4) {
			// resultString+="项目申请人："+project.getA()+"\n";
			// resultString+="支付情况："+project.getCostrep()+"\n";
			// resultString+="完成进度："+project.getProrep()+"\n";

			if (state == 1) {

			} else if (state == 2) {

				resultString += "分公司科长审批意见:" + project.getFoufirop() + "\n";

			} else if (state == 3) {
				resultString += "分公司科长审批意见:" + project.getFoufirop() + "\n";
				resultString += "分公司领导审批意见：" + project.getFousecop() + "\n";
			} else if (state == 4) {
				resultString += "分公司科长审批意见:" + project.getFoufirop() + "\n";
				resultString += "分公司领导审批意见：" + project.getFousecop() + "\n";
				resultString += "总公司工作人员审批意见：" + project.getFouthiop() + "\n";
			} else if (state == 5) {
				resultString += "分公司科长审批意见:" + project.getFoufirop() + "\n";
				resultString += "分公司领导审批意见：" + project.getFousecop() + "\n";
				resultString += "总公司工作人员审批意见：" + project.getFouthiop() + "\n";
				resultString += "总公司科长审批意见：" + project.getFoufouop() + "\n";
			}

		} else if (item == 5) {
			resultString += "项目申请人：" + project.getA() + "\n";
			resultString += "项目奖励级别：" + project.getDegree() + "\n";
			// resultString+="支付情况："+project.getCostrep()+"\n";
			// resultString+="完成进度："+project.getProrep()+"\n";

			if (state == 1) {

			} else if (state == 2) {

				resultString += "分公司科长审批意见:" + project.getFivfirop() + "\n";

			} else if (state == 3) {
				resultString += "分公司科长审批意见:" + project.getFivfirop() + "\n";
				resultString += "分公司领导审批意见：" + project.getFivsecop() + "\n";
			} else if (state == 4) {
				resultString += "分公司科长审批意见:" + project.getFivfirop() + "\n";
				resultString += "分公司领导审批意见：" + project.getFivsecop() + "\n";
				resultString += "总公司工作人员审批意见：" + project.getFivthiop() + "\n";
			} else if (state == 5) {
				resultString += "分公司科长审批意见:" + project.getFivfirop() + "\n";
				resultString += "分公司领导审批意见：" + project.getFivsecop() + "\n";
				resultString += "总公司工作人员审批意见：" + project.getFivthiop() + "\n";
				resultString += "总公司科长审批意见：" + project.getFivfouop() + "\n";
			}

		}

		return resultString;
	}

}
