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
 * sys_menu
 * 
 * @author
 */
@Entity
@Table(name = "sys_menu")
public class Menu implements Serializable {
	/**
	 * 编号
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // auto为默认值
	private Integer id;

	/**
	 * 父级编号
	 */
	@Column
	private Integer parentId;

	/**
	 * 所有父级编号
	 */
	@Column
	private String parentIds;

	/**
	 * 名称
	 */
	@Column(name = "name")
	private String name;

	/**
	 * 排序
	 */
	@Column
	private Long sort;

	/**
	 * 链接
	 */
	@Column
	private String href;

	/**
	 * 目标
	 */
	@Column
	private String target;

	/**
	 * 图标
	 */
	@Column
	private String icon;

	/**
	 * 是否在菜单中显示
	 */
	@Column
	private String isShow;

	/**
	 * 权限标识
	 */
	@Column
	private String permission;

	/**
	 * 创建者
	 */
	@Column
	private Integer createBy;

	/**
	 * 创建时间
	 */
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date createDate;

	/**
	 * 更新者
	 */
	@Column
	private Integer updateBy;

	/**
	 * 更新时间
	 */
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date updateDate;

	/**
	 * 备注信息
	 */
	@Column
	private String remarks;

	/**
	 * 删除标记
	 */
	@Column
	private String delFlag;

	private static final long serialVersionUID = 1L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getParentIds() {
		return parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSort() {
		return sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIsShow() {
		return isShow;
	}

	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
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

}