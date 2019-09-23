package com.st.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8Demo {

    public static void main(String[]args){

        List<Integer> values= Arrays.asList(1,2,3,4,5);
        //inhanced for loop ,it is external iteration
        System.out.println("printing out using inhanced for loop");
        for(Integer num:values){
            System.out.print(num);
        }

        //iteration using annonymous class
        System.out.println();
        System.out.println("printing out using anonymous class");
        Consumer<Integer> c=new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer);
            }
        };
        values.forEach(c);

        // internal iteration using lambda
        System.out.println();
        System.out.println("printing out using lambda");
    values.forEach(s->System.out.print(s));
    }
}
