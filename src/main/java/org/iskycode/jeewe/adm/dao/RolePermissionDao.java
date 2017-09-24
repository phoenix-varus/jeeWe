package org.iskycode.jeewe.adm.dao;

import org.apache.ibatis.annotations.Mapper;
import org.iskycode.jeewe.sys.dao.BaseDao;

import java.util.Map;

/**
 * @author phoenix
 *
 *         角色权限关联数据操作层
 */
@SuppressWarnings("rawtypes")
@Mapper
public interface RolePermissionDao extends BaseDao<Map> {

}
