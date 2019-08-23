package com.ss.android.ugc.aweme.follow.widet;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.profile.model.User;

public final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47866a;

    /* renamed from: b  reason: collision with root package name */
    private final a.AnonymousClass1 f47867b;

    /* renamed from: c  reason: collision with root package name */
    private final User f47868c;

    c(a.AnonymousClass1 r1, User user) {
        this.f47867b = r1;
        this.f47868c = user;
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f47866a, false, 44770, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f47866a, false, 44770, new Class[]{Bundle.class}, Void.TYPE);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f47866a, false, 44769, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47866a, false, 44769, new Class[0], Void.TYPE);
            return;
        }
        a.AnonymousClass1 r0 = this.f47867b;
        User user = this.f47868c;
        if (d.a().isLogin()) {
            a.this.b(user);
        }
    }
}
