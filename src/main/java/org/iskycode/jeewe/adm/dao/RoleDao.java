package org.iskycode.jeewe.adm.dao;

import org.apache.ibatis.annotations.Mapper;
import org.iskycode.jeewe.adm.entity.AdmRole;
import org.iskycode.jeewe.sys.dao.BaseDao;

/**
 * @author phoenix
 *
 *         角色数据操作层
 */
@Mapper
public interface RoleDao extends BaseDao<AdmRole> {

}
