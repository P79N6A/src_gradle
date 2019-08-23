package com.ss.android.ugc.aweme.fe.method;

import com.bytedance.ies.f.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.fe.b.d;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

public class SetNativeItemMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44494a;

    public SetNativeItemMethod() {
    }

    public SetNativeItemMethod(a aVar) {
        super(aVar);
    }

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        JSONObject jSONObject2 = jSONObject;
        BaseCommonJavaMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, aVar2}, this, f44494a, false, 39819, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, aVar2}, this, f44494a, false, 39819, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        try {
            if (d.a().a(jSONObject2.getString("key"), (Object) jSONObject2.getString("value"))) {
                aVar2.a((Object) null);
            } else {
                aVar2.a(-1, "");
            }
        } catch (Exception unused) {
            aVar2.a(-1, "");
        }
    }
}
