package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class gh implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10744a;

    /* renamed from: b  reason: collision with root package name */
    private final gc f10745b;

    gh(gc gcVar) {
        this.f10745b = gcVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10744a, false, 4991, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10744a, false, 4991, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10745b.a((Throwable) obj);
    }
}