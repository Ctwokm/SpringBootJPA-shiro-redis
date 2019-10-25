package com.ctwokm.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ctwokm.pojo.Role;
import java.lang.Integer;

@Repository
public interface RoleDAO extends JpaRepository<Role, Long> {

	Role findByEnname(String enName);
	
	Role findById(Integer id);
    /**
     * 通过用户id获取用户拥有的角色
     * @param userId
     * @return
     */
	
//    List<Role> findAllByUserId(Integer userId);
	
	
	/**
     * 通过用户登录名loginName获取用户拥有的角色
     * @param loginName
     * @return
     */
/*	@Query(value = "select r.name from sys_user u left join sys_user_role ur on u.id = ur.user_id left join sys_role r on r.id = ur.role_id where u.login_name = ?", nativeQuery = true)
	Set<String> listRoles(String loginName);*/
	
}
