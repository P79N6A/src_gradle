package com.bytedance.android.livesdk.gift.panel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Action;

public final /* synthetic */ class n implements Action {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15219a;

    /* renamed from: b  reason: collision with root package name */
    private final g f15220b;

    n(g gVar) {
        this.f15220b = gVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f15219a, false, 9888, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15219a, false, 9888, new Class[0], Void.TYPE);
            return;
        }
        this.f15220b.f15197e = false;
    }
}
