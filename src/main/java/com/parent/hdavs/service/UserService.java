package com.parent.hdavs.service;

import com.parent.hdavs.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author CRJUserService
 * @Date 2022.04.28/2022/4/28
 **/

@Service
public interface UserService {

    User queryName(String name);

    User queryPhone(int phone);

    List<User> queryList();
}
