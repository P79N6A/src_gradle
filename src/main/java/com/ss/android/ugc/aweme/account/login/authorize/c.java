package com.ss.android.ugc.aweme.account.login.authorize;

import a.g;
import a.i;
import android.content.Intent;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.globallistener.GlobalListener;
import com.ss.android.ugc.aweme.account.i.a;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.w;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32129a;

    /* renamed from: b  reason: collision with root package name */
    private final AuthorizeActivity f32130b;

    c(AuthorizeActivity authorizeActivity) {
        this.f32130b = authorizeActivity;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f32129a, false, 20137, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f32129a, false, 20137, new Class[]{i.class}, Object.class);
        }
        AuthorizeActivity authorizeActivity = this.f32130b;
        if (iVar.d()) {
            a.b("", "cancel", a.b.USER_OPERATOR_AFTER_LOGIN, a.C0406a.THIRD_PARTY, "");
            authorizeActivity.a(0, new Intent());
            return null;
        }
        w.b(w.k());
        authorizeActivity.a(-1, new Intent());
        GlobalListener.a(1);
        User k = w.k();
        if (authorizeActivity.getIntent().getBooleanExtra("need_remember_login_method", true)) {
            com.ss.android.ugc.aweme.account.login.g.a((BaseLoginMethod) new TPLoginMethod(k.getUid(), authorizeActivity.p, TPUserInfo.from(k)));
        }
        if (w.h()) {
            a.a("");
            w.a(2, 1, (Object) "");
        }
        return (Bundle) iVar.e();
    }
}
