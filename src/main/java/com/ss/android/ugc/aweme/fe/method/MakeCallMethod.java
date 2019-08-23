package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.utils.af;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

public class MakeCallMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44460a;

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        if (PatchProxy.isSupport(new Object[]{jSONObject, aVar}, this, f44460a, false, 39786, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, aVar}, this, f44460a, false, 39786, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
        } else if (this.f3123e != null && this.f3123e.get() != null && jSONObject != null) {
            String optString = jSONObject.optString("phone_number");
            String optString2 = jSONObject.optString("phone_id");
            String optString3 = jSONObject.optString("encrypt_key");
            String optString4 = jSONObject.optString("log_tag");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                af.a().a((Activity) this.f3123e.get(), optString, optString2, optString3, optString4);
            }
        }
    }
}
