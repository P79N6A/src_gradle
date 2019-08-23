package com.bytedance.android.livesdkapi.depend.g;

import android.content.SharedPreferences;
import com.bytedance.android.live.a;
import com.bytedance.android.livesdkapi.host.d;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18663a;

    /* renamed from: b  reason: collision with root package name */
    static Map<String, Map<String, Object>> f18664b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    static Gson f18665c = a.a();

    public static <T> T a(a<T> aVar) {
        a<T> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f18663a, true, 15017, new Class[]{a.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{aVar2}, null, f18663a, true, 15017, new Class[]{a.class}, Object.class);
        } else if (aVar2.f18662f == Boolean.class) {
            return Boolean.valueOf(a(aVar2.f18660d, aVar2.f18659c, ((Boolean) aVar2.f18661e).booleanValue()));
        } else {
            if (aVar2.f18662f == Integer.class || aVar2.f18662f == Short.class) {
                return Integer.valueOf(a(aVar2.f18660d, aVar2.f18659c, ((Integer) aVar2.f18661e).intValue()));
            }
            if (aVar2.f18662f == Float.class) {
                return Float.valueOf(a(aVar2.f18660d, aVar2.f18659c, ((Float) aVar2.f18661e).floatValue()));
            }
            if (aVar2.f18662f == Long.class) {
                return Long.valueOf(a(aVar2.f18660d, aVar2.f18659c, ((Long) aVar2.f18661e).longValue()));
            }
            if (aVar2.f18662f == Double.class) {
                return Double.valueOf(a(aVar2.f18660d, aVar2.f18659c, ((Double) aVar2.f18661e).doubleValue()));
            }
            if (aVar2.f18662f == String.class) {
                return a(aVar2.f18660d, aVar2.f18659c, (String) aVar2.f18661e);
            }
            return a(aVar2.f18660d, aVar2.f18659c, aVar2.f18662f, aVar2.f18661e);
        }
    }

    private static <T> T a(String str, String str2, Class<T> cls, T t) {
        String str3 = str;
        String str4 = str2;
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{str3, str4, cls2, t}, null, f18663a, true, 15018, new Class[]{String.class, String.class, Class.class, Object.class}, Object.class)) {
            Object[] objArr = {str3, str4, cls2, t};
            return PatchProxy.accessDispatch(objArr, null, f18663a, true, 15018, new Class[]{String.class, String.class, Class.class, Object.class}, Object.class);
        }
        Map map = f18664b.get(str3);
        if (map == null) {
            map = new HashMap();
            f18664b.put(str3, map);
        }
        try {
            if (map.containsKey(str4)) {
                return map.get(str4);
            }
            T fromJson = f18665c.fromJson(a(str).getString(str4, ""), cls2);
            if (fromJson == null) {
                map.remove(str4);
                return t;
            }
            map.put(str4, fromJson);
            return fromJson;
        } catch (Exception unused) {
            map.remove(str4);
            return t;
        }
    }

    private static boolean a(String str, String str2, boolean z) {
        String str3 = str2;
        if (!PatchProxy.isSupport(new Object[]{str, str3, Byte.valueOf(z ? (byte) 1 : 0)}, null, f18663a, true, 15025, new Class[]{String.class, String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return a(str).getBoolean(str3, z);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str3, Byte.valueOf(z)}, null, f18663a, true, 15025, new Class[]{String.class, String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    private static String a(String str, String str2, String str3) {
        String str4 = str2;
        String str5 = str3;
        if (!PatchProxy.isSupport(new Object[]{str, str4, str5}, null, f18663a, true, 15028, new Class[]{String.class, String.class, String.class}, String.class)) {
            return a(str).getString(str4, str5);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str, str4, str5}, null, f18663a, true, 15028, new Class[]{String.class, String.class, String.class}, String.class);
    }

    static SharedPreferences a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f18663a, true, 15044, new Class[]{String.class}, SharedPreferences.class)) {
            return c.a(((d) com.bytedance.android.live.utility.b.a(d.class)).a(), str2, 0);
        }
        return (SharedPreferences) PatchProxy.accessDispatch(new Object[]{str2}, null, f18663a, true, 15044, new Class[]{String.class}, SharedPreferences.class);
    }

    private static double a(String str, String str2, double d2) {
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{str, str3, Double.valueOf(d2)}, null, f18663a, true, 15030, new Class[]{String.class, String.class, Double.TYPE}, Double.TYPE)) {
            return ((Double) PatchProxy.accessDispatch(new Object[]{str, str3, Double.valueOf(d2)}, null, f18663a, true, 15030, new Class[]{String.class, String.class, Double.TYPE}, Double.TYPE)).doubleValue();
        }
        try {
            return Double.parseDouble(a(str).getString(str3, String.valueOf(d2)));
        } catch (Exception unused) {
            return d2;
        }
    }

    private static float a(String str, String str2, float f2) {
        String str3 = str2;
        if (!PatchProxy.isSupport(new Object[]{str, str3, Float.valueOf(f2)}, null, f18663a, true, 15029, new Class[]{String.class, String.class, Float.TYPE}, Float.TYPE)) {
            return a(str).getFloat(str3, f2);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{str, str3, Float.valueOf(f2)}, null, f18663a, true, 15029, new Class[]{String.class, String.class, Float.TYPE}, Float.TYPE)).floatValue();
    }

    private static int a(String str, String str2, int i) {
        String str3 = str2;
        if (!PatchProxy.isSupport(new Object[]{str, str3, Integer.valueOf(i)}, null, f18663a, true, 15026, new Class[]{String.class, String.class, Integer.TYPE}, Integer.TYPE)) {
            return a(str).getInt(str3, i);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str, str3, Integer.valueOf(i)}, null, f18663a, true, 15026, new Class[]{String.class, String.class, Integer.TYPE}, Integer.TYPE)).intValue();
    }

    private static long a(String str, String str2, long j) {
        String str3 = str2;
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{str, str3, new Long(j2)}, null, f18663a, true, 15027, new Class[]{String.class, String.class, Long.TYPE}, Long.TYPE)) {
            return a(str).getLong(str3, j2);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{str, str3, new Long(j2)}, null, f18663a, true, 15027, new Class[]{String.class, String.class, Long.TYPE}, Long.TYPE)).longValue();
    }
}
