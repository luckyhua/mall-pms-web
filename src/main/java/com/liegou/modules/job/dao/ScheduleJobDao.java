package com.liegou.modules.job.dao;

import com.liegou.modules.job.entity.ScheduleJobEntity;
import com.liegou.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * 定时任务
 * 
 * @author luckyhua
 * @since 2017/08/23
 * @version 1.0.0
 */
@Mapper
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
