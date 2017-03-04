package com.dashboard.service.user;

import java.util.List;

import com.dashboard.entity.user.User;

/**
 * This interface is the method declaration for managing user data.
 * @author Dipak Singh
 *
 */
public interface UserService {

	void createUser(List<User> pUserDetails);
	
	User findUserDetails(String pUserId);
}
