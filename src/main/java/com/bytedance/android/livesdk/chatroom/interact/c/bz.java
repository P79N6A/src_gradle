package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.bl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bz implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10469a;

    /* renamed from: b  reason: collision with root package name */
    private final bl f10470b;

    bz(bl blVar) {
        this.f10470b = blVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10469a, false, 4741, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10469a, false, 4741, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ((bl.a) this.f10470b.b()).b(false);
    }
}
