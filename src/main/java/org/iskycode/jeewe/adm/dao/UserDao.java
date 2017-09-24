package org.iskycode.jeewe.adm.dao;

import org.apache.ibatis.annotations.Mapper;
import org.iskycode.jeewe.adm.entity.AdmUser;
import org.iskycode.jeewe.sys.dao.BaseDao;

/**
 * @author phoenix
 *
 *         用户数据操作层
 */
@Mapper
public interface UserDao extends BaseDao<AdmUser> {

}
