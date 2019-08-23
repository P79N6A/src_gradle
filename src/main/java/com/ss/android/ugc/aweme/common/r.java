package com.ss.android.ugc.aweme.common;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.framework.core.a;
import java.util.Map;
import org.json.JSONObject;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40272a;

    public static void a(String str, Map map) {
        if (PatchProxy.isSupport(new Object[]{str, map}, null, f40272a, true, 33319, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, map}, null, f40272a, true, 33319, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        s.a(str, map);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{context, str, str2, str3, str4, jSONObject}, null, f40272a, true, 33317, new Class[]{Context.class, String.class, String.class, String.class, String.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {context, str, str2, str3, str4, jSONObject};
            PatchProxy.accessDispatch(objArr, null, f40272a, true, 33317, new Class[]{Context.class, String.class, String.class, String.class, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        try {
            q.a(a.b().f3307e, str, str2, Long.parseLong(str3), Long.parseLong(str4), jSONObject);
        } catch (Exception unused) {
        }
    }

    public static void a(String str, String str2, String str3, String str4, long j, JSONObject jSONObject) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, str4, new Long(j2), jSONObject}, null, f40272a, true, 33318, new Class[]{String.class, String.class, String.class, String.class, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, str3, str4, new Long(j2), jSONObject}, null, f40272a, true, 33318, new Class[]{String.class, String.class, String.class, String.class, Long.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        try {
            q.a(a.b().f3307e, str, str2, str3, Long.parseLong(str4), j, jSONObject);
        } catch (Exception unused) {
        }
    }

    public static void a(String str, @Nullable JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, jSONObject}, null, f40272a, true, 33321, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONObject}, null, f40272a, true, 33321, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        try {
            AppLogNewUtils.onEventV3(str, jSONObject);
        } catch (Exception unused) {
        }
    }

    public static void onEvent(MobClick mobClick) {
        if (PatchProxy.isSupport(new Object[]{mobClick}, null, f40272a, true, 33311, new Class[]{MobClick.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mobClick}, null, f40272a, true, 33311, new Class[]{MobClick.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.g.a.a();
        if (!TextUtils.isEmpty(mobClick.getExtValueStr())) {
            a(mobClick.getCategory(), mobClick.getEventName(), mobClick.getLabelName(), mobClick.getValue(), Long.parseLong(mobClick.getExtValueStr()), mobClick.getExtJson());
        } else {
            a(mobClick.getCategory(), mobClick.getEventName(), mobClick.getLabelName(), mobClick.getValue(), mobClick.getExtValueLong(), mobClick.getExtJson());
        }
        mobClick.recycle();
    }

    public static void b(String str, @Nullable Map<String, String> map) {
        if (PatchProxy.isSupport(new Object[]{str, map}, null, f40272a, true, 33320, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, map}, null, f40272a, true, 33320, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        try {
            q.a(str, map);
        } catch (Exception unused) {
        }
    }

    public static void a(Context context, String str, String str2, long j, long j2) {
        long j3 = j;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, new Long(j3), 0L}, null, f40272a, true, 33312, new Class[]{Context.class, String.class, String.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, new Long(j3), 0L}, null, f40272a, true, 33312, new Class[]{Context.class, String.class, String.class, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        try {
            q.a(a.b().f3307e, str, str2, j, 0);
        } catch (Exception unused) {
        }
    }

    public static void a(Context context, String str, String str2, String str3, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, str3, new Long(j2)}, null, f40272a, true, 33313, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {context, str, str2, str3, new Long(j2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f40272a, true, 33313, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        try {
            q.a(a.b().f3307e, str, str2, Long.parseLong(str3), j);
        } catch (Exception unused) {
        }
    }

    public static void a(Context context, String str, String str2, String str3, String str4) {
        if (PatchProxy.isSupport(new Object[]{context, str, str2, str3, str4}, null, f40272a, true, 33314, new Class[]{Context.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context, str, str2, str3, str4};
            PatchProxy.accessDispatch(objArr, null, f40272a, true, 33314, new Class[]{Context.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        try {
            q.a(a.b().f3307e, str, str2, Long.parseLong(str3), Long.parseLong(str4));
        } catch (Exception unused) {
        }
    }

    public static void a(Context context, String str, String str2, String str3, long j, JSONObject jSONObject) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, str3, new Long(j2), jSONObject}, null, f40272a, true, 33316, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, str3, new Long(j2), jSONObject}, null, f40272a, true, 33316, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        try {
            q.a(a.b().f3307e, str, str2, Long.parseLong(str3), j, jSONObject);
        } catch (Exception unused) {
        }
    }
}
