package com.ss.android.ugc.aweme.discover.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41926a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseWordViewHolder f41927b;

    a(BaseWordViewHolder baseWordViewHolder) {
        this.f41927b = baseWordViewHolder;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f41926a, false, 35503, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41926a, false, 35503, new Class[0], Void.TYPE);
            return;
        }
        this.f41927b.a();
    }
}
