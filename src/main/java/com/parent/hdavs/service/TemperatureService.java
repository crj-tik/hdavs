package com.parent.hdavs.service;

import com.parent.hdavs.bean.Temperature;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author CRJTemperatureService
 * @Date 2022.04.28/2022/4/28
 **/

@Service
public interface TemperatureService {

    Temperature queryId(int id);

    List<Temperature> queryList(int count);

    List<Integer> queryResult(int count);
}
