package com.lab.spring.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.lab.spring.core.beans.otherbeans" , "com.lab.spring.core.beans.injectionbeans"})
public class InjectConfig {

}
