package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class dk implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62657a;

    /* renamed from: b  reason: collision with root package name */
    private final String f62658b;

    dk(String str) {
        this.f62658b = str;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f62657a, false, 68974, new Class[0], Object.class)) {
            return RecommendUserActivity.a(this.f62658b);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f62657a, false, 68974, new Class[0], Object.class);
    }
}
