package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.b.g;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdkapi.depend.h.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.f.b.c;
import com.bytedance.ies.f.b.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.Map;

public final class ab extends c<Object, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9507a;

    /* renamed from: b  reason: collision with root package name */
    Disposable f9508b;

    public final void d_() {
        if (PatchProxy.isSupport(new Object[0], this, f9507a, false, 3705, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9507a, false, 3705, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9508b != null) {
            this.f9508b.dispose();
        }
    }

    public final void a(@NonNull Object obj, @NonNull f fVar) throws Exception {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{obj, fVar2}, this, f9507a, false, 3704, new Class[]{Object.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, fVar2}, this, f9507a, false, 3704, new Class[]{Object.class, f.class}, Void.TYPE);
            return;
        }
        final Room a2 = TTLiveSDKContext.getLiveService().d().a();
        if (a2 == null) {
            d();
            return;
        }
        HashMap hashMap = new HashMap();
        g a3 = a.a().a(j.class);
        if (a3 != null) {
            hashMap.putAll(a3.a());
        }
        g a4 = a.a().a(Room.class);
        if (a3 != null) {
            hashMap.putAll(a4.a());
        }
        TTLiveSDKContext.getHostService().g().a((Activity) fVar2.f20640a, b.a(a2).a((Map<String, String>) hashMap).a(), (com.bytedance.android.livesdkapi.depend.h.a) new com.bytedance.android.livesdkapi.depend.h.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f9509a;

            public final void a(Throwable th) {
                Throwable th2 = th;
                if (PatchProxy.isSupport(new Object[]{th2}, this, f9509a, false, 3711, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th2}, this, f9509a, false, 3711, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.live.core.c.a.a("SharePanelMethod", th2);
            }

            /* JADX WARNING: Removed duplicated region for block: B:39:0x0166  */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x0168  */
            /* JADX WARNING: Removed duplicated region for block: B:41:0x016a  */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x016c  */
            /* JADX WARNING: Removed duplicated region for block: B:43:0x016e  */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x0170  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(java.lang.String r22, java.lang.String r23) {
                /*
                    r21 = this;
                    r7 = r21
                    r8 = r22
                    r9 = r23
                    r10 = 2
                    java.lang.Object[] r0 = new java.lang.Object[r10]
                    r11 = 0
                    r0[r11] = r8
                    r12 = 1
                    r0[r12] = r9
                    com.meituan.robust.ChangeQuickRedirect r2 = f9509a
                    java.lang.Class[] r5 = new java.lang.Class[r10]
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r5[r11] = r1
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r5[r12] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 3710(0xe7e, float:5.199E-42)
                    r1 = r21
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x0045
                    java.lang.Object[] r0 = new java.lang.Object[r10]
                    r0[r11] = r8
                    r0[r12] = r9
                    com.meituan.robust.ChangeQuickRedirect r2 = f9509a
                    r3 = 0
                    r4 = 3710(0xe7e, float:5.199E-42)
                    java.lang.Class[] r5 = new java.lang.Class[r10]
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r5[r11] = r1
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r5[r12] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r21
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x0045:
                    boolean r0 = com.bytedance.android.live.uikit.a.a.f()
                    r1 = 3
                    if (r0 != 0) goto L_0x01b5
                    com.bytedance.android.livesdk.browser.jsbridge.newmethods.ab r0 = com.bytedance.android.livesdk.browser.jsbridge.newmethods.ab.this
                    com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r0
                    long r2 = r2.getId()
                    com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r0
                    java.lang.String r4 = r4.getLabels()
                    r5 = 4
                    java.lang.Object[] r13 = new java.lang.Object[r5]
                    java.lang.Long r6 = new java.lang.Long
                    r6.<init>(r2)
                    r13[r11] = r6
                    r13[r12] = r8
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
                    r13[r10] = r6
                    r13[r1] = r4
                    com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.browser.jsbridge.newmethods.ab.f9507a
                    r16 = 0
                    r17 = 3706(0xe7a, float:5.193E-42)
                    java.lang.Class[] r6 = new java.lang.Class[r5]
                    java.lang.Class r14 = java.lang.Long.TYPE
                    r6[r11] = r14
                    java.lang.Class<java.lang.String> r14 = java.lang.String.class
                    r6[r12] = r14
                    java.lang.Class r14 = java.lang.Integer.TYPE
                    r6[r10] = r14
                    java.lang.Class<java.lang.String> r14 = java.lang.String.class
                    r6[r1] = r14
                    java.lang.Class r19 = java.lang.Void.TYPE
                    r14 = r0
                    r18 = r6
                    boolean r6 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                    if (r6 == 0) goto L_0x00c6
                    java.lang.Object[] r13 = new java.lang.Object[r5]
                    java.lang.Long r6 = new java.lang.Long
                    r6.<init>(r2)
                    r13[r11] = r6
                    r13[r12] = r8
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
                    r13[r10] = r2
                    r13[r1] = r4
                    com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.browser.jsbridge.newmethods.ab.f9507a
                    r16 = 0
                    r17 = 3706(0xe7a, float:5.193E-42)
                    java.lang.Class[] r2 = new java.lang.Class[r5]
                    java.lang.Class r3 = java.lang.Long.TYPE
                    r2[r11] = r3
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    r2[r12] = r3
                    java.lang.Class r3 = java.lang.Integer.TYPE
                    r2[r10] = r3
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    r2[r1] = r3
                    java.lang.Class r19 = java.lang.Void.TYPE
                    r14 = r0
                    r18 = r2
                    com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                    goto L_0x01b5
                L_0x00c6:
                    com.bytedance.android.livesdk.utils.o r6 = new com.bytedance.android.livesdk.utils.o
                    r6.<init>()
                    java.lang.String r15 = "target_id"
                    java.lang.Object[] r13 = new java.lang.Object[r12]
                    r13[r11] = r8
                    com.meituan.robust.ChangeQuickRedirect r16 = com.bytedance.android.livesdk.browser.jsbridge.newmethods.ab.f9507a
                    r17 = 0
                    r18 = 3707(0xe7b, float:5.195E-42)
                    java.lang.Class[] r14 = new java.lang.Class[r12]
                    java.lang.Class<java.lang.String> r19 = java.lang.String.class
                    r14[r11] = r19
                    java.lang.Class r19 = java.lang.Integer.TYPE
                    r20 = r14
                    r14 = r0
                    r5 = r15
                    r15 = r16
                    r16 = r17
                    r17 = r18
                    r18 = r20
                    boolean r13 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                    r14 = -1
                    if (r13 == 0) goto L_0x0113
                    java.lang.Object[] r13 = new java.lang.Object[r12]
                    r13[r11] = r8
                    com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.browser.jsbridge.newmethods.ab.f9507a
                    r16 = 0
                    r17 = 3707(0xe7b, float:5.195E-42)
                    java.lang.Class[] r14 = new java.lang.Class[r12]
                    java.lang.Class<java.lang.String> r18 = java.lang.String.class
                    r14[r11] = r18
                    java.lang.Class r19 = java.lang.Integer.TYPE
                    r18 = r14
                    r14 = r0
                    java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                    java.lang.Integer r13 = (java.lang.Integer) r13
                    int r13 = r13.intValue()
                    goto L_0x0171
                L_0x0113:
                    int r13 = r22.hashCode()
                    r15 = -791575966(0xffffffffd0d18262, float:-2.81198633E10)
                    if (r13 == r15) goto L_0x0158
                    r15 = 3616(0xe20, float:5.067E-42)
                    if (r13 == r15) goto L_0x014e
                    r15 = 108102557(0x671839d, float:4.5423756E-35)
                    if (r13 == r15) goto L_0x0144
                    r15 = 113011944(0x6bc6ce8, float:7.0877763E-35)
                    if (r13 == r15) goto L_0x013a
                    r15 = 1355475581(0x50caea7d, float:2.72349204E10)
                    if (r13 == r15) goto L_0x0130
                    goto L_0x0162
                L_0x0130:
                    java.lang.String r13 = "weixin_moment"
                    boolean r13 = r8.equals(r13)
                    if (r13 == 0) goto L_0x0162
                    r13 = 3
                    goto L_0x0163
                L_0x013a:
                    java.lang.String r13 = "weibo"
                    boolean r13 = r8.equals(r13)
                    if (r13 == 0) goto L_0x0162
                    r13 = 4
                    goto L_0x0163
                L_0x0144:
                    java.lang.String r13 = "qzone"
                    boolean r13 = r8.equals(r13)
                    if (r13 == 0) goto L_0x0162
                    r13 = 1
                    goto L_0x0163
                L_0x014e:
                    java.lang.String r13 = "qq"
                    boolean r13 = r8.equals(r13)
                    if (r13 == 0) goto L_0x0162
                    r13 = 0
                    goto L_0x0163
                L_0x0158:
                    java.lang.String r13 = "weixin"
                    boolean r13 = r8.equals(r13)
                    if (r13 == 0) goto L_0x0162
                    r13 = 2
                    goto L_0x0163
                L_0x0162:
                    r13 = -1
                L_0x0163:
                    switch(r13) {
                        case 0: goto L_0x0170;
                        case 1: goto L_0x016e;
                        case 2: goto L_0x016c;
                        case 3: goto L_0x016a;
                        case 4: goto L_0x0168;
                        default: goto L_0x0166;
                    }
                L_0x0166:
                    r13 = -1
                    goto L_0x0171
                L_0x0168:
                    r13 = 5
                    goto L_0x0171
                L_0x016a:
                    r13 = 4
                    goto L_0x0171
                L_0x016c:
                    r13 = 3
                    goto L_0x0171
                L_0x016e:
                    r13 = 2
                    goto L_0x0171
                L_0x0170:
                    r13 = 1
                L_0x0171:
                    java.lang.String r13 = java.lang.String.valueOf(r13)
                    com.bytedance.android.livesdk.utils.o r5 = r6.a(r5, r13)
                    java.lang.String r6 = "share_type"
                    java.lang.String r13 = "1"
                    com.bytedance.android.livesdk.utils.o r5 = r5.a(r6, r13)
                    java.lang.String r6 = "common_label_list"
                    java.lang.String r4 = java.lang.String.valueOf(r4)
                    com.bytedance.android.livesdk.utils.o r4 = r5.a(r6, r4)
                    java.util.HashMap<java.lang.String, java.lang.String> r4 = r4.f17622b
                    com.bytedance.android.livesdk.v.f r5 = com.bytedance.android.livesdk.v.j.q()
                    com.bytedance.android.livesdk.y r5 = r5.d()
                    java.lang.Class<com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi> r6 = com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi.class
                    java.lang.Object r5 = r5.a(r6)
                    com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi r5 = (com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi) r5
                    io.reactivex.Observable r2 = r5.sendShare(r2, r4)
                    com.bytedance.android.live.core.rxutils.g r3 = com.bytedance.android.live.core.rxutils.i.a()
                    io.reactivex.Observable r2 = r2.compose(r3)
                    io.reactivex.functions.Consumer r3 = com.bytedance.android.livesdk.browser.jsbridge.newmethods.ac.f9513b
                    io.reactivex.functions.Consumer r4 = com.bytedance.android.live.core.rxutils.i.b()
                    io.reactivex.disposables.Disposable r2 = r2.subscribe(r3, r4)
                    r0.f9508b = r2
                L_0x01b5:
                    com.bytedance.android.livesdk.browser.jsbridge.newmethods.ab r0 = com.bytedance.android.livesdk.browser.jsbridge.newmethods.ab.this
                    com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r0
                    java.lang.Object[] r13 = new java.lang.Object[r1]
                    r13[r11] = r2
                    r13[r12] = r8
                    r13[r10] = r9
                    com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.browser.jsbridge.newmethods.ab.f9507a
                    r16 = 0
                    r17 = 3708(0xe7c, float:5.196E-42)
                    java.lang.Class[] r3 = new java.lang.Class[r1]
                    java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r4 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
                    r3[r11] = r4
                    java.lang.Class<java.lang.String> r4 = java.lang.String.class
                    r3[r12] = r4
                    java.lang.Class<java.lang.String> r4 = java.lang.String.class
                    r3[r10] = r4
                    java.lang.Class r19 = java.lang.Void.TYPE
                    r14 = r0
                    r18 = r3
                    boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                    if (r3 == 0) goto L_0x0205
                    java.lang.Object[] r13 = new java.lang.Object[r1]
                    r13[r11] = r2
                    r13[r12] = r8
                    r13[r10] = r9
                    com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.browser.jsbridge.newmethods.ab.f9507a
                    r16 = 0
                    r17 = 3708(0xe7c, float:5.196E-42)
                    java.lang.Class[] r1 = new java.lang.Class[r1]
                    java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r2 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
                    r1[r11] = r2
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r1[r12] = r2
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r1[r10] = r2
                    java.lang.Class r19 = java.lang.Void.TYPE
                    r14 = r0
                    r18 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                    return
                L_0x0205:
                    if (r2 == 0) goto L_0x025f
                    java.util.HashMap r0 = new java.util.HashMap
                    r0.<init>()
                    java.lang.String r1 = "share_platform"
                    r0.put(r1, r8)
                    java.lang.String r1 = "is_pyramid_sale"
                    java.lang.String r3 = "0"
                    r0.put(r1, r3)
                    java.lang.String r1 = "share_type"
                    r0.put(r1, r9)
                    java.lang.String r1 = "log_pb"
                    java.lang.String r3 = r2.getLog_pb()
                    r0.put(r1, r3)
                    boolean r1 = com.bytedance.android.live.uikit.a.a.f()
                    if (r1 == 0) goto L_0x0243
                    java.lang.String r1 = "share_platform"
                    r0.put(r1, r8)
                    java.lang.String r1 = "share_type"
                    r0.put(r1, r9)
                    java.lang.String r1 = "orientation"
                    int r2 = r2.getOrientation()
                    java.lang.String r2 = java.lang.String.valueOf(r2)
                    r0.put(r1, r2)
                L_0x0243:
                    com.bytedance.android.livesdk.j.a r1 = com.bytedance.android.livesdk.j.a.a()
                    java.lang.String r2 = "share"
                    java.lang.Object[] r3 = new java.lang.Object[r10]
                    com.bytedance.android.livesdk.j.c.j r4 = new com.bytedance.android.livesdk.j.c.j
                    r4.<init>()
                    java.lang.String r5 = "click"
                    com.bytedance.android.livesdk.j.c.j r4 = r4.g(r5)
                    r3[r11] = r4
                    java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r4 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
                    r3[r12] = r4
                    r1.a(r2, r0, r3)
                L_0x025f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ab.AnonymousClass1.a(java.lang.String, java.lang.String):void");
            }
        });
    }
}
