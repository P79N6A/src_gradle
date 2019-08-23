package com.ss.android.ugc.aweme.app;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class aj implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33759a;

    /* renamed from: b  reason: collision with root package name */
    public static final Callable f33760b = new aj();

    private aj() {
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f33759a, false, 22569, new Class[0], Object.class)) {
            return ai.a();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f33759a, false, 22569, new Class[0], Object.class);
    }
}
