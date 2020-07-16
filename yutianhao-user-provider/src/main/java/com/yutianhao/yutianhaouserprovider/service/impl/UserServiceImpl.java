package com.yutianhao.yutianhaouserprovider.service.impl;

import com.yutianhao.yutianhaousercommon.entity.User;
import com.yutianhao.yutianhaouserprovider.mapper.UserMapper;
import com.yutianhao.yutianhaouserprovider.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author thyu
 * @since 2020-07-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
