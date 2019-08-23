package com.ss.android.ugc.aweme.commerce.setting;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.a.b;

public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38325a;

    /* renamed from: b  reason: collision with root package name */
    private final b f38326b;

    e(b bVar) {
        this.f38326b = bVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f38325a, false, 30128, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f38325a, false, 30128, new Class[]{i.class}, Object.class);
        }
        b bVar = this.f38326b;
        if (iVar.d() || iVar.e() == null || ((a) iVar.e()).statusCode != 0 || ((a) iVar.e()).f38319a == null) {
            bVar.a(null);
        } else {
            bVar.a(((a) iVar.e()).f38319a);
        }
        return null;
    }
}
