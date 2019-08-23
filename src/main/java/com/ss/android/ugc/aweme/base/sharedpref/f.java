package com.ss.android.ugc.aweme.base.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34885a;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences f34886b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences.Editor f34887c;

    public final boolean a(String str, boolean z) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34885a, false, 24893, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34886b.getBoolean(str2, z);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f34885a, false, 24893, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public SharedPreferences.Editor a() {
        if (PatchProxy.isSupport(new Object[0], this, f34885a, false, 24890, new Class[0], SharedPreferences.Editor.class)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(new Object[0], this, f34885a, false, 24890, new Class[0], SharedPreferences.Editor.class);
        }
        if (this.f34887c == null) {
            this.f34887c = this.f34886b.edit();
        }
        return this.f34887c;
    }

    public f(Context context, String str) {
        this.f34886b = c.a(context.getApplicationContext(), str, 0);
    }

    public final int a(String str, int i) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f34885a, false, 24891, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
            return this.f34886b.getInt(str2, i);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f34885a, false, 24891, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> java.util.List<T> b(java.lang.String r20, java.lang.Class<T> r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f34885a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            r8[r11] = r4
            java.lang.Class<java.util.List> r9 = java.util.List.class
            r6 = 0
            r7 = 24904(0x6148, float:3.4898E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f34885a
            r15 = 0
            r16 = 24904(0x6148, float:3.4898E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            r0[r11] = r1
            java.lang.Class<java.util.List> r18 = java.util.List.class
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0048:
            java.lang.String r2 = ""
            r3 = r19
            java.lang.String r0 = r3.a((java.lang.String) r0, (java.lang.String) r2)
            r2 = 0
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x005c
            java.util.List r0 = com.alibaba.fastjson.JSON.parseArray(r0, r1)     // Catch:{ Exception -> 0x005c }
            goto L_0x005d
        L_0x005c:
            r0 = r2
        L_0x005d:
            if (r0 != 0) goto L_0x0064
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.sharedpref.f.b(java.lang.String, java.lang.Class):java.util.List");
    }

    public final long a(String str, long j) {
        String str2 = str;
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f34885a, false, 24892, new Class[]{String.class, Long.TYPE}, Long.TYPE)) {
            return this.f34886b.getLong(str2, j2);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f34885a, false, 24892, new Class[]{String.class, Long.TYPE}, Long.TYPE)).longValue();
    }

    public final void b(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f34885a, false, 24896, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f34885a, false, 24896, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a().putInt(str2, i).apply();
    }

    public final <T> T a(String str, Class<T> cls) {
        T t;
        String str2 = str;
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{str2, cls2}, this, f34885a, false, 24902, new Class[]{String.class, Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{str2, cls2}, this, f34885a, false, 24902, new Class[]{String.class, Class.class}, Object.class);
        }
        String a2 = a(str2, "");
        if (!TextUtils.isEmpty(a2)) {
            try {
                t = JSON.parseObject(a2, cls2);
            } catch (Exception unused) {
            }
            return t;
        }
        t = null;
        return t;
    }

    public final void b(String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f34885a, false, 24897, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f34885a, false, 24897, new Class[]{String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        a().putLong(str2, j2).apply();
    }

    public final String a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{str3, str4}, this, f34885a, false, 24894, new Class[]{String.class, String.class}, String.class)) {
            return this.f34886b.getString(str3, str4);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34885a, false, 24894, new Class[]{String.class, String.class}, String.class);
    }

    public final void b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34885a, false, 24899, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34885a, false, 24899, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        a().putString(str3, str4).apply();
    }

    public final void a(String str, Object obj) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, obj}, this, f34885a, false, 24901, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, obj}, this, f34885a, false, 24901, new Class[]{String.class, Object.class}, Void.TYPE);
            return;
        }
        a().putString(str2, JSONObject.toJSONString(obj)).apply();
    }

    public final void b(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34885a, false, 24898, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f34885a, false, 24898, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a().putBoolean(str2, z).apply();
    }
}
