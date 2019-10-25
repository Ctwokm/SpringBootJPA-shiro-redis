package com.ctwokm.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * sys_user_role
 * @author 
 */
@Entity
@Table(name = "sys_user_role")
/**
 * 当一个实体有多个主键字段时，JPA需要定义一个特殊的ID类，该类是使用@idclass注释附加到实体类的。ID类反映了主键字段，它的对象可以表示主键值
 * @author Ctwokm
 *
 */
@IdClass(UserRoleId.class)//复合主键需要使用idclass
public class UserRole implements Serializable {
    /**
     * 用户编号
     */
	@Id
    private Integer userId;

    /**
     * 角色编号
     */
	@Id
    private Integer roleId;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

	@Override
	public String toString() {
		return "UserRole [userId=" + userId + ", roleId=" + roleId + "]";
	}
    
}