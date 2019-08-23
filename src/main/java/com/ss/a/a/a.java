package com.ss.a.a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f2367a = 255;

    /* renamed from: b  reason: collision with root package name */
    public static int f2368b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static String f2369c = "";

    /* renamed from: d  reason: collision with root package name */
    public static String f2370d = "";

    public static String a() {
        if (f2369c.length() > 0) {
            return f2369c;
        }
        int i = f2367a;
        if (i == 0) {
            return "https://xlog.snssdk.com";
        }
        switch (i) {
            case 2:
                return f2368b != 1180 ? "https://xlog.byteoversea.com" : "https://xlog.tiktokv.com";
            case 3:
                return f2368b != 1233 ? "https://xlog-va.byteoversea.com" : "http://xlog-va.musical.ly";
            case 4:
                return "http://10.8.121.119:8888";
            default:
                return "";
        }
    }

    public static synchronized void a(int i) {
        synchronized (a.class) {
            f2367a = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0012, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(int r1, java.lang.String r2) {
        /*
            java.lang.Class<com.ss.a.a.a> r0 = com.ss.a.a.a.class
            monitor-enter(r0)
            switch(r1) {
                case 1025: goto L_0x000a;
                case 1026: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x0011
        L_0x0007:
            f2370d = r2     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000a:
            f2369c = r2     // Catch:{ all -> 0x000e }
            monitor-exit(r0)
            return
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0011:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.a.a.a.a(int, java.lang.String):void");
    }

    public static String b() {
        int i = f2367a;
        if (i == 0) {
            return "https://verify.snssdk.com";
        }
        switch (i) {
            case 2:
                return f2368b != 1180 ? "https://verify-sg.byteoversea.com" : "https://verify-sg.tiktokv.com";
            case 3:
                return f2368b != 1233 ? "https://verification-va.byteoversea.com" : "https://verification-va.musical.ly";
            case 4:
                return "http://10.8.121.119:6789";
            default:
                return "";
        }
    }

    public static synchronized void b(int i) {
        synchronized (a.class) {
            f2368b = i;
        }
    }
}
