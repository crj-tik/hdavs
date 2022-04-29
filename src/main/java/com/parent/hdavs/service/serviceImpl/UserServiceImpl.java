package com.parent.hdavs.service.serviceImpl;

import com.parent.hdavs.bean.Tilt;
import com.parent.hdavs.bean.User;
import com.parent.hdavs.mapper.TiltMapper;
import com.parent.hdavs.mapper.UserMapper;
import com.parent.hdavs.service.TiltService;
import com.parent.hdavs.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.28/2022/4/28
 **/

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User queryName(String name) { return userMapper.queryName(name); }

    @Override
    public User queryPhone(int phone) { return userMapper.queryPhone(phone);
    }

    @Override
    public List<User> queryList() {
        return userMapper.queryList();
    }
}
