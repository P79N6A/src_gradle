package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class fg implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10676a;

    /* renamed from: b  reason: collision with root package name */
    private final es f10677b;

    public fg(es esVar) {
        this.f10677b = esVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10676a, false, 4925, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10676a, false, 4925, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10677b.a((Throwable) obj);
    }
}
