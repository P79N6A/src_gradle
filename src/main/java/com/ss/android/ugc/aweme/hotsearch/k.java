package com.ss.android.ugc.aweme.hotsearch;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49785a;

    /* renamed from: b  reason: collision with root package name */
    private final View f49786b;

    k(View view) {
        this.f49786b = view;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f49785a, false, 49570, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49785a, false, 49570, new Class[0], Void.TYPE);
            return;
        }
        this.f49786b.getDrawingCache();
    }
}
