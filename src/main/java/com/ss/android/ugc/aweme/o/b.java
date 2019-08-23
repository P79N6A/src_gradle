package com.ss.android.ugc.aweme.o;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.f;
import com.ss.android.ugc.aweme.base.component.f;

public final /* synthetic */ class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58159a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a f58160b;

    b(f.a aVar) {
        this.f58160b = aVar;
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f58159a, false, 54503, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f58159a, false, 54503, new Class[]{Bundle.class}, Void.TYPE);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f58159a, false, 54502, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58159a, false, 54502, new Class[0], Void.TYPE);
            return;
        }
        f.a aVar = this.f58160b;
        if (aVar != null) {
            aVar.a();
        }
    }
}
