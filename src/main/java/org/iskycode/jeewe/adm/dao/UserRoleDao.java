package org.iskycode.jeewe.adm.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.iskycode.jeewe.sys.dao.BaseDao;

import java.util.List;
import java.util.Map;

/**
 * @author phoenix
 * <p>
 * 用户角色关联数据操作层
 */
@SuppressWarnings("rawtypes")
@Mapper
public interface UserRoleDao extends BaseDao<Map> {

    @Select("<script></script>")
    public List<Map> findRolesByUserName(String username);

    @Select("<script></script>")
    public List<Map> findPermissionsByUserName(String username);
}
