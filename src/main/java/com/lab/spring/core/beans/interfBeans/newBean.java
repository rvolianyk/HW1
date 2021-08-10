package com.lab.spring.core.beans.interfBeans;

import com.lab.spring.core.SortInterf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class newBean {

    SortInterf beanA;

    SortInterf beanB;

    SortInterf beanC;

    @Autowired
    public void setBeanA(@Qualifier("intBeanA") SortInterf beanA) {
        this.beanA = beanA;
    }

    @Autowired
    public void setBeanB(SortInterf beanB) {
        this.beanB = beanB;
    }

    @Autowired
    public void setBeanC(@Qualifier("intBeanC") SortInterf beanC) {
        this.beanC = beanC;
    }
}
