package com.company;

import com.company.difobj.DialPhone;
import com.company.difobj.SmartPhone;
import com.company.interfaces.MailSender;

public class Main2 {

    public static void main(String[] args) {

        DialPhone dp = new DialPhone(false);
        SmartPhone smp = new SmartPhone(123456,8,"MAC OS");

        System.out.println("=".repeat(50));
        System.out.println(smp.createMail("Письмо маме"));
        System.out.println(smp.editMail("Письмо папе"));
        smp.sendMail("папа");

        System.out.println("=".repeat(50));
        dp.call();

        System.out.println("=".repeat(50));
        Post pst = new Post("Новая почта", 4);
        System.out.println("Посылка пришла в " + pst.number + " отделение сервиса " + pst.name);
        System.out.println("Пишем письмо человеку " + pst.createMail("мама"));
        pst.sendMail("Бородинская 22");

        System.out.println("=".repeat(50));
        MailSender[] mails = new MailSender[]{smp,pst};
        main2(mails);
    }

    public static void main2(MailSender[] args) {
        for (int i = 0; i < args.length; i++) {
            args[i].sendMail("учитель");
        }
    }
}
