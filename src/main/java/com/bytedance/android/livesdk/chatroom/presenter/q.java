package com.bytedance.android.livesdk.chatroom.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Action;

public final /* synthetic */ class q implements Action {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11388a;

    /* renamed from: b  reason: collision with root package name */
    private final n f11389b;

    q(n nVar) {
        this.f11389b = nVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f11388a, false, 5187, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11388a, false, 5187, new Class[0], Void.TYPE);
            return;
        }
        this.f11389b.f11378e = false;
    }
}
