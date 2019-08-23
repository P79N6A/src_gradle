package com.ss.android.ugc.aweme.shortvideo.q.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68946a;

    /* renamed from: b  reason: collision with root package name */
    private final a f68947b;

    /* renamed from: c  reason: collision with root package name */
    private final int f68948c;

    c(a aVar, int i) {
        this.f68947b = aVar;
        this.f68948c = i;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f68946a, false, 81111, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68946a, false, 81111, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f68947b;
        int i = this.f68948c;
        if (aVar.f68940b != null) {
            aVar.f68940b.b(i);
        }
    }
}
