package com.gurung.demospringcloudstream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class DemoSpringCloudStreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringCloudStreamApplication.class, args);
    }

    @Bean
    Function<String,String> upperCase(){
        return r->{
            System.out.println("message from topic: "+r);
            r=r.toUpperCase();
            System.out.println("returning to the topic: "+r);
            return r;
        };
    }

}
