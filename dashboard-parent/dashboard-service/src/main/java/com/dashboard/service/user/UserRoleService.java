package com.dashboard.service.user;

import java.util.List;

import com.dashboard.entity.userrole.UserRole;

/**
 * This interface is the method declaration for managing user role data.
 * @author Dipak Singh
 *
 */
@FunctionalInterface
public interface UserRoleService {

	void createUserRoleDetails(List<UserRole> pUserRoleDetails);
}
