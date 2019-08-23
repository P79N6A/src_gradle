package com.ss.android.ugc.aweme.commercialize.utils;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ap implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39742a;

    /* renamed from: b  reason: collision with root package name */
    private final View f39743b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f39744c;

    ap(View view, Runnable runnable) {
        this.f39743b = view;
        this.f39744c = runnable;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f39742a, false, 32686, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39742a, false, 32686, new Class[0], Void.TYPE);
            return;
        }
        ao.a(this.f39743b, this.f39744c);
    }
}
