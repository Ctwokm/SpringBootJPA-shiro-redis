package com.ctwokm.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ctwokm.dao.MenuDAO;
import com.ctwokm.dao.RoleDAO;
import com.ctwokm.dao.RoleMenuDAO;
import com.ctwokm.dao.UserDAO;
import com.ctwokm.dao.UserRoleDAO;
import com.ctwokm.pojo.Menu;
import com.ctwokm.pojo.Role;
import com.ctwokm.pojo.RoleMenu;
import com.ctwokm.pojo.User;
import com.ctwokm.pojo.UserRole;

/**
 * 本来想直接用sql批量导入数据，但是使用了jpa之后数据库字段顺序被打乱，无法直接插入 所以只好在这里手动生成了
 * 
 * @author Ctwokm
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeneratingData {

	@Resource
	UserDAO userDAO;
	@Resource
	RoleDAO roleDAO;
	@Resource
	MenuDAO menuDAO;
	@Resource
	UserRoleDAO userRoleDAO;
	@Resource
	RoleMenuDAO roleMenuDAO;

	/**
	 * sys_user表插入数据测试
	 */
	@Test
	public void addUser() {

		/**
		 * 盐
		 */
		String salt = new SecureRandomNumberGenerator().nextBytes().toString();
		/**
		 * 加密次数
		 */
		int times = 2;
		/**
		 * 加密算法
		 */
		String algorithmName = "md5";
		/**
		 * 加密后密码
		 */
		String encodedPassword = new SimpleHash(algorithmName, "123456", salt, times).toString();
		/**
		 * user
		 */
		for (int i = 0; i < 5; i++) {
			User user = new User();
			user.setLoginName("user" + i);
			user.setPassword(encodedPassword);
			user.setSalt(salt);
			user.setCreateDate(new Date());
			userDAO.save(user);
		}
	};

	/**
	 * sys_role表添加数据测试
	 */
	@Test
	public void addRole() {
		String[] rolename = { "owner", "super", "manager", "admin", "user" };
		String[] roleCnName = { "所有者", "超级管理员", "经理", "管理员", "用户" };
		for (int i = 0; i < roleCnName.length; i++) {
			Role role = new Role();
			role.setCreateDate(new Date());
			role.setName(roleCnName[i]);
			role.setEnname(rolename[i]);
			roleDAO.save(role);
		}
	};

	/**
	 * 
	 */
	@Test
	public void addMenu() {
		String[] menuName = { "add", "delete", "use", "update", "get", "put", "set", "by", "off", "oute", "up" };
		for (int i = 0; i < menuName.length; i++) {
			Menu menu = new Menu();
			menu.setName(menuName[i]);
			menu.setCreateDate(new Date());
			menuDAO.save(menu);
		}
	};

	@Test
	public void addUserRole() {
		int m = 6;
		for (int i = 0; i < 5; i++) {
			m--;
			for (int j = m; j > 0; j--) {
				UserRole userRole = new UserRole();
				userRole.setUserId(i + 1);
				userRole.setRoleId(6 - j);
				userRoleDAO.save(userRole);
			}
		}
	};

	@Test
	public void addRoleMenu() {
		int m = 13;
		for (int i = 0; i < 5; i++) {
			m = m - 2;
			for (int j = 0; j < m; j++) {
				RoleMenu roleMenu = new RoleMenu();
				roleMenu.setRoleId(i + 1);
				roleMenu.setMenuId(j + 1);
				roleMenuDAO.save(roleMenu);
			}
		}
	};

}
