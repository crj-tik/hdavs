package com.parent.hdavs.service;

import com.parent.hdavs.bean.Humidity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author CRJHumidityService
 * @Date 2022.04.28/2022/4/28
 **/

@Service
public interface HumidityService {

    Humidity queryId(int id);

    List<Humidity> queryList(int count);

    List<Integer> queryResult(int count);
}
