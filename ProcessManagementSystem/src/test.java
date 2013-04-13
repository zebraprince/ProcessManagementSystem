

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.chinasofti.service.ILoginService;
import com.chinasofti.web.struts.form.LoginForm;



public class test {
	
	public static void main(String[] args) {
		
		ApplicationContext aContext = new FileSystemXmlApplicationContext("/WebRoot/WEB-INF/applicationContext.xml");
		
		LoginForm loginForm=new LoginForm();
		loginForm.setUsername("xly");
		loginForm.setPassword("123");
		ILoginService service=(ILoginService)aContext.getBean("LoginService");
		System.out.println(service.getLoginInfo(loginForm));
	
	}
}
