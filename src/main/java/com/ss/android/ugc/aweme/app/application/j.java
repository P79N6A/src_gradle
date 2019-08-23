package com.ss.android.ugc.aweme.app.application;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.common.a.a;
import java.util.ArrayList;
import java.util.List;

public abstract class j extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f33958b;

    /* renamed from: c  reason: collision with root package name */
    List<a> f33959c;

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public final void p_() {
        if (PatchProxy.isSupport(new Object[0], this, f33958b, false, 23222, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33958b, false, 23222, new Class[0], Void.TYPE);
            return;
        }
        super.p_();
        a();
        b();
        com.ss.android.b.a.a.a.a(new k(this));
    }

    public j(Application application) {
        super(application);
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f33958b, false, 23223, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f33958b, false, 23223, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (this.f33959c == null) {
            this.f33959c = new ArrayList();
        }
        if (!this.f33959c.contains(aVar)) {
            this.f33959c.add(aVar);
        }
    }
}
