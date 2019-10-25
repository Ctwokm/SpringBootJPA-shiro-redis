package com.ctwokm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctwokm.pojo.UserRole;
import java.lang.Integer;
import java.util.List;

public interface UserRoleDAO extends JpaRepository<UserRole, Long> {

	List<UserRole> findByUserId(Integer userid);
}
