package com.umeng.message.util;

import android.content.Context;
import com.alibaba.sdk.android.httpdns.HttpDns;
import com.alibaba.sdk.android.httpdns.HttpDnsService;
import com.umeng.commonsdk.debug.UMLog;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81408a = "b";

    public static void a(Context context) {
        HttpDns.getService(context, "174658").setExpiredIPEnabled(true);
    }

    public static String a(Context context, String str) {
        String str2;
        try {
            HttpDnsService service = HttpDns.getService(context, "174658");
            while (true) {
                str2 = service.getIpByHostAsync(str);
                try {
                    Thread.sleep(100);
                    if (str2 != null) {
                        break;
                    }
                    String str3 = str2;
                } catch (InterruptedException unused) {
                    UMLog.mutlInfo(f81408a, 0, "Thread interrupted exception");
                    return str2;
                }
            }
        } catch (InterruptedException unused2) {
            str2 = null;
            UMLog.mutlInfo(f81408a, 0, "Thread interrupted exception");
            return str2;
        }
        return str2;
    }
}
