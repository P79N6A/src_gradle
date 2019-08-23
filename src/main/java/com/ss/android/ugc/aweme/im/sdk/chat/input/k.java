package com.ss.android.ugc.aweme.im.sdk.chat.input;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.input.d;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50650a;

    /* renamed from: b  reason: collision with root package name */
    private final d.AnonymousClass2 f50651b;

    k(d.AnonymousClass2 r1) {
        this.f50651b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f50650a, false, 50608, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50650a, false, 50608, new Class[0], Void.TYPE);
            return;
        }
        d.this.b(true);
    }
}
