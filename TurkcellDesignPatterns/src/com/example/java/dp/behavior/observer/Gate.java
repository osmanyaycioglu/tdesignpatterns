package com.example.java.dp.behavior.observer;

public class Gate implements IAlarm {

    static {
        AlarmDist.getInstance()
                 .registerAlarmHandler(new Gate());
    }

    public void open() {
        System.out.println("Gate open");
    }

    public void close() {
        System.out.println("Gate open");

    }

    @Override
    public void alarmOn() {
        this.open();
    }

    @Override
    public void alarmOff() {

    }
}
