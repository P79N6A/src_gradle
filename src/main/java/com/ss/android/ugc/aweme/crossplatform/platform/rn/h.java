package com.ss.android.ugc.aweme.crossplatform.platform.rn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.platform.rn.e;
import com.ss.android.ugc.aweme.crossplatform.platform.rn.m;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class h implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40867a;

    /* renamed from: b  reason: collision with root package name */
    private final e.b f40868b;

    h(e.b bVar) {
        this.f40868b = bVar;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f40867a, false, 34356, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f40867a, false, 34356, new Class[]{Object.class}, Object.class);
        }
        this.f40868b.a((Exception) (m.a) obj);
        return null;
    }
}
