package com.ss.android.ugc.aweme.draft.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.e;
import java.util.ArrayList;
import java.util.List;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43463a;

    /* renamed from: b  reason: collision with root package name */
    public e f43464b;

    /* renamed from: c  reason: collision with root package name */
    public List<c> f43465c;

    public final List<c> a() {
        if (PatchProxy.isSupport(new Object[0], this, f43463a, false, 38507, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f43463a, false, 38507, new Class[0], List.class);
        }
        if (this.f43465c == null) {
            this.f43465c = new ArrayList();
        }
        return this.f43465c;
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f43463a, false, 38508, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f43463a, false, 38508, new Class[]{c.class}, Void.TYPE);
        } else if (cVar != null) {
            if (this.f43465c == null) {
                this.f43465c = new ArrayList();
                this.f43465c.add(cVar);
                return;
            }
            int size = this.f43465c.size();
            for (int i = 0; i < size; i++) {
                if (cVar.D > this.f43465c.get(i).D) {
                    this.f43465c.add(i, cVar);
                    return;
                }
            }
        }
    }
}
