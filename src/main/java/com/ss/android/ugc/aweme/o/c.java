package com.ss.android.ugc.aweme.o;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.f;
import com.ss.android.ugc.aweme.base.component.f;

public final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58161a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a f58162b;

    c(f.a aVar) {
        this.f58162b = aVar;
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f58161a, false, 54505, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f58161a, false, 54505, new Class[]{Bundle.class}, Void.TYPE);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f58161a, false, 54504, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58161a, false, 54504, new Class[0], Void.TYPE);
            return;
        }
        f.a aVar = this.f58162b;
        if (aVar != null) {
            aVar.a();
        }
    }
}
