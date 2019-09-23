package com.st.java8;

import java.util.*;

public class UnitExercises {

    public static void main(String[]args){

        List<Person> people= Arrays.asList(
                new Person("seli","mequ",28),
                new Person("nesi","teshome",28),
                new Person("nunu","mequ",28),
                new Person("king","kidane",28)
        );

        //java 7 way
        //step 1 sort list by last name

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        //create method to print all elements
        printAll(people);

        //create a method print all people that have last name begging with m
        printLastNameStartWithM(people);


        //java 8 way sorting and filtering

        System.out.println("***java 8 way ****");

        Collections.sort(people,(e1,e2)->e1.getLastName().compareTo(e2.getLastName()));


        System.out.println("print out all elements in people list in sorted  ");
        people.forEach( s->System.out.println(s));
        System.out.println("print out all elements in people list last name start with m ");
        people.stream().filter(s->s.getLastName().startsWith("m")).forEach(s->System.out.println(s));

    }
    public static void printAll(List<Person>people){
        for(Person p:people){
            System.out.println(p);
        }
    }
    public static void printLastNameStartWithM(List<Person>people){
        for(Person p:people){
            if(p.getLastName().startsWith("m")) {
                System.out.println("printing last name start with m "+p);
            }
        }
    }
}
