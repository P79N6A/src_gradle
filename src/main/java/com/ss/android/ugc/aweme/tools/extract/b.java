package com.ss.android.ugc.aweme.tools.extract;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74696a;

    /* renamed from: b  reason: collision with root package name */
    private final a f74697b;

    /* renamed from: c  reason: collision with root package name */
    private final String f74698c;

    b(a aVar, String str) {
        this.f74697b = aVar;
        this.f74698c = str;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f74696a, false, 87053, new Class[0], Object.class)) {
            return this.f74697b.b(this.f74698c);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f74696a, false, 87053, new Class[0], Object.class);
    }
}
