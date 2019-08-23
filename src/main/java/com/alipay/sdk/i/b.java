package com.alipay.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.j.a;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    private static b f5512c;

    /* renamed from: a  reason: collision with root package name */
    public String f5513a;

    /* renamed from: b  reason: collision with root package name */
    public String f5514b;

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f5512c == null) {
                f5512c = new b();
                Context context = com.alipay.sdk.h.b.a().f5510a;
                a aVar = new a(context);
                String a2 = a.a(context).a();
                String b2 = a.a(context).b();
                f5512c.f5513a = aVar.a(a2, b2);
                f5512c.f5514b = aVar.b(a2, b2);
                if (TextUtils.isEmpty(f5512c.f5514b)) {
                    b bVar2 = f5512c;
                    String hexString = Long.toHexString(System.currentTimeMillis());
                    if (hexString.length() > 10) {
                        hexString = hexString.substring(hexString.length() - 10);
                    }
                    bVar2.f5514b = hexString;
                }
                aVar.a(a2, b2, f5512c.f5513a, f5512c.f5514b);
            }
            bVar = f5512c;
        }
        return bVar;
    }
}
