package com.ss.android.ugc.aweme.account.k;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32020a;

    @NonNull
    public static String a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, null, f32020a, true, 20900, new Class[]{Bundle.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{bundle2}, null, f32020a, true, 20900, new Class[]{Bundle.class}, String.class);
        } else if (bundle2 == null) {
            return "";
        } else {
            String string = bundle2.getString("group_id");
            if (TextUtils.isEmpty(string)) {
                string = "";
            }
            return string;
        }
    }

    @NonNull
    public static String b(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, null, f32020a, true, 20901, new Class[]{Bundle.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{bundle2}, null, f32020a, true, 20901, new Class[]{Bundle.class}, String.class);
        } else if (bundle2 == null) {
            return "";
        } else {
            String string = bundle2.getString("log_pb");
            if (TextUtils.isEmpty(string)) {
                string = "";
            }
            return string;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (r0.equals("weixin") != false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f32020a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 20899(0x51a3, float:2.9286E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f32020a
            r13 = 1
            r14 = 20899(0x51a3, float:2.9286E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0035:
            boolean r2 = android.text.TextUtils.isEmpty(r17)
            if (r2 == 0) goto L_0x003e
            java.lang.String r0 = ""
            return r0
        L_0x003e:
            r2 = -1
            int r3 = r17.hashCode()
            switch(r3) {
                case -1530308138: goto L_0x006e;
                case -1134307907: goto L_0x0064;
                case -791575966: goto L_0x005b;
                case -471473230: goto L_0x0051;
                case 635922494: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x0078
        L_0x0047:
            java.lang.String r1 = "toutiao_v2"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0078
            r1 = 4
            goto L_0x0079
        L_0x0051:
            java.lang.String r1 = "sina_weibo"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0078
            r1 = 2
            goto L_0x0079
        L_0x005b:
            java.lang.String r3 = "weixin"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0078
            goto L_0x0079
        L_0x0064:
            java.lang.String r1 = "toutiao"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0078
            r1 = 3
            goto L_0x0079
        L_0x006e:
            java.lang.String r1 = "qzone_sns"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0078
            r1 = 0
            goto L_0x0079
        L_0x0078:
            r1 = -1
        L_0x0079:
            switch(r1) {
                case 0: goto L_0x0086;
                case 1: goto L_0x0083;
                case 2: goto L_0x0080;
                case 3: goto L_0x007d;
                case 4: goto L_0x007d;
                default: goto L_0x007c;
            }
        L_0x007c:
            return r0
        L_0x007d:
            java.lang.String r0 = "toutiao"
            return r0
        L_0x0080:
            java.lang.String r0 = "weibo"
            return r0
        L_0x0083:
            java.lang.String r0 = "weixin"
            return r0
        L_0x0086:
            java.lang.String r0 = "qq"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.k.a.a(java.lang.String):java.lang.String");
    }
}
