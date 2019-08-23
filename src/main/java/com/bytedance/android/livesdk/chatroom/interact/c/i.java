package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class i implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10789a;

    /* renamed from: b  reason: collision with root package name */
    private final h f10790b;

    i(h hVar) {
        this.f10790b = hVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10789a, false, 4636, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10789a, false, 4636, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10790b.a((d) obj);
    }
}
