package org.iskycode.jeewe.adm.service;

import org.apache.commons.collections.CollectionUtils;
import org.iskycode.jeewe.adm.dao.UserDao;
import org.iskycode.jeewe.adm.entity.AdmUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author phoenix
 * <p>
 * 用户业务处理层
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<AdmUser> findAll() {
        return userDao.findAll(new AdmUser());
    }

    @SuppressWarnings("rawtypes")
    public List<Map> findRolesByUserName(String username) {
        return userDao.findRolesByUserName(username);
    }

    @SuppressWarnings("rawtypes")
    public List<Map> findPermissionsByUserName(String username) {
        return userDao.findPermissionsByUserName(username);
    }

    public AdmUser findUserByName(String username) {
        AdmUser user = new AdmUser();
        user.setName(username);
        List<AdmUser> users = userDao.findAndByExample(user);
        if (CollectionUtils.isEmpty(users)) {
            return null;
        }
        AdmUser result = users.get(0);
        return result;
    }

    public void save(AdmUser user) {
        userDao.save(user);
    }
}
