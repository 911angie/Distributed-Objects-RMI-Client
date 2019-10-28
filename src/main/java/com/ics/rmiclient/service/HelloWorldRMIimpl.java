package com.ics.rmiclient.service;

import java.util.Date;

public class HelloWorldRMIimpl implements HelloWorldRMI {

    @Override
    public String sayHelloRmi(String message) {
        System.out.println("================Server Side ========================");
        System.out.println("Inside Rmi IMPL - Incoming message : " + message);
        return "Hello " + message + " :: Response time - > " + new Date();
    }
}
