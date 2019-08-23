package com.ss.android.ugc.aweme.commercialize.loft;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.a;

public final /* synthetic */ class c implements com.ss.android.ugc.aweme.commercialize.loft.b.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39155a;

    /* renamed from: b  reason: collision with root package name */
    private final LoftActivity f39156b;

    /* renamed from: c  reason: collision with root package name */
    private final a f39157c;

    c(LoftActivity loftActivity, a aVar) {
        this.f39156b = loftActivity;
        this.f39157c = aVar;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f39155a, false, 31006, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39155a, false, 31006, new Class[0], Void.TYPE);
            return;
        }
        LoftActivity loftActivity = this.f39156b;
        a aVar = this.f39157c;
        if (loftActivity.f39070b) {
            loftActivity.b(aVar);
        } else {
            loftActivity.f39071c = true;
        }
    }
}
