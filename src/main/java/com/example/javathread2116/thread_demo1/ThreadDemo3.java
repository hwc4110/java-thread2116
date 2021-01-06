package com.example.javathread2116.thread_demo1;

public class ThreadDemo3 {

    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run(){
                long id = this.getId();
                System.out.println("threadde的id====>" + id);

                String name = this.getName();
                System.out.println("thread的名字====>" + name);

                int priority = this.getPriority();
                System.out.println("thread的优先级---->" + priority);

                boolean isDaemon = this.isDaemon();
                System.out.println("thread是否为守护线程--->" + isDaemon);

                boolean isInterrupted = this.isInterrupted();
                System.out.println("thread是否被中断" + isInterrupted);

            }
        };
        thread.start();
    }
}
