package com.ss.android.ugc.aweme.crossplatform.platform.rn;

import com.facebook.react.bridge.RNDegradeExceptionHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.platform.rn.e;

public final /* synthetic */ class f implements RNDegradeExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40859a;

    /* renamed from: b  reason: collision with root package name */
    private final e.b f40860b;

    f(e.b bVar) {
        this.f40860b = bVar;
    }

    public final void onDegrade(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f40859a, false, 34354, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f40859a, false, 34354, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        e.b bVar = this.f40860b;
        if (bVar != null) {
            bVar.a(exc2);
        }
    }
}
