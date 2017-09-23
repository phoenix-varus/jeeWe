package org.iskycode.jeewe.adm.service;

import org.iskycode.jeewe.adm.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<Map> findAll() {
        return (List<Map>) userDao.findAll();
    }
}
