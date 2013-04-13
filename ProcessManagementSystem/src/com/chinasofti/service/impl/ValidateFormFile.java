package com.chinasofti.service.impl;

import org.apache.struts.upload.FormFile;   

public class ValidateFormFile {   
 /*      
    public boolean validate(FormFile f){   
           
        boolean b=false;   
           
        if(validateName(f)&&validateSize(f)){   
               
            b=true;   
               
        }   
           
           
        return b;   
    }   */
       
       
    public boolean validateName(FormFile f){   
           
        boolean b=false;   
           
        String fileName=f.getFileName();   
           
        fileName=fileName.substring(fileName.lastIndexOf('.')+1, fileName.length());   
           
        String[] extension=new String[]{"pdf","doc","docx","txt","rar"};   
           
        int i=0;   
        for(i=0;i<extension.length;i++){   
               
            if(fileName.equalsIgnoreCase(extension[i])){   
                break;   
            }   
               
        }   
           
        if(i<extension.length){   
               
            b=true;   
        }   
           
        return b;   
    }   
  
    public boolean validateSize(FormFile f){   
           
        boolean b=false;   
           
        int size=f.getFileSize();   
           
        int maxSize=1024*1024*5;   
           
        if(size>0&&size<=maxSize){   
            b=true;   
        }   
           
        return b;   
           
    }   
       
}  
