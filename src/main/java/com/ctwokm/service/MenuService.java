package com.ctwokm.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ctwokm.dao.MenuDAO;
import com.ctwokm.dao.RoleMenuDAO;
import com.ctwokm.dao.UserDAO;
import com.ctwokm.dao.UserRoleDAO;
import com.ctwokm.pojo.Menu;
import com.ctwokm.pojo.RoleMenu;
import com.ctwokm.pojo.User;
import com.ctwokm.pojo.UserRole;

import lombok.extern.slf4j.Slf4j;

/**
 * Menu的业务类
 * 
 * @author Ctwokm
 *
 */
@Slf4j
@Service
public class MenuService {
	@Resource
	private MenuDAO menuDAO;
	@Resource
	private UserDAO userDAO;
	@Resource
	private UserRoleDAO userRoleDAO;
	@Resource
	private RoleMenuDAO roleMenuDAO;

	/**
	 * 通过用户名获取所有权限信息
	 * 
	 * @param loginName
	 * @return
	 */
	/*
	 * public Set<String> listMenus(String loginName) { return
	 * menuDAO.listMenus(loginName); }
	 */
	public Set<String> listMenus(String loginName) {

		// 拿到该登录名属于的用户
		User user = userDAO.findByLoginName(loginName);
		log.info("######################" + user.toString());
		// 通过该用户id查询用户角色id
		List<UserRole> userRoles = userRoleDAO.findByUserId(user.getId());
		log.info("######################" + userRoles.toString());
		//遍历list查询与每个角色id相关的每个权限id
		Set<String> menus = new HashSet<String>();
		for (UserRole userRole : userRoles) {
			List<RoleMenu> list = roleMenuDAO.findByRoleId(userRole.getRoleId());
			log.info("######################" + list.toString());
			Set<String> set = new HashSet<String>();
			for (RoleMenu roleMenu : list) {
				Menu menu = menuDAO.findById(roleMenu.getMenuId());
				log.info("######################" + menu.toString());
//				set.add(menu.getName());
				set.add(menu.getPermission());
			}
			menus.addAll(set);
		}
		log.info("######################" + menus.toString());
		
		return menus;

	}
	
	public List<Menu> getListMenus(String loginName) {

		// 拿到该登录名属于的用户
		User user = userDAO.findByLoginName(loginName);
		log.info("######################" + user.toString());
		// 通过该用户id查询用户角色id
		List<UserRole> userRoles = userRoleDAO.findByUserId(user.getId());
		log.info("######################" + userRoles.toString());
		//遍历list查询与每个角色id相关的每个权限id
		Set<Menu> menusSet = new HashSet<Menu>();
		for (UserRole userRole : userRoles) {
			List<RoleMenu> list = roleMenuDAO.findByRoleId(userRole.getRoleId());
			log.info("######################" + list.toString());
			Set<Menu> set = new HashSet<Menu>();
			for (RoleMenu roleMenu : list) {
				Menu menu = menuDAO.findById(roleMenu.getMenuId());
				log.info("######################" + menu.toString());
				set.add(menu);
			}
			menusSet.addAll(set);
		}
		log.info("######################" + menusSet.toString());
		List<Menu> menus = new ArrayList<Menu>(menusSet);
		return menus;

	}

}