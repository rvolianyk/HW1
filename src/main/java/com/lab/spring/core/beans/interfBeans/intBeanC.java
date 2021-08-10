package com.lab.spring.core.beans.interfBeans;

import com.lab.spring.core.SortInterf;
import org.springframework.context.annotation.Primary;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class intBeanC implements SortInterf {
    @Override
    public String getPosition() {
        return "2";
    }
}
