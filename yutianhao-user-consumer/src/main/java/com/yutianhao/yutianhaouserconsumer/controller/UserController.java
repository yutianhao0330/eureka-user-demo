package com.yutianhao.yutianhaouserconsumer.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yutianhao.yutianhaousercommon.entity.User;
import com.yutianhao.yutianhaousercommon.vo.UserVO;
import com.yutianhao.yutianhaouserconsumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author thyu
 * @title: UserController
 * @projectName yutianhao-eureka-user
 * @description: TODO
 * @date 2020/7/17 0:09
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("list")
    public Page<User> list(UserVO vo, @RequestParam(defaultValue = "1")long current, @RequestParam(defaultValue = "5")long size){
        System.out.println(vo.getName());
        System.out.println(vo.getStartDate());
        System.out.println(vo.getEndDate());
        return userService.list(vo,current,size);
    }
}
