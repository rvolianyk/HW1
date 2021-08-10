package com.lab.spring.core.beans.interfBeans;

import com.lab.spring.core.SortInterf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SortClass {

    @Autowired
    public List<SortInterf> beans;

    public void printBeans() {
        for (SortInterf bean: beans) {
            System.out.println(bean);
        }
    }
}
