package com.company;

import com.company.difobj.*;

public class Main1 {

    public static void main(String[] args) {

        System.out.println("=".repeat(50));
        SmartPhone smp = new SmartPhone(123, 7, "Android");
        smp.call();
        smp.runApp();
        smp.powerOff();

        System.out.println("=".repeat(50));
        Mobile mb = new Mobile(111, 4);
        mb.call();
        mb.powerOff();

        System.out.println("=".repeat(50));
        DialPhone dp = new DialPhone(true);
        dp.autoAnswer();
        dp.setHasAnswerPhone(false);
        dp.autoAnswer();
        dp.call();
        dp.powerOff();

        System.out.println("=".repeat(50));
        MegaCooker mg = new MegaCooker();
        mg.switchProgram(1);
        mg.cook();
        mg.powerOff();

        System.out.println("=".repeat(50));
        Oven ov = new Oven();
        ov.initTimer(120);
        ov.cook();
        ov.powerOff();

        System.out.println("=".repeat(50));
        AbstractDevice[] obj = new AbstractDevice[]{smp,mb,dp,mg,ov};
        main1(obj);
    }

    public static void main1(AbstractDevice[] args) {
        for (int i = 0; i < args.length; i++) {
            args[i].powerOff();
        }
    }
}
