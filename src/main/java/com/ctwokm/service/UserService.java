package com.ctwokm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ctwokm.dao.UserDAO;
import com.ctwokm.pojo.User;
import com.ctwokm.system.vo.Grid;

@Service
public class UserService {
	@Resource
	private UserDAO userDAO;

	/**
	 * 通过登录名获取帐号信息
	 * 
	 * @param loginName
	 * @return
	 */
	public User findByLoginName(String name) {
		return userDAO.findByLoginName(name);
	};

	/**
	 * 通过手机号获取帐号信息
	 * 
	 * @param phone
	 * @return
	 */
	public User findByPhone(String phone) {
		return userDAO.findByPhone(phone);
	};

	/**
	 * jpa没报错...... 根据登陆名查询密码
	 * 
	 * @param loginName
	 * @return
	 */
/*	public String getPasswordByLoginName(String loginName) {
		return userDAO.getPasswordByLoginName(loginName);
	};*/
	
	/**
	 * 必要时可以限定一下查询的条数用以分页
	 * @return
	 */
	public Grid findList(){
        Grid grid = new Grid();
        
        
        List<User> users = userDAO.listUsers(null);
        
        grid.setRows(users);
        grid.setTotal(users.size());

        return grid;
    }
	
	public User getByOpenid(String openid){
        //这里假装是通过openid从数据库中获取到用户信息
        User user = new User();
        user.setName("张三");
        user.setLoginName("zhangsan");
        user.setPhone("18888888888");
        user.setId(1);
        user.setLoginFlag("1");

        return user;
    }
}