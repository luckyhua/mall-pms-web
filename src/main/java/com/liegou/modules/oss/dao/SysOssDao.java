package com.liegou.modules.oss.dao;

import com.liegou.modules.oss.entity.SysOssEntity;
import com.liegou.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文件上传
 * 
 * @author luckyhua
 * @since 2017/08/23
 * @version 1.0.0
 */
@Mapper
public interface SysOssDao extends BaseDao<SysOssEntity> {
	
}
