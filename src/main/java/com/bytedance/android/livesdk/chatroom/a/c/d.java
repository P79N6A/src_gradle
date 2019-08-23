package com.bytedance.android.livesdk.chatroom.a.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9737a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9738b;

    d(a aVar) {
        this.f9738b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9737a, false, 3938, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9737a, false, 3938, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f9738b;
        aVar.f9725f.setVisibility(8);
        aVar.g.setVisibility(8);
    }
}
