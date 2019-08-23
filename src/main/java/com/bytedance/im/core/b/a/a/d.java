package com.bytedance.im.core.b.a.a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.im.core.b.a.c.b;
import com.bytedance.im.core.b.a.c.c;
import com.bytedance.im.core.b.e.k;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f20903a;

    public static d a() {
        if (f20903a == null) {
            synchronized (d.class) {
                if (f20903a == null) {
                    f20903a = new d();
                }
            }
        }
        return f20903a;
    }

    public static boolean c(String str) {
        k.b();
        c a2 = c.a();
        boolean z = false;
        if (a2 == null) {
            return false;
        }
        try {
            a2.a(str);
            z = true;
        } catch (Exception e2) {
            com.bytedance.im.core.b.e.d.a("execSQL: " + str, (Throwable) e2);
            com.bytedance.im.core.c.d.a(e2);
        }
        return z;
    }

    public static com.bytedance.im.core.b.a.c.d d(String str) {
        k.b();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        c a2 = c.a();
        if (a2 == null) {
            return null;
        }
        try {
            return a2.b(str);
        } catch (Exception e2) {
            com.bytedance.im.core.b.e.d.a("compileStatement: " + str, (Throwable) e2);
            com.bytedance.im.core.c.d.a(e2);
            return null;
        }
    }

    public static void b(String str) {
        k.b();
        c a2 = c.a();
        if (a2 == null) {
            com.bytedance.im.core.b.e.d.b(str, "endTransaction failed by db = null");
        } else if (a2.c()) {
            try {
                a2.e();
                a2.f();
                com.bytedance.im.core.b.e.d.b(str, "endTransaction successfully");
            } catch (Exception e2) {
                com.bytedance.im.core.b.e.d.a("endTransaction", (Throwable) e2);
                com.bytedance.im.core.c.d.a(e2);
            }
        } else {
            com.bytedance.im.core.b.e.d.a("no transaction, current tid=" + Thread.currentThread(), (Throwable) new RuntimeException());
        }
    }

    public static void a(String str) {
        k.b();
        c a2 = c.a();
        if (a2 == null) {
            com.bytedance.im.core.b.e.d.b(str, "startTransaction failed by db = null");
        } else if (a2.c()) {
            com.bytedance.im.core.b.e.d.a("is in transaction, current tid=" + Thread.currentThread(), (Throwable) new RuntimeException());
        } else {
            try {
                a2.d();
                com.bytedance.im.core.b.e.d.b(str, "startTransaction successfully");
            } catch (Exception e2) {
                com.bytedance.im.core.b.e.d.a("startTransaction", (Throwable) e2);
                com.bytedance.im.core.c.d.a(e2);
            }
        }
    }

    public static b a(String str, String[] strArr) {
        b bVar;
        k.b();
        c a2 = c.a();
        if (a2 == null) {
            return null;
        }
        try {
            bVar = a2.a(str, strArr);
        } catch (Exception e2) {
            com.bytedance.im.core.b.e.d.a("rawQuery " + str, (Throwable) e2);
            com.bytedance.im.core.c.d.a(e2);
            bVar = null;
        }
        return bVar;
    }

    public static long a(String str, String str2, ContentValues contentValues) {
        k.b();
        c a2 = c.a();
        if (a2 == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return a2.a(str, (String) null, contentValues);
        } catch (Exception e2) {
            com.bytedance.im.core.b.e.d.a("insert " + str, (Throwable) e2);
            com.bytedance.im.core.c.d.a(e2);
            return -1;
        }
    }

    public static boolean a(String str, String str2, String[] strArr) {
        k.b();
        c a2 = c.a();
        if (a2 == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (a2.a(str, str2, strArr) > 0) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            com.bytedance.im.core.b.e.d.a("delete sql " + str + " " + str2, (Throwable) e2);
            com.bytedance.im.core.c.d.a(e2);
            return false;
        }
    }

    public static int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        k.b();
        c a2 = c.a();
        if (a2 == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return a2.a(str, contentValues, str2, strArr);
        } catch (Exception e2) {
            com.bytedance.im.core.b.e.d.a("update " + str + " " + str2, (Throwable) e2);
            com.bytedance.im.core.c.d.a(e2);
            return -1;
        }
    }
}
