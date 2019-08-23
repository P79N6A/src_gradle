package com.ss.android.ugc.aweme.filter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;

public final /* synthetic */ class ah implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47487a;

    /* renamed from: b  reason: collision with root package name */
    private final FilterScrollerModule f47488b;

    /* renamed from: c  reason: collision with root package name */
    private final TabLayout.e f47489c;

    ah(FilterScrollerModule filterScrollerModule, TabLayout.e eVar) {
        this.f47488b = filterScrollerModule;
        this.f47489c = eVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f47487a, false, 44346, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47487a, false, 44346, new Class[0], Void.TYPE);
            return;
        }
        FilterScrollerModule filterScrollerModule = this.f47488b;
        filterScrollerModule.f3233c.b(this.f47489c);
    }
}
