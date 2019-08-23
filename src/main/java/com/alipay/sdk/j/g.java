package com.alipay.sdk.j;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alipay.sdk.app.a.a;
import com.alipay.sdk.d.e;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static String f5533a;

    private static String a(Context context) {
        String str;
        if (TextUtils.isEmpty(f5533a)) {
            try {
                str = context.getApplicationContext().getPackageName();
            } catch (Throwable unused) {
                str = "";
            }
            f5533a = (str + "0000000000000000000000000000").substring(0, 24);
        }
        return f5533a;
    }

    public static String b(Context context, String str, String str2) {
        String str3 = null;
        try {
            String string = PreferenceManager.getDefaultSharedPreferences(context).getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                str3 = e.b(a(context), string);
            }
            if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(str3)) {
                a.a("cp", "TriDesEncryptError", String.format("%s,%s", new Object[]{str, string}));
            }
        } catch (Exception unused) {
        }
        return str3;
    }

    public static void a(Context context, String str, String str2) {
        try {
            String a2 = e.a(a(context), str2);
            if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(a2)) {
                a.a("cp", "TriDesDecryptError", String.format("%s,%s", new Object[]{str, str2}));
            }
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, a2).commit();
        } catch (Throwable unused) {
        }
    }
}
