package com.example.jfdele;

import entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JfdeleApplication {

    public static void main(String[] args) {
        //SpringApplication.run(JfdeleApplication.class, args);
        Person p = new Person("jf");
        p.display();
    }

}
