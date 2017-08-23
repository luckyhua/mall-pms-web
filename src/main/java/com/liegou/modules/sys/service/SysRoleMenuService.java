package com.liegou.modules.sys.service;

import java.util.List;


/**
 * 角色与菜单对应关系
 * 
 * @author luckyhua
 * @since 2017/08/23
 * @version 1.0.0
 */
public interface SysRoleMenuService {
	
	void saveOrUpdate(Long roleId, List<Long> menuIdList);
	
	/**
	 * 根据角色ID，获取菜单ID列表
	 */
	List<Long> queryMenuIdList(Long roleId);
	
}
