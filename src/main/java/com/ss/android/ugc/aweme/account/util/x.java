package com.ss.android.ugc.aweme.account.util;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.account.b;
import com.ss.android.ugc.aweme.w;
import org.json.JSONObject;

public final /* synthetic */ class x implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33124a;

    /* renamed from: b  reason: collision with root package name */
    public static final g f33125b = new x();

    private x() {
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f33124a, false, 21455, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f33124a, false, 21455, new Class[]{i.class}, Object.class);
        }
        if (iVar.b()) {
            JSONObject jSONObject = new JSONObject((String) iVar.e());
            new b.a();
            w.a((com.bytedance.sdk.account.k.b) b.a.b(jSONObject));
        }
        return null;
    }
}
