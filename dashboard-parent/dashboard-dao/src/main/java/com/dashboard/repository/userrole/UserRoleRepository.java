package com.dashboard.repository.userrole;

import java.math.BigDecimal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dashboard.entity.userrole.UserRole;

@Repository
public interface UserRoleRepository extends CrudRepository<UserRole, BigDecimal>{

}
