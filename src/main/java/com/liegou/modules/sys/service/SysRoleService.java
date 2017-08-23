package com.liegou.modules.sys.service;

import com.liegou.modules.sys.entity.SysRoleEntity;

import java.util.List;
import java.util.Map;

/**
 * 角色
 * 
 * @author luckyhua
 * @since 2017/08/23
 * @version 1.0.0
 */
public interface SysRoleService {
	
	SysRoleEntity queryObject(Long roleId);
	
	List<SysRoleEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SysRoleEntity role);
	
	void update(SysRoleEntity role);
	
	void deleteBatch(Long[] roleIds);

}
