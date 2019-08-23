package com.vivo.push.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;

public final class w implements c {

    /* renamed from: a  reason: collision with root package name */
    private static String f81690a = "SpCache";

    /* renamed from: b  reason: collision with root package name */
    private static String f81691b = "com.vivo.push.cache";

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f81692c;

    public final void a() {
        SharedPreferences.Editor edit = this.f81692c.edit();
        if (edit != null) {
            edit.clear().apply();
        }
        o.d(f81690a, "system cache is cleared");
    }

    public final boolean a(Context context) {
        if (this.f81692c == null) {
            this.f81692c = c.a(context, f81691b, 0);
        }
        return true;
    }

    public final String a(String str, String str2) {
        String string = this.f81692c.getString(str, str2);
        String str3 = f81690a;
        o.d(str3, "getString " + str + " is " + string);
        return string;
    }

    public final void b(String str, String str2) {
        SharedPreferences.Editor edit = this.f81692c.edit();
        if (edit != null) {
            edit.putString(str, str2).apply();
            o.d(f81690a, "putString by ".concat(String.valueOf(str)));
            return;
        }
        o.b(f81690a, "putString error by ".concat(String.valueOf(str)));
    }
}
