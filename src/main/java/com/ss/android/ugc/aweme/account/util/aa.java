package com.ss.android.ugc.aweme.account.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.bean.a;
import java.util.concurrent.Callable;

public final /* synthetic */ class aa implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33073a;

    /* renamed from: b  reason: collision with root package name */
    static final Callable f33074b = new aa();

    private aa() {
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f33073a, false, 21458, new Class[0], Object.class)) {
            return new a();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f33073a, false, 21458, new Class[0], Object.class);
    }
}
