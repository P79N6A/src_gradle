package com.ss.android.mobilelib.a;

import android.content.Context;
import com.bytedance.common.utility.persistent.Preferences;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static b f30063a;

    /* renamed from: b  reason: collision with root package name */
    private String f30064b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f30065c = "[['^(\\+86)?(1\\d{10})$', '$2']]";

    private b() {
    }

    public final String b() {
        if (this.f30064b == null) {
            return "";
        }
        return this.f30064b;
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f30063a == null) {
                f30063a = new b();
            }
            bVar = f30063a;
        }
        return bVar;
    }

    public final void a(Context context, String str) {
        this.f30064b = str;
        Preferences.CustomEditor edit = Preferences.getById(context, "app_setting").edit();
        edit.putString("last_login_mobile", str);
        SharedPrefsEditorCompat.apply(edit);
    }
}
