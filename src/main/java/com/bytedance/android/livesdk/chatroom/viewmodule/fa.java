package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.viewmodule.VideoWidget2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class fa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13262a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoWidget2.AnonymousClass6 f13263b;

    fa(VideoWidget2.AnonymousClass6 r1) {
        this.f13263b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f13262a, false, 7628, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13262a, false, 7628, new Class[0], Void.TYPE);
            return;
        }
        this.f13263b.a();
    }
}
