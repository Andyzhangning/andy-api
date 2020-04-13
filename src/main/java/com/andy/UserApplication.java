package com.andy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


/**
 * @author crg
 * @date 2019/05/29
 */
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        ApplicationContext ctx =   SpringApplication.run(UserApplication.class, args);
    }
}
