package com.ss.android.ugc.aweme.account.login.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean;

public final /* synthetic */ class k implements o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32630a;

    /* renamed from: b  reason: collision with root package name */
    private final LoginOrRegisterActivity f32631b;

    /* renamed from: c  reason: collision with root package name */
    private final long f32632c;

    k(LoginOrRegisterActivity loginOrRegisterActivity, long j) {
        this.f32631b = loginOrRegisterActivity;
        this.f32632c = j;
    }

    public final void a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f32630a, false, 20592, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f32630a, false, 20592, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f32631b.a(this.f32632c, (OneLoginPhoneBean) obj);
    }
}
