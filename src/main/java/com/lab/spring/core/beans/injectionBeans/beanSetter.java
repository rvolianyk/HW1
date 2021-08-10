package com.lab.spring.core.beans.injectionBeans;

import com.lab.spring.core.beans.otherBeans.OtherBeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class beanSetter {

    private OtherBeanB otherBeanB;

    @Autowired
    public void setOtherBeanB(OtherBeanB otherBeanB) {
        this.otherBeanB = otherBeanB;
    }
}
