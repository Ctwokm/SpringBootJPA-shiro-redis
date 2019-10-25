package com.ctwokm.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ctwokm.dao.RoleDAO;
import com.ctwokm.dao.UserDAO;
import com.ctwokm.dao.UserRoleDAO;
import com.ctwokm.service.MenuService;
import com.ctwokm.service.RoleService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestJPA {

	@Autowired
	MenuService menuService;
	@Autowired
	RoleService roleService;
	@Autowired
	RoleDAO roleDAO;
	@Autowired
	UserRoleDAO userRoleDAO;
	@Autowired
	UserDAO userDAO;
	
	@Test
	public void TestforJPA() {
		System.out.println(menuService.listMenus("user1"));
//		System.out.println(roleService.listRoles("user4"));
//		System.out.println(userRoleDAO.findByUserId(1).toString());
//		System.out.println(roleDAO.findById(1).toString());
	};
	
	@Test
	public void TestFindAll() {
//		System.out.println(userDAO.findAll());
		System.out.println(userDAO.listUsers(null));
	}
}
