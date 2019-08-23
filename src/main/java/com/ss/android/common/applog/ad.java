package com.ss.android.common.applog;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class ad implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28105a;

    /* renamed from: b  reason: collision with root package name */
    final Handler f28106b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f28107c;

    /* renamed from: d  reason: collision with root package name */
    private final a f28108d;

    /* renamed from: e  reason: collision with root package name */
    private long[] f28109e = new long[2];

    /* renamed from: f  reason: collision with root package name */
    private long[] f28110f = new long[2];
    private long[] g = new long[2];
    private long h;
    private long i;
    private int j;
    private long k;

    public interface a {
        void onTrafficWarning(b bVar);
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f28111a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f28112b;

        /* renamed from: c  reason: collision with root package name */
        public long f28113c;

        /* renamed from: d  reason: collision with root package name */
        public long f28114d;

        /* renamed from: e  reason: collision with root package name */
        public long f28115e;

        /* renamed from: f  reason: collision with root package name */
        public long f28116f;
        public long g;
        public boolean h;

        b() {
        }

        public String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f28111a, false, 15684, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f28111a, false, 15684, new Class[0], String.class);
            }
            return "TrafficWarningInfo (tx:: " + this.f28112b + ", cost: " + this.f28113c + ", last: " + this.f28114d + ", current:" + this.f28115e + ", lastTime:" + this.f28116f + ", initTime:" + this.g + ", isAccumulate:" + this.h + ")";
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f28105a, false, 15679, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f28105a, false, 15679, new Class[0], Void.TYPE);
            return;
        }
        this.f28106b.sendEmptyMessage(3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(long[] r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f28105a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<long[]> r3 = long[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 15683(0x3d43, float:2.1977E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f28105a
            r13 = 0
            r14 = 15683(0x3d43, float:2.1977E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<long[]> r0 = long[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            if (r0 == 0) goto L_0x0065
            int r2 = r0.length
            r3 = 2
            if (r2 >= r3) goto L_0x003b
            goto L_0x0065
        L_0x003b:
            r2 = -1
            r0[r9] = r2     // Catch:{ Throwable -> 0x0062 }
            r0[r1] = r2     // Catch:{ Throwable -> 0x0062 }
            r2 = r17
            android.content.Context r3 = r2.f28107c     // Catch:{ Throwable -> 0x0064 }
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch:{ Throwable -> 0x0064 }
            if (r3 == 0) goto L_0x0061
            int r4 = r3.uid     // Catch:{ Throwable -> 0x0064 }
            if (r4 > 0) goto L_0x0050
            goto L_0x0061
        L_0x0050:
            int r4 = r3.uid     // Catch:{ Throwable -> 0x0064 }
            long r4 = android.net.TrafficStats.getUidTxBytes(r4)     // Catch:{ Throwable -> 0x0064 }
            r0[r9] = r4     // Catch:{ Throwable -> 0x0064 }
            int r3 = r3.uid     // Catch:{ Throwable -> 0x0064 }
            long r3 = android.net.TrafficStats.getUidRxBytes(r3)     // Catch:{ Throwable -> 0x0064 }
            r0[r1] = r3     // Catch:{ Throwable -> 0x0064 }
            return
        L_0x0061:
            return
        L_0x0062:
            r2 = r17
        L_0x0064:
            return
        L_0x0065:
            r2 = r17
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.ad.a(long[]):void");
    }

    public final void handleMsg(Message message) {
        boolean z;
        boolean z2;
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f28105a, false, 15681, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f28105a, false, 15681, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        switch (message2.what) {
            case 1:
                try {
                    if (PatchProxy.isSupport(new Object[0], this, f28105a, false, 15682, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f28105a, false, 15682, new Class[0], Void.TYPE);
                        break;
                    } else {
                        long[] jArr = this.f28109e;
                        a(jArr);
                        Logger.debug();
                        this.i = System.currentTimeMillis();
                        for (int i2 = 0; i2 < 2; i2++) {
                            long j2 = jArr[i2];
                            if (j2 >= 0) {
                                if (this.f28110f[i2] >= 0) {
                                    long j3 = j2 - this.f28110f[i2];
                                    if (j3 > 5242880) {
                                        b bVar = new b();
                                        if (i2 == 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        bVar.f28112b = z2;
                                        bVar.f28113c = j3;
                                        bVar.f28114d = this.f28110f[i2];
                                        bVar.f28115e = j2;
                                        bVar.f28116f = this.i;
                                        bVar.g = this.h;
                                        bVar.h = false;
                                        if (this.f28108d != null) {
                                            this.f28108d.onTrafficWarning(bVar);
                                        }
                                    }
                                }
                                this.f28110f[i2] = j2;
                                if (this.g[i2] >= 0) {
                                    long j4 = j2 - this.g[i2];
                                    if (j4 > 20971520) {
                                        b bVar2 = new b();
                                        if (i2 == 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        bVar2.f28112b = z;
                                        bVar2.f28113c = j4;
                                        bVar2.f28114d = this.g[i2];
                                        bVar2.f28115e = j2;
                                        bVar2.f28116f = this.i;
                                        bVar2.g = this.h;
                                        bVar2.h = true;
                                        if (this.f28108d != null) {
                                            this.f28108d.onTrafficWarning(bVar2);
                                        }
                                    }
                                } else {
                                    this.g[i2] = j2;
                                }
                            }
                        }
                        if (this.j <= 0) {
                            this.j = 0;
                        }
                        if (this.k <= 0) {
                            this.k = 300000;
                        }
                        this.j++;
                        if (this.j > 0 && this.j <= 5) {
                            this.k *= 2;
                        }
                        this.f28106b.sendEmptyMessageDelayed(1, this.k);
                        return;
                    }
                } catch (Throwable unused) {
                    return;
                }
            case 2:
                this.f28106b.removeMessages(1);
                this.f28106b.removeMessages(3);
                this.j = 0;
                this.k = 300000;
                a(this.g);
                this.f28110f[0] = this.g[0];
                this.f28110f[1] = this.g[1];
                this.h = System.currentTimeMillis();
                this.i = this.h;
                this.f28106b.sendEmptyMessageDelayed(1, 300000);
                Logger.debug();
                break;
            case 3:
                this.f28106b.removeMessages(1);
                this.f28106b.removeMessages(2);
                this.j = 0;
                this.k = 0;
                return;
        }
    }

    public ad(Context context, a aVar) {
        this.f28107c = context.getApplicationContext();
        this.f28106b = new WeakHandler(Looper.getMainLooper(), this);
        this.f28108d = aVar;
    }
}
