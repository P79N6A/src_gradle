package com.ss.android.ugc.aweme.w.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w.a.c;
import com.ss.android.ugc.aweme.w.a.d;

public class b<M extends c, V extends d> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f76544b;

    /* renamed from: c  reason: collision with root package name */
    protected final String f76545c = getClass().getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    protected M f76546d;

    /* renamed from: e  reason: collision with root package name */
    protected V f76547e;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76544b, false, 60642, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76544b, false, 60642, new Class[0], Void.TYPE);
            return;
        }
        if (this.f76546d != null) {
            this.f76546d.onDestroy();
        }
        this.f76546d = null;
        this.f76547e = null;
    }

    public b(M m, V v) {
        if (m == null) {
            throw new NullPointerException("Model can not null");
        } else if (v != null) {
            this.f76546d = m;
            this.f76547e = v;
        } else {
            throw new NullPointerException("View can not null");
        }
    }
}
