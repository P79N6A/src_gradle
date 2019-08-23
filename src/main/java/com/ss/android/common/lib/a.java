package com.ss.android.common.lib;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28314a;

    /* renamed from: b  reason: collision with root package name */
    private static C0333a f28315b;

    /* renamed from: com.ss.android.common.lib.a$a  reason: collision with other inner class name */
    public interface C0333a {
    }

    public static void a(Context context, String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{context, str, str2}, null, f28314a, true, 15819, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2}, null, f28314a, true, 15819, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            AppLog.onEvent(context, str, str2);
            if (f28315b != null) {
                TextUtils.isEmpty(str2);
            }
        }
    }

    public static void a(Context context, String str, String str2, long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, new Long(j3), new Long(j4)}, null, f28314a, true, 15811, new Class[]{Context.class, String.class, String.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, new Long(j3), new Long(j4)}, null, f28314a, true, 15811, new Class[]{Context.class, String.class, String.class, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        a(context, "umeng", str, str2, j, j2, null);
    }

    public static void a(Context context, String str, String str2, long j, long j2, JSONObject jSONObject) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, new Long(j3), new Long(j4), jSONObject}, null, f28314a, true, 15815, new Class[]{Context.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, new Long(j3), new Long(j4), jSONObject}, null, f28314a, true, 15815, new Class[]{Context.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        a(context, "umeng", str, str2, j, j2, jSONObject);
    }

    public static void a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        String str4;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, str3, new Long(j3), new Long(j4), jSONObject}, null, f28314a, true, 15817, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, str3, new Long(j3), new Long(j4), jSONObject}, null, f28314a, true, 15817, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                str4 = "umeng";
            } else {
                str4 = str;
            }
            if (context != null) {
                AppLog.onEvent(context, str4, str2, str3, j, j2, jSONObject);
                if ("umeng".equals(str4) && f28315b != null && "umeng".equals(str4)) {
                    TextUtils.isEmpty(str3);
                }
            }
        }
    }
}
