package com.ctwokm.system.shiro;


import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.ctwokm.pojo.Menu;
import com.ctwokm.pojo.Role;
import com.ctwokm.pojo.User;
import com.ctwokm.service.MenuService;
import com.ctwokm.service.RoleService;

import java.util.List;
import java.util.Set;

/**
 * 统一角色授权控制策略
 */
@Slf4j
public class AuthorizationRealm extends AuthorizingRealm {

    @Autowired
    private RoleService roleService;
    @Autowired
    private MenuService menuService;

    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
    	log.info("---------------- 执行 Shiro 权限获取 ---------------------");
        Object principal = principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        if (principal instanceof User) {
            User userLogin = (User) principal;
            if(userLogin != null){
            	Set<String> roleSet = roleService.listRoles(userLogin.getLoginName()); 
                if(CollectionUtils.isNotEmpty(roleSet)){
                    for(String role : roleSet){
                        info.addRole(role);
 
                        Set<String> menuSet = menuService.listMenus(userLogin.getLoginName());
                        if(CollectionUtils.isNotEmpty(menuSet)){
                            for (String menu : menuSet){
                                if(StringUtils.isNoneBlank(menu)){
                                    info.addStringPermission(menu);
                                }
                            }
                        }
                    }
                }
            }
        }
        log.info("---------------- 获取到以下权限 ----------------");
        log.info(info.getStringPermissions().toString());
        log.info("---------------- Shiro 权限获取成功 ----------------------");
        return info;
    }

    /**
     * 认证信息.(身份验证) : Authentication 是用来验证用户身份
     *
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException{
        return null;
    }
}
