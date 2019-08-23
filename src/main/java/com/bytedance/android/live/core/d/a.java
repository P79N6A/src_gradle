package com.bytedance.android.live.core.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7836a;

    public static void a(JSONObject jSONObject, String str, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{jSONObject, str, new Long(j2)}, null, f7836a, true, 338, new Class[]{JSONObject.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, str, new Long(j2)}, null, f7836a, true, 338, new Class[]{JSONObject.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        try {
            jSONObject.put(str, j);
        } catch (JSONException unused) {
        }
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{jSONObject, str, str2}, null, f7836a, true, 340, new Class[]{JSONObject.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, str, str2}, null, f7836a, true, 340, new Class[]{JSONObject.class, String.class, String.class}, Void.TYPE);
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (JSONException unused) {
        }
    }
}
