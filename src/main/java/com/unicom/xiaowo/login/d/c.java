package com.unicom.xiaowo.login.d;

import android.content.Context;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Context f81453a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f81454b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ f f81455c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ a f81456d;

    public c(a aVar, Context context, String str, f fVar) {
        this.f81456d = aVar;
        this.f81453a = context;
        this.f81454b = str;
        this.f81455c = fVar;
    }

    public final void run() {
        boolean a2 = this.f81456d.a(this.f81453a, this.f81454b);
        if (this.f81455c != null) {
            this.f81455c.a(a2, null);
        }
    }
}
