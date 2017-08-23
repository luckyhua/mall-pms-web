package com.liegou.modules.sys.dao;

import com.liegou.modules.sys.entity.SysUserRoleEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户与角色对应关系
 * 
 * @author luckyhua
 * @since 2017/08/23
 * @version 1.0.0
 */
@Mapper
public interface SysUserRoleDao extends BaseDao<SysUserRoleEntity> {
	
	/**
	 * 根据用户ID，获取角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);
}
