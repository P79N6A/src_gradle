package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.push.az;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private static m f82584a;

    /* renamed from: a  reason: collision with other field name */
    private Context f997a;

    /* renamed from: a  reason: collision with other field name */
    private List<String> f998a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f82585b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f82586c = new ArrayList();

    private m(Context context) {
        this.f997a = context.getApplicationContext();
        if (this.f997a == null) {
            this.f997a = context;
        }
        SharedPreferences a2 = c.a(this.f997a, "mipush_app_info", 0);
        for (String str : a2.getString("unregistered_pkg_names", "").split(",")) {
            if (TextUtils.isEmpty(str)) {
                this.f998a.add(str);
            }
        }
        for (String str2 : a2.getString("disable_push_pkg_names", "").split(",")) {
            if (!TextUtils.isEmpty(str2)) {
                this.f82585b.add(str2);
            }
        }
        for (String str3 : a2.getString("disable_push_pkg_names_cache", "").split(",")) {
            if (!TextUtils.isEmpty(str3)) {
                this.f82586c.add(str3);
            }
        }
    }

    public static m a(Context context) {
        if (f82584a == null) {
            f82584a = new m(context);
        }
        return f82584a;
    }

    public void a(String str) {
        synchronized (this.f998a) {
            if (!this.f998a.contains(str)) {
                this.f998a.add(str);
                c.a(this.f997a, "mipush_app_info", 0).edit().putString("unregistered_pkg_names", az.a((Collection<?>) this.f998a, ",")).commit();
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m641a(String str) {
        boolean contains;
        synchronized (this.f998a) {
            contains = this.f998a.contains(str);
        }
        return contains;
    }

    public void b(String str) {
        synchronized (this.f82585b) {
            if (!this.f82585b.contains(str)) {
                this.f82585b.add(str);
                c.a(this.f997a, "mipush_app_info", 0).edit().putString("disable_push_pkg_names", az.a((Collection<?>) this.f82585b, ",")).commit();
            }
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m642b(String str) {
        boolean contains;
        synchronized (this.f82585b) {
            contains = this.f82585b.contains(str);
        }
        return contains;
    }

    public void c(String str) {
        synchronized (this.f82586c) {
            if (!this.f82586c.contains(str)) {
                this.f82586c.add(str);
                c.a(this.f997a, "mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", az.a((Collection<?>) this.f82586c, ",")).commit();
            }
        }
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m643c(String str) {
        boolean contains;
        synchronized (this.f82586c) {
            contains = this.f82586c.contains(str);
        }
        return contains;
    }

    public void d(String str) {
        synchronized (this.f998a) {
            if (this.f998a.contains(str)) {
                this.f998a.remove(str);
                c.a(this.f997a, "mipush_app_info", 0).edit().putString("unregistered_pkg_names", az.a((Collection<?>) this.f998a, ",")).commit();
            }
        }
    }

    public void e(String str) {
        synchronized (this.f82585b) {
            if (this.f82585b.contains(str)) {
                this.f82585b.remove(str);
                c.a(this.f997a, "mipush_app_info", 0).edit().putString("disable_push_pkg_names", az.a((Collection<?>) this.f82585b, ",")).commit();
            }
        }
    }

    public void f(String str) {
        synchronized (this.f82586c) {
            if (this.f82586c.contains(str)) {
                this.f82586c.remove(str);
                c.a(this.f997a, "mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", az.a((Collection<?>) this.f82586c, ",")).commit();
            }
        }
    }
}
