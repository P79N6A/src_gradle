package com.meizu.cloud.pushsdk.b.i;

import com.meizu.cloud.pushsdk.b.a.b;
import com.meizu.cloud.pushsdk.b.a.e;
import com.meizu.cloud.pushsdk.b.c.k;

public final class a {
    public static void a(k kVar, b bVar) {
        if (!(bVar.f() == e.OK_HTTP_RESPONSE || kVar == null || kVar.b() == null || kVar.b().a() == null)) {
            try {
                kVar.b().a().close();
            } catch (Exception unused) {
                com.meizu.cloud.pushsdk.b.a.a.a("Unable to close source data");
            }
        }
    }
}
