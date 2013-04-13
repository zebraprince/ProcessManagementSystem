import java.io.File;
import java.util.ArrayList;

import com.sun.java_cup.internal.internal_error;


public class testFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file=new File("E:/apache-tomcat-6.0.14/webapps/technologyapprove/upload");
		File[] mFiles=file.listFiles();
		for(int i=0;i<mFiles.length;i++){
			System.out.println(mFiles[i].getName());
			
			double d=mFiles[i].length()/1024.0;
			double m=Math.pow(10,2);
			double result=Math.round(d*m)/m;
			System.out.println(result+"KB");
			
		}
			
		

	}

	
}
