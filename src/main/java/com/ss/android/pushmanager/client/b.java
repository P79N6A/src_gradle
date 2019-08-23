package com.ss.android.pushmanager.client;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;

public final class b implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30533a;

    /* renamed from: c  reason: collision with root package name */
    static b f30534c;

    /* renamed from: b  reason: collision with root package name */
    public Messenger f30535b;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<Context> f30536d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f30537e = new WeakHandler(this);

    /* renamed from: f  reason: collision with root package name */
    private final Messenger f30538f = new Messenger(this.f30537e);
    private long g = 0;
    private ServiceConnection h = new ServiceConnection() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30539a;

        public final void onServiceDisconnected(ComponentName componentName) {
            b.this.f30535b = null;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (PatchProxy.isSupport(new Object[]{componentName, iBinder}, this, f30539a, false, 19065, new Class[]{ComponentName.class, IBinder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{componentName, iBinder}, this, f30539a, false, 19065, new Class[]{ComponentName.class, IBinder.class}, Void.TYPE);
                return;
            }
            b.this.f30535b = new Messenger(iBinder);
            b.this.b();
        }
    };

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f30533a, false, 19061, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30533a, false, 19061, new Class[0], Void.TYPE);
            return;
        }
        Logger.debug();
        if (this.f30535b != null) {
            try {
                a();
                this.f30535b = null;
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f30533a, false, 19060, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30533a, false, 19060, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (!(this.f30535b == null || this.f30536d.get() == null)) {
                ((Context) this.f30536d.get()).unbindService(this.h);
            }
        } catch (Throwable unused) {
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f30533a, false, 19059, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30533a, false, 19059, new Class[0], Void.TYPE);
        } else if (this.f30536d != null && this.f30536d.get() != null) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName((Context) this.f30536d.get(), "com.ss.android.message.log.LogService"));
                ((Context) this.f30536d.get()).bindService(intent, this.h, 1);
            } catch (Throwable unused) {
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f30533a, false, 19063, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30533a, false, 19063, new Class[0], Void.TYPE);
            return;
        }
        try {
            Message obtain = Message.obtain(null, 0);
            obtain.replyTo = this.f30538f;
            Bundle bundle = new Bundle();
            bundle.putLong("start_id", this.g);
            Logger.debug();
            obtain.obj = bundle;
            this.f30535b.send(obtain);
        } catch (Throwable unused) {
            d();
        }
    }

    private b(Context context) {
        this.f30536d = new WeakReference<>(context.getApplicationContext());
        c();
    }

    public static void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f30533a, true, 19057, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f30533a, true, 19057, new Class[]{Context.class}, Void.TYPE);
        } else if (context2 != null) {
            if (f30534c == null) {
                f30534c = new b(context2);
                return;
            }
            if (f30534c.f30535b == null) {
                f30534c.c();
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x013c */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d3 A[Catch:{ Throwable -> 0x0148 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r24) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f30533a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Message> r1 = android.os.Message.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 19062(0x4a76, float:2.6712E-41)
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f30533a
            r3 = 0
            r4 = 19062(0x4a76, float:2.6712E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Message> r1 = android.os.Message.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0148 }
            int r0 = r8.what     // Catch:{ Throwable -> 0x0148 }
            if (r0 == 0) goto L_0x0048
            r1 = 2
            if (r0 == r1) goto L_0x0041
            goto L_0x0047
        L_0x0041:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0148 }
            r23.d()     // Catch:{ Throwable -> 0x0148 }
        L_0x0047:
            return
        L_0x0048:
            com.ss.android.pushmanager.app.d$b r0 = com.ss.android.pushmanager.app.d.b()     // Catch:{ Throwable -> 0x0148 }
            if (r0 != 0) goto L_0x004f
            return
        L_0x004f:
            java.lang.Object r0 = r8.obj     // Catch:{ Throwable -> 0x0148 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ Throwable -> 0x0148 }
            java.lang.String r1 = "events"
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Throwable -> 0x0148 }
            java.lang.String r2 = "has_more"
            boolean r8 = r0.getBoolean(r2)     // Catch:{ Throwable -> 0x0148 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0148 }
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x0148 }
            if (r0 != 0) goto L_0x013f
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0148 }
            r11.<init>()     // Catch:{ Throwable -> 0x0148 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Throwable -> 0x0148 }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x0148 }
            int r1 = r0.length()     // Catch:{ Throwable -> 0x0148 }
            r2 = 0
        L_0x0077:
            r12 = 0
            if (r2 >= r1) goto L_0x00df
            org.json.JSONObject r3 = r0.optJSONObject(r2)     // Catch:{ Throwable -> 0x0148 }
            if (r3 == 0) goto L_0x00dc
            java.lang.String r4 = "category"
            java.lang.String r15 = r3.optString(r4)     // Catch:{ Throwable -> 0x0148 }
            java.lang.String r4 = "tag"
            java.lang.String r16 = r3.optString(r4)     // Catch:{ Throwable -> 0x0148 }
            java.lang.String r4 = "label"
            java.lang.String r17 = r3.optString(r4)     // Catch:{ Throwable -> 0x0148 }
            java.lang.String r4 = "value"
            long r18 = r3.optLong(r4)     // Catch:{ Throwable -> 0x0148 }
            java.lang.String r4 = "ext_value"
            long r20 = r3.optLong(r4)     // Catch:{ Throwable -> 0x0148 }
            java.lang.String r4 = "ext_json"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ Throwable -> 0x0148 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x0148 }
            if (r5 != 0) goto L_0x00b2
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x00b2 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x00b2 }
            r22 = r5
            goto L_0x00b4
        L_0x00b2:
            r22 = r12
        L_0x00b4:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0148 }
            com.ss.android.pushmanager.app.d$b r13 = com.ss.android.pushmanager.app.d.b()     // Catch:{ Throwable -> 0x0148 }
            java.lang.ref.WeakReference<android.content.Context> r4 = r7.f30536d     // Catch:{ Throwable -> 0x0148 }
            java.lang.Object r4 = r4.get()     // Catch:{ Throwable -> 0x0148 }
            r14 = r4
            android.content.Context r14 = (android.content.Context) r14     // Catch:{ Throwable -> 0x0148 }
            r13.a(r14, r15, r16, r17, r18, r20, r22)     // Catch:{ Throwable -> 0x0148 }
            java.lang.String r4 = "_id"
            long r3 = r3.optLong(r4)     // Catch:{ Throwable -> 0x0148 }
            long r5 = r7.g     // Catch:{ Throwable -> 0x0148 }
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 <= 0) goto L_0x00d5
            r7.g = r3     // Catch:{ Throwable -> 0x0148 }
        L_0x00d5:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Throwable -> 0x0148 }
            r11.add(r3)     // Catch:{ Throwable -> 0x0148 }
        L_0x00dc:
            int r2 = r2 + 1
            goto L_0x0077
        L_0x00df:
            int r0 = r11.size()     // Catch:{ Throwable -> 0x0148 }
            if (r0 <= 0) goto L_0x013f
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0148 }
            r0[r10] = r11     // Catch:{ Throwable -> 0x0148 }
            com.meituan.robust.ChangeQuickRedirect r2 = f30533a     // Catch:{ Throwable -> 0x0148 }
            r3 = 0
            r4 = 19064(0x4a78, float:2.6714E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]     // Catch:{ Throwable -> 0x0148 }
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r10] = r1     // Catch:{ Throwable -> 0x0148 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0148 }
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0148 }
            if (r0 == 0) goto L_0x0115
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0148 }
            r0[r10] = r11     // Catch:{ Throwable -> 0x0148 }
            com.meituan.robust.ChangeQuickRedirect r2 = f30533a     // Catch:{ Throwable -> 0x0148 }
            r3 = 0
            r4 = 19064(0x4a78, float:2.6714E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]     // Catch:{ Throwable -> 0x0148 }
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r10] = r1     // Catch:{ Throwable -> 0x0148 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0148 }
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0148 }
            goto L_0x013f
        L_0x0115:
            int r0 = r11.size()     // Catch:{ Throwable -> 0x0148 }
            if (r0 <= 0) goto L_0x013f
            android.os.Message r0 = android.os.Message.obtain(r12, r9)     // Catch:{ Throwable -> 0x013c }
            android.os.Messenger r1 = r7.f30538f     // Catch:{ Throwable -> 0x013c }
            r0.replyTo = r1     // Catch:{ Throwable -> 0x013c }
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ Throwable -> 0x013c }
            r1.<init>()     // Catch:{ Throwable -> 0x013c }
            java.lang.String r2 = "event_ids"
            long[] r3 = com.bytedance.common.utility.collection.ArrayUtils.toLongArray(r11)     // Catch:{ Throwable -> 0x013c }
            r1.putLongArray(r2, r3)     // Catch:{ Throwable -> 0x013c }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x013c }
            r0.obj = r1     // Catch:{ Throwable -> 0x013c }
            android.os.Messenger r1 = r7.f30535b     // Catch:{ Throwable -> 0x013c }
            r1.send(r0)     // Catch:{ Throwable -> 0x013c }
            goto L_0x013f
        L_0x013c:
            r23.d()     // Catch:{ Throwable -> 0x0148 }
        L_0x013f:
            if (r8 == 0) goto L_0x0145
            r23.b()     // Catch:{ Throwable -> 0x0148 }
            goto L_0x0148
        L_0x0145:
            r23.d()     // Catch:{ Throwable -> 0x0148 }
        L_0x0148:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.client.b.handleMsg(android.os.Message):void");
    }
}
