package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.internal.m;
import com.ss.android.ugc.aweme.q.c;

public final class ad implements m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34538a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34539b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34540c = c.a(this.f34539b, "VideoRecord", 0);

    public final int a() {
        if (!PatchProxy.isSupport(new Object[0], this, f34538a, false, 24353, new Class[0], Integer.TYPE)) {
            return this.f34540c.getInt("resources_version", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f34538a, false, 24353, new Class[0], Integer.TYPE)).intValue();
    }

    public final String b() {
        if (!PatchProxy.isSupport(new Object[0], this, f34538a, false, 24355, new Class[0], String.class)) {
            return this.f34540c.getString("uploadRecoverPath", "");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f34538a, false, 24355, new Class[0], String.class);
    }

    public ad(Context context) {
        this.f34539b = context;
    }

    public final float a(float f2) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(-1.0f)}, this, f34538a, false, 24379, new Class[]{Float.TYPE}, Float.TYPE)) {
            return this.f34540c.getFloat("ulikebeauty_sharp_default", -1.0f);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(-1.0f)}, this, f34538a, false, 24379, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
    }

    public final String b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f34538a, false, 24383, new Class[]{String.class}, String.class)) {
            return this.f34540c.getString("ulikebeauty_download_data", str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f34538a, false, 24383, new Class[]{String.class}, String.class);
    }

    public final void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34538a, false, 24384, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34538a, false, 24384, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34540c.edit();
        edit.putString("ulikebeauty_download_data", str2);
        edit.apply();
    }

    public final boolean d(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34538a, false, 24357, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34540c.getBoolean("is_first_enter_record_page", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34538a, false, 24357, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void e(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34538a, false, 24358, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34538a, false, 24358, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34540c.edit();
        edit.putBoolean("is_first_enter_record_page", false);
        edit.apply();
    }

    public final void f(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34538a, false, 24385, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34538a, false, 24385, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34540c.edit();
        edit.putBoolean("hdr_resource_model_copied", true);
        edit.apply();
    }

    public final boolean g(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34538a, false, 24386, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34540c.getBoolean("hdr_resource_model_copied", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34538a, false, 24386, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34538a, false, 24356, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f34538a, false, 24356, new Class[]{String.class}, String.class);
        }
        SharedPreferences.Editor edit = this.f34540c.edit();
        edit.putString("uploadRecoverPath", str2);
        edit.apply();
        return "";
    }

    public final boolean b(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34538a, false, 24351, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34540c.getBoolean("is_duration_mode_manually_change", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34538a, false, 24351, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34538a, false, 24352, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34538a, false, 24352, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34540c.edit();
        edit.putBoolean("is_duration_mode_manually_change", true);
        edit.apply();
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34538a, false, 24354, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34538a, false, 24354, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34540c.edit();
        edit.putInt("resources_version", i);
        edit.apply();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34538a, false, 24350, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34538a, false, 24350, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34540c.edit();
        edit.putBoolean("count_down_new_tag", false);
        edit.apply();
    }
}
