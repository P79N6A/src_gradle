package com.bytedance.android.livesdk.chatroom.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ap implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11853a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f11854b = new ap();

    private ap() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f11853a, false, 5676, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11853a, false, 5676, new Class[0], Void.TYPE);
            return;
        }
        ao.f11849b = true;
    }
}
