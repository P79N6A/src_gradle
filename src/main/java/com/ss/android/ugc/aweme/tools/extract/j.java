package com.ss.android.ugc.aweme.tools.extract;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.extract.h;
import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74717a;

    /* renamed from: b  reason: collision with root package name */
    private final h.AnonymousClass1 f74718b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f74719c;

    /* renamed from: d  reason: collision with root package name */
    private final String f74720d;

    j(h.AnonymousClass1 r1, Integer num, String str) {
        this.f74718b = r1;
        this.f74719c = num;
        this.f74720d = str;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f74717a, false, 87070, new Class[0], Object.class)) {
            return this.f74718b.a(this.f74719c, this.f74720d);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f74717a, false, 87070, new Class[0], Object.class);
    }
}
