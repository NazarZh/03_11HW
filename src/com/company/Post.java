package com.company;

import com.company.interfaces.MailSender;

public class Post implements MailSender {
    String name;
    int number;

    public Post(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String createMail(String name) {
        return name;
    }

    @Override
    public void sendMail(String address) {
        System.out.println("Отправляю письмо по адресу "+ address);
    }
}
