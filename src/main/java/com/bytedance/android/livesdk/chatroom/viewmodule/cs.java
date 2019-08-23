package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cs implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13115a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f13116b = new cs();

    private cs() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f13115a, false, 7206, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13115a, false, 7206, new Class[0], Void.TYPE);
            return;
        }
        co.a("android.permission.WRITE_EXTERNAL_STORAGE", al.b.CLICK, null, "confirm");
    }
}
