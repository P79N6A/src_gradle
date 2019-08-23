package com.bytedance.android.livesdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class v implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17652a;

    /* renamed from: b  reason: collision with root package name */
    private final s f17653b;

    v(s sVar) {
        this.f17653b = sVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17652a, false, 2646, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17652a, false, 2646, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f17653b.lambda$loadResources$2$LiveCameraResManager((Boolean) obj);
    }
}
