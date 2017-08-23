package com.liegou.modules.job.dao;

import com.liegou.modules.job.entity.ScheduleJobLogEntity;
import com.liegou.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 * 
 * @author luckyhua
 * @since 2017/08/23
 * @version 1.0.0
 */
@Mapper
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {
	
}
