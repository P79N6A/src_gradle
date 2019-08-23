package com.bytedance.android.livesdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class u implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17424a;

    /* renamed from: b  reason: collision with root package name */
    private final s f17425b;

    u(s sVar) {
        this.f17425b = sVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f17424a, false, 2645, new Class[0], Object.class)) {
            return this.f17425b.lambda$loadResources$1$LiveCameraResManager();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f17424a, false, 2645, new Class[0], Object.class);
    }
}
