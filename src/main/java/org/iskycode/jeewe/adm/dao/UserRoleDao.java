package org.iskycode.jeewe.adm.dao;

import org.apache.ibatis.annotations.Mapper;
import org.iskycode.jeewe.sys.dao.BaseDao;

import java.util.Map;

/**
 * @author phoenix
 *
 *         用户角色关联数据操作层
 */
@SuppressWarnings("rawtypes")
@Mapper
public interface UserRoleDao extends BaseDao<Map> {

}
