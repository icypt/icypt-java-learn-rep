package com.icypt.learn.example.Java8;

import java.io.Serializable;

public class LambdaDemo {

    public static void main(String args[]) {
//        TestB testB = new TestB(new TestA() {
//            @Override
//            public void eat() {
//                System.out.println("sdfs");
//            }
//
//            @Override
//            public void drink() {
//                System.out.println("fdsfds");
//
//            }
//        });
//
//        testB.testA.drink();
//        testB.testA.eat();




    }

    interface TestA {
     public void eat();

       public  void drink();
    }

    static class TestB {

        public  TestA testA;

        public TestB(TestA testA) {
            this.testA = testA;
        }
    }

}
