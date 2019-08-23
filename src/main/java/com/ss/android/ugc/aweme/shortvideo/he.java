package com.ss.android.ugc.aweme.shortvideo;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class he implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68080a;

    /* renamed from: b  reason: collision with root package name */
    private final View f68081b;

    he(View view) {
        this.f68081b = view;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f68080a, false, 74823, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68080a, false, 74823, new Class[0], Void.TYPE);
            return;
        }
        View view = this.f68081b;
        view.setRotation(0.0f);
        view.setEnabled(true);
    }
}
