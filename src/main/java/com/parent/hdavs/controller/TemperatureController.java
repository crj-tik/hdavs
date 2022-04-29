package com.parent.hdavs.controller;

import com.parent.hdavs.bean.Temperature;
import com.parent.hdavs.service.TemperatureService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.29/2022/4/29
 **/

@Controller
@RequestMapping("/temperature")
public class TemperatureController {

    @Resource
    private TemperatureService temperatureService;

    @RequestMapping("/queryId")
    public Temperature queryId(int id){
        return temperatureService.queryId(id);
    }

    @RequestMapping("/queryList")
    public List<Temperature> queryList(int count){
        return temperatureService.queryList(count);
    }

    @RequestMapping("/queryResult")
    public List<Integer> queryResult(int count){
        return temperatureService.queryResult(count);
    }
}
