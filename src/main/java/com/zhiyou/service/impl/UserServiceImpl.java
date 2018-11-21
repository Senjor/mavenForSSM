package com.zhiyou.service.impl;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.zhiyou.bean.User;
import com.zhiyou.dao.UserMapper;
import com.zhiyou.service.UserService;

/**
* @author 		laosun
* @version 		创建时间：Nov 21, 2018 10:58:53 AM
* @ClassName 	类名称
* @Description 	类描述
*/

@Service("userService")

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper um;
	
	
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		System.out.println("service");
		
		return um.selectByPrimaryKey(userId);
	}
	
}
