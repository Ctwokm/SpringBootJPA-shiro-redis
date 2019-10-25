package com.ctwokm.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * sys_role
 * 
 * @author
 */
@Entity
@Table(name = "sys_role")
public class Role implements Serializable {
	/**
	 * 编号
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // auto为默认值
	private Integer id;

	/**
	 * 角色名称
	 */
	@Column(name = "name", nullable = false, unique = true)
	private String name;

	/**
	 * 英文名称
	 */
	@Column(name = "enname", nullable = false, unique = true)
	private String enname;

	/**
	 * 数据范围
	 */
	@Column(name = "dataScope")
	private String dataScope;

	/**
	 * 角色类型
	 */
	@Column(name = "roleType")
	private Integer roleType;

	/**
	 * 是否系统数据
	 */
	@Column(name = "isSys")
	private String isSys;

	/**
	 * 是否可用
	 */
	@Column(name = "useable")
	private Integer useable;

	/**
	 * 创建者
	 */
	@Column(name = "createBy")
	private Integer createBy;

	/**
	 * 创建时间
	 */
	@Column(name = "createDate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date createDate;

	/**
	 * 更新者
	 */
	@Column(name = "updateBy")
	private Integer updateBy;

	/**
	 * 更新时间
	 */
	@Column(name = "updateDate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date updateDate;

	/**
	 * 备注信息
	 */
	@Column(name = "remarks")
	private String remarks;

	/**
	 * 删除标记
	 */
	@Column(name = "delFlag")
	private String delFlag;

	private static final long serialVersionUID = 1L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnname() {
		return enname;
	}

	public void setEnname(String enname) {
		this.enname = enname;
	}

	public String getDataScope() {
		return dataScope;
	}

	public void setDataScope(String dataScope) {
		this.dataScope = dataScope;
	}

	public Integer getRoleType() {
		return roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}

	public String getIsSys() {
		return isSys;
	}

	public void setIsSys(String isSys) {
		this.isSys = isSys;
	}

	public Integer getUseable() {
		return useable;
	}

	public void setUseable(Integer useable) {
		this.useable = useable;
	}

	public Integer getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", enname=" + enname + ", dataScope=" + dataScope + ", roleType="
				+ roleType + ", isSys=" + isSys + ", useable=" + useable + ", createBy=" + createBy + ", createDate="
				+ createDate + ", updateBy=" + updateBy + ", updateDate=" + updateDate + ", remarks=" + remarks
				+ ", delFlag=" + delFlag + "]";
	}
	
	

}