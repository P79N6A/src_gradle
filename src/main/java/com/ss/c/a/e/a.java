package com.ss.c.a.e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.c.a.a.b;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    private static final SparseIntArray f78378f = new SparseIntArray();
    private static final SparseArray<String> g = new SparseArray<>();
    private static final SparseArray<String> h = new SparseArray<>();
    private static final SparseArray<String> i = new SparseArray<>();

    /* renamed from: a  reason: collision with root package name */
    public final C0836a f78379a;

    /* renamed from: b  reason: collision with root package name */
    public final long f78380b;

    /* renamed from: c  reason: collision with root package name */
    public long f78381c;

    /* renamed from: d  reason: collision with root package name */
    public String f78382d = null;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f78383e = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            switch (message.what) {
                case 10001:
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - a.this.f78381c < a.this.f78380b) {
                        a.this.f78379a.a(false);
                        a.this.f78383e.sendEmptyMessageDelayed(10001, 10000);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("stallTime", Long.valueOf(currentTimeMillis - a.this.f78381c));
                    a.this.a(-1, new com.ss.c.a.a.a(-107, "Stall retry timeout", hashMap));
                    return;
                case 10002:
                    a.this.a(2, null);
                    break;
            }
        }
    };
    private long j = 10000;
    private AtomicInteger k = new AtomicInteger(0);
    private int l = 7;
    private boolean m = false;
    private long n = 0;
    private boolean o = false;
    private b p;

    /* renamed from: com.ss.c.a.e.a$a  reason: collision with other inner class name */
    public interface C0836a {
        void a();

        void a(com.ss.c.a.a.a aVar);

        void a(boolean z);

        void b();
    }

    public final int a() {
        return this.k.get();
    }

    public final void b() {
        this.k.set(0);
        this.f78381c = 0;
        this.l = 7;
        this.m = false;
        this.n = 0;
        this.o = false;
        this.f78383e.removeCallbacksAndMessages(null);
    }

    static {
        f78378f.put(-105, 0);
        f78378f.put(-100, 0);
        f78378f.put(-102, 3);
        f78378f.put(-106, 3);
        f78378f.put(-107, 3);
        f78378f.put(-104, 0);
        f78378f.put(-108, 3);
        f78378f.put(-109, 3);
        f78378f.put(-113, 3);
        f78378f.put(-114, 3);
        g.put(-499988, "media player: setting uri is null error");
        g.put(-499987, "media player: setting uri is error");
        g.put(-499986, "media player: url is not mp4 error");
        g.put(-499985, "media player: invalid data error");
        g.put(-499899, "media player: http bad request error");
        g.put(-499898, "media player: http unauthorized error");
        g.put(-499897, "media player: http forbidden error");
        g.put(-499896, "media player: http not found error");
        g.put(-499894, "media player: http other 4xx error");
        g.put(-499893, "media player: http server error");
        g.put(-499891, "media player: http content type invalid");
        g.put(251658241, "media info http redirect");
        g.put(-499799, "media player: tcp failed to resolve hostname");
        g.put(-499795, "media player: tcp send data failed");
        g.put(-499794, "media player: tcp receive data failed");
        g.put(-499793, "media player: tcp read network timeout");
        g.put(-499792, "media player: tcp write network timeout");
        h.put(-499999, "media player setting is null");
        h.put(-499997, "media player start decoder error");
        h.put(-499996, "media player open decoder error");
        h.put(-499992, "media player open outlet error");
        h.put(-499991, "media player start outputer error");
        h.put(-499990, "media player start outlet error");
        h.put(-499989, "media player open device error");
        h.put(1, "android media player unknown");
        i.put(-1, "not retry, report to application");
        i.put(1, "try next url from live info");
        i.put(2, "reset player");
        i.put(0, "try to send live info api request again");
    }

    private void b(com.ss.c.a.a.a aVar) {
        int i2 = this.l - 1;
        this.l = i2;
        if (i2 >= 0) {
            this.p.a(aVar.code, aVar.getInfoJSON());
        }
    }

    private void a(int i2) {
        if (!this.m || (this.m && System.currentTimeMillis() - this.n >= 1000)) {
            this.p.b(i2);
            this.p.a(i2);
            this.m = true;
            this.n = System.currentTimeMillis();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.c.a.a.a r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onError error="
            r0.<init>(r1)
            r0.append(r7)
            boolean r0 = r6.o
            r1 = -116(0xffffffffffffff8c, float:NaN)
            if (r0 == 0) goto L_0x0015
            int r0 = r7.code
            if (r0 != r1) goto L_0x0015
            return
        L_0x0015:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.k
            r0.incrementAndGet()
            int r0 = r7.code
            r2 = 1
            if (r0 == r1) goto L_0x0021
            r6.o = r2
        L_0x0021:
            java.util.Map r0 = r7.info
            java.util.concurrent.atomic.AtomicInteger r1 = r6.k
            int r1 = r1.get()
            r3 = 700(0x2bc, float:9.81E-43)
            r4 = 3
            if (r1 <= r3) goto L_0x0030
            r2 = -1
            goto L_0x0063
        L_0x0030:
            int r1 = r7.code
            r3 = -103(0xffffffffffffff99, float:NaN)
            if (r1 != r3) goto L_0x0062
            r1 = 0
            java.lang.String r3 = "internalCode"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ NumberFormatException -> 0x0046 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ NumberFormatException -> 0x0046 }
            int r3 = r3.intValue()     // Catch:{ NumberFormatException -> 0x0046 }
            r7.code = r3     // Catch:{ NumberFormatException -> 0x0047 }
            goto L_0x004e
        L_0x0046:
            r3 = 0
        L_0x0047:
            java.lang.String r1 = "retryError"
            java.lang.String r5 = "error while get player internal error code"
            r0.put(r1, r5)
        L_0x004e:
            android.util.SparseArray<java.lang.String> r1 = g
            int r1 = r1.indexOfKey(r3)
            if (r1 < 0) goto L_0x0062
            java.lang.String r1 = "playErrorReason"
            android.util.SparseArray<java.lang.String> r5 = g
            java.lang.Object r3 = r5.get(r3)
            r0.put(r1, r3)
            goto L_0x0063
        L_0x0062:
            r2 = 3
        L_0x0063:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.k
            int r0 = r0.get()
            if (r0 <= r4) goto L_0x0078
            java.lang.String r0 = r6.f78382d
            if (r0 == 0) goto L_0x0078
            com.ss.c.a.c.b r0 = com.ss.c.a.c.b.a()
            java.lang.String r1 = r6.f78382d
            r0.b(r1)
        L_0x0078:
            r6.a(r2, r7)
            r6.b(r7)
            int r7 = r7.code
            r6.a((int) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.c.a.e.a.a(com.ss.c.a.a.a):void");
    }

    public final void a(boolean z) {
        new StringBuilder("onStall ").append(z);
        if (z) {
            this.f78381c = System.currentTimeMillis();
            if (!this.f78383e.hasMessages(10001)) {
                this.f78383e.sendEmptyMessageDelayed(10001, 10000);
            }
            a(-115);
            return;
        }
        b();
    }

    public final void a(int i2, com.ss.c.a.a.a aVar) {
        long j2;
        new StringBuilder("handleRetryForError action=").append(i2);
        switch (i2) {
            case -1:
                this.f78379a.a(aVar);
                return;
            case 0:
                this.f78379a.a();
                return;
            case 1:
                this.f78379a.b();
                return;
            case 2:
                this.f78379a.a(false);
                return;
            case 3:
                if (!this.f78383e.hasMessages(10002)) {
                    new StringBuilder("start ").append(this.k);
                    Handler handler = this.f78383e;
                    if (this.k.get() > 3) {
                        j2 = 10000;
                    } else {
                        j2 = (long) (this.k.get() * this.k.get() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                    }
                    handler.sendEmptyMessageDelayed(10002, j2);
                    break;
                }
                break;
        }
    }

    public a(C0836a aVar, int i2, long j2, b bVar) {
        this.f78379a = aVar;
        this.f78380b = (long) (i2 * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        this.j = j2;
        this.k.set(0);
        this.p = bVar;
    }
}
