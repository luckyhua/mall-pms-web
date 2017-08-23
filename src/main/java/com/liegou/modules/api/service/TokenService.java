package com.liegou.modules.api.service;

import com.liegou.modules.api.entity.TokenEntity;

import java.util.Map;

/**
 * 用户Token
 * 
 * @author luckyhua
 * @since 2017/08/23
 * @version 1.0.0
 */
public interface TokenService {

	TokenEntity queryByUserId(Long userId);

	TokenEntity queryByToken(String token);
	
	void save(TokenEntity token);
	
	void update(TokenEntity token);

	/**
	 * 生成token
	 * @param userId  用户ID
	 * @return        返回token相关信息
	 */
	Map<String, Object> createToken(long userId);

}
