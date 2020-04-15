package ru.kpfu.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Iskander Valiev
 * created by isko
 * on 4/15/20
 */
@SpringBootApplication
@ComponentScan("ru.kpfu")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
