package com.yykj.echarts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

/**
 * MVC配置信息
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    /**
     * 自定义视图控制器 转向首页
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
    }

    /**
     * 注册自定义视图解析器
     * @return
     */
    @Bean
    public MyViewResolvers myViewResolvers(){
        return new MyViewResolvers();
    }

    /**
     * 自定义视图解析器类
     */
    public static class MyViewResolvers implements ViewResolver {
        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }
}
