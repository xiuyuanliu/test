package com.aop.anno;

import com.aop.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    @Bean
    public MyService myService() {
        return new MyService();
    }

    @Bean
    public MyAspect myAspect() {
        return new MyAspect();
    }

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        MyService bean = run.getBean(MyService.class);
        bean.doSomething();

        run.close();
    }
}
