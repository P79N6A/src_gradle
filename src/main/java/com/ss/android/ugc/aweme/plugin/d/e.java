package com.ss.android.ugc.aweme.plugin.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.plugin.a.b;
import java.util.ArrayList;
import java.util.List;

public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59289a;

    /* renamed from: d  reason: collision with root package name */
    private static e f59290d = new e();

    /* renamed from: b  reason: collision with root package name */
    public List<b.a> f59291b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final Object f59292c = new Object();

    public static e a() {
        return f59290d;
    }

    private e() {
    }

    public final void a(b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f59289a, false, 64625, new Class[]{b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f59289a, false, 64625, new Class[]{b.a.class}, Void.TYPE);
            return;
        }
        synchronized (this.f59292c) {
            if (!this.f59291b.contains(aVar)) {
                this.f59291b.add(aVar);
            }
        }
    }

    public final void b(b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f59289a, false, 64626, new Class[]{b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f59289a, false, 64626, new Class[]{b.a.class}, Void.TYPE);
            return;
        }
        synchronized (this.f59292c) {
            if (this.f59291b.contains(aVar)) {
                this.f59291b.remove(aVar);
            }
        }
    }
}
