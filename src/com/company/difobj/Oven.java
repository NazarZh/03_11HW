package com.company.difobj;

public class Oven extends Multicooker{
    @Override
    public void powerOn() {
        System.out.println("Включаем духовку");
    }

    @Override
    public void powerOff() {
        System.out.println("Выключаем духовку");
    }

    @Override
    public void cook() {
        System.out.println("Готовим еду в духовке");
    }

    public void initTimer(int a){
        System.out.println("Устанавливаем таймер на "+ a+" минут");
    }
}
