package com.mapbox.mapboxsdk.location;

import android.os.Handler;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    boolean f26544a;

    /* renamed from: b  reason: collision with root package name */
    final x f26545b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f26546c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f26547d;

    /* renamed from: e  reason: collision with root package name */
    private long f26548e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f26549f;

    /* access modifiers changed from: package-private */
    public final void a() {
        if (!this.f26546c) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f26547d.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f26547d.removeCallbacksAndMessages(null);
        this.f26547d.postDelayed(this.f26549f, this.f26548e);
    }
}
