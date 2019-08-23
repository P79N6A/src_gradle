package com.ss.android.message;

import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.b.h;
import com.ss.android.pushmanager.setting.b;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30003a;

    public static void a(Context context, JSONObject jSONObject, int i, String str) {
        Context context2 = context;
        JSONObject jSONObject2 = jSONObject;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, jSONObject2, 1, str2}, null, f30003a, true, 17841, new Class[]{Context.class, JSONObject.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, jSONObject2, 1, str2}, null, f30003a, true, 17841, new Class[]{Context.class, JSONObject.class, Integer.TYPE, String.class}, Void.TYPE);
        } else if (jSONObject2 != null) {
            if (!b.a().l()) {
                Logger.debug();
                com.ss.android.message.a.a.b.a(context2, "notifyEnable = " + b.a().l() + " drop message");
            } else if (!StringUtils.isEmpty(jSONObject2.optString("text"))) {
                if (jSONObject2.optInt("id", 0) < 1000) {
                    com.ss.android.message.a.a.b.a(context2, "id < 1000, drop message");
                    return;
                }
                Intent intent = new Intent("com.ss.android.message");
                intent.putExtra("message_data", jSONObject.toString());
                if (!StringUtils.isEmpty(str)) {
                    intent.setPackage(str2);
                } else {
                    intent.setPackage(context.getPackageName());
                }
                com.ss.android.message.a.a.b.a(context2, "sendMessageBroadcast");
                try {
                    h.a(context2, intent);
                } catch (Exception unused) {
                }
            }
        }
    }
}
