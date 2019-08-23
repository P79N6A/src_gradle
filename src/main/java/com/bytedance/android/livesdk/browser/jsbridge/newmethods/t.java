package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class t implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9617a;

    /* renamed from: b  reason: collision with root package name */
    private final s f9618b;

    t(s sVar) {
        this.f9618b = sVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9617a, false, 3696, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9617a, false, 3696, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        s sVar = this.f9618b;
        if (sVar.f9615b != null) {
            sVar.f9615b.dismiss();
        }
    }
}
