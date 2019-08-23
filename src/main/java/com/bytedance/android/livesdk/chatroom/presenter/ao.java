package com.bytedance.android.livesdk.chatroom.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Action;

public final /* synthetic */ class ao implements Action {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11229a;

    /* renamed from: b  reason: collision with root package name */
    private final af f11230b;

    ao(af afVar) {
        this.f11230b = afVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f11229a, false, 5240, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11229a, false, 5240, new Class[0], Void.TYPE);
            return;
        }
        this.f11230b.f11210d = false;
    }
}
