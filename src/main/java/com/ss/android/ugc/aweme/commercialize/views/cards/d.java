package com.ss.android.ugc.aweme.commercialize.views.cards;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.f.m;
import com.ss.android.ugc.aweme.utils.bg;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40054a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f40055b = new d();

    private d() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40054a, false, 33045, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40054a, false, 33045, new Class[0], Void.TYPE);
            return;
        }
        bg.a(new m(true));
    }
}
