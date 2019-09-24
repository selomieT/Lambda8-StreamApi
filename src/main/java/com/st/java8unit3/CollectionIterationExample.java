package com.st.java8unit3;

import com.st.java8.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static  void main(String[]args){
        List<Person>people= Arrays.asList(
                new Person("seli","mequ",28),
                new Person("king","kidane",28),
                new Person("seli","mequ",28)
        );
        System.out.println("Using for loop");
        for(int i=0;i<people.size();i++){
            System.out.println(people.get(i));
        }
        System.out.println("Using for in loop");
        for(Person p:people){
            System.out.println(p);
        }
        System.out.println("Using for Each");
        //this is good for multiThreading
        people.forEach(p->System.out.println(p));
        people.forEach(System.out::println);

        System.out.println("Using stream");
        people.stream().filter(p->p.getLastName().startsWith("k")).forEach(System.out::println);
       long count= people.stream().filter(p->p.getLastName().startsWith("k")).count();
       System.out.println(count);

    }
}
