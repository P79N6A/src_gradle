package com.unicom.xiaowo.login.c;

import java.util.HashMap;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ String f81428a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f81429b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ HashMap f81430c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ e f81431d;

    /* renamed from: e  reason: collision with root package name */
    private /* synthetic */ a f81432e;

    c(a aVar, String str, String str2, HashMap hashMap, e eVar) {
        this.f81432e = aVar;
        this.f81428a = str;
        this.f81429b = str2;
        this.f81430c = hashMap;
        this.f81431d = eVar;
    }

    public final void run() {
        try {
            this.f81431d.a(this.f81432e.f81427b.a(this.f81428a, this.f81429b, this.f81430c));
        } catch (Exception e2) {
            e2.getMessage();
        }
    }
}
