package com.ss.android.ugc.aweme.account.api.b;

import android.text.TextUtils;
import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public abstract class a implements k<String> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31683a;

    public void a(String str, String str2) {
    }

    public abstract void a(JSONObject jSONObject);

    public abstract void b(JSONObject jSONObject);

    public /* synthetic */ void onSuccess(Object obj) {
        String str = (String) obj;
        if (PatchProxy.isSupport(new Object[]{str}, this, f31683a, false, 19606, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f31683a, false, 19606, new Class[]{String.class}, Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if ("error".equals(jSONObject.opt("message"))) {
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    if (optJSONObject.optInt("error_code") != 1006) {
                        if (!TextUtils.isEmpty(optJSONObject.optString("captcha"))) {
                            a(optJSONObject.optString("captcha"), optJSONObject.optString("description"));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                b(jSONObject);
                return;
            }
            a(jSONObject);
        } catch (Exception unused) {
        }
    }
}
