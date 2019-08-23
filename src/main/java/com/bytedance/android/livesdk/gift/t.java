package com.bytedance.android.livesdk.gift;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Action;

public final /* synthetic */ class t implements Action {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15471a;

    /* renamed from: b  reason: collision with root package name */
    private final q f15472b;

    t(q qVar) {
        this.f15472b = qVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f15471a, false, 9315, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15471a, false, 9315, new Class[0], Void.TYPE);
            return;
        }
        this.f15472b.f15403d = false;
    }
}
