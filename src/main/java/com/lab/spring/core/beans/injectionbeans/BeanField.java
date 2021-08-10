package com.lab.spring.core.beans.injectionbeans;

import com.lab.spring.core.beans.otherbeans.OtherBeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanField {

    @Autowired
    @Qualifier("uniqueBean")
    private OtherBeanC otherBeanC;
}
