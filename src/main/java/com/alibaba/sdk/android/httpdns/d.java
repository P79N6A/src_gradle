package com.alibaba.sdk.android.httpdns;

public class d {
    static String PROTOCOL = "http://";

    /* renamed from: a  reason: collision with root package name */
    static int f5093a = 15000;

    /* renamed from: b  reason: collision with root package name */
    static String[] f5094b = {"203.107.1.1"};

    /* renamed from: c  reason: collision with root package name */
    static String f5095c;

    /* renamed from: c  reason: collision with other field name */
    static final String[] f24c = {"203.107.1.97", "203.107.1.100", "httpdns-sc.aliyuncs.com"};

    /* renamed from: d  reason: collision with root package name */
    static String f5096d = "80";

    /* renamed from: d  reason: collision with other field name */
    static final String[] f25d = new String[0];

    static synchronized boolean a(String[] strArr) {
        boolean z;
        synchronized (d.class) {
            if (strArr != null) {
                if (strArr.length != 0) {
                    f5094b = strArr;
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    static synchronized void d(String str) {
        synchronized (d.class) {
            f5095c = str;
        }
    }

    static synchronized void setHTTPSRequestEnabled(boolean z) {
        synchronized (d.class) {
            if (z) {
                PROTOCOL = "https://";
                f5096d = "443";
                return;
            }
            PROTOCOL = "http://";
            f5096d = "80";
        }
    }

    static synchronized void setTimeoutInterval(int i) {
        synchronized (d.class) {
            if (i > 0) {
                f5093a = i;
            }
        }
    }
}
