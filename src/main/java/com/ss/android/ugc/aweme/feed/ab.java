package com.ss.android.ugc.aweme.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class ab implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44636a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f44637b;

    public ab(Runnable runnable) {
        this.f44637b = runnable;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f44636a, false, 40130, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f44636a, false, 40130, new Class[0], Object.class);
        }
        this.f44637b.run();
        return null;
    }
}
