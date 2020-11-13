package com.qiufeng.service.impl;

import com.qiufeng.domain.City;
import com.qiufeng.mapper.CityMapper;
import com.qiufeng.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 城市业务处理
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    /**
     * 根据id查询城市
     * @param id 城市id
     * @return  城市
     */
    @Override
    public City findCityById(Integer id) {
        return cityMapper.findCityById(id);
    }

    /**
     * 查询所有城市
     * @return 城市集合
     */
    @Override
    public List findAll() {
        return cityMapper.findAll();
    }
}
