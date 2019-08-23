package com.bytedance.sdk.account.h.a;

import android.os.Looper;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.sdk.account.h.a.e;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class c implements WeakHandler.IHandler, e, Comparable<e>, Runnable {

    /* renamed from: f  reason: collision with root package name */
    private static f f22422f = f.a();

    /* renamed from: a  reason: collision with root package name */
    protected final AtomicBoolean f22423a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    protected final AtomicBoolean f22424b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    WeakHandler f22425c = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: d  reason: collision with root package name */
    public final String f22426d;

    /* renamed from: e  reason: collision with root package name */
    protected final e.a f22427e;
    private int g;

    public void run() {
    }

    public final e.a d() {
        return this.f22427e;
    }

    public final int e() {
        return this.g;
    }

    public final boolean a() {
        return this.f22424b.get();
    }

    public final void c() {
        this.f22424b.compareAndSet(false, true);
    }

    public final void g() {
        this.f22425c.removeMessages(0);
    }

    public final void h() {
        this.f22425c.removeMessages(1);
    }

    public final void f() {
        g();
        this.f22425c.sendEmptyMessageDelayed(0, 1000);
    }

    public final void b() {
        if (this.f22423a.compareAndSet(false, true)) {
            if (f22422f == null) {
                f22422f = f.a();
            }
            f22422f.a(this);
        }
    }

    public final c a(int i) {
        this.g = i;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r1) {
        /*
            r0 = this;
            if (r1 != 0) goto L_0x0003
            return
        L_0x0003:
            int r1 = r1.what     // Catch:{ Throwable -> 0x0016 }
            switch(r1) {
                case 0: goto L_0x000f;
                case 1: goto L_0x0009;
                default: goto L_0x0008;
            }     // Catch:{ Throwable -> 0x0016 }
        L_0x0008:
            goto L_0x0015
        L_0x0009:
            com.bytedance.sdk.account.h.a.f r1 = f22422f     // Catch:{ Throwable -> 0x0016 }
            r1.c()     // Catch:{ Throwable -> 0x0016 }
            goto L_0x0015
        L_0x000f:
            com.bytedance.sdk.account.h.a.f r1 = f22422f     // Catch:{ Throwable -> 0x0016 }
            r1.b()     // Catch:{ Throwable -> 0x0016 }
            goto L_0x0016
        L_0x0015:
            return
        L_0x0016:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.h.a.c.handleMsg(android.os.Message):void");
    }

    public /* synthetic */ int compareTo(Object obj) {
        e eVar = (e) obj;
        e.a d2 = d();
        e.a d3 = eVar.d();
        if (d2 == null) {
            d2 = e.a.NORMAL;
        }
        if (d3 == null) {
            d3 = e.a.NORMAL;
        }
        if (d2 == d3) {
            return e() - eVar.e();
        }
        return d3.ordinal() - d2.ordinal();
    }

    protected c(String str, e.a aVar) {
        this.f22427e = aVar;
        this.f22426d = StringUtils.isEmpty(str) ? getClass().getSimpleName() : str;
    }
}
