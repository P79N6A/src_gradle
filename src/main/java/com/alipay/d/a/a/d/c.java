package com.alipay.d.a.a.d;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

public final class c {
    public static String a(Context context, String str, String str2, String str3) {
        return com.ss.android.ugc.aweme.q.c.a(context, str, 0).getString(str2, str3);
    }

    public static void a(Context context, String str, Map<String, String> map) {
        SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(context, str, 0).edit();
        if (edit != null) {
            edit.clear();
            for (String next : map.keySet()) {
                edit.putString(next, map.get(next));
            }
            edit.commit();
        }
    }
}
