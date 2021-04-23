package com.company;

public class Language implements Runnable {
    private Thread waitFor;

    public Language(Thread waitFor) {
        this.waitFor = waitFor;
    }

    @Override
    public void run() {
        if (waitFor != null) {
            try {
                waitFor.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName());
    }
}