package com.ss.android.message.log;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Messenger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.pushmanager.app.d;

public class LogService extends Service implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30027a;

    /* renamed from: b  reason: collision with root package name */
    private Messenger f30028b;

    /* renamed from: c  reason: collision with root package name */
    private a f30029c;

    /* renamed from: d  reason: collision with root package name */
    private HandlerThread f30030d;

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f30027a, false, 17958, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30027a, false, 17958, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        a.a();
        if (this.f30030d != null) {
            this.f30030d.quit();
        }
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f30027a, false, 17957, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30027a, false, 17957, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        try {
            d.a a2 = d.a();
            if (a2 != null) {
                a2.a(this);
            }
        } catch (Throwable unused) {
        }
        this.f30030d = new HandlerThread("LogService");
        this.f30030d.start();
        this.f30028b = new Messenger(new WeakHandler(this.f30030d.getLooper(), this));
        try {
            this.f30029c = a.a((Context) this);
        } catch (Throwable unused2) {
        }
    }

    public IBinder onBind(Intent intent) {
        if (!PatchProxy.isSupport(new Object[]{intent}, this, f30027a, false, 17956, new Class[]{Intent.class}, IBinder.class)) {
            return this.f30028b.getBinder();
        }
        return (IBinder) PatchProxy.accessDispatch(new Object[]{intent}, this, f30027a, false, 17956, new Class[]{Intent.class}, IBinder.class);
    }

    public boolean onUnbind(Intent intent) {
        if (!PatchProxy.isSupport(new Object[]{intent}, this, f30027a, false, 17955, new Class[]{Intent.class}, Boolean.TYPE)) {
            return super.onUnbind(intent);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{intent}, this, f30027a, false, 17955, new Class[]{Intent.class}, Boolean.TYPE)).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bc, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f30027a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Message> r1 = android.os.Message.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 17960(0x4628, float:2.5167E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f30027a
            r3 = 0
            r4 = 17960(0x4628, float:2.5167E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Message> r1 = android.os.Message.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            int r0 = r10.what     // Catch:{ Throwable -> 0x00bd }
            r1 = 2
            r2 = 0
            switch(r0) {
                case 0: goto L_0x0064;
                case 1: goto L_0x0039;
                default: goto L_0x0037;
            }     // Catch:{ Throwable -> 0x00bd }
        L_0x0037:
            goto L_0x00bc
        L_0x0039:
            android.os.Messenger r0 = r10.replyTo     // Catch:{ Throwable -> 0x00bd }
            if (r0 == 0) goto L_0x00bc
            android.os.Messenger r0 = r10.replyTo     // Catch:{ Throwable -> 0x00bd }
            java.lang.Object r3 = r10.obj     // Catch:{ Throwable -> 0x00bd }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ Throwable -> 0x00bd }
            java.lang.String r4 = "event_ids"
            long[] r3 = r3.getLongArray(r4)     // Catch:{ Throwable -> 0x00bd }
            if (r3 == 0) goto L_0x00bc
            com.ss.android.message.log.a r4 = r9.f30029c     // Catch:{ Throwable -> 0x00bd }
            if (r4 != 0) goto L_0x0057
            android.os.Message r1 = android.os.Message.obtain(r2, r1)     // Catch:{ Throwable -> 0x00bd }
            r0.send(r1)     // Catch:{ Throwable -> 0x00bd }
            return
        L_0x0057:
            int r0 = r3.length     // Catch:{ Throwable -> 0x00bd }
        L_0x0058:
            if (r8 >= r0) goto L_0x00bc
            r1 = r3[r8]     // Catch:{ Throwable -> 0x00bd }
            com.ss.android.message.log.a r4 = r9.f30029c     // Catch:{ Throwable -> 0x00bd }
            r4.a((long) r1)     // Catch:{ Throwable -> 0x00bd }
            int r8 = r8 + 1
            goto L_0x0058
        L_0x0064:
            android.os.Messenger r0 = r10.replyTo     // Catch:{ Throwable -> 0x00bd }
            if (r0 == 0) goto L_0x00bc
            android.os.Messenger r0 = r10.replyTo     // Catch:{ Throwable -> 0x00bd }
            java.lang.Object r3 = r10.obj     // Catch:{ Throwable -> 0x00bd }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ Throwable -> 0x00bd }
            java.lang.String r4 = "start_id"
            r5 = 0
            long r3 = r3.getLong(r4, r5)     // Catch:{ Throwable -> 0x00bd }
            com.ss.android.message.log.a r5 = r9.f30029c     // Catch:{ Throwable -> 0x00bd }
            if (r5 != 0) goto L_0x0082
            android.os.Message r1 = android.os.Message.obtain(r2, r1)     // Catch:{ Throwable -> 0x00bd }
            r0.send(r1)     // Catch:{ Throwable -> 0x00bd }
            return
        L_0x0082:
            com.ss.android.message.log.a r5 = r9.f30029c     // Catch:{ Throwable -> 0x00bd }
            r6 = 5
            org.json.JSONArray r3 = r5.a(r3, r6)     // Catch:{ Throwable -> 0x00bd }
            if (r3 != 0) goto L_0x0093
            android.os.Message r1 = android.os.Message.obtain(r2, r1)     // Catch:{ Throwable -> 0x00bd }
            r0.send(r1)     // Catch:{ Throwable -> 0x00bd }
            return
        L_0x0093:
            android.os.Message r1 = android.os.Message.obtain(r2, r8)     // Catch:{ Throwable -> 0x00bd }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Throwable -> 0x00bd }
            r2.<init>()     // Catch:{ Throwable -> 0x00bd }
            java.lang.String r4 = "events"
            java.lang.String r5 = r3.toString()     // Catch:{ Throwable -> 0x00bd }
            r2.putString(r4, r5)     // Catch:{ Throwable -> 0x00bd }
            int r3 = r3.length()     // Catch:{ Throwable -> 0x00bd }
            if (r3 < r6) goto L_0x00b1
            java.lang.String r3 = "has_more"
            r2.putBoolean(r3, r7)     // Catch:{ Throwable -> 0x00bd }
            goto L_0x00b6
        L_0x00b1:
            java.lang.String r3 = "has_more"
            r2.putBoolean(r3, r8)     // Catch:{ Throwable -> 0x00bd }
        L_0x00b6:
            r1.obj = r2     // Catch:{ Throwable -> 0x00bd }
            r0.send(r1)     // Catch:{ Throwable -> 0x00bd }
            goto L_0x00bd
        L_0x00bc:
            return
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.log.LogService.handleMsg(android.os.Message):void");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (!PatchProxy.isSupport(new Object[]{intent, Integer.valueOf(i), Integer.valueOf(i2)}, this, f30027a, false, 17959, new Class[]{Intent.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return super.onStartCommand(intent, i, i2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{intent, Integer.valueOf(i), Integer.valueOf(i2)}, this, f30027a, false, 17959, new Class[]{Intent.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
    }
}
