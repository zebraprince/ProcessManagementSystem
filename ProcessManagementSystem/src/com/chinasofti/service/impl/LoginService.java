package com.chinasofti.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.chinasofti.dao.UserDAO;
import com.chinasofti.domain.User;
import java.util.List;
import com.chinasofti.service.ILoginService;
import com.chinasofti.web.struts.form.LoginForm;


@Transactional
public class LoginService implements ILoginService {

	
	public void saveUser(User user) {
		//保存用户
		userDAO.save(user);
	}

	
	/**用户保存的dao*/
	private UserDAO userDAO;
       

	public UserDAO getUserDAO() {
		return userDAO;
	}


	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
       
	
	
	
	
	
        //查询用户名、密码验证信息,查询用户级别信息，决定跳转页面
        public String getLoginInfo(LoginForm loginform){
        	List list = (List)(userDAO.findByUname(loginform.getUsername().trim()));
            
              if(list.size()==0) return "failure1";
           else{
        	   User databaseUser=(User)list.get(0);
            String password=databaseUser.getPassword().trim();
            if(!password.equals(loginform.getPassword().trim()))
              return "failure2";
            else{
                String duty=databaseUser.getDuty().trim();
                if(duty==null||duty.equals(""))
                  return "No Duty Found";
                 //系统管理员
                else if(duty.equals("admin"))
                   return "admin";
                  //项目管理员
                else if(duty.equals("manager"))
                    return "manager";
                 //申请人
                else if(duty.equals("worker"))
                    return "worker";
                 //审批人
                else if(duty.equals("chief1")||duty.equals("chief2")||duty.equals("chief3")||duty.equals("chief4")||
  duty.equals("chief5"))  
                 return "chief";
                else return "Duty Not Specified";
                
            }

            
            }
             
          
             
          }
           public int getLoginClass(LoginForm loginform){
        	   List list = (List)(userDAO.findByUname(loginform.getUsername().trim()));
               
               String duty=null;
               if(list.size()!=0){
            	   User databaseUser=(User)list.get(0);
            	   duty=databaseUser.getDuty().trim();
            	   if(duty.equals("chief1"))
            		   return 1;
            	   else  if(duty.equals("chief2"))
            		   return 2;
            	   else  if(duty.equals("chief3"))
            		   return 3;
            	   else  if(duty.equals("chief4"))
            		   return 4;
            	   if(duty.equals("chief5"))
            		   return 5;
            	   else return 0;
               }
               else return 0;
           }


		public int getUserId(LoginForm loginform) {
			 List list = (List)(userDAO.findByUname(loginform.getUsername().trim()));
			 if(list.size()==0) return 0;
			 else{ User databaseUser=(User)list.get(0);return databaseUser.getUid();    }
		}
       public String getRealName(LoginForm loginForm){
    	   List list = (List)(userDAO.findByUname(loginForm.getUsername().trim()));
			 if(list.size()==0) return "Oh fuck";
			 else{ User databaseUser=(User)list.get(0);return databaseUser.getRealname();    }
       }
}
