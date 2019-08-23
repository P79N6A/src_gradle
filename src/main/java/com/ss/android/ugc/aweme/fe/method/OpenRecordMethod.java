package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.hitrank.c;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.fe.base.BaseOpenMethod;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class OpenRecordMethod extends BaseOpenMethod {
    public static ChangeQuickRedirect g;

    public OpenRecordMethod(WeakReference<Context> weakReference, ReactContext reactContext) {
        super(weakReference, reactContext);
        this.f44425b = weakReference;
    }

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        JSONObject jSONObject2;
        JSONObject jSONObject3 = jSONObject;
        BaseCommonJavaMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject3, aVar2}, this, g, false, 39792, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject3, aVar2}, this, g, false, 39792, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        try {
            String string = jSONObject3.getString("type");
            jSONObject3.put("type", "openRecord");
            if (jSONObject3.has("args")) {
                jSONObject2 = jSONObject3.getJSONObject("args");
                jSONObject2.put("recordOrigin", "jsBridge");
            } else {
                jSONObject2 = null;
            }
            if (!"default".equals(string)) {
                if (TextUtils.equals("challenge", string)) {
                    jSONObject2.put("id", jSONObject2.optString("challenge_id"));
                    jSONObject2.put("recordParam", "challenge");
                    if (TextUtils.equals(jSONObject2.optString("from"), "star_board")) {
                        c.f42388e.b(jSONObject2.optString("star_id"));
                        c.f42387d = true;
                    }
                } else if ("music".equals(string)) {
                    jSONObject2.put("id", jSONObject2.get("music_id"));
                    jSONObject2.put("recordParam", "music");
                } else if ("effect".equals(string)) {
                    jSONObject2.put("id", jSONObject2.get("effect_id"));
                    jSONObject2.put("recordParam", "sticker");
                    if (TextUtils.equals(jSONObject2.optString("from"), "star_board")) {
                        c.f42385b = true;
                        c.f42388e.b(jSONObject2.optString("star_id"));
                    }
                }
            }
            jSONObject2.put("group", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            a(jSONObject);
            aVar2.a((Object) null);
        } catch (Exception unused) {
            aVar2.a(-1, "");
        }
    }
}
