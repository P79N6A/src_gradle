package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38825a;

    /* renamed from: b  reason: collision with root package name */
    static final Callable f38826b = new c();

    private c() {
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f38825a, false, 30559, new Class[0], Object.class)) {
            return a.b();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f38825a, false, 30559, new Class[0], Object.class);
    }
}
