package com.xiaomi.push;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ga;

public class gb implements ga.a {

    /* renamed from: a  reason: collision with root package name */
    private volatile long f82083a;

    /* renamed from: a  reason: collision with other field name */
    private PendingIntent f408a;

    /* renamed from: a  reason: collision with other field name */
    protected Context f409a;

    public gb(Context context) {
        this.f409a = context;
    }

    private void a(AlarmManager alarmManager, long j, PendingIntent pendingIntent) {
        Class<AlarmManager> cls = AlarmManager.class;
        try {
            cls.getMethod("setExact", new Class[]{Integer.TYPE, Long.TYPE, PendingIntent.class}).invoke(alarmManager, new Object[]{0, Long.valueOf(j), pendingIntent});
        } catch (Exception e2) {
            b.a((Throwable) e2);
        }
    }

    /* access modifiers changed from: package-private */
    public long a() {
        return (long) gw.b();
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m320a() {
        if (this.f408a != null) {
            try {
                ((AlarmManager) this.f409a.getSystemService("alarm")).cancel(this.f408a);
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f408a = null;
                b.c("unregister timer");
                this.f82083a = 0;
                throw th;
            }
            this.f408a = null;
            b.c("unregister timer");
            this.f82083a = 0;
        }
        this.f82083a = 0;
    }

    public void a(Intent intent, long j) {
        AlarmManager alarmManager = (AlarmManager) this.f409a.getSystemService("alarm");
        this.f408a = PendingIntent.getBroadcast(this.f409a, 0, intent, 0);
        if (Build.VERSION.SDK_INT >= 23) {
            au.a((Object) alarmManager, "setExactAndAllowWhileIdle", 0, Long.valueOf(j), this.f408a);
        } else if (Build.VERSION.SDK_INT >= 19) {
            a(alarmManager, j, this.f408a);
        } else {
            alarmManager.set(0, j, this.f408a);
        }
        b.c("register timer " + j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r7.f82083a < java.lang.System.currentTimeMillis()) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r8) {
        /*
            r7 = this;
            long r0 = r7.a()
            r2 = 0
            if (r8 != 0) goto L_0x000f
            long r4 = r7.f82083a
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x000f
            return
        L_0x000f:
            if (r8 == 0) goto L_0x0014
            r7.a()
        L_0x0014:
            if (r8 != 0) goto L_0x002d
            long r4 = r7.f82083a
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x001d
            goto L_0x002d
        L_0x001d:
            long r2 = r7.f82083a
            long r2 = r2 + r0
            r7.f82083a = r2
            long r2 = r7.f82083a
            long r4 = java.lang.System.currentTimeMillis()
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x003a
            goto L_0x0033
        L_0x002d:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 % r0
            long r0 = r0 - r2
        L_0x0033:
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r2
            r7.f82083a = r0
        L_0x003a:
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r0 = com.xiaomi.push.service.ap.o
            r8.<init>(r0)
            android.content.Context r0 = r7.f409a
            java.lang.String r0 = r0.getPackageName()
            r8.setPackage(r0)
            long r0 = r7.f82083a
            r7.a(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gb.a(boolean):void");
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m321a() {
        return this.f82083a != 0;
    }
}
