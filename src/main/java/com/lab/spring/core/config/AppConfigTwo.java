package com.lab.spring.core.config;

import com.lab.spring.core.beans.beans3.BeanE;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = {"com.lab.spring.core.beans.beans2", "com.lab.spring.core.beans.beans3"}
        , excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {BeanE.class})})
public class AppConfigTwo {
    
}
