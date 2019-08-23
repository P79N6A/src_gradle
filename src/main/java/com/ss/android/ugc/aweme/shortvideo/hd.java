package com.ss.android.ugc.aweme.shortvideo;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class hd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68078a;

    /* renamed from: b  reason: collision with root package name */
    private final View f68079b;

    hd(View view) {
        this.f68079b = view;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f68078a, false, 74822, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68078a, false, 74822, new Class[0], Void.TYPE);
            return;
        }
        View view = this.f68079b;
        view.setRotation(0.0f);
        view.setEnabled(false);
    }
}
