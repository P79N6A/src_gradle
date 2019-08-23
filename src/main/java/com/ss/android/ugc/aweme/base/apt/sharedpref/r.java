package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.i.a;
import com.ss.android.ugc.aweme.q.c;

public final class r implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34607a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34608b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34609c = c.a(this.f34608b, "SelectOldCities", 0);

    public r(Context context) {
        this.f34608b = context;
    }

    public final String a(String str) {
        if (!PatchProxy.isSupport(new Object[]{null}, this, f34607a, false, 24224, new Class[]{String.class}, String.class)) {
            return this.f34609c.getString("select_old_cities", null);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{null}, this, f34607a, false, 24224, new Class[]{String.class}, String.class);
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34607a, false, 24225, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34607a, false, 24225, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34609c.edit();
        edit.putString("select_old_cities", str2);
        edit.apply();
    }

    public final String c(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f34607a, false, 24226, new Class[]{String.class}, String.class)) {
            return this.f34609c.getString("select_city", str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f34607a, false, 24226, new Class[]{String.class}, String.class);
    }

    public final void d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34607a, false, 24227, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34607a, false, 24227, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34609c.edit();
        edit.putString("select_city", str2);
        edit.apply();
    }

    public final String e(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f34607a, false, 24228, new Class[]{String.class}, String.class)) {
            return this.f34609c.getString("current_city", str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f34607a, false, 24228, new Class[]{String.class}, String.class);
    }

    public final void f(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34607a, false, 24229, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34607a, false, 24229, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34609c.edit();
        edit.putString("current_city", str2);
        edit.apply();
    }
}
