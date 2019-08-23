package com.xiaomi.push;

import java.net.InetAddress;

public class cf implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ cn f81895a;

    /* renamed from: a  reason: collision with other field name */
    private String f215a;

    public cf(cn cnVar, String str) {
        this.f81895a = cnVar;
        this.f215a = str;
    }

    public void run() {
        try {
            InetAddress.getByName(this.f215a).isReachable(500);
        } catch (Exception unused) {
        }
    }
}
