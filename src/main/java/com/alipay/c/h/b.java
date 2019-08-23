package com.alipay.c.h;

import java.util.LinkedList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static b f5350a = new b();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Thread f5351b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public LinkedList<Runnable> f5352c = new LinkedList<>();

    public final synchronized void a(Runnable runnable) {
        this.f5352c.add(runnable);
        if (this.f5351b == null) {
            this.f5351b = new Thread(new c(this));
            this.f5351b.start();
        }
    }
}
