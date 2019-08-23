package com.ss.android.ugc.aweme.feedback;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47180a;

    /* renamed from: b  reason: collision with root package name */
    private final long f47181b;

    /* renamed from: c  reason: collision with root package name */
    private final long f47182c;

    /* renamed from: d  reason: collision with root package name */
    private final String f47183d;

    i(long j, long j2, String str) {
        this.f47181b = j;
        this.f47182c = j2;
        this.f47183d = str;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f47180a, false, 43794, new Class[0], Object.class)) {
            return g.a(this.f47181b, this.f47182c, this.f47183d);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f47180a, false, 43794, new Class[0], Object.class);
    }
}
