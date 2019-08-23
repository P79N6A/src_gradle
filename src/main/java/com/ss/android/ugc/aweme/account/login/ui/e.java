package com.ss.android.ugc.aweme.account.login.ui;

import a.g;
import a.i;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.i.a;
import com.ss.android.ugc.aweme.w;

public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32614a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseLoginOrRegisterActivity f32615b;

    e(BaseLoginOrRegisterActivity baseLoginOrRegisterActivity) {
        this.f32615b = baseLoginOrRegisterActivity;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f32614a, false, 20462, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f32614a, false, 20462, new Class[]{i.class}, Object.class);
        }
        BaseLoginOrRegisterActivity baseLoginOrRegisterActivity = this.f32615b;
        if (!iVar.d()) {
            a.b("", "cancel", a.b.USER_OPERATOR_AFTER_LOGIN, null, "");
            if (baseLoginOrRegisterActivity.u != null) {
                baseLoginOrRegisterActivity.u.j();
                baseLoginOrRegisterActivity.u = null;
            }
        }
        w.b(w.k());
        if (!baseLoginOrRegisterActivity.e()) {
            baseLoginOrRegisterActivity.finish();
        }
        a.a("");
        return (Bundle) iVar.e();
    }
}
