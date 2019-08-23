package com.bytedance.android.live.core.utils;

import android.graphics.Bitmap;
import com.bytedance.android.live.core.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8301a;

    /* renamed from: b  reason: collision with root package name */
    private final q.b f8302b;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap f8303c;

    l(q.b bVar, Bitmap bitmap) {
        this.f8302b = bVar;
        this.f8303c = bitmap;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f8301a, false, 1133, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8301a, false, 1133, new Class[0], Void.TYPE);
            return;
        }
        this.f8302b.a(this.f8303c);
    }
}
