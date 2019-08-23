package com.ss.android.ugc.aweme.shortvideo.record.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.record.a.b;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69082a;

    /* renamed from: b  reason: collision with root package name */
    private final b.AnonymousClass1 f69083b;

    h(b.AnonymousClass1 r1) {
        this.f69083b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f69082a, false, 78439, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69082a, false, 78439, new Class[0], Void.TYPE);
            return;
        }
        b.this.r.a(true);
    }
}
