package com.lab.spring.core.beans.injectionBeans;

import com.lab.spring.core.beans.otherBeans.OtherBeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class beanConstruct {

    @Autowired
    public beanConstruct(OtherBeanA otherBeanA) {}
}
