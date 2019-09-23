package com.st.java8;

public class TypeInference {

    public static void main(String[]args){
       // StringLength myLambda=(String s)->s.length();
        //we don't have to mention the type of argument compiler knows it's string
        StringLength myLambda= s->s.length();
        System.out.println(" selomie length is = "+myLambda.getLength("selomie") );
        printLambda(s->s.length());


    }
    public static  void printLambda(StringLength l){
        System.out.println("hello world length is ="+l.getLength("hello world"));
    }
    interface StringLength{
        int getLength(String s);
    }
}
