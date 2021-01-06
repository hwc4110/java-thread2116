package com.example.javathread2116.thread_demo1;

public class ThreadDemo5 {
    private static boolean isFinish = false;

    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run(){
                System.out.println("图片下载中..");
                for (int i = 0; i < 100; i++) {
                    System.out.println("下载进度" + i + "%");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                isFinish = true;
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run(){
                System.out.println("开始显示图片");
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (!isFinish){
                    System.out.println("下载图片出错.");
                }
                System.out.println("图片正常展示");
            }
        };
        thread.start();
        thread2.start();
    }

}
