package com.ss.android.ugc.aweme.account.f.c;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.f.c.a;
import org.json.JSONObject;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31891a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0404a f31892b;

    c(a.C0404a aVar) {
        this.f31892b = aVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f31891a, false, 20015, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f31891a, false, 20015, new Class[]{i.class}, Object.class);
        }
        a.C0404a aVar = this.f31892b;
        if (new JSONObject((String) iVar.e()).optInt("status_code") == 0) {
            aVar.a();
        } else {
            aVar.b();
        }
        return null;
    }
}
