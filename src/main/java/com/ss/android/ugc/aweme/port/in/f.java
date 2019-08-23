package com.ss.android.ugc.aweme.port.in;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61134a;

    /* renamed from: b  reason: collision with root package name */
    static final Callable f61135b = new f();

    private f() {
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f61134a, false, 67132, new Class[0], Object.class)) {
            return a.h();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f61134a, false, 67132, new Class[0], Object.class);
    }
}
