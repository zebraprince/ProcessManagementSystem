package com.chinasofti.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.sun.java_cup.internal.internal_error;


public class getLoad {
	public static   List<String> getFile(String s){
	
	File f=new File(s);
	File ss [] =f.listFiles();
	List<String> nameList = new ArrayList();
	for(int i=0;i<ss.length;i++){
		nameList.add(ss[i].getName());
	}
	
	
	return nameList;
	}
	
	
	public static void   delFile(String s,String s1){
		String sx= s.concat("/");
		String st = sx.concat(s1);
		File f=new File(st);
		f.delete();
	
		
		
		
		}
	public static void   delFiles(String s,String s1){
		String sx= s.concat("/");
		StringTokenizer wanted = new StringTokenizer(s1, ",");
		int size = wanted.countTokens();
		String[] str = new String[size];
		for(size = size-1; size>=0; size--)
			str[size] = wanted.nextToken();
		for(int i=str.length-1; i>=0; i--){
			
		File f=new File(s+"/"+str[i]);
		f.delete();
		}
		
		
		
		}
  //public static void main(String[] args) {
	//getLoad gl = new getLoad();
	// gl.delFiles("D:/apache-tomcat-6.0.14/webapps/technologyapprove/upload","1.gif,12.bmp,15.bmp");

   //}
}

