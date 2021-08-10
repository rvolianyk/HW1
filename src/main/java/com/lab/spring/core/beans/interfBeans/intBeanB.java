package com.lab.spring.core.beans.interfBeans;

import com.lab.spring.core.SortInterf;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Primary
@Order(3)
public class intBeanB implements SortInterf {
    @Override
    public String getPosition() {
        return "1";
    }
}
