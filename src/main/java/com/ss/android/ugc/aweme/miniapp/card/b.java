package com.ss.android.ugc.aweme.miniapp.card;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55633a;

    /* renamed from: b  reason: collision with root package name */
    private final View f55634b;

    b(View view) {
        this.f55634b = view;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f55633a, false, 59185, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55633a, false, 59185, new Class[0], Void.TYPE);
            return;
        }
        this.f55634b.setVisibility(4);
    }
}
