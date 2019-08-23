package com.ss.android.newmedia.message.localpush;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public class LocalPushCacheService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30232a;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f30232a, false, 18705, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30232a, false, 18705, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        Logger.debug();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f30232a, false, 18706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30232a, false, 18706, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        Logger.debug();
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f30232a, false, 18704, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30232a, false, 18704, new Class[0], Void.TYPE);
            return;
        }
        try {
            a a2 = b.a(getApplicationContext()).a();
            if (a2 != null) {
                HashMap hashMap = new HashMap(1);
                hashMap.put("local_push_last_get_time", Long.valueOf(System.currentTimeMillis()));
                a2.a(getApplicationContext(), hashMap);
            }
        } catch (Throwable unused) {
            Logger.debug();
        }
    }

    private PowerManager.WakeLock a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f30232a, false, 18697, new Class[]{Integer.TYPE}, PowerManager.WakeLock.class)) {
            return (PowerManager.WakeLock) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f30232a, false, 18697, new Class[]{Integer.TYPE}, PowerManager.WakeLock.class);
        }
        try {
            PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, "LocalPushCacheService" + i);
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            return newWakeLock;
        } catch (Throwable unused) {
            return null;
        }
    }

    private WifiManager.WifiLock b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f30232a, false, 18698, new Class[]{Integer.TYPE}, WifiManager.WifiLock.class)) {
            return (WifiManager.WifiLock) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f30232a, false, 18698, new Class[]{Integer.TYPE}, WifiManager.WifiLock.class);
        }
        try {
            WifiManager.WifiLock createWifiLock = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock("LocalPushCacheService" + i);
            createWifiLock.setReferenceCounted(false);
            createWifiLock.acquire();
            return createWifiLock;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f30232a, false, 18703, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f30232a, false, 18703, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        try {
            AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(this, 0, new Intent(this, LocalPushCacheService.class), 0);
            if (Build.VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, j, service);
            } else {
                alarmManager.set(0, j, service);
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void a(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f30232a, false, 18700, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f30232a, false, 18700, new Class[]{d.class}, Void.TYPE);
            return;
        }
        if (dVar != null && dVar.a()) {
            try {
                AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
                for (c next : dVar.f30255b) {
                    if (next.i > System.currentTimeMillis()) {
                        Intent intent = new Intent(this, MessageScheduleReceiver.class);
                        intent.setAction("com.ss.android.newmedia.message.localpush");
                        intent.putExtra("local_push_data", next.j);
                        PendingIntent broadcast = PendingIntent.getBroadcast(this, next.f30249b, intent, 134217728);
                        Logger.debug();
                        if (Build.VERSION.SDK_INT >= 19) {
                            alarmManager.setExact(0, next.i, broadcast);
                        } else {
                            alarmManager.set(0, next.i, broadcast);
                        }
                    }
                }
            } catch (Throwable unused) {
                Logger.debug();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r20, int r21, int r22) {
        /*
            r19 = this;
            r7 = r19
            r9 = r22
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            r12 = 1
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r13 = 2
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f30232a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r3 = 0
            r4 = 18695(0x4907, float:2.6197E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0067
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f30232a
            r3 = 0
            r4 = 18695(0x4907, float:2.6197E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r19
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x0067:
            super.onStartCommand(r20, r21, r22)
            android.os.PowerManager$WakeLock r8 = r7.a((int) r9)
            android.net.wifi.WifiManager$WifiLock r14 = r7.b(r9)
            android.content.Context r0 = r19.getApplicationContext()
            com.ss.android.newmedia.message.localpush.b r0 = com.ss.android.newmedia.message.localpush.b.a(r0)
            com.ss.android.newmedia.message.localpush.a r0 = r0.a()
            r1 = 14400000(0xdbba00, double:7.1145453E-317)
            r3 = 0
            if (r0 == 0) goto L_0x00b5
            android.content.Context r5 = r19.getApplicationContext()     // Catch:{ Throwable -> 0x00ac }
            java.lang.String r6 = "ies_main_local_push_enable"
            java.lang.Boolean r15 = java.lang.Boolean.TRUE     // Catch:{ Throwable -> 0x00ac }
            java.lang.Boolean r5 = r0.a((android.content.Context) r5, (java.lang.String) r6, (java.lang.Boolean) r15)     // Catch:{ Throwable -> 0x00ac }
            boolean r5 = r5.booleanValue()     // Catch:{ Throwable -> 0x00ac }
            android.content.Context r6 = r19.getApplicationContext()     // Catch:{ Throwable -> 0x00ad }
            java.lang.String r15 = "local_push_last_get_time"
            long r15 = r0.a((android.content.Context) r6, (java.lang.String) r15, (long) r3)     // Catch:{ Throwable -> 0x00ad }
            android.content.Context r6 = r19.getApplicationContext()     // Catch:{ Throwable -> 0x00af }
            java.lang.String r3 = "local_push_get_interval"
            long r3 = r0.a((android.content.Context) r6, (java.lang.String) r3, (long) r1)     // Catch:{ Throwable -> 0x00af }
            r17 = r3
            goto L_0x00b9
        L_0x00ac:
            r5 = 1
        L_0x00ad:
            r15 = 0
        L_0x00af:
            com.bytedance.common.utility.Logger.debug()
        L_0x00b2:
            r17 = 0
            goto L_0x00b9
        L_0x00b5:
            r5 = 1
            r15 = 0
            goto L_0x00b2
        L_0x00b9:
            int r0 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bf
            r17 = r1
        L_0x00bf:
            if (r5 == 0) goto L_0x013a
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r15
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 < 0) goto L_0x012f
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0[r11] = r1
            r0[r12] = r8
            r0[r13] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = f30232a
            r3 = 0
            r4 = 18699(0x490b, float:2.6203E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<android.os.PowerManager$WakeLock> r1 = android.os.PowerManager.WakeLock.class
            r5[r12] = r1
            java.lang.Class<android.net.wifi.WifiManager$WifiLock> r1 = android.net.wifi.WifiManager.WifiLock.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x011a
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0[r11] = r1
            r0[r12] = r8
            r0[r13] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = f30232a
            r3 = 0
            r4 = 18699(0x490b, float:2.6203E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<android.os.PowerManager$WakeLock> r1 = android.os.PowerManager.WakeLock.class
            r5[r12] = r1
            java.lang.Class<android.net.wifi.WifiManager$WifiLock> r1 = android.net.wifi.WifiManager.WifiLock.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0125
        L_0x011a:
            r19.a()
            com.ss.android.newmedia.message.localpush.LocalPushCacheService$1 r0 = new com.ss.android.newmedia.message.localpush.LocalPushCacheService$1
            r0.<init>(r9, r8, r14)
            r0.start()
        L_0x0125:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r17
            r7.a((long) r0)
            goto L_0x0144
        L_0x012f:
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 + r17
            long r2 = r2 - r0
            r7.a((long) r2)
            goto L_0x0143
        L_0x013a:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r17
            r7.a((long) r0)
        L_0x0143:
            r12 = 0
        L_0x0144:
            if (r12 != 0) goto L_0x0149
            r7.a(r9, r8, r14)
        L_0x0149:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.message.localpush.LocalPushCacheService.onStartCommand(android.content.Intent, int, int):int");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0063 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r21, android.os.PowerManager.WakeLock r22, android.net.wifi.WifiManager.WifiLock r23) {
        /*
            r20 = this;
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r10 = 0
            r3[r10] = r4
            r11 = 1
            r3[r11] = r22
            r12 = 2
            r3[r12] = r23
            com.meituan.robust.ChangeQuickRedirect r5 = f30232a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r10] = r4
            java.lang.Class<android.os.PowerManager$WakeLock> r4 = android.os.PowerManager.WakeLock.class
            r8[r11] = r4
            java.lang.Class<android.net.wifi.WifiManager$WifiLock> r4 = android.net.wifi.WifiManager.WifiLock.class
            r8[r12] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 18696(0x4908, float:2.6199E-41)
            r4 = r20
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0057
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            r13[r10] = r3
            r13[r11] = r22
            r13[r12] = r23
            com.meituan.robust.ChangeQuickRedirect r15 = f30232a
            r16 = 0
            r17 = 18696(0x4908, float:2.6199E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class<android.os.PowerManager$WakeLock> r1 = android.os.PowerManager.WakeLock.class
            r0[r11] = r1
            java.lang.Class<android.net.wifi.WifiManager$WifiLock> r1 = android.net.wifi.WifiManager.WifiLock.class
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r20
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x0057:
            if (r22 == 0) goto L_0x005e
            r22.release()     // Catch:{ Throwable -> 0x005d }
            goto L_0x005e
        L_0x005d:
        L_0x005e:
            if (r23 == 0) goto L_0x0063
            r23.release()     // Catch:{ Throwable -> 0x0063 }
        L_0x0063:
            r20.stopSelf(r21)     // Catch:{ Throwable -> 0x0067 }
            return
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.message.localpush.LocalPushCacheService.a(int, android.os.PowerManager$WakeLock, android.net.wifi.WifiManager$WifiLock):void");
    }
}
