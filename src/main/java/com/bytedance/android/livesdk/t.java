package com.bytedance.android.livesdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class t implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17421a;

    /* renamed from: b  reason: collision with root package name */
    private final s f17422b;

    t(s sVar) {
        this.f17422b = sVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17421a, false, 2644, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17421a, false, 2644, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f17422b.lambda$loadResources$0$LiveCameraResManager((Integer) obj);
    }
}
