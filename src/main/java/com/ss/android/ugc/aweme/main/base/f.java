package com.ss.android.ugc.aweme.main.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54435a;

    /* renamed from: b  reason: collision with root package name */
    private final TabChangeManager f54436b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54437c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f54438d;

    f(TabChangeManager tabChangeManager, String str, boolean z) {
        this.f54436b = tabChangeManager;
        this.f54437c = str;
        this.f54438d = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f54435a, false, 57809, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54435a, false, 57809, new Class[0], Void.TYPE);
            return;
        }
        this.f54436b.a(this.f54437c, this.f54438d);
    }
}
