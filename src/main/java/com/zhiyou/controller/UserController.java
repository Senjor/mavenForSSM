package com.zhiyou.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.bean.User;
import com.zhiyou.service.UserService;




/**
* @author 		laosun
* @version 		创建时间：Nov 21, 2018 11:01:31 AM
* @ClassName 	类名称
* @Description 	类描述
*/
@Controller
@RequestMapping ("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping ( value = "/showUser")
	public String index ( HttpServletRequest request, Model model) {
		int index = Integer.parseInt(request.getParameter("id"));
		System.out.println(index);

		User user = userService.getUserById(index);
		System.out.println(user);

		model.addAttribute("user",user);
		return "User";
	}

}
