package com.ss.android.ugc.aweme.commercialize.views;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40129a;

    /* renamed from: b  reason: collision with root package name */
    private final ButtonAdBottomLabelView f40130b;

    p(ButtonAdBottomLabelView buttonAdBottomLabelView) {
        this.f40130b = buttonAdBottomLabelView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40129a, false, 32833, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40129a, false, 32833, new Class[0], Void.TYPE);
            return;
        }
        this.f40130b.s();
    }
}
