package com.parent.hdavs.service.serviceImpl;

import com.parent.hdavs.bean.Heart;
import com.parent.hdavs.mapper.HeartMapper;
import com.parent.hdavs.service.HeartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.28/2022/4/28
 **/

@Service
public class HeartServiceImpl implements HeartService {

    @Resource
    private HeartMapper heartMapper;

    @Override
    public Heart queryId(int id) {
        return heartMapper.queryId(id);
    }

    @Override
    public List<Heart> queryList(int count) {
        return heartMapper.queryList(count);
    }

    @Override
    public List<Integer> queryResult(int count) {
        return heartMapper.queryResult(count);
    }
}
