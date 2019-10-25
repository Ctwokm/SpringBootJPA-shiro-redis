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
 * sys_user 首先授权管理必须明白几个道理：
 * 1、用户是随时随地都有注册的，角色是固定的，权限也是固定的，后两者只有在新的需求出现的时候才需要额外添加。
 * 2、角色和权限表如果关联太密切会导致不好处理，因此直接使用中间表代替，例如user_role，
 * 这样在我删除角色的时候，只需要处理一下和这个角色相关的user_role即可。不影响角色和权限表。
 * 
 * @author Ctwokm
 *
 */
@Entity
@Table(name = "sys_user") // 默认表名为user，这里无特殊要求可以不添加@Table
public class User implements Serializable {

	/**
	 * 编号
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // auto为默认值
	private Integer id;
	/*
	 * @Column
	 * 
	 * （1）name属性：被标注字段在数据库表中所对应字段的名称；
	 * 
	 * （2）length属性：表示该字段的长度，当字段的类型为varchar时，该属性才有效果，默认为255个字符；
	 * 
	 * （3）nullable属性：表示该字段是否可以为null值，默认是true。
	 * 
	 * （4）unique属性：表示该字段是否为唯一标识，默认fasle。
	 * 
	 * （5）precision和scale属性：precision属性和scale属性表示精度，当字段类型为double时，
	 * 
	 * precision表示数值的总长度，scale表示小数点所占的位数。
	 */
	/**
	 * 登录名
	 */
	@Column(name = "loginName", nullable = false, unique = true)
	private String loginName;

	/**
	 * 密码
	 */
	@Column(name = "password", nullable = false)
	private String password;

	/**
	 * 盐
	 */
	@Column(name = "salt", nullable = false)
	private String salt;// 加密密码的盐

	/**
	 * 用户拥有角色 外键关联后期不好处理数据格式很复杂，直接使用数据表关联
	 */
	/*
	 * @Column(name = "roles")
	 * 
	 * @ManyToMany(cascade = {}, fetch = FetchType.EAGER)
	 * 
	 * @JoinTable(name = "user_role", joinColumns = { @JoinColumn(name =
	 * "user_id") }, inverseJoinColumns = {
	 * 
	 * @JoinColumn(name = "roles_id") }) private List<Role> roles;
	 */

	/**
	 * 姓名
	 */
	@Column(name = "name")
	private String name;

	/**
	 * 邮箱
	 */
	@Column(name = "email")
	private String email;

	/**
	 * 电话
	 */
	@Column(name = "phone")
	private String phone;

	/**
	 * 手机
	 */
	@Column(name = "mobile")
	private String mobile;

	/**
	 * 用户头像
	 */
	@Column(name = "")
	private String photo;

	/**
	 * 最后登陆IP
	 */
	@Column(name = "loginIp")
	private String loginIp;

	/**
	 * 最后登陆时间
	 */
	@Column(name = "loginDate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date loginDate;

	/**
	 * 是否可登录
	 */
	@Column(name = "loginFlag")
	private String loginFlag;

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

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public String getLoginFlag() {
		return loginFlag;
	}

	public void setLoginFlag(String loginFlag) {
		this.loginFlag = loginFlag;
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
		return "User [id=" + id + ", loginName=" + loginName + ", password=" + password + ", salt=" + salt + ", name="
				+ name + ", email=" + email + ", phone=" + phone + ", mobile=" + mobile + ", photo=" + photo
				+ ", loginIp=" + loginIp + ", loginDate=" + loginDate + ", loginFlag=" + loginFlag + ", createBy="
				+ createBy + ", createDate=" + createDate + ", updateBy=" + updateBy + ", updateDate=" + updateDate
				+ ", remarks=" + remarks + ", delFlag=" + delFlag + "]";
	}
	

}