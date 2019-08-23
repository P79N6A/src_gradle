package com.ss.android.ugc.aweme.account.util;

import a.g;
import a.i;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.i.a;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.w;

public final /* synthetic */ class v implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33120a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f33121b;

    v(Bundle bundle) {
        this.f33121b = bundle;
    }

    public final Object then(i iVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f33120a, false, 21453, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f33120a, false, 21453, new Class[]{i.class}, Object.class);
        }
        Bundle bundle = this.f33121b;
        if (PatchProxy.isSupport(new Object[]{iVar}, null, r.f33113a, true, 21433, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, null, r.f33113a, true, 21433, new Class[]{i.class}, Void.TYPE);
        } else if (iVar.d()) {
            String str2 = "";
            if (iVar.f() instanceof a) {
                a aVar = (a) iVar.f();
                String valueOf = String.valueOf(aVar.getErrorCode());
                str = aVar.getErrorMsg();
                str2 = valueOf;
            } else {
                str = iVar.f().getMessage();
            }
            com.ss.android.ugc.aweme.account.i.a.a(str2, str, a.b.REFRESH_AWEME_USER, null, "");
        } else if (iVar.e() != null) {
            com.ss.android.ugc.aweme.account.i.a.a(a.b.REFRESH_AWEME_USER, null, ((User) iVar.e()).getUid());
        } else {
            com.ss.android.ugc.aweme.account.i.a.a("", "user == null", a.b.REFRESH_AWEME_USER, null, "");
        }
        if (!iVar.d()) {
            if (iVar.e() != null) {
                w.a().queryUserSync((User) iVar.e());
            }
            return bundle;
        }
        throw iVar.f();
    }
}
