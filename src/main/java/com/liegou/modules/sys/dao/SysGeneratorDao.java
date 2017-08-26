package com.liegou.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 代码生成器
 *
 * @author luckyhua
 * @version 1.0
 * @since 2017/8/26
 */
@Mapper
public interface SysGeneratorDao extends BaseDao<Map<String, Object>> {
	
	Map<String, String> queryTable(String tableName);
	
	List<Map<String, String>> queryColumns(String tableName);
}
