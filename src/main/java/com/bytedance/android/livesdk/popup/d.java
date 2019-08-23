package com.bytedance.android.livesdk.popup;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class d extends a<d> {
    public static ChangeQuickRedirect s;
    private a t;

    public interface a {
        void a(View view, d dVar);
    }

    public d() {
    }

    public final d a(a aVar) {
        this.t = aVar;
        return this;
    }

    public static d a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, s, true, 12832, new Class[]{Context.class}, d.class)) {
            return new d(context2);
        }
        return (d) PatchProxy.accessDispatch(new Object[]{context2}, null, s, true, 12832, new Class[]{Context.class}, d.class);
    }

    private d(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, a.f16841a, false, 12774, new Class[]{Context.class}, a.class)) {
            a aVar = (a) PatchProxy.accessDispatch(new Object[]{context2}, this, a.f16841a, false, 12774, new Class[]{Context.class}, a.class);
            return;
        }
        this.f16843c = context2;
        a();
    }

    public final /* synthetic */ void a(View view, a aVar) {
        d dVar = (d) aVar;
        if (PatchProxy.isSupport(new Object[]{view, dVar}, this, s, false, 12833, new Class[]{View.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, dVar}, this, s, false, 12833, new Class[]{View.class, d.class}, Void.TYPE);
            return;
        }
        if (this.t != null) {
            this.t.a(view, dVar);
        }
    }
}
