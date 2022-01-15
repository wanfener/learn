package com.example.learn.entity;

public class People {
    int a;
    public int b;
    protected int c;
    private int d;

    void sayA() {
        System.out.println(a);
    }

    public void sayB() {
        System.out.println("B");
    }

    protected void sayC() {
        System.out.println("C");
    }

    private void sayD() {
        System.out.println("D");
    }
}

