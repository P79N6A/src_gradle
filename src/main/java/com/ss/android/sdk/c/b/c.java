package com.ss.android.sdk.c.b;

import android.content.Context;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.android.ClipboardCompat;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONObject;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private Context f30726a;

    public c(Context context) {
        this.f30726a = context;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        String str;
        if (hVar.f20623d != null) {
            str = hVar.f20623d.optString(PushConstants.CONTENT);
        } else {
            str = null;
        }
        Context context = this.f30726a;
        int i = 0;
        if (context != null && !StringUtils.isEmpty(str)) {
            ClipboardCompat.setText(context, "", str);
            i = 1;
        }
        jSONObject.put("code", i);
    }
}
