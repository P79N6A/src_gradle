package com.ss.android.ugc.aweme.crossplatform.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.platform.rn.c;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40716a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicBoolean f40717b;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static e f40718a = new e((byte) 0);
    }

    public static e a() {
        return a.f40718a;
    }

    private e() {
        this.f40717b = new AtomicBoolean(false);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f40716a, false, 34212, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40716a, false, 34212, new Class[0], Void.TYPE);
            return;
        }
        if (this.f40717b.compareAndSet(false, true)) {
            c.a();
        }
    }

    /* synthetic */ e(byte b2) {
        this();
    }
}
