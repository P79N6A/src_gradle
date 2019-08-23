package com.ss.android.ugc.aweme.feed.h;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45499a;

    /* renamed from: b  reason: collision with root package name */
    private final g f45500b;

    /* renamed from: c  reason: collision with root package name */
    private final int f45501c;

    /* renamed from: d  reason: collision with root package name */
    private final long f45502d;

    /* renamed from: e  reason: collision with root package name */
    private final long f45503e;

    /* renamed from: f  reason: collision with root package name */
    private final int f45504f;
    private final Integer g;
    private final String h;
    private final int i;
    private final String j;
    private final String k;
    private final String l;

    j(g gVar, int i2, long j2, long j3, int i3, Integer num, String str, int i4, String str2, String str3, String str4) {
        this.f45500b = gVar;
        this.f45501c = i2;
        this.f45502d = j2;
        this.f45503e = j3;
        this.f45504f = i3;
        this.g = num;
        this.h = str;
        this.i = i4;
        this.j = str2;
        this.k = str3;
        this.l = str4;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f45499a, false, 42037, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45499a, false, 42037, new Class[0], Void.TYPE);
            return;
        }
        this.f45500b.a(this.f45501c, this.f45502d, this.f45503e, this.f45504f, this.g, this.h, this.i, this.j, this.k, this.l);
    }
}
