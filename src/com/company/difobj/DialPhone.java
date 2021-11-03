package com.company.difobj;

import com.company.interfaces.Caller;

public class DialPhone extends Phone implements Caller {

    private boolean hasAnswerPhone;

    public boolean isHasAnswerPhone() {
        return hasAnswerPhone;
    }

    public void setHasAnswerPhone(boolean hasAnswerPhone) {
        this.hasAnswerPhone = hasAnswerPhone;
    }

    public DialPhone(boolean hasAnswerPhone) {
        this.hasAnswerPhone = hasAnswerPhone;
    }

    @Override
    public void powerOn() {
        System.out.println("Доисторический дисковый" +
                " телефон подключается к розетке");
    }

    @Override
    public void powerOff() {
        System.out.println("Доисторический дисковый" +
                " телефон достается из розетки");
    }

    @Override
    public void call() {
        System.out.println("Крутим диск чтобы позвонить " +
                "по доисторическому телефону");
    }

    public void autoAnswer(){
        String str;
        if (hasAnswerPhone)
        System.out.println("У дискового телефона есть автоответчик");
        else
            System.out.println("У дискового телефона нет автоответчика");
    }
}
