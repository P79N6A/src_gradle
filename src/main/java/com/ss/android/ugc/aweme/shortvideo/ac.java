package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ao.a.e;
import com.ss.android.ugc.aweme.shortvideo.ab;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class ac implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65453a;

    /* renamed from: b  reason: collision with root package name */
    private final ab.AnonymousClass1 f65454b;

    ac(ab.AnonymousClass1 r1) {
        this.f65454b = r1;
    }

    public final Object invoke(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f65453a, false, 73966, new Class[]{Object.class}, Object.class)) {
            return this.f65454b.a((e) obj);
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f65453a, false, 73966, new Class[]{Object.class}, Object.class);
    }
}
