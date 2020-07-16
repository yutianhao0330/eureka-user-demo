package com.yutianhao.yutianhaouserconsumer.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yutianhao.yutianhaousercommon.entity.User;
import com.yutianhao.yutianhaousercommon.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author thyu
 * @title: UserService
 * @projectName yutianhao-eureka-user
 * @description: TODO
 * @date 2020/7/17 0:07
 */
@FeignClient(name = "user-service")
public interface UserService {
    @RequestMapping("/user/list")
    Page<User> list(UserVO vo, @RequestParam("current") long current, @RequestParam("size") long size);

}
