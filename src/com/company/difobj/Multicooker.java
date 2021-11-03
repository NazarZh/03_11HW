package com.company.difobj;

abstract class Multicooker extends AbstractDevice{

    @Override
    public void powerOn() {
        System.out.println("Включаем прибор");
    }

    @Override
    public void powerOff() {
        System.out.println("Выключаем прибор");
    }

    abstract void cook();
}
