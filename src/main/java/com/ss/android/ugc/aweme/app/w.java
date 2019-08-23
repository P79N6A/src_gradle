package com.ss.android.ugc.aweme.app;

import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;

public final /* synthetic */ class w implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34306a;

    /* renamed from: b  reason: collision with root package name */
    private final v f34307b;

    w(v vVar) {
        this.f34307b = vVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        com.bytedance.common.utility.Logger.debug();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0093 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f34306a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.os.Message> r3 = android.os.Message.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 22360(0x5758, float:3.1333E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f34306a
            r13 = 0
            r14 = 22360(0x5758, float:3.1333E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.os.Message> r0 = android.os.Message.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            r2 = r17
            com.ss.android.ugc.aweme.app.v r3 = r2.f34307b
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0097 }
            r10[r9] = r0     // Catch:{ Exception -> 0x0097 }
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.app.v.f2691a     // Catch:{ Exception -> 0x0097 }
            r13 = 0
            r14 = 22356(0x5754, float:3.1327E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0097 }
            java.lang.Class<android.os.Message> r4 = android.os.Message.class
            r15[r9] = r4     // Catch:{ Exception -> 0x0097 }
            java.lang.Class r16 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0097 }
            r11 = r3
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0097 }
            if (r4 == 0) goto L_0x0066
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0097 }
            r10[r9] = r0     // Catch:{ Exception -> 0x0097 }
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.app.v.f2691a     // Catch:{ Exception -> 0x0097 }
            r13 = 0
            r14 = 22356(0x5754, float:3.1327E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0097 }
            java.lang.Class<android.os.Message> r0 = android.os.Message.class
            r15[r9] = r0     // Catch:{ Exception -> 0x0097 }
            java.lang.Class r16 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0097 }
            r11 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0097 }
            goto L_0x0097
        L_0x0066:
            int r1 = r0.what     // Catch:{ Exception -> 0x0097 }
            r4 = 104(0x68, float:1.46E-43)
            if (r1 == r4) goto L_0x006d
            goto L_0x0096
        L_0x006d:
            java.lang.Object r0 = r0.obj     // Catch:{ Exception -> 0x0093 }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ Exception -> 0x0093 }
            java.lang.String r1 = "i"
            r0.optLong(r1)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r1 = "t"
            r0.optString(r1)     // Catch:{ Exception -> 0x0093 }
            java.util.List<java.lang.Object> r1 = r3.f2694d     // Catch:{ Exception -> 0x0093 }
            if (r1 != 0) goto L_0x0080
            goto L_0x0097
        L_0x0080:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0093 }
        L_0x0084:
            boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x0093 }
            if (r3 == 0) goto L_0x0097
            r1.next()     // Catch:{ Exception -> 0x0093 }
            java.lang.String r3 = "p"
            r0.optJSONObject(r3)     // Catch:{ Exception -> 0x0093 }
            goto L_0x0084
        L_0x0093:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x0097 }
        L_0x0096:
            return
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.w.handleMsg(android.os.Message):void");
    }
}
