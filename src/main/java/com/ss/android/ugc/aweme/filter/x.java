package com.ss.android.ugc.aweme.filter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class x implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47669a;

    /* renamed from: b  reason: collision with root package name */
    static final Callable f47670b = new x();

    private x() {
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f47669a, false, 44287, new Class[0], Object.class)) {
            return w.b();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f47669a, false, 44287, new Class[0], Object.class);
    }
}
