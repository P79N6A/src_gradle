package com.ss.android.ugc.aweme.app.constants;

import com.meituan.robust.ChangeQuickRedirect;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34104a;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(@android.support.annotation.Nullable java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f34104a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Integer.TYPE
            r3 = 0
            r5 = 1
            r6 = 23306(0x5b0a, float:3.2659E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f34104a
            r13 = 1
            r14 = 23306(0x5b0a, float:3.2659E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Integer.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x0039:
            boolean r2 = android.text.TextUtils.isEmpty(r17)
            r3 = -1
            if (r2 != 0) goto L_0x0124
            int r2 = r17.hashCode()
            r4 = 10
            r5 = 7
            r6 = 6
            r7 = 5
            r8 = 3
            switch(r2) {
                case -1842036323: goto L_0x00ff;
                case -1731750228: goto L_0x00f5;
                case -1271119582: goto L_0x00eb;
                case -1059192357: goto L_0x00e0;
                case -562830579: goto L_0x00d6;
                case -182649969: goto L_0x00cb;
                case -121207376: goto L_0x00c0;
                case 3135424: goto L_0x00b5;
                case 452151140: goto L_0x00aa;
                case 809483594: goto L_0x00a0;
                case 998835423: goto L_0x0094;
                case 1402633315: goto L_0x0089;
                case 1425879700: goto L_0x007d;
                case 1506116178: goto L_0x0072;
                case 1605556258: goto L_0x0066;
                case 1691937916: goto L_0x005b;
                case 1800278845: goto L_0x004f;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x0109
        L_0x004f:
            java.lang.String r2 = "hot_search_video_board"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0109
            r0 = 13
            goto L_0x010a
        L_0x005b:
            java.lang.String r2 = "homepage_hot"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0109
            r0 = 0
            goto L_0x010a
        L_0x0066:
            java.lang.String r2 = "other_following"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0109
            r0 = 16
            goto L_0x010a
        L_0x0072:
            java.lang.String r2 = "challenge_fresh"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0109
            r0 = 6
            goto L_0x010a
        L_0x007d:
            java.lang.String r2 = "search_result"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0109
            r0 = 12
            goto L_0x010a
        L_0x0089:
            java.lang.String r2 = "challenge"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0109
            r0 = 5
            goto L_0x010a
        L_0x0094:
            java.lang.String r2 = "general_search"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0109
            r0 = 11
            goto L_0x010a
        L_0x00a0:
            java.lang.String r2 = "others_homepage"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0109
            r0 = 4
            goto L_0x010a
        L_0x00aa:
            java.lang.String r2 = "poi_page"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0109
            r0 = 9
            goto L_0x010a
        L_0x00b5:
            java.lang.String r2 = "fans"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0109
            r0 = 15
            goto L_0x010a
        L_0x00c0:
            java.lang.String r2 = "discovery"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0109
            r0 = 10
            goto L_0x010a
        L_0x00cb:
            java.lang.String r2 = "other_fans"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0109
            r0 = 14
            goto L_0x010a
        L_0x00d6:
            java.lang.String r2 = "personal_homepage"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0109
            r0 = 3
            goto L_0x010a
        L_0x00e0:
            java.lang.String r2 = "single_song_fresh"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0109
            r0 = 8
            goto L_0x010a
        L_0x00eb:
            java.lang.String r2 = "homepage_follow"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0109
            r0 = 2
            goto L_0x010a
        L_0x00f5:
            java.lang.String r2 = "single_song"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0109
            r0 = 7
            goto L_0x010a
        L_0x00ff:
            java.lang.String r2 = "homepage_fresh"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0109
            r0 = 1
            goto L_0x010a
        L_0x0109:
            r0 = -1
        L_0x010a:
            switch(r0) {
                case 0: goto L_0x0123;
                case 1: goto L_0x0120;
                case 2: goto L_0x011f;
                case 3: goto L_0x011e;
                case 4: goto L_0x011e;
                case 5: goto L_0x011d;
                case 6: goto L_0x011d;
                case 7: goto L_0x011c;
                case 8: goto L_0x011c;
                case 9: goto L_0x0119;
                case 10: goto L_0x0118;
                case 11: goto L_0x0115;
                case 12: goto L_0x0115;
                case 13: goto L_0x0112;
                case 14: goto L_0x010f;
                case 15: goto L_0x010f;
                case 16: goto L_0x010e;
                default: goto L_0x010d;
            }
        L_0x010d:
            goto L_0x0124
        L_0x010e:
            return r4
        L_0x010f:
            r0 = 26
            return r0
        L_0x0112:
            r0 = 24
            return r0
        L_0x0115:
            r0 = 23
            return r0
        L_0x0118:
            return r5
        L_0x0119:
            r0 = 22
            return r0
        L_0x011c:
            return r6
        L_0x011d:
            return r7
        L_0x011e:
            return r8
        L_0x011f:
            return r1
        L_0x0120:
            r0 = 21
            return r0
        L_0x0123:
            return r9
        L_0x0124:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.constants.a.a(java.lang.String):int");
    }
}
