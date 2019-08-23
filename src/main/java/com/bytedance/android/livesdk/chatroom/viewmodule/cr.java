package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cr implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13113a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f13114b = new cr();

    private cr() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f13113a, false, 7205, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13113a, false, 7205, new Class[0], Void.TYPE);
            return;
        }
        co.a("android.permission.WRITE_EXTERNAL_STORAGE", al.b.SHOW, null, null);
    }
}
