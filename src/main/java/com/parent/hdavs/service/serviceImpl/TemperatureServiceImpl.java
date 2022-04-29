package com.parent.hdavs.service.serviceImpl;

import com.parent.hdavs.bean.Temperature;
import com.parent.hdavs.mapper.TemperatureMapper;
import com.parent.hdavs.service.TemperatureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.28/2022/4/28
 **/

@Service
public class TemperatureServiceImpl implements TemperatureService {

    @Resource
    private TemperatureMapper temperatureMapper;

    @Override
    public Temperature queryId(int id) {
        return temperatureMapper.queryId(id);
    }

    @Override
    public List<Temperature> queryList(int count) {
        return temperatureMapper.queryList(count);
    }

    @Override
    public List<Integer> queryResult(int count) {
        return temperatureMapper.queryResult(count);
    }
}
