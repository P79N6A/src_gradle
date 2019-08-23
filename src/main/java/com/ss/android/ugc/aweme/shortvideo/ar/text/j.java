package com.ss.android.ugc.aweme.shortvideo.ar.text;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65708a;

    /* renamed from: b  reason: collision with root package name */
    private final g f65709b;

    /* renamed from: c  reason: collision with root package name */
    private final int f65710c;

    /* renamed from: d  reason: collision with root package name */
    private final int f65711d;

    /* renamed from: e  reason: collision with root package name */
    private final Activity f65712e;

    /* renamed from: f  reason: collision with root package name */
    private final String f65713f;

    j(g gVar, int i, int i2, Activity activity, String str) {
        this.f65709b = gVar;
        this.f65710c = i;
        this.f65711d = i2;
        this.f65712e = activity;
        this.f65713f = str;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f65708a, false, 75155, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65708a, false, 75155, new Class[0], Void.TYPE);
            return;
        }
        this.f65709b.a(this.f65710c, this.f65711d, this.f65712e, this.f65713f);
    }
}
