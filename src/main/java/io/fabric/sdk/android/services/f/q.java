package io.fabric.sdk.android.services.f;

import android.content.Context;
import io.fabric.sdk.android.i;
import io.fabric.sdk.android.services.b.g;
import io.fabric.sdk.android.services.b.l;
import io.fabric.sdk.android.services.b.m;
import io.fabric.sdk.android.services.b.s;
import io.fabric.sdk.android.services.b.w;
import io.fabric.sdk.android.services.d.e;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public s f83348a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<t> f83349b;

    /* renamed from: c  reason: collision with root package name */
    private final CountDownLatch f83350c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f83351d;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final q f83352a = new q((byte) 0);
    }

    public static q a() {
        return a.f83352a;
    }

    public final t b() {
        try {
            this.f83350c.await();
            return this.f83349b.get();
        } catch (InterruptedException unused) {
            return null;
        }
    }

    private q() {
        this.f83349b = new AtomicReference<>();
        this.f83350c = new CountDownLatch(1);
        this.f83351d = false;
    }

    public final synchronized boolean c() {
        boolean z;
        t a2 = this.f83348a.a();
        a(a2);
        if (a2 != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized boolean d() {
        boolean z;
        t a2 = this.f83348a.a(r.SKIP_CACHE_LOOKUP);
        a(a2);
        if (a2 != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* synthetic */ q(byte b2) {
        this();
    }

    private void a(t tVar) {
        this.f83349b.set(tVar);
        this.f83350c.countDown();
    }

    public final synchronized q a(i iVar, s sVar, e eVar, String str, String str2, String str3, l lVar) {
        i iVar2 = iVar;
        synchronized (this) {
            if (this.f83351d) {
                return this;
            }
            if (this.f83348a == null) {
                Context context = iVar2.context;
                String str4 = sVar.f83194b;
                String a2 = new g().a(context);
                String f2 = sVar.f();
                w wVar = new w();
                k kVar = new k();
                i iVar3 = new i(iVar2);
                String f3 = io.fabric.sdk.android.services.b.i.f(context);
                String str5 = str3;
                l lVar2 = new l(iVar2, str5, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[]{str4}), eVar);
                String d2 = sVar.d();
                String c2 = sVar.c();
                String str6 = c2;
                String str7 = str2;
                String str8 = str;
                w wVar2 = new w(a2, d2, str6, sVar.b(), sVar.a(), io.fabric.sdk.android.services.b.i.a(io.fabric.sdk.android.services.b.i.h(context)), str7, str8, m.determineFrom(f2).getId(), f3);
                j jVar = new j(iVar, wVar2, wVar, kVar, iVar3, lVar2, lVar);
                this.f83348a = jVar;
            }
            this.f83351d = true;
            return this;
        }
    }
}
