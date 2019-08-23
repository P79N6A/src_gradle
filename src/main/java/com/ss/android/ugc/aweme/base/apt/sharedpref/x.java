package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.bp;
import com.ss.android.ugc.aweme.q.c;

public final class x implements bp {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34624a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34625b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34626c = c.a(this.f34625b, "NotificationSharePreferences", 0);

    public x(Context context) {
        this.f34625b = context;
    }

    public final int a(int i) {
        if (!PatchProxy.isSupport(new Object[]{0}, this, f34624a, false, 24324, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f34626c.getInt("alert_show_count", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{0}, this, f34624a, false, 24324, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34624a, false, 24325, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34624a, false, 24325, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34626c.edit();
        edit.putInt("alert_show_count", i);
        edit.apply();
    }

    public final int c(int i) {
        if (!PatchProxy.isSupport(new Object[]{0}, this, f34624a, false, 24326, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f34626c.getInt("page_enter_time", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{0}, this, f34624a, false, 24326, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final void d(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34624a, false, 24327, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34624a, false, 24327, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34626c.edit();
        edit.putInt("page_enter_time", i);
        edit.apply();
    }

    public final long a(long j) {
        if (!PatchProxy.isSupport(new Object[]{0L}, this, f34624a, false, 24322, new Class[]{Long.TYPE}, Long.TYPE)) {
            return this.f34626c.getLong("alert_last_show_time", 0);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{0L}, this, f34624a, false, 24322, new Class[]{Long.TYPE}, Long.TYPE)).longValue();
    }

    public final void b(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f34624a, false, 24323, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f34624a, false, 24323, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34626c.edit();
        edit.putLong("alert_last_show_time", j2);
        edit.apply();
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34624a, false, 24329, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34624a, false, 24329, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34626c.edit();
        edit.putBoolean("read_contact_denied", true);
        edit.apply();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34624a, false, 24317, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34624a, false, 24317, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34626c.edit();
        edit.putBoolean("noticeGuideShown", true);
        edit.apply();
    }

    public final boolean b(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34624a, false, 24328, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34626c.getBoolean("read_contact_denied", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34624a, false, 24328, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }
}
