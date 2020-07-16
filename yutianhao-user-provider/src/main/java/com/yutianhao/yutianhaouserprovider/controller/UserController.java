package com.yutianhao.yutianhaouserprovider.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yutianhao.yutianhaousercommon.entity.User;
import com.yutianhao.yutianhaousercommon.vo.UserVO;
import com.yutianhao.yutianhaouserprovider.service.IDeptService;
import com.yutianhao.yutianhaouserprovider.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author thyu
 * @since 2020-07-16
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;
    @Autowired
    private IDeptService iDeptService;
    @RequestMapping("list")
    public Page<User> list(UserVO vo, @RequestParam(defaultValue = "1")long current, @RequestParam(defaultValue = "5")long size){
        System.out.println(vo.getName());
        System.out.println(vo.getStartDate());
        System.out.println(vo.getEndDate());

        Page<User> page = new Page<>(current,size);
        Page<User> pageinfo = iUserService.query().like(null != vo.getName() && !vo.getName().equals(""), "name", vo.getName())
                .ge(null != vo.getStartDate(), "birthday", vo.getStartDate())
                .le(null != vo.getEndDate(), "birthday", vo.getEndDate())
                .page(page);
        for (User user : pageinfo.getRecords()) {
            user.setDept(iDeptService.getById(user.getDeptId()));
        }
        return pageinfo;
    }
}

