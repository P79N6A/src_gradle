package com.ss.android.push;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static String f30391a = "Wakeup";

    /* renamed from: b  reason: collision with root package name */
    public static String f30392b = "label_prevent_wakeup";

    /* renamed from: c  reason: collision with root package name */
    public static String f30393c = "label_wakeup_by_third";

    /* renamed from: d  reason: collision with root package name */
    public static boolean f30394d;

    public static void a(Context context, String str, String str2, JSONObject... jSONObjectArr) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("package", str);
            jSONObject.put("from", str2);
            a(context, f30392b, System.currentTimeMillis(), 0, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public static void a(Context context, String str, long j, long j2, JSONObject... jSONObjectArr) {
        PushDependManager.inst().logEvent(context, "umeng", f30391a, str, j, 0, jSONObjectArr[0]);
    }
}
