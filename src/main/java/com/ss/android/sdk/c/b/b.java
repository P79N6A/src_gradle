package com.ss.android.sdk.c.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.app.f;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f30724a;

    public b(WeakReference<Context> weakReference) {
        this.f30724a = weakReference;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        Context context;
        JSONObject jSONObject2 = hVar.f20623d;
        int i = -1;
        if (jSONObject2 == null) {
            jSONObject.put("installed", -1);
            return;
        }
        String optString = jSONObject2.optString("pkg_name");
        String optString2 = jSONObject2.optString(f.f34168b);
        if (this.f30724a != null) {
            context = (Context) this.f30724a.get();
        } else {
            context = null;
        }
        if (context != null) {
            if (!TextUtils.isEmpty(optString)) {
                if (ToolUtils.isInstalledApp(context, optString)) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            if (i != 1 && !TextUtils.isEmpty(optString2)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(optString2));
                if (ToolUtils.isInstalledApp(context, intent)) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
        }
        jSONObject.put("installed", i);
    }
}
