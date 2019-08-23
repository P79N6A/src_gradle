package com.ss.android.ugc.aweme.profile.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class z implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61531a;

    /* renamed from: b  reason: collision with root package name */
    static final Callable f61532b = new z();

    private z() {
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f61531a, false, 70031, new Class[0], Object.class)) {
            return null;
        }
        return PatchProxy.accessDispatch(new Object[0], this, f61531a, false, 70031, new Class[0], Object.class);
    }
}
