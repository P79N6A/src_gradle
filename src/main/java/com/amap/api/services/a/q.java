package com.amap.api.services.a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public static bn f6874a;

    /* renamed from: b  reason: collision with root package name */
    private static q f6875b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static Context f6876c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public a f6877d;

    /* renamed from: e  reason: collision with root package name */
    private HandlerThread f6878e = new HandlerThread("manifestThread") {
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0098, code lost:
            if (com.amap.api.services.a.q.a(r9.f6879a) != null) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
            if (com.amap.api.services.a.q.a(r9.f6879a) == null) goto L_0x00b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ad, code lost:
            com.amap.api.services.a.q.a(r9.f6879a).sendMessage(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            java.lang.Thread.sleep(10000);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bb, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bc, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r9 = this;
                java.lang.String r0 = "run"
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r2 = "ManifestConfigThread"
                r1.setName(r2)
                android.os.Message r1 = new android.os.Message
                r1.<init>()
                r2 = 3
                android.content.Context r3 = com.amap.api.services.a.q.f6876c     // Catch:{ Throwable -> 0x009d }
                r4 = 0
                com.amap.api.services.a.bn r5 = com.amap.api.services.a.i.a(r4)     // Catch:{ Throwable -> 0x009d }
                java.lang.String r6 = "11K;001"
                r7 = 0
                com.amap.api.services.a.bg$a r3 = com.amap.api.services.a.bg.a(r3, r5, r6, r7)     // Catch:{ Throwable -> 0x009d }
                if (r3 == 0) goto L_0x0036
                com.amap.api.services.a.bg$a$a r5 = r3.x     // Catch:{ Throwable -> 0x009d }
                if (r5 == 0) goto L_0x0036
                com.amap.api.services.a.r r5 = new com.amap.api.services.a.r     // Catch:{ Throwable -> 0x009d }
                com.amap.api.services.a.bg$a$a r6 = r3.x     // Catch:{ Throwable -> 0x009d }
                boolean r6 = r6.f6602b     // Catch:{ Throwable -> 0x009d }
                com.amap.api.services.a.bg$a$a r8 = r3.x     // Catch:{ Throwable -> 0x009d }
                boolean r8 = r8.f6601a     // Catch:{ Throwable -> 0x009d }
                r5.<init>(r6, r8)     // Catch:{ Throwable -> 0x009d }
                r1.obj = r5     // Catch:{ Throwable -> 0x009d }
            L_0x0036:
                if (r3 == 0) goto L_0x0090
                com.amap.api.services.a.bg$a$d r5 = r3.y     // Catch:{ Throwable -> 0x009d }
                if (r5 == 0) goto L_0x0090
                com.amap.api.services.a.bg$a$d r3 = r3.y     // Catch:{ Throwable -> 0x009d }
                if (r3 == 0) goto L_0x0080
                java.lang.String r5 = r3.f6612b     // Catch:{ Throwable -> 0x009d }
                java.lang.String r6 = r3.f6611a     // Catch:{ Throwable -> 0x009d }
                java.lang.String r3 = r3.f6613c     // Catch:{ Throwable -> 0x009d }
                boolean r8 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x009d }
                if (r8 != 0) goto L_0x006f
                boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x009d }
                if (r8 != 0) goto L_0x006f
                boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x009d }
                if (r8 == 0) goto L_0x0059
                goto L_0x006f
            L_0x0059:
                com.amap.api.services.a.cl r7 = new com.amap.api.services.a.cl     // Catch:{ Throwable -> 0x009d }
                r7.<init>(r6, r5, r3)     // Catch:{ Throwable -> 0x009d }
                com.amap.api.services.a.ck r3 = new com.amap.api.services.a.ck     // Catch:{ Throwable -> 0x009d }
                android.content.Context r5 = com.amap.api.services.a.q.f6876c     // Catch:{ Throwable -> 0x009d }
                com.amap.api.services.a.bn r4 = com.amap.api.services.a.i.a(r4)     // Catch:{ Throwable -> 0x009d }
                r3.<init>(r5, r7, r4)     // Catch:{ Throwable -> 0x009d }
                r3.a()     // Catch:{ Throwable -> 0x009d }
                goto L_0x0090
            L_0x006f:
                com.amap.api.services.a.ck r3 = new com.amap.api.services.a.ck     // Catch:{ Throwable -> 0x009d }
                android.content.Context r5 = com.amap.api.services.a.q.f6876c     // Catch:{ Throwable -> 0x009d }
                com.amap.api.services.a.bn r4 = com.amap.api.services.a.i.a(r4)     // Catch:{ Throwable -> 0x009d }
                r3.<init>(r5, r7, r4)     // Catch:{ Throwable -> 0x009d }
                r3.a()     // Catch:{ Throwable -> 0x009d }
                goto L_0x0090
            L_0x0080:
                com.amap.api.services.a.ck r3 = new com.amap.api.services.a.ck     // Catch:{ Throwable -> 0x009d }
                android.content.Context r5 = com.amap.api.services.a.q.f6876c     // Catch:{ Throwable -> 0x009d }
                com.amap.api.services.a.bn r4 = com.amap.api.services.a.i.a(r4)     // Catch:{ Throwable -> 0x009d }
                r3.<init>(r5, r7, r4)     // Catch:{ Throwable -> 0x009d }
                r3.a()     // Catch:{ Throwable -> 0x009d }
            L_0x0090:
                r1.what = r2
                com.amap.api.services.a.q r0 = com.amap.api.services.a.q.this
                com.amap.api.services.a.q$a r0 = r0.f6877d
                if (r0 == 0) goto L_0x00b6
                goto L_0x00ad
            L_0x009b:
                r0 = move-exception
                goto L_0x00bd
            L_0x009d:
                r3 = move-exception
                java.lang.String r4 = "ManifestConfig"
                com.amap.api.services.a.j.a(r3, r4, r0)     // Catch:{ all -> 0x009b }
                r1.what = r2
                com.amap.api.services.a.q r0 = com.amap.api.services.a.q.this
                com.amap.api.services.a.q$a r0 = r0.f6877d
                if (r0 == 0) goto L_0x00b6
            L_0x00ad:
                com.amap.api.services.a.q r0 = com.amap.api.services.a.q.this
                com.amap.api.services.a.q$a r0 = r0.f6877d
                r0.sendMessage(r1)
            L_0x00b6:
                r0 = 10000(0x2710, double:4.9407E-320)
                java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x00bc }
                return
            L_0x00bc:
                return
            L_0x00bd:
                r1.what = r2
                com.amap.api.services.a.q r2 = com.amap.api.services.a.q.this
                com.amap.api.services.a.q$a r2 = r2.f6877d
                if (r2 == 0) goto L_0x00d0
                com.amap.api.services.a.q r2 = com.amap.api.services.a.q.this
                com.amap.api.services.a.q$a r2 = r2.f6877d
                r2.sendMessage(r1)
            L_0x00d0:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.q.AnonymousClass1.run():void");
        }
    };

    class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        String f6880a = "handleMessage";

        public void handleMessage(Message message) {
            if (message != null && message.what == 3) {
                try {
                    r rVar = (r) message.obj;
                    if (rVar == null) {
                        rVar = new r(false, false);
                    }
                    ca.a(q.f6876c, i.a(rVar.a()));
                    q.f6874a = i.a(rVar.a());
                } catch (Throwable th) {
                    j.a(th, "ManifestConfig", this.f6880a);
                }
            }
        }

        public a(Looper looper) {
            super(looper);
        }
    }

    public static q a(Context context) {
        if (f6875b == null) {
            f6875b = new q(context);
        }
        return f6875b;
    }

    private q(Context context) {
        f6876c = context;
        f6874a = i.a(false);
        try {
            this.f6877d = new a(Looper.getMainLooper());
            this.f6878e.start();
        } catch (Throwable th) {
            j.a(th, "ManifestConfig", "ManifestConfig");
        }
    }
}
