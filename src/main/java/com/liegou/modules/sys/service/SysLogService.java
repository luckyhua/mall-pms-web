package com.liegou.modules.sys.service;

import com.liegou.modules.sys.entity.SysLogEntity;

import java.util.List;
import java.util.Map;

/**
 * 系统日志
 * 
 * @author luckyhua
 * @since 2017/08/23
 * @version 1.0.0
 */
public interface SysLogService {
	
	SysLogEntity queryObject(Long id);
	
	List<SysLogEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SysLogEntity sysLog);

	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
