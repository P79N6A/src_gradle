package com.umeng.message.inapp;

import android.os.Handler;
import android.os.SystemClock;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81239a = "com.umeng.message.inapp.c";

    /* renamed from: b  reason: collision with root package name */
    private final long f81240b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final long f81241c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public long f81242d;

    /* renamed from: e  reason: collision with root package name */
    private long f81243e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f81244f;
    private Handler i = new Handler() {
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r9) {
            /*
                r8 = this;
                com.umeng.message.inapp.c r0 = com.umeng.message.inapp.c.this
                monitor-enter(r0)
                int r9 = r9.what     // Catch:{ all -> 0x006e }
                r1 = 1
                if (r9 != r1) goto L_0x006c
                com.umeng.message.inapp.c r9 = com.umeng.message.inapp.c.this     // Catch:{ all -> 0x006e }
                boolean r9 = r9.f81244f     // Catch:{ all -> 0x006e }
                if (r9 == 0) goto L_0x0012
                monitor-exit(r0)     // Catch:{ all -> 0x006e }
                return
            L_0x0012:
                com.umeng.message.inapp.c r9 = com.umeng.message.inapp.c.this     // Catch:{ all -> 0x006e }
                long r2 = r9.f81242d     // Catch:{ all -> 0x006e }
                long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x006e }
                r9 = 0
                long r2 = r2 - r4
                r4 = 0
                int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r9 > 0) goto L_0x002a
                com.umeng.message.inapp.c r9 = com.umeng.message.inapp.c.this     // Catch:{ all -> 0x006e }
                r9.e()     // Catch:{ all -> 0x006e }
                goto L_0x006c
            L_0x002a:
                com.umeng.message.inapp.c r9 = com.umeng.message.inapp.c.this     // Catch:{ all -> 0x006e }
                long r6 = r9.f81241c     // Catch:{ all -> 0x006e }
                int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r9 >= 0) goto L_0x0041
                com.umeng.message.inapp.c r9 = com.umeng.message.inapp.c.this     // Catch:{ all -> 0x006e }
                r9.a((long) r2)     // Catch:{ all -> 0x006e }
                android.os.Message r9 = r8.obtainMessage(r1)     // Catch:{ all -> 0x006e }
                r8.sendMessageDelayed(r9, r2)     // Catch:{ all -> 0x006e }
                goto L_0x006c
            L_0x0041:
                long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x006e }
                com.umeng.message.inapp.c r9 = com.umeng.message.inapp.c.this     // Catch:{ all -> 0x006e }
                r9.a((long) r2)     // Catch:{ all -> 0x006e }
                com.umeng.message.inapp.c r9 = com.umeng.message.inapp.c.this     // Catch:{ all -> 0x006e }
                long r2 = r9.f81241c     // Catch:{ all -> 0x006e }
                r9 = 0
                long r6 = r6 + r2
                long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x006e }
                r9 = 0
                long r6 = r6 - r2
            L_0x0058:
                int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r9 >= 0) goto L_0x0065
                com.umeng.message.inapp.c r9 = com.umeng.message.inapp.c.this     // Catch:{ all -> 0x006e }
                long r2 = r9.f81241c     // Catch:{ all -> 0x006e }
                r9 = 0
                long r6 = r6 + r2
                goto L_0x0058
            L_0x0065:
                android.os.Message r9 = r8.obtainMessage(r1)     // Catch:{ all -> 0x006e }
                r8.sendMessageDelayed(r9, r6)     // Catch:{ all -> 0x006e }
            L_0x006c:
                monitor-exit(r0)     // Catch:{ all -> 0x006e }
                return
            L_0x006e:
                r9 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x006e }
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.inapp.c.AnonymousClass1.handleMessage(android.os.Message):void");
        }
    };

    public abstract void a(long j);

    public abstract void e();

    public final synchronized void a() {
        this.f81244f = true;
        this.i.removeMessages(1);
    }

    public final synchronized c b() {
        this.f81244f = false;
        if (this.f81240b <= 0) {
            e();
            return this;
        }
        this.f81242d = SystemClock.elapsedRealtime() + this.f81240b;
        this.i.sendMessage(this.i.obtainMessage(1));
        return this;
    }

    public final synchronized c c() {
        this.f81244f = false;
        this.f81243e = this.f81242d - SystemClock.elapsedRealtime();
        if (this.f81243e <= 0) {
            return this;
        }
        this.i.removeMessages(1);
        this.i.sendMessageAtFrontOfQueue(this.i.obtainMessage(2));
        return this;
    }

    public final synchronized c d() {
        this.f81244f = false;
        if (this.f81243e <= 0) {
            return this;
        }
        this.i.removeMessages(2);
        this.f81242d = this.f81243e + SystemClock.elapsedRealtime();
        this.i.sendMessageAtFrontOfQueue(this.i.obtainMessage(1));
        return this;
    }

    public c(long j, long j2) {
        this.f81240b = j;
        this.f81241c = j2;
    }
}
