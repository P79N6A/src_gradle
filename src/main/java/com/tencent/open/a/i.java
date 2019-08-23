package com.tencent.open.a;

import com.tencent.open.a.d;

public abstract class i {

    /* renamed from: b  reason: collision with root package name */
    public volatile int f79677b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f79678c;

    /* renamed from: d  reason: collision with root package name */
    public h f79679d;

    /* access modifiers changed from: protected */
    public abstract void a(int i, Thread thread, long j, String str, String str2, Throwable th);

    public i() {
        this(c.f79658a, true, h.f79676a);
    }

    public i(int i, boolean z, h hVar) {
        this.f79677b = c.f79658a;
        this.f79678c = true;
        this.f79679d = h.f79676a;
        this.f79677b = i;
        this.f79678c = z;
        this.f79679d = hVar;
    }

    public final void b(int i, Thread thread, long j, String str, String str2, Throwable th) {
        if (this.f79678c && d.a.a(this.f79677b, i)) {
            a(i, thread, j, str, str2, th);
        }
    }
}
