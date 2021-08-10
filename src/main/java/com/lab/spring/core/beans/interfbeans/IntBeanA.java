package com.lab.spring.core.beans.interfbeans;

import com.lab.spring.core.SortInterf;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class IntBeanA implements SortInterf {
    @Override
    public String getPosition() {return "0";}
}
