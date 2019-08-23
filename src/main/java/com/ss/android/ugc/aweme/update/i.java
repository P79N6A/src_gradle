package com.ss.android.ugc.aweme.update;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75231a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f75232b;

    i(Runnable runnable) {
        this.f75232b = runnable;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f75231a, false, 87374, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f75231a, false, 87374, new Class[0], Object.class);
        }
        this.f75232b.run();
        return null;
    }
}
