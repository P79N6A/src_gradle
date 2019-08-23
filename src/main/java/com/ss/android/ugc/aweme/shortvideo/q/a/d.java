package com.ss.android.ugc.aweme.shortvideo.q.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68949a;

    /* renamed from: b  reason: collision with root package name */
    private final a f68950b;

    /* renamed from: c  reason: collision with root package name */
    private final int f68951c;

    d(a aVar, int i) {
        this.f68950b = aVar;
        this.f68951c = i;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f68949a, false, 81112, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68949a, false, 81112, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f68950b;
        int i = this.f68951c;
        if (aVar.f68940b != null) {
            aVar.f68940b.a(i);
        }
    }
}
