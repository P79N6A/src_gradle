package com.bytedance.android.livesdk.wallet;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.c;
import com.bytedance.android.livesdkapi.host.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public class l implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18124a;

    /* renamed from: b  reason: collision with root package name */
    private n f18125b;

    public final Map<String, String> a() {
        if (!PatchProxy.isSupport(new Object[0], this, f18124a, false, 13960, new Class[0], Map.class)) {
            return this.f18125b.a();
        }
        return (Map) PatchProxy.accessDispatch(new Object[0], this, f18124a, false, 13960, new Class[0], Map.class);
    }

    public final String b() {
        if (!PatchProxy.isSupport(new Object[0], this, f18124a, false, 13963, new Class[0], String.class)) {
            return this.f18125b.b();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f18124a, false, 13963, new Class[0], String.class);
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, f18124a, false, 13964, new Class[0], String.class)) {
            return this.f18125b.c();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f18124a, false, 13964, new Class[0], String.class);
    }

    public l(n nVar) {
        this.f18125b = nVar;
    }

    public final void a(Context context, c cVar, n.a aVar) {
        Context context2 = context;
        c cVar2 = cVar;
        n.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, cVar2, aVar2}, this, f18124a, false, 13959, new Class[]{Context.class, c.class, n.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, cVar2, aVar2}, this, f18124a, false, 13959, new Class[]{Context.class, c.class, n.a.class}, Void.TYPE);
            return;
        }
        j.q().h().d().f17898b = cVar2;
        if (((o) j.q().k().a(o.class)) == null) {
            this.f18125b.a(context2, cVar2, aVar2);
        }
    }

    public final void a(Activity activity, c cVar, n.a aVar) {
        Activity activity2 = activity;
        c cVar2 = cVar;
        n.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, cVar2, aVar2}, this, f18124a, false, 13958, new Class[]{Activity.class, c.class, n.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, cVar2, aVar2}, this, f18124a, false, 13958, new Class[]{Activity.class, c.class, n.a.class}, Void.TYPE);
            return;
        }
        j.q().h().d().f17898b = cVar2;
        m mVar = (m) j.q().k().a(m.class);
        if (mVar != null) {
            mVar.a(activity2, cVar2, true, aVar2);
        } else {
            this.f18125b.a(activity2, cVar2, aVar2);
        }
    }
}
