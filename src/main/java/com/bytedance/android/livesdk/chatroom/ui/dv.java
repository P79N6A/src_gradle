package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dv implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12113a;

    /* renamed from: b  reason: collision with root package name */
    private final dl f12114b;

    dv(dl dlVar) {
        this.f12114b = dlVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12113a, false, 6240, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12113a, false, 6240, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        dl dlVar = this.f12114b;
        a.a("RushRedEnvelopeDialog", (Throwable) obj);
        dlVar.h.setVisibility(4);
        dlVar.i.setVisibility(4);
        dlVar.j.setVisibility(0);
        dlVar.j.setOnClickListener(dlVar);
    }
}
