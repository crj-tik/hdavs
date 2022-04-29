package com.parent.hdavs.service;

import com.parent.hdavs.bean.Tilt;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author CRJTiltService
 * @Date 2022.04.28/2022/4/28
 **/

@Service
public interface TiltService {

    Tilt queryId(int id);

    List<Tilt> queryList(int count);

    List<Integer> queryResult(int count);
}
