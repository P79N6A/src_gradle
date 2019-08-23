package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class de implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10552a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10553b;

    de(cy cyVar) {
        this.f10553b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10552a, false, 4829, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10552a, false, 4829, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10553b;
        cyVar.f10535f = false;
        cyVar.m = true;
        cyVar.m();
    }
}
