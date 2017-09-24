package org.iskycode.jeewe.adm.service;

import org.apache.commons.beanutils.BeanUtils;
import org.iskycode.jeewe.adm.dao.UserDao;
import org.iskycode.jeewe.adm.entity.AdmUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<Map> findAll() {
        return (List<Map>) userDao.findAll(new AdmUser());
    }

    public List<Map> findRolesByName(String username) {
        AdmUser user = new AdmUser();
        user.setName(username);
        return userDao.findAndByExample(user);
    }

    public List<Map> findPermissionsByName(String username) {
        AdmUser user = new AdmUser();
        user.setName(username);
        return userDao.findAndByExample(user);
    }

    public AdmUser findUserByName(String username) {
        AdmUser user = new AdmUser();
        user.setName(username);
        List<Map> users = userDao.findAndByExample(user);
        AdmUser result = null;
        try {
            BeanUtils.populate(result, users.get(0));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return result;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return result;
        }
        return result;
    }

    public void save(AdmUser user) {
        userDao.save(user);
    }
}
