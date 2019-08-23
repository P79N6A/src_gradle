package com.ss.android.ugc.aweme.filter;

import com.crashlytics.android.Crashlytics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effect.c.b.d;
import com.ss.android.ugc.aweme.g.a;

public final /* synthetic */ class ab implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47473a;

    /* renamed from: b  reason: collision with root package name */
    static final d f47474b = new ab();

    private ab() {
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f47473a, false, 44313, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f47473a, false, 44313, new Class[]{Exception.class}, Void.TYPE);
        } else if (!a.a()) {
            Crashlytics.logException(exc);
        } else {
            throw new RuntimeException(exc2);
        }
    }
}
