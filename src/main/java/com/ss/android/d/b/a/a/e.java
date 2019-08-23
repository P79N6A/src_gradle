package com.ss.android.d.b.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.ss.android.d.a.a;
import com.ss.android.ugc.aweme.q.c;

public final class e extends b {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f28377a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f28378b;

    /* access modifiers changed from: protected */
    public final String a(String str) {
        String d2 = d(str);
        Logger.debug();
        return d2;
    }

    private String d(String str) {
        return e(str).getString(str, null);
    }

    private SharedPreferences e(String str) {
        if ("device_id".equals(str)) {
            return this.f28378b;
        }
        return this.f28377a;
    }

    public e(Context context) {
        if (context != null) {
            this.f28377a = c.a(context, a.c(), 0);
            this.f28378b = a.a(context);
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }

    /* access modifiers changed from: protected */
    public final String[] b(String str) {
        String d2 = d(str);
        Logger.debug();
        if (TextUtils.isEmpty(d2)) {
            return null;
        }
        return d2.split("\n");
    }

    public final void c(String str) {
        SharedPreferences e2 = e(str);
        if (e2 != null && e2.contains(str)) {
            e(str).edit().remove(str).apply();
        }
        super.c(str);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String str2) {
        Logger.debug();
        g(str, str2);
    }

    private void g(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            SharedPreferences.Editor edit = e(str).edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String[] strArr) {
        if (strArr != null) {
            String join = TextUtils.join("\n", strArr);
            Logger.debug();
            g(str, join);
        }
    }
}
