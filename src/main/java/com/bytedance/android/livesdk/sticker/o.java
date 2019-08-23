package com.bytedance.android.livesdk.sticker;

import com.bytedance.android.livesdk.sticker.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17306a;

    /* renamed from: b  reason: collision with root package name */
    private final i.AnonymousClass2 f17307b;

    o(i.AnonymousClass2 r1) {
        this.f17307b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f17306a, false, 13386, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17306a, false, 13386, new Class[0], Void.TYPE);
            return;
        }
        i.this.c();
    }
}
