package com.liegou.modules.sys.service;

import com.liegou.modules.sys.entity.SysDeptEntity;

import java.util.List;
import java.util.Map;

/**
 * 部门管理
 * 
 * @author luckyhua
 * @since 2017/08/23
 * @version 1.0.0
 */
public interface SysDeptService {
	
	SysDeptEntity queryObject(Long deptId);
	
	List<SysDeptEntity> queryList(Map<String, Object> map);

	void save(SysDeptEntity sysDept);
	
	void update(SysDeptEntity sysDept);
	
	void delete(Long deptId);

	/**
	 * 查询子部门ID列表
	 * @param parentId  上级部门ID
	 */
	List<Long> queryDetpIdList(Long parentId);

	/**
	 * 获取子部门ID(包含本部门ID)，用于数据过滤
	 */
	String getSubDeptIdList(Long deptId);

}
