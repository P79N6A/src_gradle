package com.ss.android.ugc.aweme.commercialize.coupon.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.p;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.w.a.b;

public final class h extends b<g, f> implements p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38559a;

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f38559a, false, 30465, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f38559a, false, 30465, new Class[]{Exception.class}, Void.TYPE);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f38559a, false, 30466, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38559a, false, 30466, new Class[0], Void.TYPE);
            return;
        }
        if (this.f76547e != null) {
            User user = (User) ((g) this.f76546d).mData;
            if (user == null) {
                new Exception();
                return;
            }
            ((f) this.f76547e).a(user);
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f38559a, false, 30464, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f38559a, false, 30464, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ((g) this.f76546d).a(str2);
    }

    public h(g gVar, f fVar) {
        super(gVar, fVar);
        gVar.addNotifyListener(this);
    }
}
