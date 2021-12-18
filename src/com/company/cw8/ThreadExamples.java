package com.company.cw8;

public class ThreadExamples {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "started");

        Printer printer = new Printer();
        Thread childThread = new Thread(printer);
        childThread.start();

        for (int i = 0; i < 50; ++i) {
            System.out.println(Thread.currentThread().getName() + " is running");
        }

        System.out.println(Thread.currentThread().getName() + " is finished");
    }

    static class Printer implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " started");
            for (int i = 0; i < 50; ++i) {
                System.out.println(Thread.currentThread().getName() + " is running");
            }
            System.out.println(Thread.currentThread().getName() + " is finished");
        }
    }

}
