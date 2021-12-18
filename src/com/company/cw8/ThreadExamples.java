package com.company.cw8;

import java.sql.SQLOutput;

public class ThreadExamples {

    public static void main(String[] args) throws InterruptedException {
//        long start = System.currentTimeMillis();
//
//        System.out.println(Thread.currentThread().getName() + " started");
//
////        Printer printer0 = new Printer();
////        Printer printer1 = new Printer();
////        Printer printer2 = new Printer();
////
////        printer0.start();
////        printer1.start();
////        printer2.start();
//
//        Thread childThread0 = new Thread(new Printer());
//        Thread childThread1 = new Thread(new Printer());
//        Thread childThread2 = new Thread(new Printer());
//
//        childThread0.start();
//        childThread0.join();
//
//        childThread1.start();
//        childThread1.join();
//
//        childThread2.start();
//        childThread2.join();
//
//        System.out.println(Thread.currentThread().getName() + " is finished");
//
//        System.out.println(System.currentTimeMillis() - start);

        Clock clock = new Clock();
        Thread thread = new Thread(clock);

        thread.start();

        for (int i = 0; i < 100; i++) {
            if (i == 99) {
                clock.cancel();
            }
            Thread.sleep(200);
        }

    }

//    static class Printer extends Thread{
//
//        @Override
//        public void run() {
//            long start = System.currentTimeMillis();
//
//            System.out.println(Thread.currentThread().getName() + " started");
//            for (int i = 0; i < 55; ++i) {
//                System.out.println(Thread.currentThread().getName() + " is running");
//            }
//            System.out.println(Thread.currentThread().getName() + " is finished");
//
//            System.out.println(System.currentTimeMillis() - start);
//        }
//    }

    static class Printer implements Runnable {

        @Override
        public void run() {
            long start = System.currentTimeMillis();

            System.out.println(Thread.currentThread().getName() + " started");
            for (int i = 0; i < 15; ++i) {
                System.out.println(Thread.currentThread().getName() + " is running");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " is finished");

            System.out.println(System.currentTimeMillis() - start);
        }
    }

}
