package com.ali.auth.third.core.rpc.protocol;

import java.util.Random;

public class a {
    public static String a(int i) {
        String str;
        double d2;
        double d3;
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            switch (random.nextInt(3)) {
                case 0:
                    d2 = Math.random() * 25.0d;
                    d3 = 65.0d;
                    break;
                case 1:
                    d2 = Math.random() * 25.0d;
                    d3 = 97.0d;
                    break;
                case 2:
                    str = String.valueOf(new Random().nextInt(10));
                    break;
            }
            str = String.valueOf((char) ((int) Math.round(d2 + d3)));
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }
}
