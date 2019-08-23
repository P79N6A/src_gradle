package com.mapbox.mapboxsdk.http;

import com.mapbox.mapboxsdk.log.Logger;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26496a = false;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f26497b = true;

    public static void a(int i, String str) {
        if (f26497b) {
            Logger.log(i, "Mbgl-HttpRequest", str);
        }
    }

    public static void a(int i, String str, String str2) {
        int i2;
        String str3;
        if (i == 1) {
            i2 = 3;
        } else if (i == 0) {
            i2 = 4;
        } else {
            i2 = 5;
        }
        Object[] objArr = new Object[3];
        if (i == 1) {
            str3 = "temporary";
        } else if (i == 0) {
            str3 = "connection";
        } else {
            str3 = "permanent";
        }
        objArr[0] = str3;
        objArr[1] = str;
        if (!f26496a) {
            str2 = "";
        }
        objArr[2] = str2;
        a(i2, String.format("Request failed due to a %s error: %s %s", objArr));
    }
}
