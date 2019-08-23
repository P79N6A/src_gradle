package com.ss.android.ugc.aweme.commercialize.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39784a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f39785b;

    h(Aweme aweme) {
        this.f39785b = aweme;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f39784a, false, 32377, new Class[0], Object.class)) {
            return g.a(this.f39785b);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f39784a, false, 32377, new Class[0], Object.class);
    }
}
