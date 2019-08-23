package com.ss.android.agilelogger;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.RestrictTo;
import com.ss.android.agilelogger.f.h;
import com.ss.android.ugc.aweme.q.c;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f27927a;

    static String a() {
        b();
        SharedPreferences sharedPreferences = f27927a;
        return sharedPreferences.getString("_ALOG_LAST_LOG_PATH_" + h.a(ALog.getContext()), "");
    }

    public static void b() {
        if (f27927a == null) {
            Context context = ALog.getContext();
            f27927a = c.a(context, "_ALOG_SP_" + h.a(ALog.getContext()), 0);
        }
    }

    static void a(String str) {
        b();
        SharedPreferences.Editor edit = f27927a.edit();
        edit.putString("_ALOG_LAST_LOG_PATH_" + h.a(ALog.getContext()), str).commit();
    }
}
