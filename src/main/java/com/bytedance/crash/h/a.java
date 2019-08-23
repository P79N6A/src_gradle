package com.bytedance.crash.h;

import android.os.Handler;

public abstract class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public Handler f19458a;

    /* renamed from: b  reason: collision with root package name */
    public final long f19459b;

    /* renamed from: c  reason: collision with root package name */
    public final long f19460c;

    /* access modifiers changed from: package-private */
    public final void a(long j) {
        if (j > 0) {
            this.f19458a.postDelayed(this, j);
        } else {
            this.f19458a.post(this);
        }
    }

    a(Handler handler, long j, long j2) {
        this.f19458a = handler;
        this.f19459b = j;
        this.f19460c = j2;
    }
}
