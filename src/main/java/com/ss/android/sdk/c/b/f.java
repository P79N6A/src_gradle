package com.ss.android.sdk.c.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.ss.android.common.util.ToolUtils;
import org.json.JSONObject;

public final class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private Context f30731a;

    public f(Context context) {
        this.f30731a = context;
    }

    private boolean a(JSONObject jSONObject) throws Exception {
        String str;
        String str2;
        Intent intent = null;
        if (jSONObject != null) {
            str = jSONObject.optString("pkg_name");
        } else {
            str = null;
        }
        if (jSONObject != null) {
            str2 = jSONObject.optString("pkg_class");
        } else {
            str2 = null;
        }
        Context context = this.f30731a;
        if (context == null || StringUtils.isEmpty(str)) {
            return false;
        }
        boolean equals = str.equals(context.getPackageName());
        if (!StringUtils.isEmpty(str2)) {
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(str, str2));
            intent2.addFlags(268435456);
            if (ToolUtils.isInstalledApp(context, intent2)) {
                intent = intent2;
            }
        }
        if (intent == null && equals) {
            return true;
        }
        if (intent == null) {
            intent = ToolUtils.getLaunchIntentForPackage(context, str);
        }
        if (intent != null) {
            try {
                context.startActivity(intent);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        if (a(hVar.f20623d)) {
            jSONObject.put("code", 1);
        } else {
            jSONObject.put("code", 0);
        }
    }
}
