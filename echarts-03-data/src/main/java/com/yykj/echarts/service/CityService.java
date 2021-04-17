package com.yykj.echarts.service;

import com.yykj.echarts.dao.ICityDao;
import com.yykj.echarts.pojo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService{

    @Autowired
    private ICityDao cityDao;

    @Override
    public List<City> getCities() {
        return cityDao.getCities();
    }
}
