package org.iskycode.jeewe.sys.dao;

import org.apache.commons.beanutils.BeanMap;
import org.apache.commons.collections.MapUtils;
import org.apache.ibatis.jdbc.SQL;
import org.iskycode.jeewe.sys.util.OTR;

import java.util.Map;

/**
 * @author phoenix
 *
 *         公共构建sql工具类
 */
public class BaseProvider {

	@SuppressWarnings("rawtypes")
	public String saveSql(Object obj) throws Exception {
		String tableName = getTableName(obj);
		Map oMap = getBeanMap(obj);
		SQL iSql = new SQL();
		iSql.INSERT_INTO(tableName);
		for (Object key : oMap.keySet()) {
			iSql.VALUES(key.toString(), "#{" + key.toString() + "}");
		}
		return iSql.toString();
	}

	@SuppressWarnings("rawtypes")
	public String updateSql(Object obj) throws Exception {
		String tableName = getTableName(obj);
		Map oMap = getBeanMap(obj);
		SQL uSql = new SQL();
		uSql.UPDATE(tableName);
		for (Object key : oMap.keySet()) {
			// 属性为null，统一不做修改
			if (null != oMap.get(key) && !key.toString().equals("id")) {
				uSql.SET(key.toString() + " = #{" + key.toString() + "}");
			}
		}
		uSql.WHERE("id = #{id}");
		return uSql.toString();
	}

	public String deleteAndByExampleSql(Object obj) throws Exception {
		return deleteByExampleSql(obj, true);
	}

	public String deleteOrByExampleSql(Object obj) throws Exception {
		return deleteByExampleSql(obj, false);
	}

	@SuppressWarnings("rawtypes")
	private String deleteByExampleSql(Object obj, boolean flag) throws Exception {
		String tableName = getTableName(obj);
		Map oMap = getBeanMap(obj);
		SQL dSql = new SQL();
		dSql.DELETE_FROM(tableName);
		dSql.WHERE("1 = 1");
		for (Object key : oMap.keySet()) {
			if (null != oMap.get(key)) {
				if (flag) {
					dSql.AND();
				} else {
					dSql.OR();
				}
				dSql.WHERE(key.toString() + " = #{" + key.toString() + "}");
			}
		}
		return dSql.toString();
	}

	public String findAndByExampleSql(Object obj) throws Exception {
		return findByExampleSql(obj, true);
	}

	public String findOrByExampleSql(Object obj) throws Exception {
		return findByExampleSql(obj, false);
	}

	@SuppressWarnings("rawtypes")
	private String findByExampleSql(Object obj, boolean flag) throws Exception {
		String tableName = getTableName(obj);
		Map oMap = getBeanMap(obj);
		SQL fSql = new SQL();
		fSql.SELECT("*");
		fSql.FROM(tableName);
		fSql.WHERE("1 = 1");
		for (Object key : oMap.keySet()) {
			if (null != oMap.get(key)) {
				if (flag) {
					fSql.AND();
				} else {
					fSql.OR();
				}
				fSql.WHERE(key.toString() + " = #{" + key.toString() + "}");
			}
		}
		return fSql.toString();
	}

	public String findAllSql(Object obj) throws Exception {
		String tableName = getTableName(obj);
		SQL fSql = new SQL();
		fSql.SELECT("*");
		fSql.FROM(tableName);
		return fSql.toString();
	}

	private String getTableName(Object obj) throws Exception {
		if (null == obj) {
			throw new Exception("数据操作对象不能为空");
		}
		String tableName = null;
		String clazzName = obj.getClass().getSimpleName();
		try {
			tableName = (String) OTR.class.getField(clazzName).get(OTR.class);
		} catch (NoSuchFieldException e) {
			throw new Exception("实体类" + clazzName + "对应数据库表名称未找到", e);
		}
		return tableName;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private Map<Object, Object> getBeanMap(Object obj) throws Exception {
		Map oMap = new BeanMap(obj);
		if (MapUtils.isEmpty(oMap)) {
			throw new Exception("实体类没有可用属性");
		}
		return oMap;
	}
}
