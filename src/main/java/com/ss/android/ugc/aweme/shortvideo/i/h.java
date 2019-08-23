package com.ss.android.ugc.aweme.shortvideo.i;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68207a;

    /* renamed from: b  reason: collision with root package name */
    private final a f68208b;

    h(a aVar) {
        this.f68208b = aVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f68207a, false, 78294, new Class[0], Object.class)) {
            return this.f68208b.f();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f68207a, false, 78294, new Class[0], Object.class);
    }
}
