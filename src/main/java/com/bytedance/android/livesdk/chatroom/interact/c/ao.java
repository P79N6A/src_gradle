package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ao implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10386a;

    /* renamed from: b  reason: collision with root package name */
    private final al f10387b;

    ao(al alVar) {
        this.f10387b = alVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10386a, false, 4685, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10386a, false, 4685, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10387b.f();
    }
}