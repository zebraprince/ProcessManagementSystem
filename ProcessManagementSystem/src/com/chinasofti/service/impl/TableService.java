package com.chinasofti.service.impl;

import java.util.List;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.service.IMService;
import com.chinasofti.service.ITableService;
import com.chinasofti.service.workflow.IFirInfoService;
import com.chinasofti.service.workflow.action.FirInfoService;
import com.sun.java_cup.internal.internal_error;

public class TableService implements ITableService{
	
	
	public List<List<String>> getTableInfo(int i,int j){
		IFirInfoService infoService=new FirInfoService();
		List<List<String>> list=infoService.getFirInfo(i,j);
		
		return list;
	}
	
	
	
	
}
