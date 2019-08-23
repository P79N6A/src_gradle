package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ft implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10709a;

    /* renamed from: b  reason: collision with root package name */
    private final fl f10710b;

    ft(fl flVar) {
        this.f10710b = flVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10709a, false, 4960, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10709a, false, 4960, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10710b.a((Throwable) obj);
    }
}
