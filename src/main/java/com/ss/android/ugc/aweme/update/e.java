package com.ss.android.ugc.aweme.update;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75213a;

    /* renamed from: b  reason: collision with root package name */
    private final d f75214b;

    public e(d dVar) {
        this.f75214b = dVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f75213a, false, 87364, new Class[0], Object.class)) {
            return this.f75214b.b();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f75213a, false, 87364, new Class[0], Object.class);
    }
}
