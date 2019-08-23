package com.ss.android.ugc.aweme.story.d;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72346a;

    @Nullable
    public static JSONObject a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f72346a, true, 86505, new Class[]{String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{str2}, null, f72346a, true, 86505, new Class[]{String.class}, JSONObject.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("request_id", str2);
            } catch (Exception unused) {
                jSONObject = null;
            }
            return jSONObject;
        }
    }
}
