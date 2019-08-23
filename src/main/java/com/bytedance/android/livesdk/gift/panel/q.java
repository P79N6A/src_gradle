package com.bytedance.android.livesdk.gift.panel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Action;

public final /* synthetic */ class q implements Action {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15227a;

    /* renamed from: b  reason: collision with root package name */
    private final g f15228b;

    q(g gVar) {
        this.f15228b = gVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f15227a, false, 9891, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15227a, false, 9891, new Class[0], Void.TYPE);
            return;
        }
        this.f15228b.f15197e = false;
    }
}
