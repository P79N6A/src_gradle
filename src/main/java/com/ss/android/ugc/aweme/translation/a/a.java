package com.ss.android.ugc.aweme.translation.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.p;
import com.ss.android.ugc.aweme.translation.model.c;
import com.ss.android.ugc.aweme.translation.model.d;
import com.ss.android.ugc.aweme.w.a.b;

public final class a extends b<c, com.ss.android.ugc.aweme.translation.ui.a> implements p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74958a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f74958a, false, 87297, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74958a, false, 87297, new Class[0], Void.TYPE);
            return;
        }
        d dVar = (d) ((c) this.f76546d).mData;
        if (dVar == null) {
            ((com.ss.android.ugc.aweme.translation.ui.a) this.f76547e).a(new Exception());
        } else {
            ((com.ss.android.ugc.aweme.translation.ui.a) this.f76547e).a(dVar);
        }
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f74958a, false, 87296, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f74958a, false, 87296, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        ((com.ss.android.ugc.aweme.translation.ui.a) this.f76547e).a(exc2);
    }

    public a(c cVar, com.ss.android.ugc.aweme.translation.ui.a aVar) {
        super(cVar, aVar);
        ((c) this.f76546d).addNotifyListener(this);
    }

    public final void a(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f74958a, false, 87295, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f74958a, false, 87295, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        ((c) this.f76546d).a(str4, str5, str6);
    }
}
