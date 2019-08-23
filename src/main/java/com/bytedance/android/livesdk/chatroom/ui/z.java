package com.bytedance.android.livesdk.chatroom.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class z implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12312a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f12313b = new z();

    private z() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12312a, false, 5631, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12312a, false, 5631, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
