package com.ctwokm.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ctwokm.dao.RoleDAO;
import com.ctwokm.dao.UserDAO;
import com.ctwokm.dao.UserRoleDAO;
import com.ctwokm.pojo.Role;
import com.ctwokm.pojo.User;
import com.ctwokm.pojo.UserRole;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RoleService {

	@Resource
	private UserDAO userDAO;
	@Resource
	private UserRoleDAO userRoleDAO;
	@Resource
	private RoleDAO roleDAO;

	
	/**
	 * 通过用户登录名loginName获取用户拥有的角色的角色名称
	 * 
	 * @param loginName
	 * @return
	 */
	/*
	 * public Set<String> listRoles(String loginName){ return
	 * roleDAO.listRoles(loginName); }
	 */
	public Set<String> listRoles(String loginName) {
		// 拿到该登录名属于的用户
		User user = userDAO.findByLoginName(loginName);
		log.info("######################"+user.toString());
		// 通过该用户id查询用户角色id
		List<UserRole> userRoles = userRoleDAO.findByUserId(user.getId());
		log.info("######################"+userRoles.toString());
		//遍历集合查到该用户所有角色id对应的角色
		Set<String> roles = new HashSet<String>();
		for (UserRole userRole : userRoles) {
			Role role = roleDAO.findById(userRole.getRoleId());
			log.info("######################"+role.toString());
//			roles.add(role.getName());
			roles.add(role.getEnname());
		}
		log.info("######################"+roles.toString());
		return roles;
	}
	/**
	 * 通过用户登录名loginName获取用户拥有的角色
	 * 
	 * @param loginName
	 * @return
	 */
	public List<Role> getListRoles(String loginName) {
		// 拿到该登录名属于的用户
		User user = userDAO.findByLoginName(loginName);
		log.info("######################"+user.toString());
		// 通过该用户id查询用户角色id
		List<UserRole> userRoles = userRoleDAO.findByUserId(user.getId());
		log.info("######################"+userRoles.toString());
		List<Role> roles = new ArrayList<Role>();
		for (UserRole userRole : userRoles) {
			Role role = roleDAO.findById(userRole.getRoleId());
			log.info("######################"+role.toString());
			roles.add(role);
		}
		log.info("######################"+roles.toString());
		return roles;
	}
	
}