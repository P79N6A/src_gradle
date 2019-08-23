package com.bytedance.frameworks.plugin.core;

import android.content.SharedPreferences;
import com.bytedance.frameworks.plugin.e;
import com.ss.android.ugc.aweme.q.c;

public class d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f2194b;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f2195a = c.a(e.a(), "plugin_meta_data", 0);

    private d() {
    }

    public static d a() {
        if (f2194b == null) {
            synchronized (d.class) {
                if (f2194b == null) {
                    f2194b = new d();
                }
            }
        }
        return f2194b;
    }

    public final String a(String str) {
        SharedPreferences sharedPreferences = this.f2195a;
        return sharedPreferences.getString("MD5_" + str, "");
    }

    public final void a(String str, int i, boolean z) {
        SharedPreferences.Editor edit = this.f2195a.edit();
        String str2 = str + "-" + i;
        if (z) {
            edit.putBoolean(str2, true);
        } else {
            edit.remove(str2);
        }
        edit.commit();
    }

    public final void a(String str, int i, int i2, int i3) {
        SharedPreferences.Editor edit = this.f2195a.edit();
        edit.putInt("HOST_MIN_" + str + "_" + i, i2);
        edit.putInt("HOST_MAX_" + str + "_" + i, i3);
        edit.apply();
    }
}
