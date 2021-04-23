package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Language(null), "Java");
        Thread t2 = new Thread(new Language(t1), "C#");
        Thread t3 = new Thread(new Language(t2), "PHP");
        Thread t4 = new Thread(new Language(t3), "JavaScript");
        Thread t5 = new Thread(new Language(t4), "Go");
        Thread t6 = new Thread(new Language(t5), "Python");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
