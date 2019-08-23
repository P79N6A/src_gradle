package com.bytedance.android.livesdk.chatroom.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Action;

public final /* synthetic */ class ar implements Action {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11235a;

    /* renamed from: b  reason: collision with root package name */
    private final af f11236b;

    public ar(af afVar) {
        this.f11236b = afVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f11235a, false, 5243, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11235a, false, 5243, new Class[0], Void.TYPE);
            return;
        }
        this.f11236b.h = false;
    }
}
