package com.ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONException;
import org.json.JSONObject;

public class MonitorLogMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76654a;

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        BaseCommonJavaMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, aVar2}, this, f76654a, false, 89997, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, aVar2}, this, f76654a, false, 89997, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
        } else if (jSONObject2 == null || jSONObject.length() == 0) {
            aVar2.a(0, "params is empty");
        } else {
            String optString = jSONObject2.optString("log_type");
            if (TextUtils.isEmpty(optString)) {
                aVar2.a(0, "log_type is empty");
                return;
            }
            String optString2 = jSONObject2.optString("service");
            if (!TextUtils.equals(optString, "service_monitor") || !TextUtils.isEmpty(optString2)) {
                JSONObject jSONObject3 = new JSONObject();
                a(jSONObject2, jSONObject3, "status");
                a(jSONObject2, jSONObject3, "value");
                n.a(optString, optString2, jSONObject3);
                aVar2.a((Object) null);
                return;
            }
            aVar2.a(0, "service is required while log_type=" + optString);
        }
    }

    private static void a(JSONObject jSONObject, JSONObject jSONObject2, String str) throws JSONException {
        JSONObject jSONObject3 = jSONObject;
        JSONObject jSONObject4 = jSONObject2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{jSONObject3, jSONObject4, str2}, null, f76654a, true, 89998, new Class[]{JSONObject.class, JSONObject.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject3, jSONObject4, str2}, null, f76654a, true, 89998, new Class[]{JSONObject.class, JSONObject.class, String.class}, Void.TYPE);
            return;
        }
        Object opt = jSONObject3.opt(str2);
        if (opt != null) {
            jSONObject4.put(str2, opt);
        }
    }
}
