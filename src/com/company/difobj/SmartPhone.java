package com.company.difobj;

import com.company.interfaces.Caller;
import com.company.interfaces.EmailSender;

public class SmartPhone extends Mobile implements Caller, EmailSender {

    String os;

    public SmartPhone(int simCount, int display, String os) {
        super(simCount, display);
        this.os = os;
    }

    @Override
    public void powerOn() {
        //super.powerOn();
        System.out.println("Смартфон включается");
    }

    @Override
    public void powerOff() {
        //super.powerOf();
        System.out.println("Смартфон выключается");
    }

    @Override
    public void call() {
        //super.call();
        System.out.println("Звоним по " + display +
                " дюймовому смартфону c номером "+simCount);
    }

    public void runApp(){
        System.out.println("Вы включаете программу на ОС - "+os);
    }

    @Override
    public String editMail(String name) {
        return name;
    }

    @Override
    public String createMail(String name) {
        return name;
    }

    @Override
    public void sendMail(String person) {
        System.out.println("Отправил электронное письмо человеку "+ person);
    }
}
