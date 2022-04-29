package com.parent.hdavs.mapper;

import com.parent.hdavs.bean.User;

import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.28/2022/4/28
 **/


public interface UserMapper {
    User queryName(String name);

    User queryPhone(int phone);

    List<User> queryList();
}
