package com.tencent.a.a.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public final class d extends f {
    public d(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        synchronized (this) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.f79217a).edit();
            edit.putString(h.c("4kU71lN96TJUomD1vOU9lgj9Tw=="), str);
            edit.commit();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final String b() {
        String string;
        synchronized (this) {
            string = PreferenceManager.getDefaultSharedPreferences(this.f79217a).getString(h.c("4kU71lN96TJUomD1vOU9lgj9Tw=="), null);
        }
        return string;
    }
}
