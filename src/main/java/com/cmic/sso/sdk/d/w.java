package com.cmic.sso.sdk.d;

import java.util.UUID;

public class w {
    public static String b() {
        return c().replace("-", "");
    }

    private static String c() {
        return UUID.randomUUID().toString();
    }

    public static String a() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
