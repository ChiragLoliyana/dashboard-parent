package com.dashboard.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dashboard.entity.generic.Update;

@Table(name = "t_user")
@Entity
public class User extends Update {

	@Id
	@Column(name = "user_id", length = 10, nullable = false, unique = true)
	private String userId;

	@Column(name = "password", length = 10, nullable = false)
	private String password;

	@Column(name = "email", length = 50)
	private String email;

	@Column(name = "phone", length = 50)
	private String phone;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", email=" + email + ", phone=" + phone + "]";
	}
}
