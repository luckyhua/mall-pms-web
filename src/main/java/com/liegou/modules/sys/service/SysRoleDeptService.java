package com.liegou.modules.sys.service;

import java.util.List;


/**
 * 角色与部门对应关系
 * 
 * @author luckyhua
 * @since 2017/08/23
 * @version 1.0.0
 */
public interface SysRoleDeptService {
	
	void saveOrUpdate(Long roleId, List<Long> deptIdList);
	
	/**
	 * 根据角色ID，获取部门ID列表
	 */
	List<Long> queryDeptIdList(Long roleId);
	
}
