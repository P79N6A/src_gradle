package com.bytedance.android.live.core.utils;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8242a;

    /* renamed from: b  reason: collision with root package name */
    private final View f8243b;

    b(View view) {
        this.f8243b = view;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f8242a, false, 956, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8242a, false, 956, new Class[0], Void.TYPE);
            return;
        }
        this.f8243b.requestLayout();
    }
}
