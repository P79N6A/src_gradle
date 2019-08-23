package com.ss.android.ugc.aweme.utils.permission;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75937a;

    /* renamed from: b  reason: collision with root package name */
    private final PermissionStateReporter f75938b;

    c(PermissionStateReporter permissionStateReporter) {
        this.f75938b = permissionStateReporter;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f75937a, false, 88784, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f75937a, false, 88784, new Class[0], Object.class);
        }
        this.f75938b.f75923b.report(Integer.valueOf(e.a()), Integer.valueOf(e.b()));
        return null;
    }
}
