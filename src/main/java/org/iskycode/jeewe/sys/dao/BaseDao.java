package org.iskycode.jeewe.sys.dao;

import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BaseDao<T> {


    @InsertProvider(type = BaseProvider.class, method = "saveSql")
    @Options(flushCache = Options.FlushCachePolicy.TRUE, timeout = 20000)
    public void save(Object obj);

    @UpdateProvider(type = BaseProvider.class, method = "updateSql")
    @Options(flushCache = Options.FlushCachePolicy.TRUE, timeout = 20000)
    public void update(Object obj);

    @DeleteProvider(type = BaseProvider.class, method = "deleteAndByExampleSql")
    @Options(flushCache = Options.FlushCachePolicy.TRUE, timeout = 20000)
    public void deleteAndByExample(Object obj);

    @DeleteProvider(type = BaseProvider.class, method = "deleteOrByExampleSql")
    @Options(flushCache = Options.FlushCachePolicy.TRUE, timeout = 20000)
    public void deleteOrByExample(Object obj);

    @SelectProvider(type = BaseProvider.class, method = "findAndByExampleSql")
    public List<T> findAndByExample(Object obj);

    @SelectProvider(type = BaseProvider.class, method = "findOrByExampleSql")
    public List<T> findOrByExample(Object obj);

    @SelectProvider(type = BaseProvider.class, method = "findAllSql")
    public List<T> findAll(Object obj);
}
