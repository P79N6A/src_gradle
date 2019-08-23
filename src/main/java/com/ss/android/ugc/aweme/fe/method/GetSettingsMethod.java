package com.ss.android.ugc.aweme.fe.method;

import com.bytedance.ies.f.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.setting.o;
import org.json.JSONObject;

public class GetSettingsMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44452a;

    public GetSettingsMethod() {
    }

    public GetSettingsMethod(a aVar) {
        super(aVar);
    }

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        BaseCommonJavaMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject, aVar2}, this, f44452a, false, 39756, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, aVar2}, this, f44452a, false, 39756, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        try {
            aVar2.a((Object) new JSONObject(o.a().h));
        } catch (Exception unused) {
            aVar2.a(-1, "");
        }
    }
}
