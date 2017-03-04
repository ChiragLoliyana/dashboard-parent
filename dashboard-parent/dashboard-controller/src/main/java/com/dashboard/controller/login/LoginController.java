package com.dashboard.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.entity.user.User;
import com.dashboard.service.user.UserService;

/**
 * This controller is the class for all types of login operations.
 * @author Dipak Singh
 *
 */
@RestController
public class LoginController {
	
	@Autowired
	private UserService userService;

	@GetMapping("getUserDetails")
	private User getUserDetails(@RequestParam(value = "userId") String userId) {
		return userService.findUserDetails(userId);
	}
}
