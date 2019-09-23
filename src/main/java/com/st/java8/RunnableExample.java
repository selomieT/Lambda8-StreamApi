package com.st.java8;

public class RunnableExample {

    public static void  main(String[]args){
        Thread myThread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("printed inside runnable");
            }
        });
        myThread.run();

        Thread myLambdaThread=new Thread(()->System.out.println("printed inside lammda"));
        myLambdaThread.run();

        //lambda  is acted  as an instance of interface to achive back ward compatability
        //having the interface mechanizm for declaring lambdas to have backward comptatability
    }
}
