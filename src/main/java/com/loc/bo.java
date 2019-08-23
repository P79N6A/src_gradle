package com.loc;

import java.util.HashMap;

public final class bo {

    /* renamed from: a  reason: collision with root package name */
    HashMap<Long, bp> f25555a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    long f25556b = 0;

    private static long a(int i, int i2) {
        return (((long) i2) & 65535) | ((((long) i) & 65535) << 32);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r5 = r2.get(java.lang.Long.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r5 != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r9.m = com.loc.cn.b();
        r2.put(java.lang.Long.valueOf(r3), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r5.j == r9.j) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r9.m = com.loc.cn.b();
        r2.put(java.lang.Long.valueOf(r3), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        r9.m = r5.m;
        r2.put(java.lang.Long.valueOf(r3), r9);
        r0 = (com.loc.cn.b() - r5.m) / 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r3 = a(r3, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(com.loc.bp r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0062
            boolean r2 = r9.o
            if (r2 != 0) goto L_0x0009
            goto L_0x0062
        L_0x0009:
            java.util.HashMap<java.lang.Long, com.loc.bp> r2 = r8.f25555a
            int r3 = r9.k
            switch(r3) {
                case 1: goto L_0x0017;
                case 2: goto L_0x0012;
                case 3: goto L_0x0017;
                case 4: goto L_0x0017;
                default: goto L_0x0010;
            }
        L_0x0010:
            r3 = r0
            goto L_0x001f
        L_0x0012:
            int r3 = r9.h
            int r4 = r9.i
            goto L_0x001b
        L_0x0017:
            int r3 = r9.f25559c
            int r4 = r9.f25560d
        L_0x001b:
            long r3 = a(r3, r4)
        L_0x001f:
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            java.lang.Object r5 = r2.get(r5)
            com.loc.bp r5 = (com.loc.bp) r5
            if (r5 != 0) goto L_0x0039
            long r5 = com.loc.cn.b()
            r9.m = r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.put(r3, r9)
            return r0
        L_0x0039:
            int r6 = r5.j
            int r7 = r9.j
            if (r6 == r7) goto L_0x004d
            long r5 = com.loc.cn.b()
            r9.m = r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.put(r3, r9)
            return r0
        L_0x004d:
            long r0 = r5.m
            r9.m = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.put(r0, r9)
            long r0 = com.loc.cn.b()
            long r2 = r5.m
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
        L_0x0062:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bo.a(com.loc.bp):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.ArrayList<? extends com.loc.bp> r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x0090
            long r0 = com.loc.cn.b()
            long r2 = r12.f25556b
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x001a
            long r2 = r12.f25556b
            long r2 = r0 - r2
            r6 = 60000(0xea60, double:2.9644E-319)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x001a
            return
        L_0x001a:
            java.util.HashMap<java.lang.Long, com.loc.bp> r2 = r12.f25555a
            int r3 = r13.size()
            r6 = 0
            r7 = r4
            r4 = 0
        L_0x0023:
            if (r4 >= r3) goto L_0x005e
            java.lang.Object r5 = r13.get(r4)
            com.loc.bp r5 = (com.loc.bp) r5
            boolean r9 = r5.o
            if (r9 == 0) goto L_0x005b
            int r9 = r5.k
            switch(r9) {
                case 1: goto L_0x003a;
                case 2: goto L_0x0035;
                case 3: goto L_0x003a;
                case 4: goto L_0x003a;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x0042
        L_0x0035:
            int r7 = r5.h
            int r8 = r5.i
            goto L_0x003e
        L_0x003a:
            int r7 = r5.f25559c
            int r8 = r5.f25560d
        L_0x003e:
            long r7 = a(r7, r8)
        L_0x0042:
            java.lang.Long r9 = java.lang.Long.valueOf(r7)
            java.lang.Object r9 = r2.get(r9)
            com.loc.bp r9 = (com.loc.bp) r9
            if (r9 == 0) goto L_0x005b
            int r10 = r9.j
            int r11 = r5.j
            if (r10 != r11) goto L_0x0059
            long r9 = r9.m
            r5.m = r9
            goto L_0x005b
        L_0x0059:
            r5.m = r0
        L_0x005b:
            int r4 = r4 + 1
            goto L_0x0023
        L_0x005e:
            r2.clear()
            int r3 = r13.size()
        L_0x0065:
            if (r6 >= r3) goto L_0x008e
            java.lang.Object r4 = r13.get(r6)
            com.loc.bp r4 = (com.loc.bp) r4
            boolean r5 = r4.o
            if (r5 == 0) goto L_0x008b
            int r5 = r4.k
            switch(r5) {
                case 1: goto L_0x007c;
                case 2: goto L_0x0077;
                case 3: goto L_0x007c;
                case 4: goto L_0x007c;
                default: goto L_0x0076;
            }
        L_0x0076:
            goto L_0x0084
        L_0x0077:
            int r5 = r4.h
            int r7 = r4.i
            goto L_0x0080
        L_0x007c:
            int r5 = r4.f25559c
            int r7 = r4.f25560d
        L_0x0080:
            long r7 = a(r5, r7)
        L_0x0084:
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r2.put(r5, r4)
        L_0x008b:
            int r6 = r6 + 1
            goto L_0x0065
        L_0x008e:
            r12.f25556b = r0
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bo.a(java.util.ArrayList):void");
    }
}
