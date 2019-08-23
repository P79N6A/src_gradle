package com.ss.android.ugc.aweme.filter.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.filter.d.a;
import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47577a;

    /* renamed from: b  reason: collision with root package name */
    private final a.AnonymousClass1 f47578b;

    /* renamed from: c  reason: collision with root package name */
    private final List f47579c;

    b(a.AnonymousClass1 r1, List list) {
        this.f47578b = r1;
        this.f47579c = list;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f47577a, false, 44465, new Class[0], Object.class)) {
            return this.f47578b.a(this.f47579c);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f47577a, false, 44465, new Class[0], Object.class);
    }
}
