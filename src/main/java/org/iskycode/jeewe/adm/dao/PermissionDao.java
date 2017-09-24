package org.iskycode.jeewe.adm.dao;

import org.apache.ibatis.annotations.Mapper;
import org.iskycode.jeewe.adm.entity.AdmPermission;
import org.iskycode.jeewe.sys.dao.BaseDao;

/**
 * @author phoenix
 *
 *         权限数据操作层
 */
@Mapper
public interface PermissionDao extends BaseDao<AdmPermission> {

}
