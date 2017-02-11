package com.sample;

class A{
    void foo(){
        System.out.printf("a");
    }
    static void staticFoo()
    {
        System.out.printf("a");
    }
}

class B extends A{
    void foo(){
        System.out.printf("b");
    }
    static void staticFoo()
    {
        System.out.printf("b");
    }

}

public class Polymorphism {

    public static void main(String[] args) {
	// write your code here

        A a = new B();
        a.foo(); // print b
        a.staticFoo(); // print a because the static function of A
        a = new A();
        a.foo(); // print a
        a.staticFoo();// print a because the static function of A
        B b = new B();
        b.foo(); // print b
        a.staticFoo(); // print a because the static function of A
        //So, out string is baaaba

    }
}


