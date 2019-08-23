package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dg implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10556a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10557b;

    dg(cy cyVar) {
        this.f10557b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10556a, false, 4831, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10556a, false, 4831, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10557b;
        cyVar.g = false;
        cyVar.m = false;
        cyVar.n();
    }
}
