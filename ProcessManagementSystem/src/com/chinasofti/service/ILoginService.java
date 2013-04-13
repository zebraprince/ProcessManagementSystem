package com.chinasofti.service;

import com.chinasofti.domain.User;
import com.chinasofti.web.struts.form.LoginForm;


public interface ILoginService {

	/**
	 * 保存一个用户。
	 * @param user
	 */
	public void saveUser(User user);
        //查询用户名、密码验证信息
        public String getLoginInfo(LoginForm loginform);
        public int getLoginClass(LoginForm loginform);
        public int getUserId(LoginForm loginform);
        public String getRealName(LoginForm loginForm);
}
