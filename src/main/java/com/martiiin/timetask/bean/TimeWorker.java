package com.martiiin.timetask.bean;

public interface TimeWorker {

    String getName();


    String getTime();

    Long getMilesTime();

    int start();


    int stop();


    int clear();

    void modifyTime();

    void setTime(String time);



}
