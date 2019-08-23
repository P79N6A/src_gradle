package com.ss.android.ugc.aweme.story.live;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73120a;

    public static void a(Context context, String str, String str2, String str3, long j, String str4) {
        String str5 = str;
        String str6 = str2;
        long j2 = j;
        String str7 = str4;
        if (PatchProxy.isSupport(new Object[]{context, str5, str6, str3, new Long(j2), str7}, null, f73120a, true, 84669, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str5, str6, str3, new Long(j2), str7}, null, f73120a, true, 84669, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(context, 1, str3, j, a(str5, "video", str6, str7));
    }

    public static final void a(Context context, int i, String str, String str2, String str3, long j) {
        String str4 = str;
        String str5 = str2;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), str4, str5, str3, new Long(j2)}, null, f73120a, true, 84670, new Class[]{Context.class, Integer.TYPE, String.class, String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i), str4, str5, str3, new Long(j2)}, null, f73120a, true, 84670, new Class[]{Context.class, Integer.TYPE, String.class, String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        a(context, i, str3, j, a(str4, "head", str5));
    }

    public static void a(Context context, boolean z, int i, String str, String str2, long j) {
        String str3 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), str3, str2, new Long(j2)}, null, f73120a, true, 84673, new Class[]{Context.class, Boolean.TYPE, Integer.TYPE, String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z), Integer.valueOf(i), str3, str2, new Long(j2)}, null, f73120a, true, 84673, new Class[]{Context.class, Boolean.TYPE, Integer.TYPE, String.class, String.class, Long.TYPE}, Void.TYPE);
        } else {
            a(context, i, str2, j, a(z ? "homepage" : "others_homepage", "head", str3));
        }
    }

    public static void a(Context context, String str, String str2, String str3, long j) {
        String str4 = str;
        String str5 = str2;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, str4, str5, str3, new Long(j2)}, null, f73120a, true, 84675, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {context, str4, str5, str3, new Long(j2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f73120a, true, 84675, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        a(context, 1, str3, j, a(str4, "head", str5));
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        if (PatchProxy.isSupport(new Object[]{str7, str8, str9, str10, str11, str12}, null, f73120a, true, 84683, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str7, str8, str9, str10, str11, str12};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f73120a, true, 84683, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        r.onEvent(MobClick.obtain().setEventName("follow").setLabelName("personal_homepage").setValue(str7).setExtValueString(str8).setJsonObject(new t().a("enter_from", "live_aud").a("request_id", str9).a("user_id", str10).a("user_type", str11).a("position", str12).a()));
    }

    public static void a(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        if (PatchProxy.isSupport(new Object[]{str7, str8, str9, str10, bool, str11, str12}, null, f73120a, true, 84684, new Class[]{String.class, String.class, String.class, String.class, Boolean.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str7, str8, str9, str10, bool, str11, str12}, null, f73120a, true, 84684, new Class[]{String.class, String.class, String.class, String.class, Boolean.class, String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", str9);
        hashMap.put("room_id", str10);
        hashMap.put("user_type", bool.booleanValue() ? "host" : "aud");
        hashMap.put("enter_from", str7);
        hashMap.put("previous_page", str8);
        hashMap.put("to_user_id", str11);
        hashMap.put("request_id", str12);
        r.a("follow", (Map) hashMap);
    }

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f73120a, true, 84685, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f73120a, true, 84685, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", str2);
        hashMap.put("scene_id", "1003");
        r.a("enter_wallet_page", (Map) hashMap);
    }

    public static void a(String str, long j, String str2, String str3, String str4, int i, boolean z, String str5) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j2), str2, str3, str4, -1, Byte.valueOf(z ? (byte) 1 : 0), str5}, null, f73120a, true, 84688, new Class[]{String.class, Long.TYPE, String.class, String.class, String.class, Integer.TYPE, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, new Long(j2), str2, str3, str4, -1, Byte.valueOf(z), str5}, null, f73120a, true, 84688, new Class[]{String.class, Long.TYPE, String.class, String.class, String.class, Integer.TYPE, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(str, j, str2, str3, str4, -1, -1, z, str5);
    }

    @SuppressLint({"TooManyMethodParam"})
    private static void a(String str, long j, String str2, String str3, String str4, int i, int i2, boolean z, String str5) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j2), str2, str3, str4, Integer.valueOf(i), -1, Byte.valueOf(z ? (byte) 1 : 0), str5}, null, f73120a, true, 84689, new Class[]{String.class, Long.TYPE, String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, new Long(j2), str2, str3, str4, Integer.valueOf(i), -1, Byte.valueOf(z), str5}, null, f73120a, true, 84689, new Class[]{String.class, Long.TYPE, String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(str, j, str2, str4, i, -1, z, str5, str3);
    }

    @SuppressLint({"TooManyMethodParam"})
    public static void a(String str, long j, String str2, String str3, int i, int i2, boolean z, String str4, String str5) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j2), str2, str3, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), str4, str5}, null, f73120a, true, 84690, new Class[]{String.class, Long.TYPE, String.class, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, new Long(j2), str2, str3, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), str4, str5}, null, f73120a, true, 84690, new Class[]{String.class, Long.TYPE, String.class, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        a(str, j, str2, str3, i, i2, z, str4, str5, "click");
    }

    @SuppressLint({"TooManyMethodParam"})
    public static void a(String str, long j, String str2, String str3, int i, int i2, boolean z, String str4, String str5, String str6) {
        String str7 = str;
        long j2 = j;
        String str8 = str2;
        String str9 = str3;
        int i3 = i2;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        int i4 = 4;
        if (PatchProxy.isSupport(new Object[]{str7, new Long(j2), str8, str9, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), str10, str11, str12}, null, f73120a, true, 84691, new Class[]{String.class, Long.TYPE, String.class, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str7, new Long(j2), str8, str9, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), str10, str11, str12}, null, f73120a, true, 84691, new Class[]{String.class, Long.TYPE, String.class, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", str7);
        hashMap.put("room_id", String.valueOf(j));
        hashMap.put("enter_from_merge", str8);
        hashMap.put("scene_id", "1003");
        hashMap.put("action_type", str12);
        hashMap.put("video_id", str10);
        hashMap.put("sdk_version", "1150");
        hashMap.put("request_id", str9);
        if ("live_merge".equals(str8) || "homepage_fresh".equals(str8)) {
            hashMap.put("order", String.valueOf(i));
        }
        if (i3 > 0) {
            if (i3 == 5) {
                i4 = 5;
            } else if (i3 == 6) {
                i4 = 1;
            }
            hashMap.put("room_type", String.valueOf(i4));
        }
        if (str11 != null) {
            hashMap.put("enter_method", str11);
        }
        hashMap.put("_param_live_platform", "live");
        hashMap.put("sdk_version", "1150");
        r.a("livesdk_live_show", (Map) hashMap);
    }

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f73120a, true, 84706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f73120a, true, 84706, new Class[0], Void.TYPE);
        } else {
            r.a("live_take_alert_show", (Map) null);
        }
    }

    public static void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f73120a, true, 84701, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f73120a, true, 84701, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", str2);
        hashMap.put("_param_live_platform", "live");
        r.a("livesdk_enter_live_merge", (Map) hashMap);
    }

    public static void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f73120a, true, 84702, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f73120a, true, 84702, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", str2);
        hashMap.put("_param_live_platform", "live");
        r.a("livesdk_live_merge_show", (Map) hashMap);
    }

    public static JSONObject a(String str, String str2, String str3) {
        String str4;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7}, null, f73120a, true, 84680, new Class[]{String.class, String.class, String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{str5, str6, str7}, null, f73120a, true, 84680, new Class[]{String.class, String.class, String.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("position", str5);
            if (TextUtils.equals("aweme", "musical_ly")) {
                if (TextUtils.equals(str5, "push")) {
                    str4 = "click_push";
                } else if (!TextUtils.equals(str5, "homepage_follow") || !TextUtils.equals(str6, "head")) {
                    if (!TextUtils.equals(str5, "others_homepage")) {
                        if (!TextUtils.equals(str6, "video")) {
                            if (TextUtils.equals(str5, "message")) {
                                str4 = "click_watch_button";
                            } else {
                                str4 = str6;
                            }
                        }
                    }
                    str4 = "click_head";
                } else {
                    str4 = "click_watch_button";
                }
                jSONObject.put("enter_method", str4);
            } else {
                jSONObject.put("style", str6);
            }
            jSONObject.put("request_id", str7);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static JSONObject a(String str, String str2, String str3, String str4) {
        String str5 = str4;
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, str5}, null, f73120a, true, 84681, new Class[]{String.class, String.class, String.class, String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{str, str2, str3, str5}, null, f73120a, true, 84681, new Class[]{String.class, String.class, String.class, String.class}, JSONObject.class);
        }
        JSONObject a2 = a(str, str2, str3);
        try {
            a2.put("video_value", str5);
        } catch (JSONException unused) {
        }
        return a2;
    }

    public static void b(Context context, int i, String str, String str2, long j) {
        String str3 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, 0, str3, str2, new Long(j2)}, null, f73120a, true, 84665, new Class[]{Context.class, Integer.TYPE, String.class, String.class, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {context, 0, str3, str2, new Long(j2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f73120a, true, 84665, new Class[]{Context.class, Integer.TYPE, String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        a(context, 0, str2, j, a("homepage_follow", "video", str3));
    }

    public static void c(Context context, int i, String str, String str2, long j) {
        String str3 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, 0, str3, str2, new Long(j2)}, null, f73120a, true, 84671, new Class[]{Context.class, Integer.TYPE, String.class, String.class, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {context, 0, str3, str2, new Long(j2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f73120a, true, 84671, new Class[]{Context.class, Integer.TYPE, String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        a(context, 0, str2, j, a("homepage_hot", "video", str3));
    }

    public static void a(Context context, int i, String str, long j, JSONObject jSONObject) {
        int i2 = i;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), str, new Long(j2), jSONObject}, null, f73120a, true, 84679, new Class[]{Context.class, Integer.TYPE, String.class, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {context, Integer.valueOf(i), str, new Long(j2), jSONObject};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f73120a, true, 84679, new Class[]{Context.class, Integer.TYPE, String.class, Long.TYPE, JSONObject.class}, Void.TYPE);
        } else if (i2 == 0) {
            r.a(context, "impression", "live", str, j, jSONObject);
        } else if (i2 == 1 && jSONObject != null) {
            r.a(context, "enter_detail", "live_aud", str, j, jSONObject);
        }
    }

    public static void a(Context context, int i, String str, String str2, long j) {
        String str3 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, 1, str3, str2, new Long(j2)}, null, f73120a, true, 84663, new Class[]{Context.class, Integer.TYPE, String.class, String.class, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {context, 1, str3, str2, new Long(j2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f73120a, true, 84663, new Class[]{Context.class, Integer.TYPE, String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        a(context, 1, str2, j, a("push", "push", str3));
    }

    public static void d(Context context, int i, String str, String str2, long j, String str3) {
        String str4 = str;
        long j2 = j;
        String str5 = str3;
        if (PatchProxy.isSupport(new Object[]{context, 1, str4, str2, new Long(j2), str5}, null, f73120a, true, 84672, new Class[]{Context.class, Integer.TYPE, String.class, String.class, Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, 1, str4, str2, new Long(j2), str5}, null, f73120a, true, 84672, new Class[]{Context.class, Integer.TYPE, String.class, String.class, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        JSONObject a2 = a("homepage_hot", "video", str4);
        try {
            a2.put("video_value", str5);
        } catch (JSONException unused) {
        }
        a(context, 1, str2, j, a2);
    }

    public static void b(Context context, int i, String str, String str2, long j, String str3) {
        String str4 = str;
        long j2 = j;
        String str5 = str3;
        if (PatchProxy.isSupport(new Object[]{context, 0, str4, str2, new Long(j2), str5}, null, f73120a, true, 84666, new Class[]{Context.class, Integer.TYPE, String.class, String.class, Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, 0, str4, str2, new Long(j2), str5}, null, f73120a, true, 84666, new Class[]{Context.class, Integer.TYPE, String.class, String.class, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        JSONObject a2 = a("homepage_follow", "video", str4);
        try {
            a2.put("page_name", str5);
        } catch (JSONException unused) {
        }
        a(context, 0, str2, j, a2);
    }

    public static void c(Context context, int i, String str, String str2, long j, String str3) {
        String str4 = str;
        long j2 = j;
        String str5 = str3;
        if (PatchProxy.isSupport(new Object[]{context, 1, str4, str2, new Long(j2), str5}, null, f73120a, true, 84667, new Class[]{Context.class, Integer.TYPE, String.class, String.class, Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, 1, str4, str2, new Long(j2), str5}, null, f73120a, true, 84667, new Class[]{Context.class, Integer.TYPE, String.class, String.class, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        JSONObject a2 = a("homepage_follow", "video", str4);
        try {
            a2.put("video_value", str5);
        } catch (JSONException unused) {
        }
        a(context, 1, str2, j, a2);
    }

    public static void a(Context context, int i, String str, String str2, long j, String str3) {
        String str4 = str;
        long j2 = j;
        String str5 = str3;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), str4, str2, new Long(j2), str5}, null, f73120a, true, 84664, new Class[]{Context.class, Integer.TYPE, String.class, String.class, Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i), str4, str2, new Long(j2), str5}, null, f73120a, true, 84664, new Class[]{Context.class, Integer.TYPE, String.class, String.class, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        JSONObject a2 = a("toplist", "head", str4);
        try {
            a2.put("page_name", str5);
        } catch (JSONException unused) {
        }
        a(context, i, str2, j, a2);
    }
}
