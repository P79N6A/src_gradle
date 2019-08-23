package com.ss.android.message;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Message;
import android.os.RemoteException;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.b.h;
import com.ss.android.message.c;
import com.ss.android.pushmanager.app.e;
import com.ss.android.pushmanager.setting.b;
import java.util.HashMap;
import java.util.Map;

public class i implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30012a;

    /* renamed from: d  reason: collision with root package name */
    public static com.ss.android.pushmanager.client.a f30013d;
    private static volatile i g;

    /* renamed from: b  reason: collision with root package name */
    public Context f30014b;

    /* renamed from: c  reason: collision with root package name */
    public b f30015c;

    /* renamed from: e  reason: collision with root package name */
    ServiceConnection f30016e = new ServiceConnection() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30018a;

        public final void onServiceDisconnected(ComponentName componentName) {
            if (PatchProxy.isSupport(new Object[]{componentName}, this, f30018a, false, 17924, new Class[]{ComponentName.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{componentName}, this, f30018a, false, 17924, new Class[]{ComponentName.class}, Void.TYPE);
                return;
            }
            Logger.debug();
            i.this.f30015c = null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00da, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e0, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e1, code lost:
            com.ss.android.message.b.h.a((java.lang.Exception) r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e4, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00e0 A[ExcHandler: RemoteException (r0v1 'e' android.os.RemoteException A[CUSTOM_DECLARE]), Splitter:B:16:0x0096] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onServiceConnected(android.content.ComponentName r21, android.os.IBinder r22) {
            /*
                r20 = this;
                r8 = r20
                r9 = r22
                r10 = 2
                java.lang.Object[] r1 = new java.lang.Object[r10]
                r11 = 0
                r1[r11] = r21
                r12 = 1
                r1[r12] = r9
                com.meituan.robust.ChangeQuickRedirect r3 = f30018a
                java.lang.Class[] r6 = new java.lang.Class[r10]
                java.lang.Class<android.content.ComponentName> r2 = android.content.ComponentName.class
                r6[r11] = r2
                java.lang.Class<android.os.IBinder> r2 = android.os.IBinder.class
                r6[r12] = r2
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 17925(0x4605, float:2.5118E-41)
                r2 = r20
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0043
                java.lang.Object[] r1 = new java.lang.Object[r10]
                r1[r11] = r21
                r1[r12] = r9
                com.meituan.robust.ChangeQuickRedirect r3 = f30018a
                r4 = 0
                r5 = 17925(0x4605, float:2.5118E-41)
                java.lang.Class[] r6 = new java.lang.Class[r10]
                java.lang.Class<android.content.ComponentName> r0 = android.content.ComponentName.class
                r6[r11] = r0
                java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
                r6[r12] = r0
                java.lang.Class r7 = java.lang.Void.TYPE
                r2 = r20
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                return
            L_0x0043:
                com.bytedance.common.utility.Logger.debug()
                com.ss.android.message.i r0 = com.ss.android.message.i.this
                java.lang.Object[] r1 = new java.lang.Object[r12]
                r1[r11] = r9
                r2 = 0
                com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.message.b.a.f29951a
                r4 = 1
                r5 = 17828(0x45a4, float:2.4982E-41)
                java.lang.Class[] r6 = new java.lang.Class[r12]
                java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
                r6[r11] = r7
                java.lang.Class<com.ss.android.message.b> r7 = com.ss.android.message.b.class
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x007c
                java.lang.Object[] r13 = new java.lang.Object[r12]
                r13[r11] = r9
                r14 = 0
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.message.b.a.f29951a
                r16 = 1
                r17 = 17828(0x45a4, float:2.4982E-41)
                java.lang.Class[] r1 = new java.lang.Class[r12]
                java.lang.Class<android.os.IBinder> r3 = android.os.IBinder.class
                r1[r11] = r3
                java.lang.Class<com.ss.android.message.b> r19 = com.ss.android.message.b.class
                r18 = r1
                java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                com.ss.android.message.b r1 = (com.ss.android.message.b) r1
                goto L_0x0094
            L_0x007c:
                if (r9 != 0) goto L_0x0080
                r1 = r2
                goto L_0x0094
            L_0x0080:
                java.lang.String r1 = "com.ss.android.message.INotifyService"
                android.os.IInterface r1 = r9.queryLocalInterface(r1)
                if (r1 == 0) goto L_0x008f
                boolean r3 = r1 instanceof com.ss.android.message.b
                if (r3 == 0) goto L_0x008f
                com.ss.android.message.b r1 = (com.ss.android.message.b) r1
                goto L_0x0094
            L_0x008f:
                com.ss.android.message.b$a$a r1 = new com.ss.android.message.b$a$a
                r1.<init>(r9)
            L_0x0094:
                r0.f30015c = r1
                com.ss.android.message.i r0 = com.ss.android.message.i.this     // Catch:{ RemoteException -> 0x00e0, Exception -> 0x00db }
                com.ss.android.message.b r0 = r0.f30015c     // Catch:{ RemoteException -> 0x00e0, Exception -> 0x00db }
                com.ss.android.message.i r1 = com.ss.android.message.i.this     // Catch:{ RemoteException -> 0x00e0, Exception -> 0x00db }
                com.ss.android.message.c$a r1 = r1.f30017f     // Catch:{ RemoteException -> 0x00e0, Exception -> 0x00db }
                r0.a(r1)     // Catch:{ RemoteException -> 0x00e0, Exception -> 0x00db }
                com.ss.android.message.i r0 = com.ss.android.message.i.this     // Catch:{ RemoteException -> 0x00e0, Exception -> 0x00db }
                java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ RemoteException -> 0x00e0, Exception -> 0x00db }
                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.message.i.f30012a     // Catch:{ RemoteException -> 0x00e0, Exception -> 0x00db }
                r15 = 0
                r16 = 17923(0x4603, float:2.5115E-41)
                java.lang.Class[] r1 = new java.lang.Class[r11]     // Catch:{ RemoteException -> 0x00e0, Exception -> 0x00db }
                java.lang.Class r18 = java.lang.Void.TYPE     // Catch:{ RemoteException -> 0x00e0, Exception -> 0x00db }
                r13 = r0
                r17 = r1
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ RemoteException -> 0x00e0, Exception -> 0x00db }
                if (r1 == 0) goto L_0x00c9
                java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ RemoteException -> 0x00e0, Exception -> 0x00db }
                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.message.i.f30012a     // Catch:{ RemoteException -> 0x00e0, Exception -> 0x00db }
                r15 = 0
                r16 = 17923(0x4603, float:2.5115E-41)
                java.lang.Class[] r1 = new java.lang.Class[r11]     // Catch:{ RemoteException -> 0x00e0, Exception -> 0x00db }
                java.lang.Class r18 = java.lang.Void.TYPE     // Catch:{ RemoteException -> 0x00e0, Exception -> 0x00db }
                r13 = r0
                r17 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ RemoteException -> 0x00e0, Exception -> 0x00db }
                goto L_0x00df
            L_0x00c9:
                com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x00da, RemoteException -> 0x00e0 }
                com.ss.android.message.b r1 = r0.f30015c     // Catch:{ Exception -> 0x00da, RemoteException -> 0x00e0 }
                if (r1 == 0) goto L_0x00df
                android.content.Context r1 = r0.f30014b     // Catch:{ Exception -> 0x00da, RemoteException -> 0x00e0 }
                android.content.ServiceConnection r3 = r0.f30016e     // Catch:{ Exception -> 0x00da, RemoteException -> 0x00e0 }
                r1.unbindService(r3)     // Catch:{ Exception -> 0x00da, RemoteException -> 0x00e0 }
                r0.f30015c = r2     // Catch:{ Exception -> 0x00da, RemoteException -> 0x00e0 }
                goto L_0x00df
            L_0x00da:
                return
            L_0x00db:
                r0 = move-exception
                com.ss.android.message.b.h.a((java.lang.Exception) r0)
            L_0x00df:
                return
            L_0x00e0:
                r0 = move-exception
                com.ss.android.message.b.h.a((java.lang.Exception) r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.i.AnonymousClass1.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }
    };

    /* renamed from: f  reason: collision with root package name */
    protected c.a f30017f = new c.a() {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f30020b;

        public final boolean a() throws RemoteException {
            if (PatchProxy.isSupport(new Object[0], this, f30020b, false, 17926, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f30020b, false, 17926, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (i.f30013d != null) {
                return true;
            } else {
                throw h.a(" pushapp enable is null");
            }
        }

        public final long c() throws RemoteException {
            if (PatchProxy.isSupport(new Object[0], this, f30020b, false, 17928, new Class[0], Long.TYPE)) {
                return ((Long) PatchProxy.accessDispatch(new Object[0], this, f30020b, false, 17928, new Class[0], Long.TYPE)).longValue();
            } else if (i.f30013d != null) {
                return i.f30013d.a();
            } else {
                throw h.a(" pushapp appId is null");
            }
        }

        public final String d() throws RemoteException {
            if (PatchProxy.isSupport(new Object[0], this, f30020b, false, 17929, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f30020b, false, 17929, new Class[0], String.class);
            } else if (i.f30013d != null) {
                return i.f30013d.b();
            } else {
                throw h.a(" pushapp clientId is null");
            }
        }

        public final String e() throws RemoteException {
            if (PatchProxy.isSupport(new Object[0], this, f30020b, false, 17930, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f30020b, false, 17930, new Class[0], String.class);
            } else if (i.f30013d != null) {
                return i.f30013d.c();
            } else {
                throw h.a(" pushapp devicedId is null");
            }
        }

        public final String f() throws RemoteException {
            if (PatchProxy.isSupport(new Object[0], this, f30020b, false, 17931, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f30020b, false, 17931, new Class[0], String.class);
            } else if (i.f30013d != null) {
                return i.f30013d.d();
            } else {
                throw h.a(" pushapp installId is null");
            }
        }

        public final String g() throws RemoteException {
            if (PatchProxy.isSupport(new Object[0], this, f30020b, false, 17932, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f30020b, false, 17932, new Class[0], String.class);
            } else if (i.f30013d != null) {
                return i.f30013d.e();
            } else {
                throw h.a(" pushapp package is null");
            }
        }

        public final int b() throws RemoteException {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, f30020b, false, 17927, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f30020b, false, 17927, new Class[0], Integer.TYPE)).intValue();
            } else if (i.f30013d != null) {
                if (b.a().l()) {
                    i = 1;
                }
                return i;
            } else {
                throw h.a(" pushapp push enable is null");
            }
        }
    };

    public static class a implements com.ss.android.pushmanager.client.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30022a;

        /* renamed from: d  reason: collision with root package name */
        private static volatile a f30023d;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f30024b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private Context f30025c;

        public final long a() {
            if (!PatchProxy.isSupport(new Object[0], this, f30022a, false, 17934, new Class[0], Long.TYPE)) {
                return (long) e.a().b().c();
            }
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f30022a, false, 17934, new Class[0], Long.TYPE)).longValue();
        }

        public final String b() {
            if (!PatchProxy.isSupport(new Object[0], this, f30022a, false, 17935, new Class[0], String.class)) {
                return this.f30024b.get(com.ss.android.pushmanager.i.f30566e);
            }
            return (String) PatchProxy.accessDispatch(new Object[0], this, f30022a, false, 17935, new Class[0], String.class);
        }

        public final String c() {
            if (!PatchProxy.isSupport(new Object[0], this, f30022a, false, 17936, new Class[0], String.class)) {
                return this.f30024b.get(com.ss.android.pushmanager.i.f30562a);
            }
            return (String) PatchProxy.accessDispatch(new Object[0], this, f30022a, false, 17936, new Class[0], String.class);
        }

        public final String d() {
            if (!PatchProxy.isSupport(new Object[0], this, f30022a, false, 17937, new Class[0], String.class)) {
                return this.f30024b.get(com.ss.android.pushmanager.i.f30563b);
            }
            return (String) PatchProxy.accessDispatch(new Object[0], this, f30022a, false, 17937, new Class[0], String.class);
        }

        public final String e() {
            if (!PatchProxy.isSupport(new Object[0], this, f30022a, false, 17938, new Class[0], String.class)) {
                return this.f30025c.getPackageName();
            }
            return (String) PatchProxy.accessDispatch(new Object[0], this, f30022a, false, 17938, new Class[0], String.class);
        }

        private a(Context context) {
            this.f30025c = context.getApplicationContext();
            b.a().a(this.f30024b);
        }

        public static a a(Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, null, f30022a, true, 17933, new Class[]{Context.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{context2}, null, f30022a, true, 17933, new Class[]{Context.class}, a.class);
            }
            if (f30023d == null) {
                synchronized (a.class) {
                    if (f30023d == null) {
                        f30023d = new a(context2);
                    }
                }
            }
            return f30023d;
        }
    }

    public void handleMsg(Message message) {
    }

    private i() {
    }

    public static i a() {
        if (PatchProxy.isSupport(new Object[0], null, f30012a, true, 17916, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], null, f30012a, true, 17916, new Class[0], i.class);
        }
        if (g == null) {
            synchronized (i.class) {
                if (g == null) {
                    g = new i();
                }
            }
        }
        return g;
    }

    public final boolean a(Context context, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{context, intent}, this, f30012a, false, 17921, new Class[]{Context.class, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, intent}, this, f30012a, false, 17921, new Class[]{Context.class, Intent.class}, Boolean.TYPE)).booleanValue();
        } else if (context == null || intent == null) {
            return false;
        } else {
            try {
                if (this.f30015c != null) {
                    return true;
                }
                Context applicationContext = context.getApplicationContext();
                applicationContext.startService(intent);
                return applicationContext.bindService(intent, this.f30016e, 1);
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
