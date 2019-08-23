package com.ss.android.ugc.aweme.commercialize.views;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40143a;

    /* renamed from: b  reason: collision with root package name */
    private final StripAdBottomLabelView f40144b;

    w(StripAdBottomLabelView stripAdBottomLabelView) {
        this.f40144b = stripAdBottomLabelView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40143a, false, 33010, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40143a, false, 33010, new Class[0], Void.TYPE);
            return;
        }
        this.f40144b.u();
    }
}
