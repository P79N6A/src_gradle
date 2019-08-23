package com.ss.android.ugc.aweme.fe.method;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.fe.b.c;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.e;
import com.ss.android.ugc.aweme.utils.bg;
import org.json.JSONException;
import org.json.JSONObject;

public class BroadcastMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44430a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f44431a;

        /* renamed from: b  reason: collision with root package name */
        public JSONObject f44432b;

        public a(String str, JSONObject jSONObject) {
            this.f44431a = str;
            this.f44432b = jSONObject;
        }
    }

    public static void a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, f44430a, true, 39741, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, f44430a, true, 39741, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        e.a("notification", c.a(jSONObject));
        bg.a(new a("notification", jSONObject2));
        com.ss.android.ugc.aweme.account.c.e().notifyFromRnAndH5(jSONObject2);
    }

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        BaseCommonJavaMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject, aVar2}, this, f44430a, false, 39740, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, aVar2}, this, f44430a, false, 39740, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        try {
            a(jSONObject);
            aVar2.a((Object) "");
        } catch (JSONException unused) {
            aVar2.a(-1, "");
        }
    }
}
