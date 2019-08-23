package com.ss.android.ugc.aweme.services;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.framework.services.IEventBusHelperService;

public class EventBusHelperService implements IEventBusHelperService {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void postWithParameter(java.lang.String r20, java.lang.String... r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 71372(0x116cc, float:1.00013E-40)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0047
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 0
            r16 = 71372(0x116cc, float:1.00013E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0047:
            java.lang.String r3 = "FollowStatus"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.profile.model.FollowStatus r0 = new com.ss.android.ugc.aweme.profile.model.FollowStatus
            r0.<init>()
            if (r1 == 0) goto L_0x0069
            int r3 = r1.length
            if (r3 < r2) goto L_0x0069
            r2 = r1[r10]
            r0.userId = r2
            r1 = r1[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r1.intValue()
            r0.followStatus = r1
        L_0x0069:
            com.ss.android.ugc.aweme.utils.bg.a(r0)
            return
        L_0x006d:
            java.lang.String r3 = "LiveEvent"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x008c
            if (r1 == 0) goto L_0x008c
            int r0 = r1.length
            if (r0 != r11) goto L_0x008c
            r0 = r1[r10]
            java.lang.String r1 = "2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008c
            com.ss.android.ugc.aweme.main.c.b r0 = new com.ss.android.ugc.aweme.main.c.b
            r0.<init>(r2)
            com.ss.android.ugc.aweme.utils.bg.a(r0)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.EventBusHelperService.postWithParameter(java.lang.String, java.lang.String[]):void");
    }
}
