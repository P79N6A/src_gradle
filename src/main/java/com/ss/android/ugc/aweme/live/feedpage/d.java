package com.ss.android.ugc.aweme.live.feedpage;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.live.feedpage.c;
import io.reactivex.functions.Consumer;
import java.util.Map;
import java.util.Set;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53395a;

    /* renamed from: b  reason: collision with root package name */
    private final c.a f53396b;

    /* renamed from: c  reason: collision with root package name */
    private final long f53397c;

    d(c.a aVar, long j) {
        this.f53396b = aVar;
        this.f53397c = j;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f53395a, false, 55671, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f53395a, false, 55671, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c.a aVar = this.f53396b;
        long j = this.f53397c;
        f fVar = (f) obj;
        Set<Long> set = aVar.f53392d;
        if (PatchProxy.isSupport(new Object[]{set, new Long(j), fVar}, aVar, c.a.f53389a, false, 55667, new Class[]{Set.class, Long.TYPE, f.class}, Void.TYPE)) {
            Object[] objArr = {set, new Long(j), fVar};
            ChangeQuickRedirect changeQuickRedirect = c.a.f53389a;
            c.a aVar2 = aVar;
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            PatchProxy.accessDispatch(objArr, aVar2, changeQuickRedirect2, false, 55667, new Class[]{Set.class, Long.TYPE, f.class}, Void.TYPE);
            return;
        }
        if (!fVar.a().isEmpty()) {
            Set<Long> keySet = fVar.a().keySet();
            Map a2 = fVar.a();
            for (Long l : keySet) {
                c.this.f53386e.put(l, Long.valueOf(j));
                long j2 = (Long) a2.get(l);
                if (j2 == null) {
                    j2 = 0L;
                }
                if (!c.f53384c.equals(j2)) {
                    c.this.f53385d.put(l, j2);
                } else {
                    c.this.f53385d.remove(l);
                }
            }
        } else {
            c.this.f53385d.put(aVar.f53391c, 0L);
        }
        aVar.a();
    }
}
