package com.liegou.modules.sys.service;

import java.util.List;
import java.util.Map;

/**
 * 代码生成器
 *
 * @author luckyhua
 * @version 1.0
 * @since 2017/8/26
 */
public interface SysGeneratorService {

    List<Map<String, Object>> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    Map<String, String> queryTable(String tableName);

    List<Map<String, String>> queryColumns(String tableName);

    byte[] generatorCode(String[] tableNames);

}
