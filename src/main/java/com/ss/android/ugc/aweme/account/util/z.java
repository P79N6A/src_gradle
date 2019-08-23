package com.ss.android.ugc.aweme.account.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.bean.a;
import java.util.concurrent.Callable;

public final /* synthetic */ class z implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33130a;

    /* renamed from: b  reason: collision with root package name */
    static final Callable f33131b = new z();

    private z() {
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f33130a, false, 21457, new Class[0], Object.class)) {
            return new a();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f33130a, false, 21457, new Class[0], Object.class);
    }
}
