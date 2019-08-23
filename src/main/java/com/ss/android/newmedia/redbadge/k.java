package com.ss.android.newmedia.redbadge;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class k implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30355a;

    /* renamed from: b  reason: collision with root package name */
    private Intent f30356b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f30357c = true;

    /* renamed from: d  reason: collision with root package name */
    private Context f30358d;

    public final void onServiceDisconnected(ComponentName componentName) {
        if (PatchProxy.isSupport(new Object[]{componentName}, this, f30355a, false, 18783, new Class[]{ComponentName.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{componentName}, this, f30355a, false, 18783, new Class[]{ComponentName.class}, Void.TYPE);
            return;
        }
        try {
            this.f30358d.unbindService(this);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r12, android.os.IBinder r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r12
            r10 = 1
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = f30355a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.content.ComponentName> r2 = android.content.ComponentName.class
            r6[r9] = r2
            java.lang.Class<android.os.IBinder> r2 = android.os.IBinder.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 18782(0x495e, float:2.6319E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x003d
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r12
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = f30355a
            r4 = 0
            r5 = 18782(0x495e, float:2.6319E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.content.ComponentName> r0 = android.content.ComponentName.class
            r6[r9] = r0
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x003d:
            android.os.Messenger r0 = new android.os.Messenger
            r0.<init>(r13)
            android.os.Message r1 = new android.os.Message
            r1.<init>()
            r2 = 101(0x65, float:1.42E-43)
            r1.what = r2     // Catch:{ Exception -> 0x006f, all -> 0x0064 }
            android.os.Bundle r2 = r1.getData()     // Catch:{ Exception -> 0x006f, all -> 0x0064 }
            java.lang.String r3 = "intent"
            android.content.Intent r4 = r11.f30356b     // Catch:{ Exception -> 0x006f, all -> 0x0064 }
            r2.putParcelable(r3, r4)     // Catch:{ Exception -> 0x006f, all -> 0x0064 }
            r0.send(r1)     // Catch:{ Exception -> 0x006f, all -> 0x0064 }
            boolean r0 = r11.f30357c     // Catch:{ Throwable -> 0x0063 }
            if (r0 == 0) goto L_0x0062
            android.content.Context r0 = r11.f30358d     // Catch:{ Throwable -> 0x0063 }
            r0.unbindService(r11)     // Catch:{ Throwable -> 0x0063 }
        L_0x0062:
            return
        L_0x0063:
            return
        L_0x0064:
            r0 = move-exception
            boolean r1 = r11.f30357c     // Catch:{ Throwable -> 0x006e }
            if (r1 == 0) goto L_0x006e
            android.content.Context r1 = r11.f30358d     // Catch:{ Throwable -> 0x006e }
            r1.unbindService(r11)     // Catch:{ Throwable -> 0x006e }
        L_0x006e:
            throw r0
        L_0x006f:
            boolean r0 = r11.f30357c     // Catch:{ Throwable -> 0x0079 }
            if (r0 == 0) goto L_0x0078
            android.content.Context r0 = r11.f30358d     // Catch:{ Throwable -> 0x0079 }
            r0.unbindService(r11)     // Catch:{ Throwable -> 0x0079 }
        L_0x0078:
            return
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.redbadge.k.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    k(Intent intent, boolean z, Context context) {
        this.f30356b = intent;
        this.f30358d = context;
    }
}
