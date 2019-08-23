package com.alipay.e.a;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class a {
    public static synchronized String a(Context context, Map<String, String> map) {
        String a2;
        synchronized (a.class) {
            HashMap hashMap = new HashMap();
            hashMap.put("utdid", com.alipay.d.a.a.a.a.a(map, "utdid", ""));
            hashMap.put("tid", com.alipay.d.a.a.a.a.a(map, "tid", ""));
            hashMap.put("userId", com.alipay.d.a.a.a.a.a(map, "userId", ""));
            com.alipay.c.g.a.a(context).a(0, hashMap, null);
            a2 = com.alipay.c.a.a.a(context);
        }
        return a2;
    }
}
