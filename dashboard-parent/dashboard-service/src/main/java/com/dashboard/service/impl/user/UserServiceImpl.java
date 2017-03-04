package com.dashboard.service.impl.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dashboard.entity.user.User;
import com.dashboard.repository.user.UserRepository;
import com.dashboard.service.user.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void createUser(List<User> pUserDetails) {
		userRepository.save(pUserDetails);
	}
	
	@Override
	public User findUserDetails(String pUserId) {
		return userRepository.findByUserId(pUserId);
	}

}
