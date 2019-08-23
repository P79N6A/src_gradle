package com.ss.android.ugc.awemepushlib.interaction;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.pushmanager.app.a;

public final /* synthetic */ class s implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77046a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.awemepushapi.a f77047b;

    s(com.ss.android.ugc.awemepushapi.a aVar) {
        this.f77047b = aVar;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f77046a, false, 90262, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f77046a, false, 90262, new Class[]{String.class}, Void.TYPE);
        }
    }
}
