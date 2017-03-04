package com.dashboard.entity.role;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dashboard.entity.generic.Update;

/**
 * This class is the entity class for role details.
 * @author Dipak Singh
 *
 */
@Table(name="t_role")
@Entity
public class Role extends Update{

	@Id
	@Column(name="role_id", nullable=false, unique=true)
	private Integer roleId;
	
	@Column(name="role_desc", nullable=false, unique=true)
	private String roleDescreption;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleDescreption() {
		return roleDescreption;
	}

	public void setRoleDescreption(String roleDescreption) {
		this.roleDescreption = roleDescreption;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleDescreption=" + roleDescreption + "]";
	}
}
