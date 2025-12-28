package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Alien ao1 = (Alien) ctx.getBean("alien");
        ctx.getBean("comp");
        ctx.getBean("comp");
        ctx.getBean("comp");

//        ao1.code();
    }
}
