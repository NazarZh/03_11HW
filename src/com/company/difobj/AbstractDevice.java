package com.company.difobj;

public abstract class AbstractDevice {
    String name;
    int serialNumber;

    public AbstractDevice(String name, int serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    public AbstractDevice() {
        powerOn();
    }

    abstract void powerOn();
    public abstract void powerOff();
}
