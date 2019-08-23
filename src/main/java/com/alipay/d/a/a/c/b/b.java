package com.alipay.d.a.a.c.b;

import android.content.Context;
import com.alipay.d.a.a.c.a;
import com.alipay.d.a.a.c.a.c;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static a f5378a;

    /* renamed from: b  reason: collision with root package name */
    private static a f5379b;

    public static a a(Context context, String str) {
        com.alipay.d.a.a.c.b bVar = null;
        if (context == null) {
            return null;
        }
        if (f5378a == null) {
            if (context != null) {
                bVar = com.alipay.d.a.a.c.b.a(context, str);
            }
            f5379b = bVar;
            f5378a = new b();
        }
        return f5378a;
    }

    public final boolean a(String str) {
        return f5379b.a(str);
    }

    public final com.alipay.d.a.a.c.a.b a(c cVar) {
        com.alipay.f.a.a.b.a.a aVar = new com.alipay.f.a.a.b.a.a();
        aVar.os = com.alipay.d.a.a.a.a.c(cVar.f5367a);
        aVar.apdid = com.alipay.d.a.a.a.a.c(cVar.f5368b);
        aVar.pubApdid = com.alipay.d.a.a.a.a.c(cVar.f5369c);
        aVar.priApdid = com.alipay.d.a.a.a.a.c(cVar.f5370d);
        aVar.token = com.alipay.d.a.a.a.a.c(cVar.f5371e);
        aVar.umidToken = com.alipay.d.a.a.a.a.c(cVar.f5372f);
        aVar.version = com.alipay.d.a.a.a.a.c(cVar.g);
        aVar.lastTime = com.alipay.d.a.a.a.a.c(cVar.h);
        aVar.dataMap = cVar.i == null ? new HashMap<>() : cVar.i;
        com.alipay.f.a.a.b.b.b a2 = f5379b.a(aVar);
        com.alipay.d.a.a.c.a.b bVar = new com.alipay.d.a.a.c.a.b();
        if (a2 == null) {
            return null;
        }
        bVar.f5361a = a2.success;
        bVar.f5362b = a2.resultCode;
        bVar.f5363c = a2.apdid;
        bVar.f5364d = a2.token;
        bVar.f5365e = a2.currentTime;
        bVar.f5366f = a2.version;
        bVar.g = a2.vkeySwitch;
        bVar.i = a2.appListVer;
        String str = a2.bugTrackSwitch;
        bVar.h = PushConstants.PUSH_TYPE_NOTIFY;
        bVar.j = PushConstants.PUSH_TYPE_NOTIFY;
        if (com.alipay.d.a.a.a.a.b(str) && str.length() > 0) {
            bVar.h = str.charAt(0);
        }
        return bVar;
    }
}
