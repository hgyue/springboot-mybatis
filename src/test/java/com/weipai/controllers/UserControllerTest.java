package com.weipai.controllers;

import java.util.List;

import org.junit.Test;

import com.weipai.pojo.User;

public class UserControllerTest {

	@Test
	public void testGetAll() {
		List<User> list = new UserController().getAll();
		System.out.println(list.toString());
	}

}
