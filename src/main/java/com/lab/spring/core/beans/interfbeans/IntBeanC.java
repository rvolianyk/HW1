package com.lab.spring.core.beans.interfbeans;

import com.lab.spring.core.SortInterf;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class IntBeanC implements SortInterf {
    @Override
    public String getPosition() {return "2";}
}
