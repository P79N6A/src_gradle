package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ae implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10365a;

    /* renamed from: b  reason: collision with root package name */
    private final x f10366b;

    ae(x xVar) {
        this.f10366b = xVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10365a, false, 4666, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10365a, false, 4666, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10366b.c((Throwable) obj);
    }
}