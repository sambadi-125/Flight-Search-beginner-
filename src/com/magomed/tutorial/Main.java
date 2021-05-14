package com.magomed.tutorial;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args){
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

            @Override
            public void run(){
                System.out.println("Task is complete :) ");
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2021);
        date.set(Calendar.MONTH,Calendar.MAY);
        date.set(Calendar.DAY_OF_MONTH,11);
        date.set(Calendar.HOUR_OF_DAY,23);
        date.set(Calendar.MINUTE,7);
        date.set(Calendar.SECOND,0);
        date.set(Calendar.MILLISECOND,0);

        //timer.schedule(task, 0);

        timer.schedule(task, date.getTime() );
        }
}

