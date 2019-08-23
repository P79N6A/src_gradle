package com.ss.android.ugc.aweme.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import org.json.JSONException;
import org.json.JSONObject;

public final class an {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45045a;

    public static void a(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, null, f45045a, true, 40248, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, null, f45045a, true, 40248, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fetch_type", str6);
        } catch (JSONException unused) {
        }
        r.onEvent(MobClick.obtain().setEventName(str4).setLabelName(str5).setJsonObject(jSONObject));
    }
}
