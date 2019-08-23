package com.bytedance.android.livesdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Action;

public final /* synthetic */ class x implements Action {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18579a;

    /* renamed from: b  reason: collision with root package name */
    private final s f18580b;

    x(s sVar) {
        this.f18580b = sVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f18579a, false, 2648, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18579a, false, 2648, new Class[0], Void.TYPE);
            return;
        }
        this.f18580b.lambda$loadResources$4$LiveCameraResManager();
    }
}
