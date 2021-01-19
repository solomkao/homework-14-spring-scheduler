package com.solomka;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Date());
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
    }

}
