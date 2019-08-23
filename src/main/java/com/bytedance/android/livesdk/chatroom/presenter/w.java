package com.bytedance.android.livesdk.chatroom.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class w implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11416a;

    /* renamed from: b  reason: collision with root package name */
    private final s f11417b;

    public w(s sVar) {
        this.f11417b = sVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11416a, false, 5206, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11416a, false, 5206, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f11417b.f11399b = false;
    }
}
