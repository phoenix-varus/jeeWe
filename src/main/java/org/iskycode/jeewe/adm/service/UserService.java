package org.iskycode.jeewe.adm.service;

import org.iskycode.jeewe.adm.dao.UserDao;
import org.iskycode.jeewe.adm.entity.AdmPermission;
import org.iskycode.jeewe.adm.entity.AdmRole;
import org.iskycode.jeewe.adm.entity.AdmUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<Map> findAll() {
        return (List<Map>) userDao.findAll(new AdmUser());
    }

    public List<AdmRole> findRolesByName(String username) {
        return null;
    }

    public List<AdmPermission> findPermissionsByName(String username) {
        return null;
    }

    public AdmUser findUserByName(String username) {
        return null;
    }

    public void save(AdmUser user) {
    }
}
