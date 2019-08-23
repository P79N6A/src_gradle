package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.e.n;
import com.ss.android.ugc.aweme.q.c;

public final class ac implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34535a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34536b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34537c = c.a(this.f34536b, "PoiPreferences", 0);

    public final int a() {
        if (!PatchProxy.isSupport(new Object[0], this, f34535a, false, 24338, new Class[0], Integer.TYPE)) {
            return this.f34537c.getInt("poi_route_type", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f34535a, false, 24338, new Class[0], Integer.TYPE)).intValue();
    }

    public final String b() {
        if (!PatchProxy.isSupport(new Object[0], this, f34535a, false, 24344, new Class[0], String.class)) {
            return this.f34537c.getString("fake_lat", "");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f34535a, false, 24344, new Class[0], String.class);
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, f34535a, false, 24346, new Class[0], String.class)) {
            return this.f34537c.getString("fake_lng", "");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f34535a, false, 24346, new Class[0], String.class);
    }

    public ac(Context context) {
        this.f34536b = context;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34535a, false, 24339, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34535a, false, 24339, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34537c.edit();
        edit.putInt("poi_route_type", i);
        edit.apply();
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34535a, false, 24347, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34535a, false, 24347, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34537c.edit();
        edit.putString("fake_lng", str2);
        edit.apply();
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34535a, false, 24345, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34535a, false, 24345, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34537c.edit();
        edit.putString("fake_lat", str2);
        edit.apply();
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34535a, false, 24343, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34535a, false, 24343, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34537c.edit();
        edit.putBoolean("enable_fake_gps", z);
        edit.apply();
    }

    public final boolean a(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34535a, false, 24342, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34537c.getBoolean("enable_fake_gps", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34535a, false, 24342, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }
}
