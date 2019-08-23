package com.ss.sys.ces.a;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static int f78481a;

    /* renamed from: b  reason: collision with root package name */
    public static int f78482b;

    /* renamed from: c  reason: collision with root package name */
    public static int f78483c;

    /* renamed from: d  reason: collision with root package name */
    private static int f78484d;

    /* renamed from: e  reason: collision with root package name */
    private static int f78485e;

    /* renamed from: f  reason: collision with root package name */
    private static int f78486f;

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|(4:1|2|(1:4)(2:6|(1:8)(1:9))|5)|(2:12|13)|14|15|16|18) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0057 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r4) {
        /*
            java.lang.String r0 = "window"
            java.lang.Object r0 = r4.getSystemService(r0)     // Catch:{ Throwable -> 0x003e }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ Throwable -> 0x003e }
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ Throwable -> 0x003e }
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ Throwable -> 0x003e }
            r1.<init>()     // Catch:{ Throwable -> 0x003e }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x003e }
            r3 = 17
            if (r2 < r3) goto L_0x0023
            r0.getRealSize(r1)     // Catch:{ Throwable -> 0x003e }
            int r0 = r1.x     // Catch:{ Throwable -> 0x003e }
            f78481a = r0     // Catch:{ Throwable -> 0x003e }
            int r0 = r1.y     // Catch:{ Throwable -> 0x003e }
        L_0x0020:
            f78482b = r0     // Catch:{ Throwable -> 0x003e }
            goto L_0x003f
        L_0x0023:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x003e }
            r3 = 13
            if (r2 < r3) goto L_0x0033
            r0.getSize(r1)     // Catch:{ Throwable -> 0x003e }
            int r0 = r1.x     // Catch:{ Throwable -> 0x003e }
            f78481a = r0     // Catch:{ Throwable -> 0x003e }
            int r0 = r1.y     // Catch:{ Throwable -> 0x003e }
            goto L_0x0020
        L_0x0033:
            int r1 = r0.getWidth()     // Catch:{ Throwable -> 0x003e }
            f78481a = r1     // Catch:{ Throwable -> 0x003e }
            int r0 = r0.getHeight()     // Catch:{ Throwable -> 0x003e }
            goto L_0x0020
        L_0x003e:
        L_0x003f:
            if (r4 == 0) goto L_0x0057
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch:{ Throwable -> 0x0057 }
            r0.<init>()     // Catch:{ Throwable -> 0x0057 }
            android.content.res.Resources r0 = r4.getResources()     // Catch:{ Throwable -> 0x0057 }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ Throwable -> 0x0057 }
            float r1 = r0.density     // Catch:{ Throwable -> 0x0057 }
            int r1 = (int) r1     // Catch:{ Throwable -> 0x0057 }
            f78484d = r1     // Catch:{ Throwable -> 0x0057 }
            int r0 = r0.densityDpi     // Catch:{ Throwable -> 0x0057 }
            f78483c = r0     // Catch:{ Throwable -> 0x0057 }
        L_0x0057:
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch:{ Throwable -> 0x006e }
            r0.<init>()     // Catch:{ Throwable -> 0x006e }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ Throwable -> 0x006e }
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()     // Catch:{ Throwable -> 0x006e }
            float r0 = r4.xdpi     // Catch:{ Throwable -> 0x006e }
            int r0 = (int) r0     // Catch:{ Throwable -> 0x006e }
            f78485e = r0     // Catch:{ Throwable -> 0x006e }
            float r4 = r4.ydpi     // Catch:{ Throwable -> 0x006e }
            int r4 = (int) r4     // Catch:{ Throwable -> 0x006e }
            f78486f = r4     // Catch:{ Throwable -> 0x006e }
        L_0x006e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r0 = f78483c
            r4.append(r0)
            java.lang.String r0 = "[<!>]"
            r4.append(r0)
            int r0 = f78481a
            r4.append(r0)
            java.lang.String r0 = "*"
            r4.append(r0)
            int r0 = f78482b
            r4.append(r0)
            java.lang.String r0 = "[<!>]"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.sys.ces.a.d.a(android.content.Context):java.lang.String");
    }
}
