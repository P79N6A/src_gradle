package com.ss.android.ugc.aweme.photo.edit.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58530a;

    /* renamed from: b  reason: collision with root package name */
    private final a f58531b;

    b(a aVar) {
        this.f58531b = aVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f58530a, false, 63645, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58530a, false, 63645, new Class[0], Void.TYPE);
            return;
        }
        this.f58531b.f58524b.e();
    }
}
