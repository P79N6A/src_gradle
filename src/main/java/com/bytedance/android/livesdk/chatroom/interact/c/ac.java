package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ac implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10361a;

    /* renamed from: b  reason: collision with root package name */
    private final x f10362b;

    ac(x xVar) {
        this.f10362b = xVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10361a, false, 4664, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10361a, false, 4664, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10362b.b((Throwable) obj);
    }
}
