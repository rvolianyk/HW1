package com.lab.spring.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(value = "com.lab.spring.core.beans.interfBeans")
public class SortConfig {

}
