package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bo implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10446a;

    /* renamed from: b  reason: collision with root package name */
    private final bl f10447b;

    bo(bl blVar) {
        this.f10447b = blVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10446a, false, 4730, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10446a, false, 4730, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10447b.a((Throwable) obj);
    }
}
