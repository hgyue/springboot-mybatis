package com.weipai.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weipai.pojo.User;
import com.weipai.service.IUserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Resource(name="userService")
	private IUserService usi;
	
	@GetMapping
	public List<User> getAll(){
		return usi.getAll();
	}
}
