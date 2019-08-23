package com.ta.utdid2.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.ta.utdid2.b.a.b;
import com.ta.utdid2.b.a.h;
import com.ta.utdid2.b.a.i;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class c {
    private static final String TAG = "com.ta.utdid2.a.c";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f78838a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, Long> f78839b = new ConcurrentHashMap();

    private static String c(String str, String str2) {
        if (Build.VERSION.SDK_INT >= 8) {
            return com.ta.utdid2.b.a.c.encodeToString(str.concat(str2).getBytes(), 2);
        }
        return b.encodeToString(str.concat(str2).getBytes(), 2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m14a(Context context, String str, String str2) {
        if (context == null) {
            return "";
        }
        String c2 = c(str, str2);
        String str3 = f78838a.get(c2);
        if (i.a(str3)) {
            str3 = com.ss.android.ugc.aweme.q.c.a(context, "OfJbkLdFbPOMbGyP", 0).getString("EvQwnbilKezpOJey".concat(c2), "");
            f78838a.put(c2, str3);
        }
        return str3;
    }

    public static long a(Context context, String str, String str2) {
        long j;
        if (context == null) {
            return 0;
        }
        String c2 = c(str, str2);
        if (f78839b.containsKey(c2)) {
            j = f78839b.get(c2).longValue();
        } else {
            j = 0;
        }
        Long valueOf = Long.valueOf(j);
        if (valueOf.longValue() == 0) {
            valueOf = Long.valueOf(com.ss.android.ugc.aweme.q.c.a(context, "OfJbkLdFbPOMbGyP", 0).getLong("rKrMJgyAEbVtSQGi".concat(c2), 0));
            f78839b.put(c2, valueOf);
        }
        return valueOf.longValue();
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (context != null) {
            String c2 = c(str, str3);
            long currentTimeMillis = System.currentTimeMillis();
            f78838a.put(c2, str2);
            f78839b.put(c2, Long.valueOf(currentTimeMillis));
            SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(context, "OfJbkLdFbPOMbGyP", 0);
            if (Build.VERSION.SDK_INT >= 9) {
                h.a(a2.edit().putString("EvQwnbilKezpOJey".concat(c2), str2));
                h.a(a2.edit().putLong("rKrMJgyAEbVtSQGi".concat(c2), currentTimeMillis));
                return;
            }
            a2.edit().putString("EvQwnbilKezpOJey".concat(c2), str2).commit();
            a2.edit().putLong("rKrMJgyAEbVtSQGi".concat(c2), currentTimeMillis).commit();
        }
    }
}
