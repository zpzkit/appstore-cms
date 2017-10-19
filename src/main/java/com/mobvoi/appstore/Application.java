package com.mobvoi.appstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by watson on 2017/10/19.
 */
@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args){
      SpringApplication.run(Application.class, args);
    }
}
