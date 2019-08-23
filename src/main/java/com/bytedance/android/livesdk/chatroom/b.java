package com.bytedance.android.livesdk.chatroom;

import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9752a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9753b;

    /* renamed from: c  reason: collision with root package name */
    private final Surface f9754c;

    b(a aVar, Surface surface) {
        this.f9753b = aVar;
        this.f9754c = surface;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f9752a, false, 3893, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9752a, false, 3893, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f9753b;
        Surface surface = this.f9754c;
        if (aVar.f9694c != null) {
            aVar.f9694c.a(surface);
        }
    }
}
