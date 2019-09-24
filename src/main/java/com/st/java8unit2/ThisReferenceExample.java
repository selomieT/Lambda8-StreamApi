package com.st.java8unit2;

public class ThisReferenceExample {
    public void doProcess(int i,Process p){
        p.process(i);
    }
    public void excute(){
        doProcess(10,i->{
            System.out.println("the value of i =" +i);
            System.out.println(this);//this point to the instance of object (ThisReferenceExample
        });
    }
    public  String toString(){
        return "this is the main ThisReference class instance";
    }
    public static void main(String[]args){
        ThisReferenceExample thisReferenceExample=new ThisReferenceExample();
        thisReferenceExample.excute();
      /*  thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("value of i = "+i);
                System.out.println(this);//this keyword reference the instance of annonymous inner class
            }
            public String toString(){
                return "this is annoymous inner class";
            }
        });*/
        //System.out.println(this); it is not work because in static we can not use this

        thisReferenceExample.doProcess(10,i->{
            System.out.println("the value of i ="+i);
            //System.out.println(this); we will get an error,lambda expression don't override this
        });
    }
}
