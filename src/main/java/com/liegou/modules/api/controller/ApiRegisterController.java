package com.liegou.modules.api.controller;

import com.liegou.modules.api.annotation.AuthIgnore;
import com.liegou.modules.api.service.UserService;
import com.liegou.utils.R;
import com.liegou.validator.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注册
 * @author luckyhua
 * @since 2017/08/23
 * @version 1.0.0
 */
@RestController
@RequestMapping("/api")
public class ApiRegisterController {
    @Autowired
    private UserService userService;

    /**
     * 注册
     */
    @AuthIgnore
    @PostMapping("register")
    public R register(String mobile, String password){
        Assert.isBlank(mobile, "手机号不能为空");
        Assert.isBlank(password, "密码不能为空");

        userService.save(mobile, password);

        return R.ok();
    }
}
