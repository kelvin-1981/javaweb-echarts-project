package com.yykj.echarts.dao;

import com.yykj.echarts.pojo.City;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ICityDao {

    public List<City> getCities();
}
