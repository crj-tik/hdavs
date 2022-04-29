package com.parent.hdavs.mapper;

import com.parent.hdavs.bean.Tilt;

import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.28/2022/4/28
 **/


public interface TiltMapper {
    Tilt queryId(int id);

    List<Tilt> queryList(int count);

    List<Integer> queryResult(int count);
}
