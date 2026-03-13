package com.dddj.controller;

import com.dddj.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DDDJ
 **/@RestController
public class HelloController {

     @Value("${name}")
    private String name;

    @Value("${person2.name}")
    private String person2Name;

    @Value("${person.age}")
    private int age;

    @Value("${address[0]}")
    private String address1;

    @Value("${msg1}")
    private String msg1;

    @Value("${msg2}")
    private String msg2;

    @Autowired
    private Environment environment;

    @Autowired
    private Person person;

    @RequestMapping("/env")
    public String env(){
        return environment.getProperty("person2.name");
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello SpringBoot";
    }

     @RequestMapping("/name")
    public String name(){
         return name + "\n" + person2Name + "\n" + age + "\n" + address1;
     }

     @RequestMapping("/msg")
    public String msg(){
    	 return msg1 + "\n" + msg2;
     }

     @RequestMapping("/person")
    public Person person(){
    	 return person;
     }

}
