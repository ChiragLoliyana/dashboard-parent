package com.dashboard.service.user;

import java.util.List;

import com.dashboard.entity.role.Role;

/**
 * This interface is the method declaration for managing role data.
 * @author Dipak Singh
 *
 */
@FunctionalInterface
public interface RoleService {

	void createRole(List<Role> pRoleDetails);
}
