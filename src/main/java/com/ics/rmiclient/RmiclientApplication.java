package com.ics.rmiclient;

import com.ics.rmiclient.service.CabBookingService;
import com.ics.rmiclient.service.HelloWorldRMI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import java.time.LocalTime;

@SpringBootApplication
public class RmiclientApplication {

    @Bean
    RmiProxyFactoryBean rmiProxy() {
        RmiProxyFactoryBean bean = new RmiProxyFactoryBean();
//        bean.setServiceInterface(HelloWorldRMI.class);
//        bean.setServiceUrl("rmi://localhost:8080/helloworldrmi");
        bean.setServiceInterface(CabBookingService.class);
        bean.setServiceUrl("rmi://localhost:1099/cabBooking");

        return bean;
    }

    public static void main(String[] args) {
//        HelloWorldRMI helloWorldRMI = SpringApplication.run(RmiclientApplication.class, args).getBean(HelloWorldRMI.class);
        CabBookingService newOrder = SpringApplication.run(RmiclientApplication.class, args).getBean(CabBookingService.class);

        System.out.println("================Client Side ========================");
//        System.out.println(helloWorldRMI.sayHelloRmi("David"));
        System.out.println(newOrder.bookRide("Madaraka", LocalTime.now()));
    }

}
