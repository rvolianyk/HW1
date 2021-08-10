package com.lab.spring.core.beans.injectionbeans;

import com.lab.spring.core.beans.otherbeans.OtherBeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanConstruct {

    @Autowired
    public BeanConstruct(OtherBeanA otherBeanA) {}
}
