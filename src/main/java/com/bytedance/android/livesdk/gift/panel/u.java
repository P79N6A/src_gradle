package com.bytedance.android.livesdk.gift.panel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Action;

public final /* synthetic */ class u implements Action {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15238a;

    /* renamed from: b  reason: collision with root package name */
    private final g f15239b;

    u(g gVar) {
        this.f15239b = gVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f15238a, false, 9895, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15238a, false, 9895, new Class[0], Void.TYPE);
            return;
        }
        this.f15239b.f15197e = false;
    }
}
