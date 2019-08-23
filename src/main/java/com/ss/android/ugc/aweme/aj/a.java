package com.ss.android.ugc.aweme.aj;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;
import java.util.List;

public abstract class a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f2592b;

    /* renamed from: c  reason: collision with root package name */
    protected String f2593c;

    public abstract void a();

    public final void a(Context context, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context, str3, str4}, this, f2592b, false, 73847, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str3, str4}, this, f2592b, false, 73847, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        SharedPreferences a2 = a(context);
        if (a2 != null) {
            SharedPreferences.Editor edit = a2.edit();
            edit.putString(str3, str4);
            edit.apply();
        }
    }

    public final void a(Context context, String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f2592b, false, 73856, new Class[]{Context.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str2, Byte.valueOf(z)}, this, f2592b, false, 73856, new Class[]{Context.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences a2 = a(context);
        if (a2 != null) {
            SharedPreferences.Editor edit = a2.edit();
            edit.putBoolean(str2, z);
            edit.apply();
        }
    }

    public a() {
        a();
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2592b, false, 73867, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2592b, false, 73867, new Class[0], Void.TYPE);
        } else if (TextUtils.isEmpty(this.f2593c)) {
            throw new IllegalStateException("filename can not bo null");
        }
    }

    private SharedPreferences a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f2592b, false, 73866, new Class[]{Context.class}, SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[]{context2}, this, f2592b, false, 73866, new Class[]{Context.class}, SharedPreferences.class);
        } else if (context2 == null) {
            return null;
        } else {
            b();
            return c.a(context2, this.f2593c, 0);
        }
    }

    public final int b(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, this, f2592b, false, 73852, new Class[]{Context.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, str2}, this, f2592b, false, 73852, new Class[]{Context.class, String.class}, Integer.TYPE)).intValue();
        }
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return 0;
        }
        return a2.getInt(str2, 0);
    }

    public final boolean c(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, this, f2592b, false, 73858, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2}, this, f2592b, false, 73858, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return false;
        }
        return a2.getBoolean(str2, false);
    }

    public final long d(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, this, f2592b, false, 73861, new Class[]{Context.class, String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{context, str2}, this, f2592b, false, 73861, new Class[]{Context.class, String.class}, Long.TYPE)).longValue();
        }
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return 0;
        }
        return a2.getLong(str2, 0);
    }

    public final String a(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, this, f2592b, false, 73849, new Class[]{Context.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, str2}, this, f2592b, false, 73849, new Class[]{Context.class, String.class}, String.class);
        }
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return null;
        }
        return a2.getString(str2, "");
    }

    public final <T> T a(Context context, String str, Class<T> cls) {
        String str2 = str;
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{context, str2, cls2}, this, f2592b, false, 73864, new Class[]{Context.class, String.class, Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{context, str2, cls2}, this, f2592b, false, 73864, new Class[]{Context.class, String.class, Class.class}, Object.class);
        }
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return null;
        }
        String string = a2.getString(str2, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return JSON.parseObject(string, cls2);
        } catch (Error | Exception unused) {
            return null;
        }
    }

    public final int b(Context context, String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2, Integer.valueOf(i)}, this, f2592b, false, 73851, new Class[]{Context.class, String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, str2, Integer.valueOf(i)}, this, f2592b, false, 73851, new Class[]{Context.class, String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return 0;
        }
        return a2.getInt(str2, i);
    }

    public final String b(Context context, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context, str3, str4}, this, f2592b, false, 73848, new Class[]{Context.class, String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, str3, str4}, this, f2592b, false, 73848, new Class[]{Context.class, String.class, String.class}, String.class);
        }
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return null;
        }
        return a2.getString(str3, str4);
    }

    public final void a(Context context, String str, int i) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2, Integer.valueOf(i)}, this, f2592b, false, 73850, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, Integer.valueOf(i)}, this, f2592b, false, 73850, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = c.a(context2, this.f2593c, 0).edit();
        edit.putInt(str2, i);
        edit.apply();
    }

    public final <T> List<T> b(Context context, String str, Class<T> cls) {
        String str2 = str;
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{context, str2, cls2}, this, f2592b, false, 73865, new Class[]{Context.class, String.class, Class.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{context, str2, cls2}, this, f2592b, false, 73865, new Class[]{Context.class, String.class, Class.class}, List.class);
        }
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return null;
        }
        String string = a2.getString(str2, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return JSON.parseArray(string, cls2);
        } catch (Error | Exception unused) {
            return null;
        }
    }

    public final void a(Context context, String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, str2, new Long(j2)}, this, f2592b, false, 73859, new Class[]{Context.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str2, new Long(j2)}, this, f2592b, false, 73859, new Class[]{Context.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences a2 = a(context);
        if (a2 != null) {
            SharedPreferences.Editor edit = a2.edit();
            edit.putLong(str2, j2);
            edit.apply();
        }
    }

    public final void b(Context context, String str, Object obj) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2, obj}, this, f2592b, false, 73863, new Class[]{Context.class, String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str2, obj}, this, f2592b, false, 73863, new Class[]{Context.class, String.class, Object.class}, Void.TYPE);
            return;
        }
        try {
            SharedPreferences a2 = a(context);
            if (a2 != null) {
                if (obj != null) {
                    SharedPreferences.Editor edit = a2.edit();
                    edit.putString(str2, JSONObject.toJSONString(obj));
                    edit.commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(Context context, String str, Object obj) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2, obj}, this, f2592b, false, 73862, new Class[]{Context.class, String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str2, obj}, this, f2592b, false, 73862, new Class[]{Context.class, String.class, Object.class}, Void.TYPE);
            return;
        }
        try {
            SharedPreferences a2 = a(context);
            if (a2 != null) {
                if (obj != null) {
                    SharedPreferences.Editor edit = a2.edit();
                    edit.putString(str2, JSONObject.toJSONString(obj));
                    edit.apply();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean b(Context context, String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f2592b, false, 73857, new Class[]{Context.class, String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2, Byte.valueOf(z)}, this, f2592b, false, 73857, new Class[]{Context.class, String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return false;
        }
        return a2.getBoolean(str2, z);
    }
}
