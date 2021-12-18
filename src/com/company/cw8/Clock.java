package com.company.cw8;

public class Clock implements Runnable {
    private boolean isCanceled = false;

    public void cancel() {
        this.isCanceled = true;
    }

    @Override
    public void run() {
        while (!isCanceled) {
            try {
                System.out.println("Tik");
                Thread.sleep(1000);
                System.out.println("Tak");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
