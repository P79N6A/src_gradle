package com.ss.android.ugc.aweme;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class ab implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31576a;

    /* renamed from: b  reason: collision with root package name */
    static final Callable f31577b = new ab();

    private ab() {
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f31576a, false, 19506, new Class[0], Object.class)) {
            return aa.a();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f31576a, false, 19506, new Class[0], Object.class);
    }
}
