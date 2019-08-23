package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class dn implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75756a;

    /* renamed from: b  reason: collision with root package name */
    public static final Callable f75757b = new dn();

    private dn() {
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f75756a, false, 88527, new Class[0], Object.class)) {
            return dm.a();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f75756a, false, 88527, new Class[0], Object.class);
    }
}
