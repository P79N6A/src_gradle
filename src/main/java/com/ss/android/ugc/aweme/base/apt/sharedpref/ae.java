package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.n;
import com.ss.android.ugc.aweme.q.c;

public final class ae implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34541a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34542b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34543c = c.a(this.f34542b, "ProfilePreferences", 0);

    public ae(Context context) {
        this.f34542b = context;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34541a, false, 24389, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34541a, false, 24389, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34543c.edit();
        edit.putInt("last_upload_account_num", i);
        edit.apply();
    }

    public final int b(int i) {
        if (!PatchProxy.isSupport(new Object[]{0}, this, f34541a, false, 24390, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f34543c.getInt("last_upload_account_num", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{0}, this, f34541a, false, 24390, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f34541a, false, 24391, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f34541a, false, 24391, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34543c.edit();
        edit.putLong("last_upload_account_num_time", j2);
        edit.apply();
    }

    public final long b(long j) {
        if (!PatchProxy.isSupport(new Object[]{0L}, this, f34541a, false, 24392, new Class[]{Long.TYPE}, Long.TYPE)) {
            return this.f34543c.getLong("last_upload_account_num_time", 0);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{0L}, this, f34541a, false, 24392, new Class[]{Long.TYPE}, Long.TYPE)).longValue();
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34541a, false, 24393, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34541a, false, 24393, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34543c.edit();
        edit.putString("profile_cache_post_list", str2);
        edit.apply();
    }

    public final boolean b(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34541a, false, 24388, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34543c.getBoolean("first_open_slide_setting_for_multi_account", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34541a, false, 24388, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34541a, false, 24387, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34541a, false, 24387, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34543c.edit();
        edit.putBoolean("first_open_slide_setting_for_multi_account", false);
        edit.apply();
    }
}
