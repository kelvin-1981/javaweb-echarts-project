package com.yykj.echarts.service;

import com.yykj.echarts.pojo.City;
import org.springframework.stereotype.Service;
import java.util.List;

public interface ICityService {

    public List<City> getCities();
}
