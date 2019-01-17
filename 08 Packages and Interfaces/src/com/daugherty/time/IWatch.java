package com.daugherty.time;

public interface IWatch {

    public static long getUNIXEpochTime(){
        long unixTime = System.currentTimeMillis();
        return unixTime;
    }

}
