package com.st.java8unit3;

public class MethodReference1 {
    public static void main(String[]args){
        //method reference is an alternative way of using lambda expression
       // MethodReference1::PrintMessage==()->PrintMessage()
       // Thread t=new Thread(()->PrintMessage());
        Thread t=new Thread(MethodReference1::PrintMessage);
        t.start();
    }
    public static  void PrintMessage(){
        System.out.println("Hello");
    }
}
