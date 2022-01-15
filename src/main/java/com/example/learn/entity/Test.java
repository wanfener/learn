package com.example.learn.entity;

import com.sun.org.apache.xpath.internal.operations.String;
import java.lang.*;

public class Test {

    static class Person {
        public void eat(Apple apple) {
            java.lang.String sss = "s";
            StringBuffer sb = new StringBuffer();
            StringBuilder sd = new StringBuilder();
            Apple peeled = apple.getPeeled();
            System.out.println("yummy");
        }
    }

    static class Peeler{
        static Apple peel(Apple apple) {
            return apple;
        }
    }

    static class Apple{
        Apple getPeeled() {
            return Peeler.peel(this);
        }
    }

    public static void main(String[] args) {
        People p = new People();
        p.a = 2;
        p.b = 3;
        p.c = 1;
        new Person().eat(new Apple());
        P1 x = new P1();
        x.a =1;
        x.b = 2;
        x.c = 3;
        x.sayA();
    }
}
