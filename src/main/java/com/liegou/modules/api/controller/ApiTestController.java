package com.liegou.modules.api.controller;

import com.liegou.modules.api.annotation.AuthIgnore;
import com.liegou.modules.api.annotation.LoginUser;
import com.liegou.modules.api.entity.TokenEntity;
import com.liegou.modules.api.entity.UserEntity;
import com.liegou.utils.R;
import org.springframework.web.bind.annotation.*;

/**
 * API测试接口
 *
 * @author luckyhua
 * @since 2017/08/23
 * @version 1.0.0
 */
@RestController
@RequestMapping("/api")
public class ApiTestController {

    /**
     * 获取用户信息
     */
    @GetMapping("userInfo")
    public R userInfo(@LoginUser UserEntity user){
        return R.ok().put("user", user);
    }

    /**
     * 忽略Token验证测试
     */
    @AuthIgnore
    @GetMapping("notToken")
    public R notToken(){
        return R.ok().put("msg", "无需token也能访问。。。");
    }

    /**
     * 接收JSON数据
     */
    @PostMapping("jsonData")
    public R jsonData(@LoginUser UserEntity user, @RequestBody TokenEntity token){
        return R.ok().put("user", user).put("token", token);
    }
}
