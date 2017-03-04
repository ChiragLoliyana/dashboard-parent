package com.dashboard.entity.userrole;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dashboard.entity.generic.Update;

/**
 * This class is the entity class for User role details.
 * @author Dipak Singh
 *
 */
@Table(name="t_user_role")
@Entity
public class UserRole extends Update{

	@Id
	@Column(name="user_role_id", nullable=false, unique=true)
	private Integer userRoleId;
	
	@Column(name="user_id", nullable=false, unique=true)
	private String userId;
	
	@Column(name="role_id", nullable=false, unique=true)
	private Integer roleId;

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "UserRole [userRoleId=" + userRoleId + ", userId=" + userId + ", roleId=" + roleId + "]";
	}
}
