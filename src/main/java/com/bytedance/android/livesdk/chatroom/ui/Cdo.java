package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.core.c.a;
import com.bytedance.android.livesdk.utils.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.do  reason: invalid class name */
public final /* synthetic */ class Cdo implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12098a;

    /* renamed from: b  reason: collision with root package name */
    private final dl f12099b;

    Cdo(dl dlVar) {
        this.f12099b = dlVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12098a, false, 6233, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12098a, false, 6233, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        dl dlVar = this.f12099b;
        Throwable th = (Throwable) obj;
        a.a("RushRedEnvelopeDialog", th);
        dlVar.c();
        dlVar.g.setOnClickListener(dlVar);
        l.a(dlVar.getContext(), th);
    }
}
