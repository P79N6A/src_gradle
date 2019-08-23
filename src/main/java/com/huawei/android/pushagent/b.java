package com.huawei.android.pushagent;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.MessageQueue;
import android.os.PowerManager;
import com.huawei.android.pushagent.b.a;
import com.huawei.android.pushagent.utils.a.e;

public class b extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public Handler f24997a;

    /* renamed from: b  reason: collision with root package name */
    private MessageQueue f24998b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public PowerManager.WakeLock f24999c = ((PowerManager) this.f25000d.getSystemService("power")).newWakeLock(1, "eventLooper");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Context f25000d;

    final class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private com.huawei.android.pushagent.b.a f25002b;

        /* renamed from: c  reason: collision with root package name */
        private Intent f25003c;

        public a(com.huawei.android.pushagent.b.a aVar, Intent intent) {
            this.f25002b = aVar;
            this.f25003c = intent;
        }

        public final void run() {
            try {
                this.f25002b.a(b.this.f25000d, this.f25003c);
            } catch (Exception e2) {
                e.c("PushLogAC2815", "ReceiverDispatcher: call Receiver:" + this.f25002b.getClass().getSimpleName() + ", intent:" + this.f25003c + " failed:" + e2.toString(), e2);
            }
        }
    }

    public b(Context context) {
        super("ReceiverDispatcher");
        this.f25000d = context;
    }

    public void a(a aVar, Intent intent) {
        if (this.f24997a == null) {
            e.d("PushLogAC2815", "ReceiverDispatcher: the handler is null");
            PushService.a().stopService();
            return;
        }
        try {
            if (!this.f24999c.isHeld()) {
                this.f24999c.acquire();
            }
            if (!this.f24997a.postDelayed(new a(aVar, intent), 1)) {
                e.c("PushLogAC2815", "postDelayed runnable error");
                throw new Exception("postDelayed runnable error");
            }
        } catch (Exception e2) {
            try {
                e.c("PushLogAC2815", "dispatchIntent error", e2);
                if (this.f24999c.isHeld()) {
                    e.b("PushLogAC2815", "release wakelock after dispatchIntent error");
                    this.f24999c.release();
                }
            } catch (Exception e3) {
                e.c("PushLogAC2815", "release eventLooper wakelock error", e3);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r2.f24999c.isHeld() != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r2.f24999c.isHeld() != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        r2.f24999c.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r2 = this;
            android.os.Looper.prepare()     // Catch:{ Throwable -> 0x0031 }
            android.os.Handler r0 = new android.os.Handler     // Catch:{ Throwable -> 0x0031 }
            r0.<init>()     // Catch:{ Throwable -> 0x0031 }
            r2.f24997a = r0     // Catch:{ Throwable -> 0x0031 }
            android.os.MessageQueue r0 = android.os.Looper.myQueue()     // Catch:{ Throwable -> 0x0031 }
            r2.f24998b = r0     // Catch:{ Throwable -> 0x0031 }
            android.os.MessageQueue r0 = r2.f24998b     // Catch:{ Throwable -> 0x0031 }
            com.huawei.android.pushagent.c r1 = new com.huawei.android.pushagent.c     // Catch:{ Throwable -> 0x0031 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0031 }
            r0.addIdleHandler(r1)     // Catch:{ Throwable -> 0x0031 }
            android.os.Looper.loop()     // Catch:{ Throwable -> 0x0031 }
            android.os.PowerManager$WakeLock r0 = r2.f24999c
            if (r0 == 0) goto L_0x0048
            android.os.PowerManager$WakeLock r0 = r2.f24999c
            boolean r0 = r0.isHeld()
            if (r0 == 0) goto L_0x0048
        L_0x0029:
            android.os.PowerManager$WakeLock r0 = r2.f24999c
            r0.release()
            return
        L_0x002f:
            r0 = move-exception
            goto L_0x0049
        L_0x0031:
            r0 = move-exception
            java.lang.String r1 = "PushLogAC2815"
            java.lang.String r0 = com.huawei.android.pushagent.utils.a.e.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x002f }
            com.huawei.android.pushagent.utils.a.e.d(r1, r0)     // Catch:{ all -> 0x002f }
            android.os.PowerManager$WakeLock r0 = r2.f24999c
            if (r0 == 0) goto L_0x0048
            android.os.PowerManager$WakeLock r0 = r2.f24999c
            boolean r0 = r0.isHeld()
            if (r0 == 0) goto L_0x0048
            goto L_0x0029
        L_0x0048:
            return
        L_0x0049:
            android.os.PowerManager$WakeLock r1 = r2.f24999c
            if (r1 == 0) goto L_0x005a
            android.os.PowerManager$WakeLock r1 = r2.f24999c
            boolean r1 = r1.isHeld()
            if (r1 == 0) goto L_0x005a
            android.os.PowerManager$WakeLock r1 = r2.f24999c
            r1.release()
        L_0x005a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.b.run():void");
    }
}
