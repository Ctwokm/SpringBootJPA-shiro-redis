package com.ctwokm.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ctwokm.pojo.Menu;

@Repository
public interface MenuDAO extends JpaRepository<Menu, Long> {
    /**
     * 通过角色id获取所有权限信息
     * @param roleId
     * @return
     */
//    List<Menu> findAllByRoleId(Integer roleId);
	
	/**
     * 通过用户名获取所有权限信息
     * @param loginName
     * @return
     */
	/*@Query(value = "select m.name from sys_user u left join sys_user_role ru on u.id = ru.user_id left join sys_role r on r.id = ru.role_id left join sys_role_menu rm on r.id = rm.role_id left join sys_menu m on m.id = rm.menu_id where u.login_name = ?", nativeQuery = true)
	Set<String> listMenus(String loginName);*/
	
	Menu findById(Integer id);
}
