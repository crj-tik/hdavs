package com.parent.hdavs.controller;

import com.parent.hdavs.bean.Light;
import com.parent.hdavs.service.LightService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.29/2022/4/29
 **/

@Controller
@RequestMapping("/light")
public class LightController {

    @Resource
    private LightService lightService;

    @RequestMapping("/queryId")
    public Light queryId(int id){
        return lightService.queryId(id);
    }

    @RequestMapping("/queryList")
    public List<Light> queryList(int count){
        return lightService.queryList(count);
    }

    @RequestMapping("/queryResult")
    public List<Integer> queryResult(int count){
        return lightService.queryResult(count);
    }
}
