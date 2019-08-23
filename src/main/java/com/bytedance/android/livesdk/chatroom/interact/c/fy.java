package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class fy implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10719a;

    /* renamed from: b  reason: collision with root package name */
    private final fl f10720b;

    public fy(fl flVar) {
        this.f10720b = flVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10719a, false, 4965, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10719a, false, 4965, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10720b.a((Throwable) obj);
    }
}
