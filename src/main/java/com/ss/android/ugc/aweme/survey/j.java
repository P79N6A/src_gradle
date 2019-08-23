package com.ss.android.ugc.aweme.survey;

import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74526a;

    /* renamed from: b  reason: collision with root package name */
    private final i f74527b;

    j(i iVar) {
        this.f74527b = iVar;
    }

    public final void onGlobalLayout() {
        if (PatchProxy.isSupport(new Object[0], this, f74526a, false, 86716, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74526a, false, 86716, new Class[0], Void.TYPE);
            return;
        }
        this.f74527b.c();
    }
}
