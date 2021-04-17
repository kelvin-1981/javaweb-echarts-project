package com.yykj.echarts.controller;

import com.alibaba.fastjson.JSON;
import com.yykj.echarts.pojo.City;
import com.yykj.echarts.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DataController {

    @Autowired
    private CityService cityService;

    @GetMapping("/getAll")
    @ResponseBody
    public String getCityListJson(){
        List<City> cities = cityService.getCities();
        return JSON.toJSONString(cities);
    }
}
