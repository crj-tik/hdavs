package com.parent.hdavs.controller;

import com.parent.hdavs.bean.Tilt;
import com.parent.hdavs.service.TiltService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.29/2022/4/29
 **/

@Controller
@RequestMapping("/tilt")
public class TiltController {

    @Resource
    private TiltService tiltService;

    @RequestMapping("/queryId")
    public Tilt queryId(int id){
        return tiltService.queryId(id);
    }

    @RequestMapping("/queryList")
    public List<Tilt> queryList(int count){
        return tiltService.queryList(count);
    }

    @RequestMapping("/queryResult")
    public List<Integer> queryResult(int count){
        return tiltService.queryResult(count);
    }
}
