package com.bytedance.android.livesdkapi.depend.g;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public class a<T> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f18658b;

    /* renamed from: c  reason: collision with root package name */
    public String f18659c;

    /* renamed from: d  reason: collision with root package name */
    public String f18660d;

    /* renamed from: e  reason: collision with root package name */
    public T f18661e;

    /* renamed from: f  reason: collision with root package name */
    public Class<T> f18662f;

    public T a() {
        if (!PatchProxy.isSupport(new Object[0], this, f18658b, false, 15015, new Class[0], Object.class)) {
            return b.a(this);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f18658b, false, 15015, new Class[0], Object.class);
    }

    public void a(T t) {
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{t2}, this, f18658b, false, 15016, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t2}, this, f18658b, false, 15016, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this, t2}, null, b.f18663a, true, 15043, new Class[]{a.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this, t2}, null, b.f18663a, true, 15043, new Class[]{a.class, Object.class}, Void.TYPE);
            return;
        }
        String str = this.f18660d;
        if (t2 == null) {
            b.a(str).edit().remove(this.f18659c).apply();
            return;
        }
        if (this.f18662f == Boolean.class) {
            String str2 = this.f18659c;
            boolean booleanValue = ((Boolean) t2).booleanValue();
            if (PatchProxy.isSupport(new Object[]{str, str2, Byte.valueOf(booleanValue ? (byte) 1 : 0)}, null, b.f18663a, true, 15037, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, str2, Byte.valueOf(booleanValue)}, null, b.f18663a, true, 15037, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE);
            } else {
                b.a(str).edit().putBoolean(str2, booleanValue).apply();
            }
        } else if (this.f18662f == Integer.class) {
            String str3 = this.f18659c;
            int intValue = ((Integer) t2).intValue();
            if (PatchProxy.isSupport(new Object[]{str, str3, Integer.valueOf(intValue)}, null, b.f18663a, true, 15038, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, str3, Integer.valueOf(intValue)}, null, b.f18663a, true, 15038, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE);
            } else {
                b.a(str).edit().putInt(str3, intValue).apply();
            }
        } else if (this.f18662f == Float.class) {
            String str4 = this.f18659c;
            float floatValue = ((Float) t2).floatValue();
            if (PatchProxy.isSupport(new Object[]{str, str4, Float.valueOf(floatValue)}, null, b.f18663a, true, 15041, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, str4, Float.valueOf(floatValue)}, null, b.f18663a, true, 15041, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE);
            } else {
                b.a(str).edit().putFloat(str4, floatValue).apply();
            }
        } else if (this.f18662f == Long.class) {
            String str5 = this.f18659c;
            long longValue = ((Long) t2).longValue();
            if (PatchProxy.isSupport(new Object[]{str, str5, new Long(longValue)}, null, b.f18663a, true, 15039, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, str5, new Long(longValue)}, null, b.f18663a, true, 15039, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            } else {
                b.a(str).edit().putLong(str5, longValue).apply();
            }
        } else if (this.f18662f == Double.class) {
            String str6 = this.f18659c;
            double doubleValue = ((Double) t2).doubleValue();
            if (PatchProxy.isSupport(new Object[]{str, str6, Double.valueOf(doubleValue)}, null, b.f18663a, true, 15042, new Class[]{String.class, String.class, Double.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, str6, Double.valueOf(doubleValue)}, null, b.f18663a, true, 15042, new Class[]{String.class, String.class, Double.TYPE}, Void.TYPE);
            } else {
                b.a(str).edit().putString(str6, String.valueOf(doubleValue)).apply();
            }
        } else if (this.f18662f == String.class) {
            String str7 = this.f18659c;
            String str8 = (String) t2;
            if (PatchProxy.isSupport(new Object[]{str, str7, str8}, null, b.f18663a, true, 15040, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, str7, str8}, null, b.f18663a, true, 15040, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            } else {
                b.a(str).edit().putString(str7, str8).apply();
            }
        } else {
            Map map = b.f18664b.get(str);
            if (map != null) {
                map.put(this.f18659c, t2);
            }
            b.a(str).edit().putString(this.f18659c, b.f18665c.toJson((Object) t2)).apply();
        }
    }

    public a(String str, @NonNull T t) {
        this("tt_live_sdk", str, t.getClass(), t);
    }

    public a(String str, String str2, @NonNull T t) {
        this(str, str2, t.getClass(), t);
    }

    private a(String str, String str2, Class<T> cls, T t) {
        this.f18660d = str;
        this.f18659c = str2;
        this.f18661e = t;
        this.f18662f = cls;
        if (t == null) {
            if (this.f18662f == Integer.class || this.f18662f == Short.class) {
                this.f18661e = 0;
            } else if (this.f18662f == Long.class) {
                this.f18661e = 0L;
            } else if (this.f18662f == Double.class) {
                this.f18661e = Double.valueOf(0.0d);
            } else if (this.f18662f == Float.class) {
                this.f18661e = Float.valueOf(0.0f);
            } else if (this.f18662f == Boolean.class) {
                this.f18661e = Boolean.FALSE;
            }
        }
    }
}
