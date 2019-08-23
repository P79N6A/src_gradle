package com.bytedance.android.livesdk.gift.panel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Action;

public final /* synthetic */ class x implements Action {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15390a;

    /* renamed from: b  reason: collision with root package name */
    private final g f15391b;

    x(g gVar) {
        this.f15391b = gVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f15390a, false, 9898, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15390a, false, 9898, new Class[0], Void.TYPE);
            return;
        }
        this.f15391b.f15197e = false;
    }
}
