package com.vivo.push.util;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.a.a.a.a.a.a;

public final class u implements c {

    /* renamed from: a  reason: collision with root package name */
    private ContentResolver f81688a;

    u() {
    }

    public final boolean a(Context context) {
        if (!j.b()) {
            return false;
        }
        this.f81688a = context.getContentResolver();
        return true;
    }

    public final String a(String str, String str2) {
        try {
            return Settings.System.getString(this.f81688a, str);
        } catch (Exception e2) {
            a.b(e2);
            o.b("SettingsCache", "getString error by ".concat(String.valueOf(str)));
            return str2;
        }
    }

    public final void b(String str, String str2) {
        try {
            Settings.System.putString(this.f81688a, str, str2);
        } catch (Exception e2) {
            a.b(e2);
            o.b("SettingsCache", "putString error by ".concat(String.valueOf(str)));
        }
    }
}
