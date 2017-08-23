package com.liegou.modules.job.service;

import com.liegou.modules.job.entity.ScheduleJobLogEntity;

import java.util.List;
import java.util.Map;

/**
 * 定时任务日志
 * 
 * @author luckyhua
 * @since 2017/08/23
 * @version 1.0.0
 */
public interface ScheduleJobLogService {

	/**
	 * 根据ID，查询定时任务日志
	 */
	ScheduleJobLogEntity queryObject(Long jobId);
	
	/**
	 * 查询定时任务日志列表
	 */
	List<ScheduleJobLogEntity> queryList(Map<String, Object> map);
	
	/**
	 * 查询总数
	 */
	int queryTotal(Map<String, Object> map);
	
	/**
	 * 保存定时任务日志
	 */
	void save(ScheduleJobLogEntity log);
	
}
