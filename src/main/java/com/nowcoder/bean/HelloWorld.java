package com.nowcoder.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yby on 2017/1/16.
 */

@Component
public class HelloWorld {



    public void setPerson(Person person) {
        this.person = person;
    }

    @Autowired
    private Person person;

    @Autowired
    private Person person2;

    private String name;

    public void output(){
        System.out.println("hello yby");

    }
    public void same(){
        System.out.println(this.hashCode());
        System.out.println("person hashcode: " + person.hashCode());
        System.out.println("person2 hashcode: " + person2.hashCode());
    }

    public void say(){
        System.out.println(person.name);
        System.out.println(person2.name);
        person.name = "gaigai";
        System.out.println(person.name);
        System.out.println(person2.name);
    }
}
