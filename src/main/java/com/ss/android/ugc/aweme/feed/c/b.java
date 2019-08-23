package com.ss.android.ugc.aweme.feed.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45083a;

    /* renamed from: b  reason: collision with root package name */
    public List<a> f45084b = new ArrayList();

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f45083a, false, 40949, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f45083a, false, 40949, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (!this.f45084b.contains(aVar)) {
            this.f45084b.add(aVar);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f45083a, false, 40954, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f45083a, false, 40954, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        for (a aVar : this.f45084b) {
            aVar.v = z;
        }
    }
}
