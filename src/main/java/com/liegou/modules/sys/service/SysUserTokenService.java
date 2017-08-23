package com.liegou.modules.sys.service;

import com.liegou.modules.sys.entity.SysUserTokenEntity;
import com.liegou.utils.R;

/**
 * 用户Token
 * 
 * @author luckyhua
 * @since 2017/08/23
 * @version 1.0.0
 */
public interface SysUserTokenService {

	SysUserTokenEntity queryByUserId(Long userId);

	SysUserTokenEntity queryByToken(String token);
	
	void save(SysUserTokenEntity token);
	
	void update(SysUserTokenEntity token);

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	R createToken(long userId);

}
