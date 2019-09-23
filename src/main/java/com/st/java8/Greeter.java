package com.st.java8;

public class Greeter {
    public  static  void greet(Greeting greeting){
        greeting.perform();
    }


    public static  void  main(String[]args){
        Greeter greeter=new Greeter();
        //greeter.greet();

      /*  we create interface Greeting and has perform method
        we create class HellowordGreeting a implements greeting interface
       */

        HelloWorldGreeting helloWorldGreeting=new HelloWorldGreeting();

        //using annonymous class
        Greeting annonymousGreeting=new Greeting() {//
            @Override
            public void perform() {
                System.out.println("Hello world");
            }
        };

        //intead of passing behaviour through instance we can use lambda

        Greeting lambdaGreeting=()->System.out.println("Hello world");



        lambdaGreeting.perform();//implemating function
        helloWorldGreeting.perform();
        annonymousGreeting.perform();

        greet(()->System.out.println("Hello world"));
    }

}
