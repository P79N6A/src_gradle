package com.amap.api.mapcore2d;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

public class de {

    /* renamed from: a  reason: collision with root package name */
    public static final String f5928a = "/a/";

    /* renamed from: b  reason: collision with root package name */
    static final String f5929b = "b";

    /* renamed from: c  reason: collision with root package name */
    static final String f5930c = "c";

    /* renamed from: d  reason: collision with root package name */
    static final String f5931d = "d";

    /* renamed from: e  reason: collision with root package name */
    public static final String f5932e = "g";

    /* renamed from: f  reason: collision with root package name */
    public static final String f5933f = "h";
    public static final String g = "e";
    public static final String h = "f";

    static void a(Context context) {
        try {
            dk a2 = a(context, 2);
            if (a2 != null) {
                a2.b(context);
            }
        } catch (Throwable unused) {
        }
    }

    public static Class<? extends dv> a(int i) {
        switch (i) {
            case 0:
                return dq.class;
            case 1:
                return ds.class;
            case 2:
                return dp.class;
            default:
                return null;
        }
    }

    static void b(final Context context) {
        try {
            ExecutorService c2 = dg.c();
            if (c2 != null) {
                if (!c2.isShutdown()) {
                    c2.submit(new Runnable() {
                        /* JADX WARNING: Failed to process nested try/catch */
                        /* JADX WARNING: Removed duplicated region for block: B:32:? A[ExcHandler: RejectedExecutionException (unused java.util.concurrent.RejectedExecutionException), SYNTHETIC, Splitter:B:7:0x0016] */
                        /* JADX WARNING: Removed duplicated region for block: B:47:0x008e  */
                        /* JADX WARNING: Removed duplicated region for block: B:49:0x0093  */
                        /* JADX WARNING: Removed duplicated region for block: B:51:0x0098  */
                        /* JADX WARNING: Removed duplicated region for block: B:55:0x009f  */
                        /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4  */
                        /* JADX WARNING: Removed duplicated region for block: B:59:0x00a9  */
                        /* JADX WARNING: Removed duplicated region for block: B:64:0x00b1  */
                        /* JADX WARNING: Removed duplicated region for block: B:66:0x00b6  */
                        /* JADX WARNING: Removed duplicated region for block: B:68:0x00bb  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void run() {
                            /*
                                r7 = this;
                                r0 = 0
                                android.content.Context r1 = r2     // Catch:{ RejectedExecutionException -> 0x00ad, Throwable -> 0x0080, all -> 0x007a }
                                r2 = 0
                                com.amap.api.mapcore2d.dk r1 = com.amap.api.mapcore2d.de.a((android.content.Context) r1, (int) r2)     // Catch:{ RejectedExecutionException -> 0x00ad, Throwable -> 0x0080, all -> 0x007a }
                                android.content.Context r2 = r2     // Catch:{ RejectedExecutionException -> 0x0078, Throwable -> 0x0073, all -> 0x006e }
                                r3 = 1
                                com.amap.api.mapcore2d.dk r2 = com.amap.api.mapcore2d.de.a((android.content.Context) r2, (int) r3)     // Catch:{ RejectedExecutionException -> 0x0078, Throwable -> 0x0073, all -> 0x006e }
                                android.content.Context r3 = r2     // Catch:{ RejectedExecutionException -> 0x006b, Throwable -> 0x0066, all -> 0x0061 }
                                r4 = 2
                                com.amap.api.mapcore2d.dk r3 = com.amap.api.mapcore2d.de.a((android.content.Context) r3, (int) r4)     // Catch:{ RejectedExecutionException -> 0x006b, Throwable -> 0x0066, all -> 0x0061 }
                                android.content.Context r0 = r2     // Catch:{ RejectedExecutionException -> 0x006c, Throwable -> 0x005f }
                                r1.c((android.content.Context) r0)     // Catch:{ RejectedExecutionException -> 0x006c, Throwable -> 0x005f }
                                android.content.Context r0 = r2     // Catch:{ RejectedExecutionException -> 0x006c, Throwable -> 0x005f }
                                r2.c((android.content.Context) r0)     // Catch:{ RejectedExecutionException -> 0x006c, Throwable -> 0x005f }
                                android.content.Context r0 = r2     // Catch:{ RejectedExecutionException -> 0x006c, Throwable -> 0x005f }
                                r3.c((android.content.Context) r0)     // Catch:{ RejectedExecutionException -> 0x006c, Throwable -> 0x005f }
                                android.content.Context r0 = r2     // Catch:{ RejectedExecutionException -> 0x006c, Throwable -> 0x005f }
                                com.amap.api.mapcore2d.fc.a(r0)     // Catch:{ RejectedExecutionException -> 0x006c, Throwable -> 0x005f }
                                android.content.Context r0 = r2     // Catch:{ RejectedExecutionException -> 0x006c, Throwable -> 0x005f }
                                com.amap.api.mapcore2d.fa.a((android.content.Context) r0)     // Catch:{ RejectedExecutionException -> 0x006c, Throwable -> 0x005f }
                                java.util.List r0 = com.amap.api.mapcore2d.dk.a()     // Catch:{ RejectedExecutionException -> 0x006c, Throwable -> 0x005f }
                                int r4 = r0.size()     // Catch:{ RejectedExecutionException -> 0x006c, Throwable -> 0x005f }
                                if (r4 <= 0) goto L_0x004f
                                java.util.Iterator r0 = r0.iterator()     // Catch:{ RejectedExecutionException -> 0x006c, Throwable -> 0x005f }
                            L_0x003d:
                                boolean r4 = r0.hasNext()     // Catch:{ RejectedExecutionException -> 0x006c, Throwable -> 0x005f }
                                if (r4 == 0) goto L_0x004f
                                java.lang.Object r4 = r0.next()     // Catch:{ RejectedExecutionException -> 0x006c, Throwable -> 0x005f }
                                com.amap.api.mapcore2d.dk$b r4 = (com.amap.api.mapcore2d.dk.b) r4     // Catch:{ RejectedExecutionException -> 0x006c, Throwable -> 0x005f }
                                android.content.Context r5 = r2     // Catch:{ Throwable -> 0x003d, RejectedExecutionException -> 0x006c }
                                r4.a(r5)     // Catch:{ Throwable -> 0x003d, RejectedExecutionException -> 0x006c }
                                goto L_0x003d
                            L_0x004f:
                                if (r1 == 0) goto L_0x0054
                                r1.d()
                            L_0x0054:
                                if (r2 == 0) goto L_0x0059
                                r2.d()
                            L_0x0059:
                                if (r3 == 0) goto L_0x005e
                                r3.d()
                            L_0x005e:
                                return
                            L_0x005f:
                                r0 = move-exception
                                goto L_0x0085
                            L_0x0061:
                                r3 = move-exception
                                r6 = r3
                                r3 = r0
                                r0 = r6
                                goto L_0x009d
                            L_0x0066:
                                r3 = move-exception
                                r6 = r3
                                r3 = r0
                                r0 = r6
                                goto L_0x0085
                            L_0x006b:
                                r3 = r0
                            L_0x006c:
                                r0 = r2
                                goto L_0x00af
                            L_0x006e:
                                r2 = move-exception
                                r3 = r0
                                r0 = r2
                                r2 = r3
                                goto L_0x009d
                            L_0x0073:
                                r2 = move-exception
                                r3 = r0
                                r0 = r2
                                r2 = r3
                                goto L_0x0085
                            L_0x0078:
                                r3 = r0
                                goto L_0x00af
                            L_0x007a:
                                r1 = move-exception
                                r2 = r0
                                r3 = r2
                                r0 = r1
                                r1 = r3
                                goto L_0x009d
                            L_0x0080:
                                r1 = move-exception
                                r2 = r0
                                r3 = r2
                                r0 = r1
                                r1 = r3
                            L_0x0085:
                                java.lang.String r4 = "Log"
                                java.lang.String r5 = "processLog"
                                com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r0, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x009c }
                                if (r1 == 0) goto L_0x0091
                                r1.d()
                            L_0x0091:
                                if (r2 == 0) goto L_0x0096
                                r2.d()
                            L_0x0096:
                                if (r3 == 0) goto L_0x009b
                                r3.d()
                            L_0x009b:
                                return
                            L_0x009c:
                                r0 = move-exception
                            L_0x009d:
                                if (r1 == 0) goto L_0x00a2
                                r1.d()
                            L_0x00a2:
                                if (r2 == 0) goto L_0x00a7
                                r2.d()
                            L_0x00a7:
                                if (r3 == 0) goto L_0x00ac
                                r3.d()
                            L_0x00ac:
                                throw r0
                            L_0x00ad:
                                r1 = r0
                                r3 = r1
                            L_0x00af:
                                if (r1 == 0) goto L_0x00b4
                                r1.d()
                            L_0x00b4:
                                if (r0 == 0) goto L_0x00b9
                                r0.d()
                            L_0x00b9:
                                if (r3 == 0) goto L_0x00be
                                r3.d()
                            L_0x00be:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.de.AnonymousClass3.run():void");
                        }
                    });
                }
            }
        } catch (Throwable th) {
            dd.a(th, "Log", "processLog");
        }
    }

    public static String c(int i) {
        switch (i) {
            case 0:
                return f5930c;
            case 1:
                return f5929b;
            case 2:
                return f5931d;
            default:
                return "";
        }
    }

    public static dv b(int i) {
        switch (i) {
            case 0:
                return new dq();
            case 1:
                return new ds();
            case 2:
                return new dp();
            default:
                return null;
        }
    }

    static dk a(Context context, int i) {
        dk dkVar;
        switch (i) {
            case 0:
                dkVar = new di(i);
                break;
            case 1:
                dkVar = new dj(i);
                break;
            case 2:
                dkVar = new dh(i);
                break;
            default:
                return null;
        }
        return dkVar;
    }

    public static String a(Context context, String str) {
        return context.getFilesDir().getAbsolutePath() + f5928a + str;
    }

    static void a(final Context context, final cy cyVar, final String str, final String str2) {
        try {
            if (cyVar.f()) {
                ExecutorService c2 = dg.c();
                if (c2 != null) {
                    if (!c2.isShutdown()) {
                        c2.submit(new Runnable() {
                            public final void run() {
                                try {
                                    dk a2 = de.a(context, 1);
                                    if (TextUtils.isEmpty(str2)) {
                                        a2.a(cyVar, context, new Throwable("gpsstatistics"), str, (String) null, (String) null);
                                    } else {
                                        a2.a(cyVar, context, str2, str, (String) null, (String) null);
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        });
                    }
                }
            }
        } catch (RejectedExecutionException unused) {
        } catch (Throwable unused2) {
        }
    }

    static void a(Context context, Throwable th, int i, String str, String str2) {
        try {
            ExecutorService c2 = dg.c();
            if (c2 != null) {
                if (!c2.isShutdown()) {
                    final Context context2 = context;
                    final int i2 = i;
                    final Throwable th2 = th;
                    final String str3 = str;
                    final String str4 = str2;
                    AnonymousClass2 r2 = new Runnable() {
                        public final void run() {
                            try {
                                dk a2 = de.a(context2, i2);
                                if (a2 != null) {
                                    a2.a(context2, th2, str3, str4);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    };
                    c2.submit(r2);
                }
            }
        } catch (RejectedExecutionException unused) {
        } catch (Throwable unused2) {
        }
    }
}
