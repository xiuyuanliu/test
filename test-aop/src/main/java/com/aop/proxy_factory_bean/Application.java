package com.aop.proxy_factory_bean;

import com.aop.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/proxy_factory_bean/*.xml")
public class Application {


    public static void main(String[] args) {


        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);


        MyService myService = run.getBean("myProxy", MyService.class);

        myService.doSomething();

        run.close();
    }

}
