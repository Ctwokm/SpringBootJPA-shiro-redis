package com.ctwokm.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * sys_role_menu
 * 
 * @author
 */
@Entity
@Table(name = "sys_role_menu")
@IdClass(RoleMenuId.class)
public class RoleMenu implements Serializable {

	/**
	 * 角色编号
	 */
	@Id
	private Integer roleId;//驼峰命名会被数据库自动转为role_id

	/**
	 * 菜单编号
	 */
	@Id
	private Integer menuId;

	private static final long serialVersionUID = 1L;


	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
}