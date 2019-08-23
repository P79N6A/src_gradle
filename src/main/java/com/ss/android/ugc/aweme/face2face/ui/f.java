package com.ss.android.ugc.aweme.face2face.ui;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.face2face.ui.d;
import com.ss.android.ugc.aweme.profile.model.User;

public final /* synthetic */ class f implements com.ss.android.ugc.aweme.base.component.f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44086a;

    /* renamed from: b  reason: collision with root package name */
    private final d.AnonymousClass2 f44087b;

    /* renamed from: c  reason: collision with root package name */
    private final User f44088c;

    f(d.AnonymousClass2 r1, User user) {
        this.f44087b = r1;
        this.f44088c = user;
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f44086a, false, 39227, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f44086a, false, 39227, new Class[]{Bundle.class}, Void.TYPE);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44086a, false, 39226, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44086a, false, 39226, new Class[0], Void.TYPE);
            return;
        }
        d.AnonymousClass2 r0 = this.f44087b;
        User user = this.f44088c;
        if (com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            d.this.b(user);
        }
    }
}
