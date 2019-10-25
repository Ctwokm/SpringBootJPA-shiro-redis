package com.ctwokm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctwokm.pojo.RoleMenu;
import java.lang.Integer;
import java.util.List;

public interface RoleMenuDAO extends JpaRepository<RoleMenu, Long> {
	
	List<RoleMenu> findByRoleId(Integer roleid);
}
