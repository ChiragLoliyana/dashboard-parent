package com.dashboard.repository.role;

import java.math.BigDecimal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dashboard.entity.role.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, BigDecimal>{

}
