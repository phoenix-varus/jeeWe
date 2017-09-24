package org.iskycode.jeewe.adm.service;

import org.iskycode.jeewe.adm.dao.RolePermissionDao;
import org.iskycode.jeewe.adm.dao.UserDao;
import org.iskycode.jeewe.adm.dao.UserRoleDao;
import org.iskycode.jeewe.adm.entity.AdmUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    UserRoleDao userRoleDao;

    @Autowired
    RolePermissionDao rolePermissionDao;

    public List<AdmUser> findAll() {
        return userDao.findAll(new AdmUser());
    }

    public List<Map> findRolesByUserName(String username) {
        AdmUser user = new AdmUser();
        user.setName(username);
        return userRoleDao.findAndByExample(user);
    }

    public List<Map> findPermissionsByUserName(String username) {
        AdmUser user = new AdmUser();
        user.setName(username);
        return rolePermissionDao.findAndByExample(user);
    }

    public AdmUser findUserByName(String username) {
        AdmUser user = new AdmUser();
        user.setName(username);
        List<AdmUser> users = userDao.findAndByExample(user);
        AdmUser result = users.get(0);
        return result;
    }

    public void save(AdmUser user) {
        userDao.save(user);
    }
}
