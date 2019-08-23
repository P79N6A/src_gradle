package com.ta.utdid2.b.a;

import java.util.Random;

public class g {
    public static final String c() {
        int nextInt = new Random().nextInt();
        int nextInt2 = new Random().nextInt();
        byte[] bytes = e.getBytes((int) (System.currentTimeMillis() / 1000));
        byte[] bytes2 = e.getBytes((int) System.nanoTime());
        byte[] bytes3 = e.getBytes(nextInt);
        byte[] bytes4 = e.getBytes(nextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(bytes, 0, bArr, 0, 4);
        System.arraycopy(bytes2, 0, bArr, 4, 4);
        System.arraycopy(bytes3, 0, bArr, 8, 4);
        System.arraycopy(bytes4, 0, bArr, 12, 4);
        return b.encodeToString(bArr, 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r1) {
        /*
            if (r1 == 0) goto L_0x0011
            java.lang.String r0 = "phone"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch:{ Exception -> 0x0011 }
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch:{ Exception -> 0x0011 }
            if (r1 == 0) goto L_0x0011
            java.lang.String r1 = r1.getDeviceId()     // Catch:{ Exception -> 0x0011 }
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            boolean r0 = com.ta.utdid2.b.a.i.a((java.lang.String) r1)
            if (r0 == 0) goto L_0x001c
            java.lang.String r1 = c()
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.b.a.g.a(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(android.content.Context r1) {
        /*
            if (r1 == 0) goto L_0x0011
            java.lang.String r0 = "phone"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch:{ Exception -> 0x0011 }
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch:{ Exception -> 0x0011 }
            if (r1 == 0) goto L_0x0011
            java.lang.String r1 = r1.getSubscriberId()     // Catch:{ Exception -> 0x0011 }
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            boolean r0 = com.ta.utdid2.b.a.i.a((java.lang.String) r1)
            if (r0 == 0) goto L_0x001c
            java.lang.String r1 = c()
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.b.a.g.b(android.content.Context):java.lang.String");
    }
}
