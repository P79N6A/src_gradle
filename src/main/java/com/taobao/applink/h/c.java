package com.taobao.applink.h;

import java.util.Map;

public class c {
    private static String a(int i) {
        switch (i) {
            case 1:
                return "/minitrade.1.21.2";
            case 2:
                return "/minitrade.1.21.1";
            default:
                return null;
        }
    }

    public static void a(int i, Map map) {
        String a2 = a(i);
        if (map != null && a2 != null) {
            a.a().a(a2).a(map).b();
        }
    }
}
