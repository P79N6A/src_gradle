package com.ss.android.ugc.aweme.shortvideo.ar.text;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65686a;

    /* renamed from: b  reason: collision with root package name */
    private final b f65687b;

    /* renamed from: c  reason: collision with root package name */
    private final int f65688c;

    /* renamed from: d  reason: collision with root package name */
    private final int f65689d;

    /* renamed from: e  reason: collision with root package name */
    private final Activity f65690e;

    /* renamed from: f  reason: collision with root package name */
    private final String f65691f;

    d(b bVar, int i, int i2, Activity activity, String str) {
        this.f65687b = bVar;
        this.f65688c = i;
        this.f65689d = i2;
        this.f65690e = activity;
        this.f65691f = str;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f65686a, false, 75132, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65686a, false, 75132, new Class[0], Void.TYPE);
            return;
        }
        this.f65687b.a(this.f65688c, this.f65689d, this.f65690e, this.f65691f);
    }
}
