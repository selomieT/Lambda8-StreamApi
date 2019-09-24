package com.st.java8unit2;

public class ClousureExample {
 /*   A Closure simply creates a scope that
    allows the function to access and manimupate the variables outside of its scope.*/

    public static void main(String[]args){
        int a=10;
        int b=20;//the value b has not to be changed, it is final or effectivelyFinal
        doProcess(a,i->System.out.println(i+b));
        //the b is not in the doprocess scope but it will contain the frozen value

    }

    public static void doProcess(int i,Process p){
        p.process(i);
    }

}
interface Process{
    void process(int i);
}
