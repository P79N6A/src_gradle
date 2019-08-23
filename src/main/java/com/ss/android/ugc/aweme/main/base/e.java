package com.ss.android.ugc.aweme.main.base;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54430a;

    /* renamed from: b  reason: collision with root package name */
    private final TabChangeManager f54431b;

    /* renamed from: c  reason: collision with root package name */
    private final Class f54432c;

    /* renamed from: d  reason: collision with root package name */
    private final String f54433d;

    /* renamed from: e  reason: collision with root package name */
    private final Bundle f54434e;

    e(TabChangeManager tabChangeManager, Class cls, String str, Bundle bundle) {
        this.f54431b = tabChangeManager;
        this.f54432c = cls;
        this.f54433d = str;
        this.f54434e = bundle;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f54430a, false, 57808, new Class[0], Object.class)) {
            return this.f54431b.b(this.f54432c, this.f54433d, this.f54434e);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f54430a, false, 57808, new Class[0], Object.class);
    }
}
