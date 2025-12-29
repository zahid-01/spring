package org.example;

import config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

//        ctx.getBean("hp", Desktop.class).compile();

        ctx.getBean(Alien.class).code();
        
    }
}
