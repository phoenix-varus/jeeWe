package org.iskycode.jeewe.adm.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.iskycode.jeewe.sys.dao.BaseDao;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao extends BaseDao {

    @Select("select * from adm_user")
    public List<Map> findAll();
}
