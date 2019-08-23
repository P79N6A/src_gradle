package com.ss.android.ugc.aweme.audio;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.audio.g;

public final /* synthetic */ class d implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34409a;

    /* renamed from: b  reason: collision with root package name */
    private final c f34410b;

    /* renamed from: c  reason: collision with root package name */
    private final int f34411c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f34412d;

    d(c cVar, int i, boolean z) {
        this.f34410b = cVar;
        this.f34411c = i;
        this.f34412d = z;
    }

    public final void a() {
        int i;
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[0], this, f34409a, false, 23899, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34409a, false, 23899, new Class[0], Void.TYPE);
            return;
        }
        c cVar = this.f34410b;
        int i4 = this.f34411c;
        boolean z = this.f34412d;
        cVar.b(false);
        g gVar = cVar.h;
        Activity activity = cVar.f2715d;
        Object[] objArr = {activity, Integer.valueOf(i4)};
        if (PatchProxy.isSupport(objArr, gVar, g.f34417a, false, 23912, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr2 = {activity, Integer.valueOf(i4)};
            Object[] objArr3 = objArr2;
            g gVar2 = gVar;
            PatchProxy.accessDispatch(objArr3, gVar2, g.f34417a, false, 23912, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
        } else if (!gVar.f34420d) {
            gVar.f34420d = true;
            Context applicationContext = activity.getApplicationContext();
            Object[] objArr4 = {applicationContext, Integer.valueOf(i4)};
            if (PatchProxy.isSupport(objArr4, gVar, g.f34417a, false, 23913, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr5 = {applicationContext, Integer.valueOf(i4)};
                Object[] objArr6 = objArr5;
                g gVar3 = gVar;
                PatchProxy.accessDispatch(objArr6, gVar3, g.f34417a, false, 23913, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            } else if (gVar.g == null) {
                HandlerThread handlerThread = new HandlerThread("volume-timer-thread");
                handlerThread.start();
                if (i4 <= 10) {
                    i2 = 1;
                } else {
                    i2 = i4 / 10;
                }
                if (i4 <= 10) {
                    i3 = 0;
                } else {
                    i3 = i4 % 10;
                }
                i = 1;
                g.AnonymousClass1 r9 = new Handler(handlerThread.getLooper(), i3, applicationContext, i2, i4) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f34423a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ int f34424b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ Context f34425c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ int f34426d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ int f34427e;

                    /* JADX WARNING: Removed duplicated region for block: B:29:0x0080  */
                    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void handleMessage(android.os.Message r10) {
                        /*
                            r9 = this;
                            r7 = 1
                            java.lang.Object[] r0 = new java.lang.Object[r7]
                            r8 = 0
                            r0[r8] = r10
                            com.meituan.robust.ChangeQuickRedirect r2 = f34423a
                            java.lang.Class[] r5 = new java.lang.Class[r7]
                            java.lang.Class<android.os.Message> r1 = android.os.Message.class
                            r5[r8] = r1
                            java.lang.Class r6 = java.lang.Void.TYPE
                            r3 = 0
                            r4 = 23916(0x5d6c, float:3.3513E-41)
                            r1 = r9
                            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                            if (r0 == 0) goto L_0x0030
                            java.lang.Object[] r0 = new java.lang.Object[r7]
                            r0[r8] = r10
                            com.meituan.robust.ChangeQuickRedirect r2 = f34423a
                            r3 = 0
                            r4 = 23916(0x5d6c, float:3.3513E-41)
                            java.lang.Class[] r5 = new java.lang.Class[r7]
                            java.lang.Class<android.os.Message> r1 = android.os.Message.class
                            r5[r8] = r1
                            java.lang.Class r6 = java.lang.Void.TYPE
                            r1 = r9
                            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                            return
                        L_0x0030:
                            int r0 = r10.what
                            if (r0 != r7) goto L_0x009b
                            com.ss.android.ugc.aweme.audio.g r0 = com.ss.android.ugc.aweme.audio.g.this
                            boolean r0 = r0.f34420d
                            if (r0 != 0) goto L_0x003b
                            return
                        L_0x003b:
                            r9.removeMessages(r7)
                            com.ss.android.ugc.aweme.audio.g r0 = com.ss.android.ugc.aweme.audio.g.this
                            int r1 = r0.f34422f
                            int r1 = r1 + r7
                            r0.f34422f = r1
                            r0 = 10
                            if (r1 <= r0) goto L_0x004f
                            com.ss.android.ugc.aweme.audio.g r0 = com.ss.android.ugc.aweme.audio.g.this
                            r0.b()
                            return
                        L_0x004f:
                            int r1 = r9.f34424b
                            if (r1 > 0) goto L_0x0056
                            android.content.Context r0 = r9.f34425c
                            goto L_0x0070
                        L_0x0056:
                            r1 = 0
                        L_0x0057:
                            int r2 = r9.f34424b
                            if (r1 >= r2) goto L_0x0068
                            com.ss.android.ugc.aweme.audio.g r2 = com.ss.android.ugc.aweme.audio.g.this
                            int r2 = r2.f34422f
                            int r3 = 10 - r1
                            if (r2 != r3) goto L_0x0065
                            r8 = 1
                            goto L_0x0068
                        L_0x0065:
                            int r1 = r1 + 1
                            goto L_0x0057
                        L_0x0068:
                            android.content.Context r0 = r9.f34425c
                            if (r8 == 0) goto L_0x0070
                            int r1 = r9.f34426d
                            int r1 = r1 + r7
                            goto L_0x0072
                        L_0x0070:
                            int r1 = r9.f34426d
                        L_0x0072:
                            r2 = 8
                            boolean r0 = com.ss.android.ugc.aweme.audio.a.b(r0, r1, r2)
                            android.content.Context r1 = r9.f34425c
                            int r1 = com.ss.android.ugc.aweme.audio.a.b(r1)
                            if (r0 != 0) goto L_0x0086
                            com.ss.android.ugc.aweme.audio.g r0 = com.ss.android.ugc.aweme.audio.g.this
                            r0.b()
                            return
                        L_0x0086:
                            int r0 = r9.f34427e
                            if (r1 < r0) goto L_0x0090
                            com.ss.android.ugc.aweme.audio.g r0 = com.ss.android.ugc.aweme.audio.g.this
                            r0.b()
                            return
                        L_0x0090:
                            com.ss.android.ugc.aweme.audio.g r0 = com.ss.android.ugc.aweme.audio.g.this
                            boolean r0 = r0.f34420d
                            if (r0 == 0) goto L_0x009b
                            r0 = 500(0x1f4, double:2.47E-321)
                            r9.sendEmptyMessageDelayed(r7, r0)
                        L_0x009b:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.audio.g.AnonymousClass1.handleMessage(android.os.Message):void");
                    }

                    {
                        this.f34424b = r3;
                        this.f34425c = r4;
                        this.f34426d = r5;
                        this.f34427e = r6;
                    }
                };
                gVar.g = r9;
                gVar.i.a(new h(gVar));
                a.a(applicationContext, false);
                a.a(applicationContext, 0, 0);
                gVar.g.sendEmptyMessage(i);
            }
            i = 1;
            gVar.i.a(new h(gVar));
            a.a(applicationContext, false);
            a.a(applicationContext, 0, 0);
            gVar.g.sendEmptyMessage(i);
        }
        cVar.h.h = null;
        if (!z) {
            cVar.a();
        }
    }
}
