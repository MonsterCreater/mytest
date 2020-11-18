package com.gec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gec.dao.UserMapper;
import com.gec.pojo.User;
import com.gec.pojo.UserExample;
import com.gec.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	public User login(User user) {
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUserNameEqualTo(user.getUserName()).andUserPwdEqualTo(user.getUserPwd());
		List<User> list = userMapper.selectByExample(userExample);
		return list.size()>0?list.get(0):null;
	}

}
