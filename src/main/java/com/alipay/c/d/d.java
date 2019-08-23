package com.alipay.c.d;

import android.content.Context;
import android.os.Build;
import com.alipay.d.a.a.b.b;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;

public final class d {
    public static synchronized Map<String, String> a(Context context) {
        HashMap hashMap;
        synchronized (d.class) {
            hashMap = new HashMap();
            hashMap.put("AE1", "android");
            StringBuilder sb = new StringBuilder();
            sb.append(com.alipay.d.a.a.b.d.a() ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY);
            hashMap.put("AE2", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.alipay.d.a.a.b.d.a(context) ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY);
            hashMap.put("AE3", sb2.toString());
            hashMap.put("AE4", Build.BOARD);
            hashMap.put("AE5", Build.BRAND);
            hashMap.put("AE6", Build.DEVICE);
            hashMap.put("AE7", Build.DISPLAY);
            hashMap.put("AE8", Build.VERSION.INCREMENTAL);
            hashMap.put("AE9", Build.MANUFACTURER);
            hashMap.put("AE10", Build.MODEL);
            hashMap.put("AE11", Build.PRODUCT);
            hashMap.put("AE12", Build.VERSION.RELEASE);
            hashMap.put("AE13", Build.VERSION.SDK);
            hashMap.put("AE14", Build.TAGS);
            hashMap.put("AE15", com.alipay.d.a.a.b.d.a("ro.kernel.qemu", PushConstants.PUSH_TYPE_NOTIFY));
            hashMap.put("AE21", b.g());
        }
        return hashMap;
    }
}
