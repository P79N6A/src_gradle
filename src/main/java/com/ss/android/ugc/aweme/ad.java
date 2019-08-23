package com.ss.android.ugc.aweme;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.user.util.d;
import java.util.concurrent.Callable;

public final /* synthetic */ class ad implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33193a;

    /* renamed from: b  reason: collision with root package name */
    static final Callable f33194b = new ad();

    private ad() {
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f33193a, false, 19508, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f33193a, false, 19508, new Class[0], Object.class);
        }
        d.a("");
        return null;
    }
}
