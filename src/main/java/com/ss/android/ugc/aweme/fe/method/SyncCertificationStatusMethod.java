package com.ss.android.ugc.aweme.fe.method;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.fe.a.a;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.utils.bg;
import org.json.JSONObject;

public class SyncCertificationStatusMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44513a;

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        if (PatchProxy.isSupport(new Object[]{jSONObject, aVar}, this, f44513a, false, 39835, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, aVar}, this, f44513a, false, 39835, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        d.a().queryUser();
        bg.a(new a(1));
    }
}
