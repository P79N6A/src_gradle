package cn.com.chinatelecom.a.a.e;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static String[] f1712a = {"android.permission.READ_PHONE_STATE"};

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r9) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 23
            if (r0 < r2) goto L_0x0040
            java.lang.String[] r0 = f1712a     // Catch:{ Exception -> 0x0040 }
            r2 = 0
            if (r9 == 0) goto L_0x003c
            if (r0 == 0) goto L_0x003c
            int r3 = r0.length     // Catch:{ Exception -> 0x0040 }
            if (r3 > 0) goto L_0x0012
            goto L_0x003c
        L_0x0012:
            android.content.pm.PackageManager r3 = r9.getPackageManager()     // Catch:{ Exception -> 0x0040 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0040 }
            r4.<init>()     // Catch:{ Exception -> 0x0040 }
            r5 = 0
        L_0x001c:
            int r6 = r0.length     // Catch:{ Exception -> 0x0040 }
            if (r5 >= r6) goto L_0x0034
            r6 = -1
            r7 = r0[r5]     // Catch:{ Exception -> 0x0040 }
            java.lang.String r8 = r9.getPackageName()     // Catch:{ Exception -> 0x0040 }
            int r7 = r3.checkPermission(r7, r8)     // Catch:{ Exception -> 0x0040 }
            if (r6 != r7) goto L_0x0031
            r6 = r0[r5]     // Catch:{ Exception -> 0x0040 }
            r4.add(r6)     // Catch:{ Exception -> 0x0040 }
        L_0x0031:
            int r5 = r5 + 1
            goto L_0x001c
        L_0x0034:
            boolean r9 = r4.isEmpty()     // Catch:{ Exception -> 0x0040 }
            if (r9 != 0) goto L_0x003c
            r9 = 1
            goto L_0x003d
        L_0x003c:
            r9 = 0
        L_0x003d:
            if (r9 == 0) goto L_0x0040
            return r2
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.a.a.e.h.a(android.content.Context):boolean");
    }
}
