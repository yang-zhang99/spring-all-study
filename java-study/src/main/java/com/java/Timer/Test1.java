package com.java.Timer;

import java.util.Date;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Test1 {
    
    public static void main(String[] args) throws InterruptedException {
        long newTime = System.currentTimeMillis();
        
        System.out.println(newTime + " 当前时间--- " + Thread.currentThread().getName() + "Start");
        
        long scheduleTime = (newTime + 10000);
        
        System.out.println(scheduleTime + " 计划时间--- " + Thread.currentThread().getName() + "Start");
        
        
        MyTask myTask = new MyTask();
        
        Timer timer = new Timer();
        
        TimeUnit.SECONDS.sleep(1);
        
        timer.schedule(myTask, new Date(scheduleTime));
        
        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
        
    }
    
}
