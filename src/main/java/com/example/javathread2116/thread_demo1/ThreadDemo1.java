package com.example.javathread2116.thread_demo1;

public class ThreadDemo1 extends Thread {

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "当前执行的线程是" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        ThreadDemo1 threadDemo2 = new ThreadDemo1();
        ThreadDemo1 threadDemo3 = new ThreadDemo1();
        threadDemo1.start();
        threadDemo2.start();
        threadDemo3.start();
    }
}
