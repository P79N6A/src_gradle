package com.ss.android.push.daemon.a;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class c extends a {

    /* renamed from: c  reason: collision with root package name */
    private IBinder f30408c;

    /* renamed from: d  reason: collision with root package name */
    private Parcel f30409d;

    private boolean c() {
        try {
            if (this.f30408c != null) {
                if (this.f30409d != null) {
                    this.f30408c.transact(14, this.f30409d, null, 0);
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void a() {
        try {
            if (!(!c() || this.f30403b == null || this.f30403b.f30412c == null)) {
                this.f30403b.f30412c.a();
            }
        } catch (Throwable unused) {
        }
    }

    private void b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityManagerNative");
            Object invoke = cls.getMethod("getDefault", new Class[0]).invoke(cls, new Object[0]);
            Field declaredField = invoke.getClass().getDeclaredField("mRemote");
            declaredField.setAccessible(true);
            this.f30408c = (IBinder) declaredField.get(invoke);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
        } catch (Exception unused2) {
        }
    }

    @SuppressLint({"Recycle"})
    private void a(Context context, String str) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context.getPackageName(), str));
        intent.setAction("start_by_daemon_action");
        intent.setFlags(32);
        this.f30409d = Parcel.obtain();
        this.f30409d.writeInterfaceToken("android.app.IActivityManager");
        this.f30409d.writeStrongBinder(null);
        intent.writeToParcel(this.f30409d, 0);
        this.f30409d.writeString(intent.resolveTypeIfNeeded(context.getContentResolver()));
        this.f30409d.writeStrongBinder(null);
        this.f30409d.writeInt(-1);
        this.f30409d.writeString(null);
        this.f30409d.writeBundle(null);
        this.f30409d.writeString(null);
        this.f30409d.writeInt(-1);
        this.f30409d.writeInt(0);
        this.f30409d.writeInt(0);
        this.f30409d.writeInt(0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|4|5|6|7|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x004b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Context r8, com.ss.android.push.daemon.b r9) {
        /*
            r7 = this;
            super.b(r8, r9)
            r7.b()     // Catch:{ Throwable -> 0x0071 }
            com.ss.android.push.daemon.b$a r0 = r9.f30410a     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r0 = r0.f30415c     // Catch:{ Throwable -> 0x0071 }
            r7.a((android.content.Context) r8, (java.lang.String) r0)     // Catch:{ Throwable -> 0x0071 }
            r7.c()     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r0 = "indicators"
            r1 = 0
            java.io.File r0 = r8.getDir(r0, r1)     // Catch:{ Throwable -> 0x004b }
            com.ss.android.push.daemon.nativ.NativeDaemonAPI r1 = new com.ss.android.push.daemon.nativ.NativeDaemonAPI     // Catch:{ Throwable -> 0x004b }
            r1.<init>(r8)     // Catch:{ Throwable -> 0x004b }
            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x004b }
            java.lang.String r3 = "indicator_d"
            r2.<init>(r0, r3)     // Catch:{ Throwable -> 0x004b }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Throwable -> 0x004b }
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x004b }
            java.lang.String r4 = "indicator_p"
            r3.<init>(r0, r4)     // Catch:{ Throwable -> 0x004b }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Throwable -> 0x004b }
            java.io.File r4 = new java.io.File     // Catch:{ Throwable -> 0x004b }
            java.lang.String r5 = "observer_d"
            r4.<init>(r0, r5)     // Catch:{ Throwable -> 0x004b }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ Throwable -> 0x004b }
            java.io.File r5 = new java.io.File     // Catch:{ Throwable -> 0x004b }
            java.lang.String r6 = "observer_p"
            r5.<init>(r0, r6)     // Catch:{ Throwable -> 0x004b }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ Throwable -> 0x004b }
            r1.doDaemon(r2, r3, r4, r0)     // Catch:{ Throwable -> 0x004b }
        L_0x004b:
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r1 = r8.getPackageName()     // Catch:{ Throwable -> 0x0071 }
            com.ss.android.push.daemon.b$a r2 = r9.f30411b     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r2 = r2.f30414b     // Catch:{ Throwable -> 0x0071 }
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x0071 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Throwable -> 0x0071 }
            r1.<init>()     // Catch:{ Throwable -> 0x0071 }
            r1.setComponent(r0)     // Catch:{ Throwable -> 0x0071 }
            r8.startService(r1)     // Catch:{ Throwable -> 0x0071 }
            if (r9 == 0) goto L_0x0070
            com.ss.android.push.daemon.b$b r0 = r9.f30412c     // Catch:{ Throwable -> 0x0071 }
            if (r0 == 0) goto L_0x0070
            r7.f30403b = r9     // Catch:{ Throwable -> 0x0071 }
            com.ss.android.push.daemon.b$b r9 = r9.f30412c     // Catch:{ Throwable -> 0x0071 }
            r9.c(r8)     // Catch:{ Throwable -> 0x0071 }
        L_0x0070:
            return
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.push.daemon.a.c.b(android.content.Context, com.ss.android.push.daemon.b):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|4|5|6|7|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x004b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r8, com.ss.android.push.daemon.b r9) {
        /*
            r7 = this;
            super.a(r8, r9)
            r7.b()     // Catch:{ Throwable -> 0x0071 }
            com.ss.android.push.daemon.b$a r0 = r9.f30411b     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r0 = r0.f30415c     // Catch:{ Throwable -> 0x0071 }
            r7.a((android.content.Context) r8, (java.lang.String) r0)     // Catch:{ Throwable -> 0x0071 }
            r7.c()     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r0 = "indicators"
            r1 = 0
            java.io.File r0 = r8.getDir(r0, r1)     // Catch:{ Throwable -> 0x004b }
            com.ss.android.push.daemon.nativ.NativeDaemonAPI r1 = new com.ss.android.push.daemon.nativ.NativeDaemonAPI     // Catch:{ Throwable -> 0x004b }
            r1.<init>(r8)     // Catch:{ Throwable -> 0x004b }
            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x004b }
            java.lang.String r3 = "indicator_p"
            r2.<init>(r0, r3)     // Catch:{ Throwable -> 0x004b }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Throwable -> 0x004b }
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x004b }
            java.lang.String r4 = "indicator_d"
            r3.<init>(r0, r4)     // Catch:{ Throwable -> 0x004b }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Throwable -> 0x004b }
            java.io.File r4 = new java.io.File     // Catch:{ Throwable -> 0x004b }
            java.lang.String r5 = "observer_p"
            r4.<init>(r0, r5)     // Catch:{ Throwable -> 0x004b }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ Throwable -> 0x004b }
            java.io.File r5 = new java.io.File     // Catch:{ Throwable -> 0x004b }
            java.lang.String r6 = "observer_d"
            r5.<init>(r0, r6)     // Catch:{ Throwable -> 0x004b }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ Throwable -> 0x004b }
            r1.doDaemon(r2, r3, r4, r0)     // Catch:{ Throwable -> 0x004b }
        L_0x004b:
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r1 = r8.getPackageName()     // Catch:{ Throwable -> 0x0071 }
            com.ss.android.push.daemon.b$a r2 = r9.f30410a     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r2 = r2.f30414b     // Catch:{ Throwable -> 0x0071 }
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x0071 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Throwable -> 0x0071 }
            r1.<init>()     // Catch:{ Throwable -> 0x0071 }
            r1.setComponent(r0)     // Catch:{ Throwable -> 0x0071 }
            r8.startService(r1)     // Catch:{ Throwable -> 0x0071 }
            if (r9 == 0) goto L_0x0070
            com.ss.android.push.daemon.b$b r0 = r9.f30412c     // Catch:{ Throwable -> 0x0071 }
            if (r0 == 0) goto L_0x0070
            r7.f30403b = r9     // Catch:{ Throwable -> 0x0071 }
            com.ss.android.push.daemon.b$b r9 = r9.f30412c     // Catch:{ Throwable -> 0x0071 }
            r9.b(r8)     // Catch:{ Throwable -> 0x0071 }
        L_0x0070:
            return
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.push.daemon.a.c.a(android.content.Context, com.ss.android.push.daemon.b):void");
    }
}
