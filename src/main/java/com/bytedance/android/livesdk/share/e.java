package com.bytedance.android.livesdk.share;

import android.app.Activity;
import com.bytedance.android.livesdkapi.depend.h.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17220a;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ae, code lost:
        if (r1.equals("weixin") != false) goto L_0x00b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.app.Activity r21, java.lang.String r22, com.bytedance.android.livesdkapi.depend.model.live.Room r23) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f17220a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r5 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = 0
            r7 = 1
            r8 = 13278(0x33de, float:1.8606E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x005a
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f17220a
            r17 = 1
            r18 = 13278(0x33de, float:1.8606E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r1 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Boolean.TYPE
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x005a:
            com.bytedance.android.livesdk.v.e r4 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.share.b r4 = r4.g()
            r5 = -1
            int r6 = r22.hashCode()
            r7 = -791575966(0xffffffffd0d18262, float:-2.81198633E10)
            if (r6 == r7) goto L_0x00a8
            r3 = 3616(0xe20, float:5.067E-42)
            if (r6 == r3) goto L_0x009e
            r3 = 108102557(0x671839d, float:4.5423756E-35)
            if (r6 == r3) goto L_0x0094
            r3 = 113011944(0x6bc6ce8, float:7.0877763E-35)
            if (r6 == r3) goto L_0x008a
            r3 = 1355475581(0x50caea7d, float:2.72349204E10)
            if (r6 == r3) goto L_0x0080
            goto L_0x00b1
        L_0x0080:
            java.lang.String r3 = "weixin_moment"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b1
            r3 = 4
            goto L_0x00b2
        L_0x008a:
            java.lang.String r3 = "weibo"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b1
            r3 = 2
            goto L_0x00b2
        L_0x0094:
            java.lang.String r3 = "qzone"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b1
            r3 = 1
            goto L_0x00b2
        L_0x009e:
            java.lang.String r3 = "qq"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b1
            r3 = 0
            goto L_0x00b2
        L_0x00a8:
            java.lang.String r6 = "weixin"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r3 = -1
        L_0x00b2:
            switch(r3) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00d4;
                case 2: goto L_0x00ca;
                case 3: goto L_0x00c0;
                case 4: goto L_0x00b6;
                default: goto L_0x00b5;
            }
        L_0x00b5:
            return r11
        L_0x00b6:
            com.bytedance.android.livesdk.j.f.a((android.content.Context) r21)
            java.lang.String r1 = "weixin_moment"
            boolean r0 = a(r0, r2, r4, r1)
            return r0
        L_0x00c0:
            com.bytedance.android.livesdk.j.f.a((android.content.Context) r21)
            java.lang.String r1 = "weixin"
            boolean r0 = a(r0, r2, r4, r1)
            return r0
        L_0x00ca:
            com.bytedance.android.livesdk.j.f.a((android.content.Context) r21)
            java.lang.String r1 = "weibo"
            boolean r0 = a(r0, r2, r4, r1)
            return r0
        L_0x00d4:
            com.bytedance.android.livesdk.j.f.a((android.content.Context) r21)
            java.lang.String r1 = "qzone"
            boolean r0 = a(r0, r2, r4, r1)
            return r0
        L_0x00de:
            com.bytedance.android.livesdk.j.f.a((android.content.Context) r21)
            java.lang.String r1 = "qq"
            boolean r0 = a(r0, r2, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.share.e.a(android.app.Activity, java.lang.String, com.bytedance.android.livesdkapi.depend.model.live.Room):boolean");
    }

    private static boolean a(Activity activity, Room room, b bVar, String str) {
        Activity activity2 = activity;
        b bVar2 = bVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, room, bVar2, str2}, null, f17220a, true, 13279, new Class[]{Activity.class, Room.class, b.class, String.class}, Boolean.TYPE)) {
            Object[] objArr = {activity2, room, bVar2, str2};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, f17220a, true, 13279, new Class[]{Activity.class, Room.class, b.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (!bVar2.a(activity2, str2)) {
            return false;
        } else {
            bVar2.a(activity2, b.a(room).a(room.getAnchorShareText()).f(str2).a());
            return true;
        }
    }
}
