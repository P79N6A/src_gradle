package com.ss.android.ugc.aweme.festival.christmas.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.festival.christmas.api.ChristmasApi;
import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47246a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f47247b;

    j(Object[] objArr) {
        this.f47247b = objArr;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f47246a, false, 43917, new Class[0], Object.class)) {
            return ChristmasApi.a((String) this.f47247b[0]);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f47246a, false, 43917, new Class[0], Object.class);
    }
}
