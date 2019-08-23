package com.ss.android.common.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f27995a;

    /* renamed from: com.ss.android.common.a.a$a  reason: collision with other inner class name */
    public static class C0329a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f27996a;

        /* renamed from: b  reason: collision with root package name */
        private Context f27997b;

        /* renamed from: c  reason: collision with root package name */
        private String f27998c;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f27996a, false, 15239, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f27996a, false, 15239, new Class[0], Void.TYPE);
                return;
            }
            a.a(this.f27997b, this.f27998c);
        }

        public C0329a(Context context, String str) {
            this.f27997b = context;
            this.f27998c = str;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(19:4|5|6|7|8|(1:10)(1:11)|12|(1:14)|15|(1:17)|18|(1:20)|21|(2:23|(4:27|(2:30|28)|54|31))|32|33|34|(6:36|(1:38)(4:39|40|41|(1:45))|46|48|49|(1:51))|52) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00f5 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0112 A[Catch:{ Exception -> 0x016b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r19, java.lang.String r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f27995a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = 0
            r6 = 1
            r7 = 15236(0x3b84, float:2.135E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004a
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f27995a
            r15 = 1
            r16 = 15236(0x3b84, float:2.135E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x004a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016b }
            r2.<init>(r1)     // Catch:{ Exception -> 0x016b }
            r1 = 0
            java.lang.String r3 = "build_serial"
            java.lang.String r4 = android.os.Build.SERIAL     // Catch:{ Exception -> 0x00f5 }
            a(r2, r3, r4, r11)     // Catch:{ Exception -> 0x00f5 }
            boolean r3 = com.ss.android.d.d.d()     // Catch:{ Exception -> 0x00f5 }
            if (r3 == 0) goto L_0x0062
            java.lang.String r3 = com.ss.android.d.c.c.g()     // Catch:{ Exception -> 0x00f5 }
            goto L_0x0063
        L_0x0062:
            r3 = r1
        L_0x0063:
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00f5 }
            if (r4 == 0) goto L_0x006d
            java.lang.String r3 = com.ss.android.a.a()     // Catch:{ Exception -> 0x00f5 }
        L_0x006d:
            java.lang.String r4 = "google_aid"
            a(r2, r4, r3, r11)     // Catch:{ Exception -> 0x00f5 }
            java.util.TimeZone r3 = java.util.TimeZone.getDefault()     // Catch:{ Exception -> 0x00f5 }
            int r3 = r3.getRawOffset()     // Catch:{ Exception -> 0x00f5 }
            r4 = 3600000(0x36ee80, float:5.044674E-39)
            int r3 = r3 / r4
            r4 = -12
            if (r3 >= r4) goto L_0x0084
            r3 = -12
        L_0x0084:
            r4 = 12
            if (r3 <= r4) goto L_0x008a
            r3 = 12
        L_0x008a:
            java.lang.String r4 = "timezone"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f5 }
            r5.<init>()     // Catch:{ Exception -> 0x00f5 }
            r5.append(r3)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x00f5 }
            a(r2, r4, r3, r10)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r3 = "phone"
            java.lang.Object r3 = r0.getSystemService(r3)     // Catch:{ Exception -> 0x00f5 }
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r4 = "carrier"
            java.lang.String r5 = r3.getNetworkOperatorName()     // Catch:{ Exception -> 0x00f5 }
            a(r2, r4, r5, r11)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r4 = "mcc_mnc"
            java.lang.String r5 = r3.getNetworkOperator()     // Catch:{ Exception -> 0x00f5 }
            a(r2, r4, r5, r11)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r4 = "sim_region"
            java.lang.String r3 = r3.getSimCountryIso()     // Catch:{ Exception -> 0x00f5 }
            a(r2, r4, r3, r11)     // Catch:{ Exception -> 0x00f5 }
            boolean r3 = com.ss.android.d.a.d.e()     // Catch:{ Exception -> 0x00f5 }
            if (r3 == 0) goto L_0x00f2
            java.lang.String[] r3 = com.ss.android.d.c.c.a((android.content.Context) r19)     // Catch:{ Exception -> 0x00f5 }
            if (r3 == 0) goto L_0x00f2
            int r4 = r3.length     // Catch:{ Exception -> 0x00f5 }
            if (r4 <= 0) goto L_0x00f2
            r4 = r3[r10]     // Catch:{ Exception -> 0x00f5 }
            r5 = r4
            r4 = 1
        L_0x00d1:
            int r6 = r3.length     // Catch:{ Exception -> 0x00f5 }
            if (r4 >= r6) goto L_0x00ed
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f5 }
            r6.<init>()     // Catch:{ Exception -> 0x00f5 }
            r6.append(r5)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r5 = ","
            r6.append(r5)     // Catch:{ Exception -> 0x00f5 }
            r5 = r3[r4]     // Catch:{ Exception -> 0x00f5 }
            r6.append(r5)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x00f5 }
            int r4 = r4 + 1
            goto L_0x00d1
        L_0x00ed:
            java.lang.String r3 = "sim_serial_number"
            a(r2, r3, r5, r11)     // Catch:{ Exception -> 0x00f5 }
        L_0x00f2:
            com.ss.android.j.f.a((android.content.Context) r0, (java.lang.StringBuilder) r2)     // Catch:{ Exception -> 0x00f5 }
        L_0x00f5:
            com.ss.android.common.applog.NetUtil.appendCommonParams(r2, r11)     // Catch:{ Exception -> 0x016b }
            com.ss.android.common.applog.c r0 = com.ss.android.common.applog.c.a()     // Catch:{ Exception -> 0x016b }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x016b }
            java.lang.String r0 = r0.a((java.lang.String) r2)     // Catch:{ Exception -> 0x016b }
            com.bytedance.common.utility.NetworkClient r2 = com.bytedance.common.utility.NetworkClient.getDefault()     // Catch:{ Exception -> 0x016b }
            java.lang.String r0 = r2.get(r0, r1, r1)     // Catch:{ Exception -> 0x016b }
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x016b }
            if (r1 != 0) goto L_0x016b
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x016b }
            r1.<init>(r0)     // Catch:{ Exception -> 0x016b }
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x016b }
            r2[r10] = r1     // Catch:{ Exception -> 0x016b }
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f27995a     // Catch:{ Exception -> 0x016b }
            r5 = 1
            r6 = 15237(0x3b85, float:2.1352E-41)
            java.lang.Class[] r7 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x016b }
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            r7[r10] = r0     // Catch:{ Exception -> 0x016b }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x016b }
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x016b }
            if (r0 == 0) goto L_0x0145
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x016b }
            r2[r10] = r1     // Catch:{ Exception -> 0x016b }
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f27995a     // Catch:{ Exception -> 0x016b }
            r5 = 1
            r6 = 15237(0x3b85, float:2.1352E-41)
            java.lang.Class[] r7 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x016b }
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            r7[r10] = r0     // Catch:{ Exception -> 0x016b }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x016b }
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x016b }
            goto L_0x015c
        L_0x0145:
            java.lang.String r0 = "data"
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch:{ Exception -> 0x015c }
            if (r0 == 0) goto L_0x015c
            java.lang.String r2 = "is_activated"
            int r0 = r0.optInt(r2)     // Catch:{ Exception -> 0x015c }
            if (r0 != r11) goto L_0x015c
            com.ss.android.common.applog.c r0 = com.ss.android.common.applog.c.a()     // Catch:{ Exception -> 0x015c }
            r0.b()     // Catch:{ Exception -> 0x015c }
        L_0x015c:
            java.lang.String r0 = "success"
            java.lang.String r2 = "message"
            java.lang.String r1 = r1.optString(r2)     // Catch:{ Exception -> 0x016b }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x016b }
            if (r0 == 0) goto L_0x016b
            return r11
        L_0x016b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.a.a.a(android.content.Context, java.lang.String):boolean");
    }

    private static void a(StringBuilder sb, String str, String str2, boolean z) {
        String str3;
        StringBuilder sb2 = sb;
        if (PatchProxy.isSupport(new Object[]{sb2, str, str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f27995a, true, 15238, new Class[]{StringBuilder.class, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sb2, str, str2, Byte.valueOf(z)}, null, f27995a, true, 15238, new Class[]{StringBuilder.class, String.class, String.class, Boolean.TYPE}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (sb.toString().indexOf(63) < 0) {
                sb2.append("?");
            } else {
                sb2.append("&");
            }
            sb.append(str);
            sb2.append("=");
            if (z) {
                str3 = Uri.encode(str2);
            } else {
                str3 = str2;
            }
            sb2.append(str3);
        }
    }
}
