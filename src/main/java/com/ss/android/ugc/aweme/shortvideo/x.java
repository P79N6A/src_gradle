package com.ss.android.ugc.aweme.shortvideo;

import com.google.common.a.s;
import com.google.common.util.concurrent.b;
import com.google.common.util.concurrent.e;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.a.b.a;

public final /* synthetic */ class x implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71487a;

    /* renamed from: b  reason: collision with root package name */
    private final s f71488b;

    x(s sVar) {
        this.f71488b = sVar;
    }

    public final q a(Object obj) {
        q qVar;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f71487a, false, 73945, new Class[]{Object.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{obj}, this, f71487a, false, 73945, new Class[]{Object.class}, q.class);
        }
        s sVar = this.f71488b;
        a aVar = (a) obj;
        if (com.ss.android.ugc.aweme.port.in.a.g.a(aVar)) {
            if (!PatchProxy.isSupport(new Object[]{aVar, sVar}, null, w.f71307a, true, 73944, new Class[]{a.class, s.class}, q.class)) {
                return new b<V>(aVar, sVar) {

                    /* renamed from: a */
                    final /* synthetic */ a f71308a;

                    /* renamed from: b */
                    final /* synthetic */ s f71309b;
                };
            }
            qVar = (q) PatchProxy.accessDispatch(new Object[]{aVar, sVar}, null, w.f71307a, true, 73944, new Class[]{a.class, s.class}, q.class);
        } else {
            qVar = l.a((Throwable) aVar);
        }
        return qVar;
    }
}
