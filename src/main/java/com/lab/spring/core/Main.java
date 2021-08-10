package com.lab.spring.core;

import com.lab.spring.core.beans.interfBeans.SortClass;
import com.lab.spring.core.config.AppConfigOne;
import com.lab.spring.core.config.AppConfigTwo;
import com.lab.spring.core.config.InjectConfig;
import com.lab.spring.core.config.SortConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

    private static final ApplicationContext CONTEXT1 = new AnnotationConfigApplicationContext(AppConfigOne.class);
    private static final ApplicationContext CONTEXT2 = new AnnotationConfigApplicationContext(AppConfigTwo.class);
    private static final ApplicationContext CONTEXT3 = new AnnotationConfigApplicationContext(InjectConfig.class);
    private static final ApplicationContext CONTEXT4 = new AnnotationConfigApplicationContext(SortConfig.class);

    public static void main(String[] args) throws NoSuchFieldException {
        config1();
        config2();
        config3();
        config4();
    }

    public static void config1() {
        System.out.println("Config 1");
        for (String beanDefinitionName : CONTEXT1.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        System.out.println("----------");
    }

    public static void config2() {
        System.out.println("Config 2");
        for (String beanDefinitionName : CONTEXT2.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        System.out.println("----------");
    }

    public static void config3() {
        System.out.println("Config 3");
        for (String beanDefinitionName : CONTEXT3.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        System.out.println("----------");
    }

    public static void config4() {
        System.out.println("Collection");
        CONTEXT4.getBean(SortClass.class).printBeans();
        System.out.println("----------");
        System.out.println("@Primary");
        for (String beanDefinitionName : CONTEXT4.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }
}
