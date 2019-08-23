package com.ss.android.ugc.aweme.ah;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ah.b;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33284a;

    /* renamed from: b  reason: collision with root package name */
    private final b.a f33285b;

    c(b.a aVar) {
        this.f33285b = aVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f33284a, false, 71016, new Class[0], Object.class)) {
            return this.f33285b.a();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f33284a, false, 71016, new Class[0], Object.class);
    }
}
