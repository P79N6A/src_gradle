package com.ss.android.ugc.aweme.im.sdk.chat.input;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.input.d;
import com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50647a;

    /* renamed from: b  reason: collision with root package name */
    private final d.AnonymousClass2 f50648b;

    /* renamed from: c  reason: collision with root package name */
    private final c f50649c;

    j(d.AnonymousClass2 r1, c cVar) {
        this.f50648b = r1;
        this.f50649c = cVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f50647a, false, 50607, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50647a, false, 50607, new Class[0], Void.TYPE);
            return;
        }
        this.f50648b.a(this.f50649c);
    }
}
