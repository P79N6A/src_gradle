package com.meizu.cloud.pushsdk.b.e;

import com.meizu.cloud.pushsdk.b.a.b;
import com.meizu.cloud.pushsdk.b.b.a;
import com.meizu.cloud.pushsdk.b.c.k;

public final class c {
    public static <T> com.meizu.cloud.pushsdk.b.a.c<T> a(b bVar) {
        switch (bVar.g()) {
            case 0:
                return b(bVar);
            case 1:
                return c(bVar);
            case 2:
                return d(bVar);
            default:
                return new com.meizu.cloud.pushsdk.b.a.c<>(new a());
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0066=Splitter:B:30:0x0066, B:36:0x0077=Splitter:B:36:0x0077} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> com.meizu.cloud.pushsdk.b.a.c<T> b(com.meizu.cloud.pushsdk.b.a.b r5) {
        /*
            r0 = 0
            com.meizu.cloud.pushsdk.b.c.k r1 = com.meizu.cloud.pushsdk.b.e.a.a(r5)     // Catch:{ a -> 0x0073, Exception -> 0x0062, all -> 0x005d }
            if (r1 != 0) goto L_0x001d
            com.meizu.cloud.pushsdk.b.a.c r0 = new com.meizu.cloud.pushsdk.b.a.c     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            com.meizu.cloud.pushsdk.b.b.a r2 = new com.meizu.cloud.pushsdk.b.b.a     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            r2.<init>()     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            com.meizu.cloud.pushsdk.b.b.a r2 = com.meizu.cloud.pushsdk.b.i.b.a((com.meizu.cloud.pushsdk.b.b.a) r2)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            r0.<init>((com.meizu.cloud.pushsdk.b.b.a) r2)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            com.meizu.cloud.pushsdk.b.i.a.a(r1, r5)
            return r0
        L_0x0019:
            r0 = move-exception
            goto L_0x0066
        L_0x001b:
            r0 = move-exception
            goto L_0x0077
        L_0x001d:
            com.meizu.cloud.pushsdk.b.a.e r0 = r5.f()     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            com.meizu.cloud.pushsdk.b.a.e r2 = com.meizu.cloud.pushsdk.b.a.e.OK_HTTP_RESPONSE     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            if (r0 != r2) goto L_0x0031
            com.meizu.cloud.pushsdk.b.a.c r0 = new com.meizu.cloud.pushsdk.b.a.c     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            r0.<init>(r1)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            r0.a((com.meizu.cloud.pushsdk.b.c.k) r1)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            com.meizu.cloud.pushsdk.b.i.a.a(r1, r5)
            return r0
        L_0x0031:
            int r0 = r1.a()     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto L_0x0052
            com.meizu.cloud.pushsdk.b.a.c r0 = new com.meizu.cloud.pushsdk.b.a.c     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            com.meizu.cloud.pushsdk.b.b.a r2 = new com.meizu.cloud.pushsdk.b.b.a     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            r2.<init>((com.meizu.cloud.pushsdk.b.c.k) r1)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            int r3 = r1.a()     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            com.meizu.cloud.pushsdk.b.b.a r2 = com.meizu.cloud.pushsdk.b.i.b.a((com.meizu.cloud.pushsdk.b.b.a) r2, (com.meizu.cloud.pushsdk.b.a.b) r5, (int) r3)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            r0.<init>((com.meizu.cloud.pushsdk.b.b.a) r2)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            r0.a((com.meizu.cloud.pushsdk.b.c.k) r1)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            com.meizu.cloud.pushsdk.b.i.a.a(r1, r5)
            return r0
        L_0x0052:
            com.meizu.cloud.pushsdk.b.a.c r0 = r5.a((com.meizu.cloud.pushsdk.b.c.k) r1)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            r0.a((com.meizu.cloud.pushsdk.b.c.k) r1)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            com.meizu.cloud.pushsdk.b.i.a.a(r1, r5)
            return r0
        L_0x005d:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x008a
        L_0x0062:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0066:
            com.meizu.cloud.pushsdk.b.a.c r2 = new com.meizu.cloud.pushsdk.b.a.c     // Catch:{ all -> 0x0089 }
            com.meizu.cloud.pushsdk.b.b.a r0 = com.meizu.cloud.pushsdk.b.i.b.a((java.lang.Exception) r0)     // Catch:{ all -> 0x0089 }
            r2.<init>((com.meizu.cloud.pushsdk.b.b.a) r0)     // Catch:{ all -> 0x0089 }
            com.meizu.cloud.pushsdk.b.i.a.a(r1, r5)
            return r2
        L_0x0073:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0077:
            com.meizu.cloud.pushsdk.b.a.c r2 = new com.meizu.cloud.pushsdk.b.a.c     // Catch:{ all -> 0x0089 }
            com.meizu.cloud.pushsdk.b.b.a r3 = new com.meizu.cloud.pushsdk.b.b.a     // Catch:{ all -> 0x0089 }
            r3.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x0089 }
            com.meizu.cloud.pushsdk.b.b.a r0 = com.meizu.cloud.pushsdk.b.i.b.a((com.meizu.cloud.pushsdk.b.b.a) r3)     // Catch:{ all -> 0x0089 }
            r2.<init>((com.meizu.cloud.pushsdk.b.b.a) r0)     // Catch:{ all -> 0x0089 }
            com.meizu.cloud.pushsdk.b.i.a.a(r1, r5)
            return r2
        L_0x0089:
            r0 = move-exception
        L_0x008a:
            com.meizu.cloud.pushsdk.b.i.a.a(r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.b.e.c.b(com.meizu.cloud.pushsdk.b.a.b):com.meizu.cloud.pushsdk.b.a.c");
    }

    private static <T> com.meizu.cloud.pushsdk.b.a.c<T> c(b bVar) {
        try {
            k b2 = a.b(bVar);
            if (b2 == null) {
                return new com.meizu.cloud.pushsdk.b.a.c<>(com.meizu.cloud.pushsdk.b.i.b.a(new a()));
            }
            if (b2.a() >= 400) {
                com.meizu.cloud.pushsdk.b.a.c<T> cVar = new com.meizu.cloud.pushsdk.b.a.c<>(com.meizu.cloud.pushsdk.b.i.b.a(new a(b2), bVar, b2.a()));
                cVar.a(b2);
                return cVar;
            }
            com.meizu.cloud.pushsdk.b.a.c<T> cVar2 = new com.meizu.cloud.pushsdk.b.a.c<>("success");
            cVar2.a(b2);
            return cVar2;
        } catch (a e2) {
            return new com.meizu.cloud.pushsdk.b.a.c<>(com.meizu.cloud.pushsdk.b.i.b.a(new a((Throwable) e2)));
        } catch (Exception e3) {
            return new com.meizu.cloud.pushsdk.b.a.c<>(com.meizu.cloud.pushsdk.b.i.b.a(e3));
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0066=Splitter:B:30:0x0066, B:36:0x0077=Splitter:B:36:0x0077} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> com.meizu.cloud.pushsdk.b.a.c<T> d(com.meizu.cloud.pushsdk.b.a.b r5) {
        /*
            r0 = 0
            com.meizu.cloud.pushsdk.b.c.k r1 = com.meizu.cloud.pushsdk.b.e.a.c(r5)     // Catch:{ a -> 0x0073, Exception -> 0x0062, all -> 0x005d }
            if (r1 != 0) goto L_0x001d
            com.meizu.cloud.pushsdk.b.a.c r0 = new com.meizu.cloud.pushsdk.b.a.c     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            com.meizu.cloud.pushsdk.b.b.a r2 = new com.meizu.cloud.pushsdk.b.b.a     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            r2.<init>()     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            com.meizu.cloud.pushsdk.b.b.a r2 = com.meizu.cloud.pushsdk.b.i.b.a((com.meizu.cloud.pushsdk.b.b.a) r2)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            r0.<init>((com.meizu.cloud.pushsdk.b.b.a) r2)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            com.meizu.cloud.pushsdk.b.i.a.a(r1, r5)
            return r0
        L_0x0019:
            r0 = move-exception
            goto L_0x0066
        L_0x001b:
            r0 = move-exception
            goto L_0x0077
        L_0x001d:
            com.meizu.cloud.pushsdk.b.a.e r0 = r5.f()     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            com.meizu.cloud.pushsdk.b.a.e r2 = com.meizu.cloud.pushsdk.b.a.e.OK_HTTP_RESPONSE     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            if (r0 != r2) goto L_0x0031
            com.meizu.cloud.pushsdk.b.a.c r0 = new com.meizu.cloud.pushsdk.b.a.c     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            r0.<init>(r1)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            r0.a((com.meizu.cloud.pushsdk.b.c.k) r1)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            com.meizu.cloud.pushsdk.b.i.a.a(r1, r5)
            return r0
        L_0x0031:
            int r0 = r1.a()     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto L_0x0052
            com.meizu.cloud.pushsdk.b.a.c r0 = new com.meizu.cloud.pushsdk.b.a.c     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            com.meizu.cloud.pushsdk.b.b.a r2 = new com.meizu.cloud.pushsdk.b.b.a     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            r2.<init>((com.meizu.cloud.pushsdk.b.c.k) r1)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            int r3 = r1.a()     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            com.meizu.cloud.pushsdk.b.b.a r2 = com.meizu.cloud.pushsdk.b.i.b.a((com.meizu.cloud.pushsdk.b.b.a) r2, (com.meizu.cloud.pushsdk.b.a.b) r5, (int) r3)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            r0.<init>((com.meizu.cloud.pushsdk.b.b.a) r2)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            r0.a((com.meizu.cloud.pushsdk.b.c.k) r1)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            com.meizu.cloud.pushsdk.b.i.a.a(r1, r5)
            return r0
        L_0x0052:
            com.meizu.cloud.pushsdk.b.a.c r0 = r5.a((com.meizu.cloud.pushsdk.b.c.k) r1)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            r0.a((com.meizu.cloud.pushsdk.b.c.k) r1)     // Catch:{ a -> 0x001b, Exception -> 0x0019 }
            com.meizu.cloud.pushsdk.b.i.a.a(r1, r5)
            return r0
        L_0x005d:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x0085
        L_0x0062:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0066:
            com.meizu.cloud.pushsdk.b.a.c r2 = new com.meizu.cloud.pushsdk.b.a.c     // Catch:{ all -> 0x0084 }
            com.meizu.cloud.pushsdk.b.b.a r0 = com.meizu.cloud.pushsdk.b.i.b.a((java.lang.Exception) r0)     // Catch:{ all -> 0x0084 }
            r2.<init>((com.meizu.cloud.pushsdk.b.b.a) r0)     // Catch:{ all -> 0x0084 }
            com.meizu.cloud.pushsdk.b.i.a.a(r1, r5)
            return r2
        L_0x0073:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0077:
            com.meizu.cloud.pushsdk.b.a.c r2 = new com.meizu.cloud.pushsdk.b.a.c     // Catch:{ all -> 0x0084 }
            com.meizu.cloud.pushsdk.b.b.a r0 = com.meizu.cloud.pushsdk.b.i.b.a((com.meizu.cloud.pushsdk.b.b.a) r0)     // Catch:{ all -> 0x0084 }
            r2.<init>((com.meizu.cloud.pushsdk.b.b.a) r0)     // Catch:{ all -> 0x0084 }
            com.meizu.cloud.pushsdk.b.i.a.a(r1, r5)
            return r2
        L_0x0084:
            r0 = move-exception
        L_0x0085:
            com.meizu.cloud.pushsdk.b.i.a.a(r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.b.e.c.d(com.meizu.cloud.pushsdk.b.a.b):com.meizu.cloud.pushsdk.b.a.c");
    }
}
