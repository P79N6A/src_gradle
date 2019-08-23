package com.ss.android.ugc.aweme.update;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class n implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75286a;

    /* renamed from: b  reason: collision with root package name */
    private final m f75287b;

    n(m mVar) {
        this.f75287b = mVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f75286a, false, 87471, new Class[0], Object.class)) {
            return this.f75287b.z();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f75286a, false, 87471, new Class[0], Object.class);
    }
}
