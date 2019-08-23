package com.ss.android.ugc.aweme.qrcode.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.p;
import com.ss.android.ugc.aweme.qrcode.c.c;
import com.ss.android.ugc.aweme.qrcode.c.d;
import com.ss.android.ugc.aweme.w.a.b;

public final class k extends b<d, b> implements p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63441a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f63441a, false, 70479, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63441a, false, 70479, new Class[0], Void.TYPE);
            return;
        }
        if (this.f76547e != null) {
            ((b) this.f76547e).a((c) ((d) this.f76546d).mData);
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f63441a, false, 70478, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f63441a, false, 70478, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f76547e != null) {
            ((b) this.f76547e).a(exc);
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f63441a, false, 70477, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f63441a, false, 70477, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ((d) this.f76546d).a(str2);
    }

    public k(d dVar, b bVar) {
        super(dVar, bVar);
        dVar.addNotifyListener(this);
    }
}
