package com.company.difobj;

public class MegaCooker extends Multicooker{

    @Override
    public void powerOn() {
        System.out.println("Включаем мультиварку");
    }

    @Override
    public void powerOff() {
        System.out.println("Выключаем мультиварку");
    }

    @Override
    public void cook() {
        System.out.println("Готовим еду в мультиварке");
    }

    public void switchProgram(int a){
        System.out.println("Вы выбрали программу "+ a + " для готовки");
    }
}
