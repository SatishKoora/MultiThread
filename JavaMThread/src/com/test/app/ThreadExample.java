package com.test.app;

public class ThreadExample implements Runnable {

    @Override
    public void run(){

    }

    public static void main(String[] args) {
        Thread thread1 = new Thread();
        thread1.start();
        try{
            thread1.sleep(1000);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        thread1.setPriority(1);
        int testpriority = thread1.getPriority();
        System.out.println(testpriority);
        System.out.println("Thread Running.....");
    }
}
