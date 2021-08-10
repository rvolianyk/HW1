package com.lab.spring.core.beans.injectionBeans;

import com.lab.spring.core.beans.otherBeans.OtherBeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class beanField {

    @Autowired
    @Qualifier("uniqueBean")
    private OtherBeanC otherBeanC;
}
