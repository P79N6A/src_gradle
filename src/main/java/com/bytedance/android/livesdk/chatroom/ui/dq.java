package com.bytedance.android.livesdk.chatroom.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dq implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12102a;

    /* renamed from: b  reason: collision with root package name */
    private final dl f12103b;

    dq(dl dlVar) {
        this.f12103b = dlVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12102a, false, 6235, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12102a, false, 6235, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        dl dlVar = this.f12103b;
        Integer num = (Integer) obj;
        dlVar.a(num.intValue());
        if (num.intValue() == 0) {
            dlVar.a();
        }
    }
}
