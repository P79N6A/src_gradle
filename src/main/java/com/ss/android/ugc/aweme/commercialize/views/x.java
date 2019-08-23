package com.ss.android.ugc.aweme.commercialize.views;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;

public final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40145a;

    /* renamed from: b  reason: collision with root package name */
    private final StripAdBottomLabelView f40146b;

    x(StripAdBottomLabelView stripAdBottomLabelView) {
        this.f40146b = stripAdBottomLabelView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40145a, false, 33011, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40145a, false, 33011, new Class[0], Void.TYPE);
            return;
        }
        n.a(this.f40146b.m, 0, c.f69428f, true);
    }
}
