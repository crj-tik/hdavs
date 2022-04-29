package com.parent.hdavs.service.serviceImpl;

import com.parent.hdavs.bean.Light;
import com.parent.hdavs.mapper.LightMapper;
import com.parent.hdavs.service.LightService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.28/2022/4/28
 **/

@Service
public class LightServiceImpl implements LightService {

    @Resource
    private LightMapper lightMapper;

    @Override
    public Light queryId(int id) {
        return lightMapper.queryId(id);
    }

    @Override
    public List<Light> queryList(int count) {
        return lightMapper.queryList(count);
    }

    @Override
    public List<Integer> queryResult(int count) {
        return lightMapper.queryResult(count);
    }
}
