package com.ss.android.ugc.aweme.base;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34744a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f34745b;

    /* renamed from: c  reason: collision with root package name */
    private final long f34746c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f34747d;

    h(Uri uri, long j, boolean z) {
        this.f34745b = uri;
        this.f34746c = j;
        this.f34747d = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f34744a, false, 24003, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34744a, false, 24003, new Class[0], Void.TYPE);
            return;
        }
        Uri uri = this.f34745b;
        e.a(uri != null ? uri.toString() : null, this.f34746c, this.f34747d);
    }
}
