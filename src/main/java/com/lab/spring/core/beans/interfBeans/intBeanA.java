package com.lab.spring.core.beans.interfBeans;

import com.lab.spring.core.SortInterf;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class intBeanA implements SortInterf {
    @Override
    public String getPosition() {
        return "0";
    }
}
