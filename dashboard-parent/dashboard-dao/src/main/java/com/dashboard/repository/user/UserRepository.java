package com.dashboard.repository.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dashboard.entity.user.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

	User findByUserId(String pUserId);
}
