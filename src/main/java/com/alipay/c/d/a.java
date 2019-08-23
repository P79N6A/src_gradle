package com.alipay.c.d;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class a {
    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        HashMap hashMap;
        synchronized (a.class) {
            String a2 = com.alipay.d.a.a.a.a.a(map, "appchannel", "");
            hashMap = new HashMap();
            hashMap.put("AA1", context.getPackageName());
            hashMap.put("AA2", com.alipay.d.a.a.b.a.a(context));
            hashMap.put("AA3", "security-sdk-token");
            hashMap.put("AA4", "3.2.0-20160621");
            hashMap.put("AA6", a2);
        }
        return hashMap;
    }
}
