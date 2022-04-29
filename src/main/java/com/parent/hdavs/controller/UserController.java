package com.parent.hdavs.controller;

import com.parent.hdavs.bean.Tilt;
import com.parent.hdavs.bean.User;
import com.parent.hdavs.service.TiltService;
import com.parent.hdavs.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.29/2022/4/29
 **/

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/queryId")
    public User queryName(String name){
        return userService.queryName(name);
    }

    @RequestMapping("/queryList")
    public User queryPhone(int phone){
        return userService.queryPhone(phone);
    }

    @RequestMapping("/queryResult")
    public List<User> queryList(){
        return userService.queryList();
    }
}
