package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38807a;

    /* renamed from: b  reason: collision with root package name */
    private final String f38808b;

    b(String str) {
        this.f38808b = str;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f38807a, false, 30558, new Class[0], Object.class)) {
            return a.a(this.f38808b);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f38807a, false, 30558, new Class[0], Object.class);
    }
}
