package com.ss.android.ugc.aweme.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class af implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44990a;

    /* renamed from: b  reason: collision with root package name */
    private final ae f44991b;

    /* renamed from: c  reason: collision with root package name */
    private final String f44992c;

    af(ae aeVar, String str) {
        this.f44991b = aeVar;
        this.f44992c = str;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f44990a, false, 40153, new Class[0], Object.class)) {
            return this.f44991b.a(this.f44992c);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f44990a, false, 40153, new Class[0], Object.class);
    }
}
