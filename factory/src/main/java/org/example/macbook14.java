package org.example;

public class macbook14 implements IComputer{
    @Override
    public int getBattery() {
        return 0;
    }
    macbook14(){
        System.out.println("macook14 created");
    }
    @Override
    public int getScreenSize() {
        return 0;
    }

    @Override
    public String getSeriesCode() {
        return null;
    }
}
