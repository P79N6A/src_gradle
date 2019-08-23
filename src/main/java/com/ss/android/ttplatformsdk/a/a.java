package com.ss.android.ttplatformsdk.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f31121b;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f31122a;

    /* renamed from: c  reason: collision with root package name */
    private final String f31123c = "ttplatformapi.prefs";

    public static a a(Context context) {
        if (f31121b == null) {
            f31121b = new a(context);
        }
        return f31121b;
    }

    private a(Context context) {
        this.f31122a = c.a(context, "ttplatformapi.prefs", 4);
    }

    public final String b(String str, String str2) {
        return this.f31122a.getString(str, str2);
    }

    public final void a(String str, String str2) {
        SharedPreferences.Editor edit = this.f31122a.edit();
        edit.putString(str, str2);
        edit.commit();
    }
}
