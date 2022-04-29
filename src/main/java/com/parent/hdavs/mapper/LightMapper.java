package com.parent.hdavs.mapper;

import com.parent.hdavs.bean.Light;

import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.28/2022/4/28
 **/


public interface LightMapper {
    Light queryId(int id);

    List<Light> queryList(int count);

    List<Integer> queryResult(int count);
}
