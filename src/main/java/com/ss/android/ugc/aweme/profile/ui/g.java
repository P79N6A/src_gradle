package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62747a;

    /* renamed from: b  reason: collision with root package name */
    private final String f62748b;

    /* renamed from: c  reason: collision with root package name */
    private final long f62749c;

    g(String str, long j) {
        this.f62748b = str;
        this.f62749c = j;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f62747a, false, 67810, new Class[0], Object.class)) {
            return AwemeListFragment.a(this.f62748b, this.f62749c);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f62747a, false, 67810, new Class[0], Object.class);
    }
}
