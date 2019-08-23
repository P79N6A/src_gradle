package com.ss.android.ad.splash.core;

import com.ss.android.ad.splash.core.c.g;
import com.ss.android.ad.splash.core.c.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class s {
    private static volatile s j;
    private static volatile boolean k;

    /* renamed from: a  reason: collision with root package name */
    public volatile l f27734a;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f27735b;

    /* renamed from: c  reason: collision with root package name */
    public AtomicInteger f27736c;

    /* renamed from: d  reason: collision with root package name */
    public AtomicInteger f27737d;

    /* renamed from: e  reason: collision with root package name */
    public int f27738e;

    /* renamed from: f  reason: collision with root package name */
    public List<Map<String, String>> f27739f;
    public volatile long g;
    public boolean h;
    public boolean i;
    private int l;
    private volatile boolean m;

    private static boolean g() {
        return k;
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        this.m = true;
        this.f27734a = null;
    }

    /* access modifiers changed from: package-private */
    public final List<g> b() {
        if (!d()) {
            return null;
        }
        return this.f27734a.f27652a;
    }

    /* access modifiers changed from: package-private */
    public final LinkedHashMap<Long, String> c() {
        if (!e()) {
            return null;
        }
        return this.f27734a.f27653b;
    }

    public static s a() {
        if (j == null) {
            synchronized (s.class) {
                if (j == null) {
                    j = new s();
                }
            }
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        if ((!(!this.m) || !g()) || this.f27734a == null || this.f27734a.f27652a == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        if ((!(!this.m) || !g()) || this.f27734a == null || this.f27734a.f27653b == null) {
            return false;
        }
        return true;
    }

    private s() {
        this.f27735b = -1;
        this.f27736c = new AtomicInteger();
        this.f27737d = new AtomicInteger();
        this.f27738e = 0;
        this.f27739f = Collections.synchronizedList(new ArrayList());
        this.g = 0;
        this.h = false;
        this.i = false;
        this.f27734a = null;
        this.i = false;
        this.l = 0;
        this.h = false;
        this.m = false;
    }
}
