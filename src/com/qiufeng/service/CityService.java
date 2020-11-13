package com.qiufeng.service;

import com.qiufeng.domain.City;

import java.util.List;

/**
 * 城市业务
 */
public interface CityService {

    /**
     * 根据id查询城市
     * @param id 城市id
     * @return  城市
     */
    City findCityById(Integer id);

    /**
     * 查询所有城市
     * @return 城市集合
     */
    List findAll();

}
