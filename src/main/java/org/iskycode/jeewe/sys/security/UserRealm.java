package org.iskycode.jeewe.sys.security;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.iskycode.jeewe.adm.entity.AdmPermission;
import org.iskycode.jeewe.adm.entity.AdmRole;
import org.iskycode.jeewe.adm.entity.AdmUser;
import org.iskycode.jeewe.adm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author phoenix
 * <p>
 * 安全组件，整合shiro
 */
@Component
public class UserRealm extends AuthorizingRealm {
    @Autowired
    UserService userService;

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = (String) principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        // 根据用户名查询当前用户拥有的角色
        List<Map> roles = userService.findRolesByUserName(username);
        Set<String> roleNames = new HashSet<String>();
        for (Map role : roles) {
            roleNames.add(role.get("name").toString());
        }
        // 将角色名称提供给info
        authorizationInfo.setRoles(roleNames);
        // 根据用户名查询当前用户权限
        List<Map> permissions = userService.findPermissionsByUserName(username);
        Set<String> permissionNames = new HashSet<String>();
        for (Map permission : permissions) {
            permissionNames.add(permission.get("name").toString());
        }
        // 将权限名称提供给info
        authorizationInfo.setStringPermissions(permissionNames);

        return authorizationInfo;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        AdmUser user = userService.findUserByName(username);
        if (user == null) {
            // 用户名不存在抛出异常
            throw new UnknownAccountException();
        }

        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getName(), user.getPassword(),
                ByteSource.Util.bytes(user.getCredentialsSalt()), getName());
        return authenticationInfo;
    }
}
