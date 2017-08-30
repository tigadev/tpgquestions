package com.question.third;

//created by adzam on 31/8/2017
public class StopWatch {

    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;

    public StopWatch() {
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }

    public String toString(){
        long millisecond = stopTime - startTime;
        int seconds = (int) (millisecond / 1000) % 60 ;
        int minutes = (int) ((millisecond / (1000*60)) % 60);
        int hours   = (int) ((millisecond / (1000*60*60)) % 24);

        return hours + ":" + minutes + ":" + seconds;
    }
}
