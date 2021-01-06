package com.example.javathread2116.thread_demo1;

public class ThreadDemo2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 1000; j++){
                System.out.println("当前执行的线程是" + Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo2 threadDemo2 = new ThreadDemo2();
        ThreadDemo2 threadDemo21 = new ThreadDemo2();
        Thread thread1 = new Thread(threadDemo2);
        Thread thread2 = new Thread(threadDemo21);
        thread1.start();
        thread2.start();
        System.out.println("当前线程->>" + Thread.currentThread().getName());
    }
}
