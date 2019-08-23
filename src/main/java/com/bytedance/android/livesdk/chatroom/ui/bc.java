package com.bytedance.android.livesdk.chatroom.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Action;

public final /* synthetic */ class bc implements Action {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11911a;

    /* renamed from: b  reason: collision with root package name */
    private final az f11912b;

    bc(az azVar) {
        this.f11912b = azVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f11911a, false, 5746, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11911a, false, 5746, new Class[0], Void.TYPE);
            return;
        }
        this.f11912b.f11902e = false;
    }
}
