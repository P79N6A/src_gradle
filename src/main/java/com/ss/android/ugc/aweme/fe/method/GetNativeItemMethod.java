package com.ss.android.ugc.aweme.fe.method;

import android.text.TextUtils;
import com.bytedance.ies.f.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.fe.b.d;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

public class GetNativeItemMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44451a;

    public GetNativeItemMethod() {
    }

    public GetNativeItemMethod(a aVar) {
        super(aVar);
    }

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        JSONObject jSONObject2 = jSONObject;
        BaseCommonJavaMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, aVar2}, this, f44451a, false, 39755, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, aVar2}, this, f44451a, false, 39755, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        try {
            String a2 = d.a().a(jSONObject2.getString("key"), "");
            if (!TextUtils.isEmpty(a2)) {
                aVar2.a((Object) a2);
            } else {
                aVar2.a(-1, "");
            }
        } catch (Exception unused) {
            aVar2.a(-1, "");
        }
    }
}
