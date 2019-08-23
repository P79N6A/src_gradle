package com.bytedance.ad.symphony.e;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.ad.symphony.d;
import com.bytedance.ad.symphony.e.b;
import com.bytedance.ad.symphony.g.f;
import com.bytedance.ad.symphony.provider.AbsNativeAdProvider;
import com.bytedance.ad.symphony.provider.b;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class a implements b, b.a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f7617b = "a";

    /* renamed from: c  reason: collision with root package name */
    private String f7618c;

    /* renamed from: d  reason: collision with root package name */
    private List<b> f7619d = new LinkedList();

    /* renamed from: e  reason: collision with root package name */
    private b.a f7620e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.ad.symphony.provider.b f7621f;
    private int g;
    private long h;
    private AtomicInteger i = new AtomicInteger(0);
    private boolean j;
    private com.bytedance.ad.symphony.f.a k;

    public final int d() {
        return this.g;
    }

    public final List<b> e() {
        return this.f7619d;
    }

    public final void a() {
        this.i.getAndAdd(1);
    }

    public final int b() {
        return this.i.decrementAndGet();
    }

    public final void c() {
        if (this.f7621f != null) {
            this.f7621f.tryPreloadAd(this.f7618c, this.k, this);
        }
    }

    public final void a(b bVar) {
        this.f7619d.add(bVar);
    }

    public final void a(String str) {
        f.a();
        if (this.f7620e != null) {
            this.f7620e.a(str);
        }
    }

    public final boolean a(Context context) {
        if (!AbsNativeAdProvider.isAdMobNativeAdProvider(this.g) || Build.VERSION.SDK_INT < 21) {
            return true;
        }
        try {
            if (context.getPackageManager().getPackageInfo("com.google.android.webview", 1) != null) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            d.a(e2);
            return false;
        }
    }

    public final void a(String str, String str2) {
        f.a();
        if (this.f7620e != null) {
            b.a aVar = this.f7620e;
            String str3 = this.f7618c;
            int i2 = this.g;
            double elapsedRealtime = (double) (SystemClock.elapsedRealtime() - this.h);
            Double.isNaN(elapsedRealtime);
            aVar.a(str3, str, i2, str2, elapsedRealtime / 1000.0d);
            if (this.f7619d.isEmpty() && !this.j) {
                this.f7620e.a(this.f7618c);
            }
        }
        if (!this.j) {
            if (!this.f7619d.isEmpty()) {
                for (b next : this.f7619d) {
                    if (next.b() == 0) {
                        next.c();
                    }
                }
                this.f7619d.clear();
            }
            if ("Request Timeout".equals(str2)) {
                this.j = true;
            }
        }
    }

    public a(String str, com.bytedance.ad.symphony.provider.b bVar, com.bytedance.ad.symphony.f.a aVar, b.a aVar2) {
        this.f7618c = str;
        this.f7620e = aVar2;
        this.f7621f = bVar;
        this.g = this.f7621f.getProviderId();
        this.h = SystemClock.elapsedRealtime();
        this.k = aVar;
    }
}
