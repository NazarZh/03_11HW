package com.company.difobj;

public class Mobile extends Phone {

    int simCount;
    int display;

    public Mobile(int simCount, int display) {
        this.simCount = simCount;
        this.display = display;
    }

    @Override
    public void powerOn() {
        System.out.println("Мобильный телефон включается");
    }

    @Override
    public void powerOff() {
        System.out.println("Мобильный телефон выключается");
    }

    @Override
    public void call() {
        System.out.println("Звоним по " + display +
                " дюймовому мобильному телефону c номером "+simCount);
    }
}
