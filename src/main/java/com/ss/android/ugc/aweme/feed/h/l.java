package com.ss.android.ugc.aweme.feed.h;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.h.g;
import java.util.concurrent.Callable;

public final /* synthetic */ class l implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45507a;

    /* renamed from: b  reason: collision with root package name */
    static final Callable f45508b = new l();

    private l() {
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f45507a, false, 42040, new Class[0], Object.class)) {
            return g.AnonymousClass1.a();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f45507a, false, 42040, new Class[0], Object.class);
    }
}
