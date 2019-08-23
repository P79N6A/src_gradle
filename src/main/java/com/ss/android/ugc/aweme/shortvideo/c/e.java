package com.ss.android.ugc.aweme.shortvideo.c;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65876a;

    /* renamed from: b  reason: collision with root package name */
    private final c f65877b;

    public e(c cVar) {
        this.f65877b = cVar;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f65876a, false, 75210, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f65876a, false, 75210, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c cVar = this.f65877b;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            if (PatchProxy.isSupport(new Object[0], cVar, c.f65864a, false, 75208, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, c.f65864a, false, 75208, new Class[0], Void.TYPE);
                return;
            }
            cVar.f65866c.e(cVar.f65866c.e());
            cVar.f65866c.a(cVar.f65866c.b());
            cVar.f65866c.b(cVar.f65866c.c());
            if (cVar.h) {
                cVar.f65866c.d(cVar.f65866c.d());
                cVar.f65866c.c(cVar.f65866c.g());
            }
        }
    }
}
