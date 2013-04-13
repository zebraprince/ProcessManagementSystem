import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.sun.java_cup.internal.internal_error;


public class TestFile1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*File file=new File("E:/workspace");
      File[] files=file.listFiles();
      for(int i=0;i<files.length;i++)
    	  System.out.println(files[i].getName());*/
	 /* File[] files=bianli("E:/workspace").toArray(File[]);
	  for(int i=0;i<files.length;i++)
    	  System.out.println(files[i].getName());*/
		List<File> arrayList=bianli("E:/workspace");
		
		for(int i=0;i<arrayList.size();i++)
			System.out.println(arrayList.get(i).getName());
	  
	  
	}
    public static List<File> bianli(String basicpath){
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
