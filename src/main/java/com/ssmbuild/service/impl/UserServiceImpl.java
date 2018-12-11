package com.ssmbuild.service.impl;

import com.ssmbuild.dao.UserDao;
import com.ssmbuild.domain.User;
import com.ssmbuild.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈〉
 *
 * @author xiaoyue
 * @create 2018/12/11 10:50
 * @since 1.0.0
 */
@Service public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}
}