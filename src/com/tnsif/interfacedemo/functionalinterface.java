package com.tnsif.interfacedemo;
interface functional {
    void A();
}

class B implements functional {
    @Override
    public void A() {
        System.out.println("print A");
    }
}

public class functionalinterface {   
    public static void main(String[] args) {
        B b = new B();
        b.A();
    }
}