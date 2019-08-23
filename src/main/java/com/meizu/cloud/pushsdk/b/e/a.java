package com.meizu.cloud.pushsdk.b.e;

import com.meizu.cloud.pushsdk.b.a.b;
import com.meizu.cloud.pushsdk.b.c.e;
import com.meizu.cloud.pushsdk.b.c.i;
import com.meizu.cloud.pushsdk.b.c.j;
import com.meizu.cloud.pushsdk.b.c.k;
import java.io.File;
import java.io.IOException;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f26986a;

    public static k a(b bVar) throws com.meizu.cloud.pushsdk.b.b.a {
        try {
            i.a a2 = new i.a().a(bVar.e());
            a(a2, bVar);
            switch (bVar.d()) {
                case 0:
                    a2 = a2.a();
                    break;
                case 1:
                    a2 = a2.a(bVar.m());
                    break;
                case 2:
                    a2 = a2.c(bVar.m());
                    break;
                case 3:
                    a2 = a2.b(bVar.m());
                    break;
                case 4:
                    a2 = a2.b();
                    break;
                case 5:
                    a2 = a2.d(bVar.m());
                    break;
            }
            i c2 = a2.c();
            bVar.a((com.meizu.cloud.pushsdk.b.c.a) new e());
            return bVar.l().a(c2);
        } catch (IOException e2) {
            throw new com.meizu.cloud.pushsdk.b.b.a((Throwable) e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.meizu.cloud.pushsdk.b.c.i.a r2, com.meizu.cloud.pushsdk.b.a.b r3) {
        /*
            java.lang.String r0 = r3.h()
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "User-Agent"
            java.lang.String r1 = r3.h()
        L_0x000c:
            r2.a((java.lang.String) r0, (java.lang.String) r1)
            goto L_0x001e
        L_0x0010:
            java.lang.String r0 = f26986a
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = f26986a
            r3.a((java.lang.String) r0)
            java.lang.String r0 = "User-Agent"
            java.lang.String r1 = f26986a
            goto L_0x000c
        L_0x001e:
            com.meizu.cloud.pushsdk.b.c.c r0 = r3.o()
            if (r0 == 0) goto L_0x0042
            r2.a((com.meizu.cloud.pushsdk.b.c.c) r0)
            java.lang.String r1 = r3.h()
            if (r1 == 0) goto L_0x0042
            java.util.Set r0 = r0.b()
            java.lang.String r1 = "User-Agent"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "User-Agent"
            java.lang.String r3 = r3.h()
            r2.a((java.lang.String) r0, (java.lang.String) r3)
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.b.e.a.a(com.meizu.cloud.pushsdk.b.c.i$a, com.meizu.cloud.pushsdk.b.a.b):void");
    }

    public static k b(b bVar) throws com.meizu.cloud.pushsdk.b.b.a {
        try {
            i.a a2 = new i.a().a(bVar.e());
            a(a2, bVar);
            i c2 = a2.a().c();
            bVar.a((com.meizu.cloud.pushsdk.b.c.a) new e());
            k a3 = bVar.l().a(c2);
            com.meizu.cloud.pushsdk.b.i.b.a(a3, bVar.j(), bVar.k());
            return a3;
        } catch (IOException e2) {
            try {
                File file = new File(bVar.j() + File.separator + bVar.k());
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            throw new com.meizu.cloud.pushsdk.b.b.a((Throwable) e2);
        }
    }

    public static k c(b bVar) throws com.meizu.cloud.pushsdk.b.b.a {
        try {
            i.a a2 = new i.a().a(bVar.e());
            a(a2, bVar);
            i c2 = a2.a((j) new b(bVar.n(), bVar.i())).c();
            bVar.a((com.meizu.cloud.pushsdk.b.c.a) new e());
            return bVar.l().a(c2);
        } catch (IOException e2) {
            throw new com.meizu.cloud.pushsdk.b.b.a((Throwable) e2);
        }
    }
}
