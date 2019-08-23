package com.vivo.push.c;

import android.text.TextUtils;
import com.vivo.push.b.j;

public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f81545a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j f81546b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d f81547c;

    public final void run() {
        if (!TextUtils.isEmpty(this.f81545a)) {
            this.f81547c.f81532b.onReceiveRegId(this.f81547c.f81705a, this.f81545a);
        }
        this.f81547c.f81532b.onBind(this.f81547c.f81705a, this.f81546b.h(), this.f81546b.d());
    }

    e(d dVar, String str, j jVar) {
        this.f81547c = dVar;
        this.f81545a = str;
        this.f81546b = jVar;
    }
}
