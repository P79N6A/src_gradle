package com.ss.android.ugc.aweme.common;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.statistic.b;
import com.ss.android.statistic.d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40270a;

    /* renamed from: b  reason: collision with root package name */
    private static String f40271b;

    public static void a(String str, @Nullable Map<String, String> map) {
        Map<String, String> map2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, map}, null, f40270a, true, 33304, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, map}, null, f40270a, true, 33304, new Class[]{String.class, Map.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(f40271b)) {
                if (map == null) {
                    map2 = new HashMap<>();
                } else {
                    map2 = map;
                }
                map2.put("launch_from", f40271b);
            } else {
                map2 = map;
            }
            d.a().a(str2, (Map) map2, b.i);
        }
    }

    public static void a(Context context, String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{context, str, str2}, null, f40270a, true, 33303, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2}, null, f40270a, true, 33303, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            if (!TextUtils.isEmpty(f40271b)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("launch_from", f40271b);
                } catch (JSONException unused) {
                    d.a().a("umeng", str, str2, null, null, jSONObject, b.h | b.f31112e);
                }
            } else {
                d.a().a("umeng", str, str2, null, null, null, b.h | b.f31112e);
            }
        }
    }

    public static void a(Context context, String str, String str2, long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, new Long(j3), new Long(j4)}, null, f40270a, true, 33299, new Class[]{Context.class, String.class, String.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, new Long(j3), new Long(j4)}, null, f40270a, true, 33299, new Class[]{Context.class, String.class, String.class, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        a(context, "umeng", str, str2, j, j2, null);
    }

    public static void a(Context context, String str, String str2, long j, long j2, JSONObject jSONObject) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, new Long(j3), new Long(j4), jSONObject}, null, f40270a, true, 33301, new Class[]{Context.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, new Long(j3), new Long(j4), jSONObject}, null, f40270a, true, 33301, new Class[]{Context.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        a(context, "umeng", str, str2, j, j2, jSONObject);
    }

    public static void a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        String str4;
        JSONObject jSONObject2;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, str3, new Long(j3), new Long(j4), jSONObject}, null, f40270a, true, 33302, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, str3, new Long(j3), new Long(j4), jSONObject}, null, f40270a, true, 33302, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                str4 = "umeng";
            } else {
                str4 = str;
            }
            if (!StringUtils.isEmpty(f40271b)) {
                if (jSONObject == null) {
                    jSONObject2 = new JSONObject();
                } else {
                    jSONObject2 = jSONObject;
                }
                try {
                    jSONObject2.put("launch_from", f40271b);
                } catch (JSONException unused) {
                }
            } else {
                jSONObject2 = jSONObject;
            }
            if (context != null) {
                d.a().a(str4, str2, str3, Long.valueOf(j), Long.valueOf(j2), jSONObject2, b.f31112e | b.h);
            }
        }
    }
}
