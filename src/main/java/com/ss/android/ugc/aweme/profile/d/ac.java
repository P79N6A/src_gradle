package com.ss.android.ugc.aweme.profile.d;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.a;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61374a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f61375b;

    public static String a(int i) {
        switch (i) {
            case 1:
                return "avatar";
            case 2:
                return "nick_name";
            case 3:
                return "all";
            default:
                return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0073, code lost:
        if ((r2 - ((java.lang.Long) com.ss.android.ugc.aweme.app.SharePrefCache.inst().getLastCloseUpdateDialogTime().c()).longValue()) > 86400000) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(boolean r16) {
        /*
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r16)
            r8 = 0
            r1[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f61374a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r8] = r2
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = 0
            r4 = 1
            r5 = 70049(0x111a1, float:9.816E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0041
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r16)
            r9[r8] = r1
            r10 = 0
            com.meituan.robust.ChangeQuickRedirect r11 = f61374a
            r12 = 1
            r13 = 70049(0x111a1, float:9.816E-41)
            java.lang.Class[] r14 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r14[r8] = r0
            java.lang.Class r15 = java.lang.Boolean.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0041:
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r1 = r1.getUpdateUserPosition()
            java.lang.Object r1 = r1.c()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r2 = java.lang.System.currentTimeMillis()
            if (r16 == 0) goto L_0x0076
            if (r1 != r0) goto L_0x00ae
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r1 = r1.getLastCloseUpdateDialogTime()
            java.lang.Object r1 = r1.c()
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            long r2 = r2 - r4
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ae
            goto L_0x00af
        L_0x0076:
            if (r1 != 0) goto L_0x00ae
            boolean r1 = f61375b
            if (r1 == 0) goto L_0x00ae
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r1 = r1.getLastCloseFeedUpdateDialogTime()
            java.lang.Object r1 = r1.c()
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            long r2 = r2 - r4
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r1 = r1.getUpdateUserFrequency()
            java.lang.Object r1 = r1.c()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r4 = (long) r1
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            long r4 = r4 * r6
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ae
            f61375b = r8
            goto L_0x00af
        L_0x00ae:
            r0 = 0
        L_0x00af:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.d.ac.a(boolean):boolean");
    }

    public static void a(Activity activity, a aVar, Fragment fragment, boolean z) {
        int i;
        if (PatchProxy.isSupport(new Object[]{activity, aVar, fragment, Byte.valueOf(z ? (byte) 1 : 0)}, null, f61374a, true, 70047, new Class[]{Activity.class, a.class, Fragment.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, aVar, fragment, Byte.valueOf(z)}, null, f61374a, true, 70047, new Class[]{Activity.class, a.class, Fragment.class, Boolean.TYPE}, Void.TYPE);
        } else if (!com.ss.android.g.a.a() && ((Boolean) SharePrefCache.inst().getIsEnableUpdateUserDialog().c()).booleanValue()) {
            User curUser = d.a().getCurUser();
            if (!(curUser == null || curUser.getWxTag() == 0 || !a(z))) {
                int wxTag = curUser.getWxTag();
                if (m.a().b()) {
                    i = 0;
                } else {
                    i = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                }
                ad adVar = new ad(wxTag, activity, aVar, fragment, z);
                com.ss.android.b.a.a.a.a(adVar, i);
            }
        }
    }
}
