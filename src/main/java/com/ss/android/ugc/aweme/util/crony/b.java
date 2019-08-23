package com.ss.android.ugc.aweme.util.crony;

import com.meituan.robust.ChangeQuickRedirect;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75426a;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        if (r0.equals(com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity.f73306b) != false) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f75426a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r5 = 0
            r6 = 87831(0x15717, float:1.23077E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f75426a
            r13 = 0
            r14 = 87831(0x15717, float:1.23077E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0039:
            r2 = -1
            int r3 = r18.hashCode()
            switch(r3) {
                case -1245625446: goto L_0x009e;
                case 0: goto L_0x0094;
                case 100: goto L_0x008a;
                case 103: goto L_0x007f;
                case 117: goto L_0x0075;
                case 118: goto L_0x006b;
                case 3599307: goto L_0x0062;
                case 94746189: goto L_0x0057;
                case 688591589: goto L_0x004d;
                case 1109191185: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x00a8
        L_0x0043:
            java.lang.String r1 = "deviceId"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a8
            r1 = 3
            goto L_0x00a9
        L_0x004d:
            java.lang.String r1 = "versionCode"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a8
            r1 = 5
            goto L_0x00a9
        L_0x0057:
            java.lang.String r1 = "clear"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a8
            r1 = 9
            goto L_0x00a9
        L_0x0062:
            java.lang.String r3 = "user"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00a8
            goto L_0x00a9
        L_0x006b:
            java.lang.String r1 = "v"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a8
            r1 = 6
            goto L_0x00a9
        L_0x0075:
            java.lang.String r1 = "u"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a8
            r1 = 2
            goto L_0x00a9
        L_0x007f:
            java.lang.String r1 = "g"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a8
            r1 = 8
            goto L_0x00a9
        L_0x008a:
            java.lang.String r1 = "d"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a8
            r1 = 4
            goto L_0x00a9
        L_0x0094:
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a8
            r1 = 0
            goto L_0x00a9
        L_0x009e:
            java.lang.String r1 = "gitsha"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a8
            r1 = 7
            goto L_0x00a9
        L_0x00a8:
            r1 = -1
        L_0x00a9:
            switch(r1) {
                case 0: goto L_0x0124;
                case 1: goto L_0x010d;
                case 2: goto L_0x010d;
                case 3: goto L_0x00fa;
                case 4: goto L_0x00fa;
                case 5: goto L_0x00e3;
                case 6: goto L_0x00e3;
                case 7: goto L_0x00e0;
                case 8: goto L_0x00e0;
                case 9: goto L_0x00af;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            java.lang.String r0 = "don't support key"
            return r0
        L_0x00af:
            com.ss.android.ugc.aweme.app.r r0 = com.ss.android.ugc.aweme.app.k.h()
            java.lang.String r1 = "MainTabPreferences"
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.q.c.a(r0, r1, r9)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.clear()
            r0.apply()
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r0 = r0.getFollowGuideShown()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.a(r1)
            com.ss.android.ugc.aweme.app.r r0 = com.ss.android.ugc.aweme.app.k.h()
            java.lang.String r1 = "清除成功，建议冷起"
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.a((android.content.Context) r0, (java.lang.String) r1)
            r0.a()
            java.lang.String r0 = "OK"
            return r0
        L_0x00e0:
            java.lang.String r0 = "GitSHA: 70269d3c718"
            return r0
        L_0x00e3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UpdateVersionCode:"
            r0.<init>(r1)
            com.ss.android.ugc.aweme.app.i r1 = com.ss.android.ugc.aweme.app.i.a()
            int r1 = r1.getUpdateVersionCode()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x00fa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DeviceId:"
            r0.<init>(r1)
            java.lang.String r1 = com.ss.android.common.applog.z.a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x010d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "userID:"
            r0.<init>(r1)
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r1 = r1.getCurUserId()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0124:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UserId: "
            r0.<init>(r1)
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r1 = r1.getCurUserId()
            r0.append(r1)
            java.lang.String r1 = "\nDeviceId: "
            r0.append(r1)
            java.lang.String r1 = com.ss.android.common.applog.z.a()
            r0.append(r1)
            java.lang.String r1 = "\nUpdateVerionCode: "
            r0.append(r1)
            com.ss.android.ugc.aweme.app.i r1 = com.ss.android.ugc.aweme.app.i.a()
            int r1 = r1.getUpdateVersionCode()
            r0.append(r1)
            java.lang.String r1 = "\nGitSHA: 70269d3c718"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.util.crony.b.a(java.lang.String):java.lang.String");
    }
}
