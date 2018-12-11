package com.ssmbuild.controller;

import com.ssmbuild.domain.User;
import com.ssmbuild.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 〈用户控制器〉
 *
 * @author xiaoyue
 * @create 2018/12/11 10:48
 * @since 1.0.0
 */
@Controller
@RequestMapping("/user")
public class UserAction {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
}