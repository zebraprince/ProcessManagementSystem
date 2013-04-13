package com.chinasofti.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileService {
	public List<File> bianli(String basicpath){
    	List<File> list=new ArrayList<File>();
    	File file=new File(basicpath);
    	
    	  File[] files=file.listFiles();
    	for(int i=0;i<files.length;i++){
    		File mFile=files[i];
    		if(mFile.isFile()) list.add(mFile);
    		else{
    			
    			list.addAll(bianli(basicpath+"/"+mFile.getName()));
    		}
    	}
    	 return list;
    }
}
