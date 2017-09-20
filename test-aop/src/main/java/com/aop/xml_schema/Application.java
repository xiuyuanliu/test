package com.aop.xml_schema;

import com.aop.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/xml_schema/*.xml")
public class Application {


    public static void main(String[] args) {


        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

        MyService bean = run.getBean(MyService.class);

        bean.doSomething();

        run.close();

    }
}