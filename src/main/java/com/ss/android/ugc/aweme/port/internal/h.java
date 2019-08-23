package com.ss.android.ugc.aweme.port.internal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61172a;

    /* renamed from: b  reason: collision with root package name */
    private final PublishFragmentLifecycleCallbacks f61173b;

    h(PublishFragmentLifecycleCallbacks publishFragmentLifecycleCallbacks) {
        this.f61173b = publishFragmentLifecycleCallbacks;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f61172a, false, 67187, new Class[0], Object.class)) {
            return this.f61173b.f61145b.f3769b.c();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f61172a, false, 67187, new Class[0], Object.class);
    }
}
