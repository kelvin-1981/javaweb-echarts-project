package com.yykj.echarts.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {

    @JSONField(name = "name")
    private String name;

    @JSONField(name = "value")
    private float value;
}
