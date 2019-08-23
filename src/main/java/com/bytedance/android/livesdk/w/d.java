package com.bytedance.android.livesdk.w;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.android.live.a;
import com.bytedance.android.live.core.utils.ac;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;
import java.util.HashMap;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17770a;

    /* renamed from: b  reason: collision with root package name */
    protected static final SharedPreferences f17771b;

    /* renamed from: c  reason: collision with root package name */
    protected static Map<String, Object> f17772c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    protected static Gson f17773d = a.a();

    static {
        Context context;
        if (PatchProxy.isSupport(new Object[0], null, f17770a, true, 13319, new Class[0], Context.class)) {
            context = (Context) PatchProxy.accessDispatch(new Object[0], null, f17770a, true, 13319, new Class[0], Context.class);
        } else {
            context = ac.e();
        }
        f17771b = c.a(context, "live_sdk_core", 0);
    }

    public static <T> T a(com.bytedance.android.livesdkapi.depend.g.a<T> aVar) {
        int i;
        T t;
        long j;
        float f2;
        boolean z;
        com.bytedance.android.livesdkapi.depend.g.a<T> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f17770a, true, 13310, new Class[]{com.bytedance.android.livesdkapi.depend.g.a.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{aVar2}, null, f17770a, true, 13310, new Class[]{com.bytedance.android.livesdkapi.depend.g.a.class}, Object.class);
        } else if (f17772c.containsKey(aVar2.f18659c)) {
            return f17772c.get(aVar2.f18659c);
        } else {
            if (aVar2.f18662f == Boolean.class) {
                String str = aVar2.f18659c;
                boolean booleanValue = ((Boolean) aVar2.f18661e).booleanValue();
                if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(booleanValue ? (byte) 1 : 0)}, null, f17770a, true, 13312, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(booleanValue)}, null, f17770a, true, 13312, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
                } else {
                    z = f17771b.getBoolean(str, booleanValue);
                }
                T valueOf = Boolean.valueOf(z);
                f17772c.put(aVar2.f18659c, valueOf);
                return valueOf;
            } else if (aVar2.f18662f == Integer.class || aVar2.f18662f == Short.class) {
                String str2 = aVar2.f18659c;
                int intValue = ((Integer) aVar2.f18661e).intValue();
                if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(intValue)}, null, f17770a, true, 13313, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(intValue)}, null, f17770a, true, 13313, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
                } else {
                    i = f17771b.getInt(str2, intValue);
                }
                T valueOf2 = Integer.valueOf(i);
                f17772c.put(aVar2.f18659c, valueOf2);
                return valueOf2;
            } else if (aVar2.f18662f == Float.class) {
                String str3 = aVar2.f18659c;
                float floatValue = ((Float) aVar2.f18661e).floatValue();
                if (PatchProxy.isSupport(new Object[]{str3, Float.valueOf(floatValue)}, null, f17770a, true, 13316, new Class[]{String.class, Float.TYPE}, Float.TYPE)) {
                    f2 = ((Float) PatchProxy.accessDispatch(new Object[]{str3, Float.valueOf(floatValue)}, null, f17770a, true, 13316, new Class[]{String.class, Float.TYPE}, Float.TYPE)).floatValue();
                } else {
                    f2 = f17771b.getFloat(str3, floatValue);
                }
                T valueOf3 = Float.valueOf(f2);
                f17772c.put(aVar2.f18659c, valueOf3);
                return valueOf3;
            } else if (aVar2.f18662f == Long.class) {
                String str4 = aVar2.f18659c;
                long longValue = ((Long) aVar2.f18661e).longValue();
                if (PatchProxy.isSupport(new Object[]{str4, new Long(longValue)}, null, f17770a, true, 13314, new Class[]{String.class, Long.TYPE}, Long.TYPE)) {
                    j = ((Long) PatchProxy.accessDispatch(new Object[]{str4, new Long(longValue)}, null, f17770a, true, 13314, new Class[]{String.class, Long.TYPE}, Long.TYPE)).longValue();
                } else {
                    j = f17771b.getLong(str4, longValue);
                }
                T valueOf4 = Long.valueOf(j);
                f17772c.put(aVar2.f18659c, valueOf4);
                return valueOf4;
            } else if (aVar2.f18662f == Double.class) {
                T valueOf5 = Double.valueOf(a(aVar2.f18659c, ((Double) aVar2.f18661e).doubleValue()));
                f17772c.put(aVar2.f18659c, valueOf5);
                return valueOf5;
            } else if (aVar2.f18662f != String.class) {
                return a(aVar2.f18659c, aVar2.f18662f, aVar2.f18661e);
            } else {
                String str5 = aVar2.f18659c;
                String str6 = (String) aVar2.f18661e;
                if (PatchProxy.isSupport(new Object[]{str5, str6}, null, f17770a, true, 13315, new Class[]{String.class, String.class}, String.class)) {
                    t = (String) PatchProxy.accessDispatch(new Object[]{str5, str6}, null, f17770a, true, 13315, new Class[]{String.class, String.class}, String.class);
                } else {
                    t = f17771b.getString(str5, str6);
                }
                if (t == null) {
                    f17772c.remove(aVar2.f18659c);
                } else {
                    f17772c.put(aVar2.f18659c, t);
                }
                return t;
            }
        }
    }

    private static double a(String str, double d2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Double.valueOf(d2)}, null, f17770a, true, 13317, new Class[]{String.class, Double.TYPE}, Double.TYPE)) {
            return ((Double) PatchProxy.accessDispatch(new Object[]{str2, Double.valueOf(d2)}, null, f17770a, true, 13317, new Class[]{String.class, Double.TYPE}, Double.TYPE)).doubleValue();
        }
        try {
            return Double.parseDouble(f17771b.getString(str2, String.valueOf(d2)));
        } catch (Exception unused) {
            return d2;
        }
    }

    public static <T> void a(com.bytedance.android.livesdkapi.depend.g.a aVar, T t) {
        com.bytedance.android.livesdkapi.depend.g.a aVar2 = aVar;
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{aVar2, t2}, null, f17770a, true, 13318, new Class[]{com.bytedance.android.livesdkapi.depend.g.a.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, t2}, null, f17770a, true, 13318, new Class[]{com.bytedance.android.livesdkapi.depend.g.a.class, Object.class}, Void.TYPE);
        } else if (t2 == null) {
            f17772c.remove(aVar2.f18659c);
            f17771b.edit().remove(aVar2.f18659c).apply();
        } else {
            f17772c.put(aVar2.f18659c, t2);
            if (aVar2.f18662f == Boolean.class) {
                f17771b.edit().putBoolean(aVar2.f18659c, ((Boolean) t2).booleanValue()).apply();
            } else if (aVar2.f18662f == Integer.class) {
                f17771b.edit().putInt(aVar2.f18659c, ((Integer) t2).intValue()).apply();
            } else if (aVar2.f18662f == Float.class) {
                f17771b.edit().putFloat(aVar2.f18659c, ((Float) t2).floatValue()).apply();
            } else if (aVar2.f18662f == Long.class) {
                f17771b.edit().putLong(aVar2.f18659c, ((Long) t2).longValue()).apply();
            } else if (aVar2.f18662f == Double.class) {
                f17771b.edit().putString(aVar2.f18659c, t.toString()).apply();
            } else if (aVar2.f18662f == String.class) {
                f17771b.edit().putString(aVar2.f18659c, (String) t2).apply();
            } else {
                f17771b.edit().putString(aVar2.f18659c, f17773d.toJson((Object) t2)).apply();
            }
        }
    }

    private static <T> T a(String str, Class<T> cls, T t) {
        String str2 = str;
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{str2, cls2, t}, null, f17770a, true, 13311, new Class[]{String.class, Class.class, Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{str2, cls2, t}, null, f17770a, true, 13311, new Class[]{String.class, Class.class, Object.class}, Object.class);
        }
        try {
            if (f17772c.containsKey(str2)) {
                return f17772c.get(str2);
            }
            T fromJson = f17773d.fromJson(f17771b.getString(str2, ""), cls2);
            if (fromJson == null) {
                f17772c.remove(str2);
            } else {
                f17772c.put(str2, fromJson);
            }
            return fromJson;
        } catch (Exception unused) {
            f17772c.remove(str2);
            return t;
        }
    }
}
