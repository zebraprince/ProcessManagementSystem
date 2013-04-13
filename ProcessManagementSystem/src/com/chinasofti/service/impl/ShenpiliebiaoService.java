package com.chinasofti.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.domain.Project;
import com.chinasofti.service.IShenpiliebiaoService;

public class ShenpiliebiaoService implements IShenpiliebiaoService{
	private ProjectDAO projectDAO;

	public void setProjectDAO(ProjectDAO projectDAO) {
		this.projectDAO = projectDAO;
	}

	@SuppressWarnings("unchecked")
	public List<List<String>> getInfo(int uid, int state) {
		List<List<String>> resultList = new ArrayList<List<String>>();

		if (state == 1) {

			List<String> tempList = new ArrayList<String>();

			List<Project> proList = projectDAO.findByFirfirId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findBySecfirId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findByThifirId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findByFoufirId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findByFivfirId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

		} else if (state == 2) {

			List<String> tempList = new ArrayList<String>();

			List<Project> proList = projectDAO.findByFirsecId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findBySecsecId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findByThisecId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findByFousecId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findByFivsecId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

		} else if (state == 3) {

			List<String> tempList = new ArrayList<String>();

			List<Project> proList = projectDAO.findByFirthiId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findBySecthiId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findByThithiId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findByFouthiId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findByFivthiId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

		}

		else if (state == 4) {

			List<String> tempList = new ArrayList<String>();

			List<Project> proList = projectDAO.findByFirfouId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findBySecfouId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findByThifouId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findByFoufouId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findByFivfouId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

		} else if (state == 5) {

			List<String> tempList = new ArrayList<String>();

			List<Project> proList = projectDAO.findByFirfivId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findBySecfivId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findByThifivId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findByFoufivId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

			tempList = new ArrayList<String>();
			proList = projectDAO.findByFivfivId(uid);
			for (int i = 0; i < proList.size(); i++) {
				Project tempProject = proList.get(i);
				tempList.add(String.valueOf(tempProject.getPid()));
				tempList.add(String.valueOf(tempProject.getPname()));
				tempList.add(String.valueOf(tempProject.getFirdate()));
				//根据需要可以继续加信息
				resultList.add(tempList);
			}

		}

		return resultList;

	}

}
