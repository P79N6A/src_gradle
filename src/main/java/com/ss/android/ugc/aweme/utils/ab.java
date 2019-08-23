package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class ab implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75481a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f75482b;

    /* renamed from: c  reason: collision with root package name */
    private final String f75483c;

    ab(Runnable runnable, String str) {
        this.f75482b = runnable;
        this.f75483c = str;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f75481a, false, 88036, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f75481a, false, 88036, new Class[0], Object.class);
        }
        Runnable runnable = this.f75482b;
        if (runnable == null) {
            return null;
        }
        runnable.run();
        return null;
    }
}
