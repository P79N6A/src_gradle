package com.ss.android.ugc.aweme.commercialize.coupon.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.coupon.model.d;
import com.ss.android.ugc.aweme.common.p;

public final class b extends com.ss.android.ugc.aweme.w.a.b<a, e> implements p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38544a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f38544a, false, 30454, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38544a, false, 30454, new Class[0], Void.TYPE);
            return;
        }
        if (this.f76547e != null) {
            d dVar = (d) ((a) this.f76546d).mData;
            if (dVar == null) {
                ((e) this.f76547e).a(new Exception());
                return;
            }
            ((e) this.f76547e).a(dVar);
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f38544a, false, 30453, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f38544a, false, 30453, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f76547e != null) {
            ((e) this.f76547e).a(exc);
        }
    }

    public b(a aVar, e eVar) {
        super(aVar, eVar);
        aVar.addNotifyListener(this);
    }

    public final void a(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f38544a, false, 30452, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f38544a, false, 30452, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        ((a) this.f76546d).a(i, str2);
    }
}
