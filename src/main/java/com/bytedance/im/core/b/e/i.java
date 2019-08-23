package com.bytedance.im.core.b.e;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.SharedPreferences;
import com.bytedance.im.core.a.c;

@SuppressLint({"ApplySharedPref"})
public class i {

    /* renamed from: b  reason: collision with root package name */
    private static volatile long f21238b;

    /* renamed from: c  reason: collision with root package name */
    private static i f21239c;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f21240a;

    public final long b() {
        return this.f21240a.getLong(a("im_reset_time"), 0);
    }

    public final int c() {
        return this.f21240a.getInt(a("im_reset_count"), 0);
    }

    private i() {
        f21238b = c.a().f20879c.a();
        Application application = c.a().f20877a;
        this.f21240a = com.ss.android.ugc.aweme.q.c.a(application, "imsdk_" + f21238b, 0);
    }

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            long a2 = c.a().f20879c.a();
            if (f21239c == null || a2 != f21238b) {
                synchronized (i.class) {
                    if (f21239c == null || a2 != f21238b) {
                        f21239c = new i();
                    }
                }
            }
            iVar = f21239c;
        }
        return iVar;
    }

    public final long a(int i) {
        return this.f21240a.getLong(a(i, "msg_by_user_cursor"), -1);
    }

    public static String a(String str) {
        return c.a().f20879c.a() + "_" + str;
    }

    public final long b(int i) {
        return this.f21240a.getLong(a(i, "msg_by_user_report_cursor"), -1);
    }

    public final boolean c(int i) {
        return this.f21240a.getBoolean(a(i, "im_init"), false);
    }

    public static String a(int i, String str) {
        if (i == 0) {
            return c.a().f20879c.a() + "_" + str;
        }
        return c.a().f20879c.a() + "_" + str + "_" + i;
    }

    public final void a(int i, long j) {
        this.f21240a.edit().putLong(a(i, "msg_by_user_cursor"), j).commit();
    }
}
