package org.iskycode.jeewe.adm.dao;

import org.apache.ibatis.annotations.Mapper;
import org.iskycode.jeewe.adm.entity.AdmUser;
import org.iskycode.jeewe.sys.dao.BaseDao;

@Mapper
public interface UserDao extends BaseDao<AdmUser> {

}
