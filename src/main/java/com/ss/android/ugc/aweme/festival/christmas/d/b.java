package com.ss.android.ugc.aweme.festival.christmas.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.festival.christmas.api.ChristmasApi;
import com.ss.android.ugc.aweme.festival.christmas.d.a;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47255a;

    /* renamed from: b  reason: collision with root package name */
    private final a.AnonymousClass1 f47256b;

    b(a.AnonymousClass1 r1) {
        this.f47256b = r1;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f47255a, false, 43922, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f47255a, false, 43922, new Class[0], Object.class);
        }
        a.AnonymousClass1 r0 = this.f47256b;
        return ChristmasApi.a(a.this.f47251b, a.this.f47252c);
    }
}
