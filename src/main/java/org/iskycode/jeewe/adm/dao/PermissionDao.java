package org.iskycode.jeewe.adm.dao;

import org.apache.ibatis.annotations.Mapper;
import org.iskycode.jeewe.adm.entity.AdmPermission;
import org.iskycode.jeewe.sys.dao.BaseDao;

@Mapper
public interface PermissionDao extends BaseDao<AdmPermission> {

}
