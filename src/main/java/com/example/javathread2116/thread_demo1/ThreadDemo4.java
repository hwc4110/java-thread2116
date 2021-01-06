package com.example.javathread2116.thread_demo1;

public class ThreadDemo4 implements Runnable {

    private int countDown = 10;

    private static int taskCount = 0;

    private final int id = taskCount++;

    public ThreadDemo4(){}

    public ThreadDemo4(int countDown){
        this.countDown = countDown;
    }

    public String status(){
        return "#" + id + "{" + (countDown > 0 ? countDown : "stop!") + "}";
    }


    @Override
    public void run() {
        while (countDown-- > 0){
            System.out.print(status() + "  ");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(new ThreadDemo4()).start();
        }
    }
}
