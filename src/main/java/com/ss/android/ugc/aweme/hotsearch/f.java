package com.ss.android.ugc.aweme.hotsearch;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49750a;

    /* renamed from: b  reason: collision with root package name */
    private final View f49751b;

    f(View view) {
        this.f49751b = view;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f49750a, false, 49542, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49750a, false, 49542, new Class[0], Void.TYPE);
            return;
        }
        this.f49751b.getDrawingCache();
    }
}
