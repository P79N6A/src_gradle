package com.ss.android.ugc.aweme.o;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.d.f;
import com.ss.android.ugc.aweme.poi.a;
import com.ss.android.ugc.aweme.port.in.y;

public final /* synthetic */ class o implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58301a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f58302b;

    /* renamed from: c  reason: collision with root package name */
    private final y.a f58303c;

    o(Context context, y.a aVar) {
        this.f58302b = context;
        this.f58303c = aVar;
    }

    public final void W_() {
        if (PatchProxy.isSupport(new Object[0], this, f58301a, false, 54683, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58301a, false, 54683, new Class[0], Void.TYPE);
            return;
        }
        Context context = this.f58302b;
        y.a aVar = this.f58303c;
        a f2 = af.a(context.getApplicationContext()).f();
        if (f2 == null || !f2.isValid()) {
            if (aVar != null) {
                aVar.a();
            }
        } else if (aVar != null) {
            aVar.a(f2.latitude, f2.longitude);
        }
    }
}
