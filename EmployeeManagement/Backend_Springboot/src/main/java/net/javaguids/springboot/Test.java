package net.javaguids.springboot;


Code 1 : 
public class Test {
    public void m1(String s) {
        System.out.println("String arg method");
    }

    public void m1(StringBuffer d) {
        System.out.println("StringBuffer arg method");
    }

    public static void main(String[] args) {
        Test t = new Test();
        
        t.m1(null);         //Here I am getting Compilation Error (CE)
    }
}

Code 2 :

public class Test {
    public void m1(String s) {
        System.out.println("String arg method");
    }

    public void m1(Object d) {
        System.out.println("StringBuffer arg method");
    }

    public static void main(String[] args) {
        Test t = new Test();
        
        t.m1(null);         //Here I am not getting Compilation Error (CE) Why??
    }
}

