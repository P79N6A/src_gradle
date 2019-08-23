package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.presenter.bk;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bm implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11299a;

    /* renamed from: b  reason: collision with root package name */
    private final bk f11300b;

    bm(bk bkVar) {
        this.f11300b = bkVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11299a, false, 5292, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11299a, false, 5292, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        bk bkVar = this.f11300b;
        if (bkVar.b() != null) {
            ((bk.a) bkVar.b()).b();
        }
    }
}
