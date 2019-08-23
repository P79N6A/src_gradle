package com.xiaomi.push;

public class gp extends Thread {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ go f82115a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    gp(go goVar, String str) {
        super(str);
        this.f82115a = goVar;
    }

    public void run() {
        try {
            this.f82115a.f82114a.a();
        } catch (Exception e2) {
            this.f82115a.c(9, e2);
        }
    }
}
