package com.ss.android.ad.splash.core;

import android.support.annotation.WorkerThread;
import com.ss.android.ad.splash.core.c.b;
import com.ss.android.ad.splash.core.c.f;
import java.util.List;

public final class h {
    private static volatile h j;

    /* renamed from: a  reason: collision with root package name */
    public volatile List<b> f27694a;

    /* renamed from: b  reason: collision with root package name */
    public volatile List<b> f27695b;

    /* renamed from: c  reason: collision with root package name */
    public volatile f f27696c;

    /* renamed from: d  reason: collision with root package name */
    public long f27697d = 1800000;

    /* renamed from: e  reason: collision with root package name */
    public long f27698e = 300000;

    /* renamed from: f  reason: collision with root package name */
    public volatile long f27699f = -1;
    public volatile long g = -1;
    public boolean h;
    public String i = "{}";

    private h() {
    }

    public static h a() {
        if (j == null) {
            synchronized (h.class) {
                if (j == null) {
                    j = new h();
                }
            }
        }
        return j;
    }

    @WorkerThread
    public final void a(long j2) {
        if (j2 > 0) {
            this.f27699f = j2;
        }
    }

    @WorkerThread
    public final void b(long j2) {
        if (j2 > 0) {
            this.g = j2;
        }
    }
}
