package com.ss.android.ad.splash.core;

import android.support.annotation.Nullable;
import com.ss.android.ad.splash.core.c.b;

public class d {

    /* renamed from: c  reason: collision with root package name */
    private static volatile d f27654c;

    /* renamed from: a  reason: collision with root package name */
    volatile b f27655a;

    /* renamed from: b  reason: collision with root package name */
    long f27656b;

    private d() {
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f27655a = null;
        this.f27656b = 0;
    }

    public static d a() {
        if (f27654c == null) {
            synchronized (d.class) {
                if (f27654c == null) {
                    f27654c = new d();
                }
            }
        }
        return f27654c;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final b b() {
        if (Math.abs(System.currentTimeMillis() - this.f27656b) <= 10000) {
            return this.f27655a;
        }
        this.f27655a = null;
        return null;
    }
}
