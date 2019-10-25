package com.ctwokm.pojo;

import java.io.Serializable;

import javax.persistence.Id;

public class RoleMenuId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 角色编号
	 */
	Integer roleId;// 驼峰命名会被数据库自动转为role_id

	/**
	 * 菜单编号
	 */
	Integer menuId;
	
	
}
