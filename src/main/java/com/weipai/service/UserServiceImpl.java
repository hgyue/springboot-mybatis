package com.weipai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weipai.mapper.UserMapper;
import com.weipai.pojo.User;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserMapper um;

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return um.getAll();
	}

}
