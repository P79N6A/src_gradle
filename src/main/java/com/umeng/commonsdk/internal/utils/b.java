package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.common.ULog;

public class b {

    /* renamed from: c  reason: collision with root package name */
    private static boolean f80760c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static Context f80761d;

    /* renamed from: a  reason: collision with root package name */
    PhoneStateListener f80762a;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public TelephonyManager f80763e;

    static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final b f80765a = new b(b.f80761d);

        private a() {
        }
    }

    public synchronized boolean a() {
        return f80760c;
    }

    public synchronized void b() {
        ULog.e("BaseStationUtils", "base station registerListener");
        try {
            if (this.f80763e != null) {
                this.f80763e.listen(this.f80762a, 256);
            }
            f80760c = true;
        } catch (Throwable unused) {
        }
    }

    public synchronized void c() {
        ULog.e("BaseStationUtils", "base station unRegisterListener");
        try {
            if (this.f80763e != null) {
                this.f80763e.listen(this.f80762a, 0);
            }
            f80760c = false;
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    public String e() {
        String str;
        String str2 = null;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) f80761d.getSystemService("phone");
            if (telephonyManager == null) {
                return null;
            }
            String simOperator = telephonyManager.getSimOperator();
            if (!TextUtils.isEmpty(simOperator)) {
                if (!simOperator.equals("46000")) {
                    if (!simOperator.equals("46002")) {
                        if (simOperator.equals("46001")) {
                            str = "中国联通";
                        } else if (simOperator.equals("46003")) {
                            str = "中国电信";
                        }
                        str2 = str;
                    }
                }
                str = "中国移动";
                str2 = str;
            }
            return str2;
        } catch (Throwable unused) {
        }
    }

    private b(Context context) {
        this.f80762a = new PhoneStateListener() {
            /* JADX WARNING: Can't wrap try/catch for region: R(8:1|2|(2:7|(1:33)(2:17|(2:22|(3:27|(1:31)|32)(1:26))(1:21)))(1:6)|34|(2:36|37)|38|39|40) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0132 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onSignalStrengthsChanged(android.telephony.SignalStrength r8) {
                /*
                    r7 = this;
                    super.onSignalStrengthsChanged(r8)
                    java.lang.String r0 = "BaseStationUtils"
                    r1 = 1
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    java.lang.String r3 = "base station onSignalStrengthsChanged"
                    r4 = 0
                    r2[r4] = r3
                    com.umeng.commonsdk.statistics.common.ULog.e((java.lang.String) r0, (java.lang.Object[]) r2)
                    com.umeng.commonsdk.internal.utils.b r0 = com.umeng.commonsdk.internal.utils.b.this     // Catch:{ Exception -> 0x0138 }
                    android.content.Context r2 = com.umeng.commonsdk.internal.utils.b.f80761d     // Catch:{ Exception -> 0x0138 }
                    java.lang.String r3 = "phone"
                    java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ Exception -> 0x0138 }
                    android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch:{ Exception -> 0x0138 }
                    android.telephony.TelephonyManager unused = r0.f80763e = r2     // Catch:{ Exception -> 0x0138 }
                    java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x0138 }
                    java.lang.String r2 = " "
                    java.lang.String[] r0 = r0.split(r2)     // Catch:{ Exception -> 0x0138 }
                    r2 = 0
                    com.umeng.commonsdk.internal.utils.b r3 = com.umeng.commonsdk.internal.utils.b.this     // Catch:{ Exception -> 0x0138 }
                    android.telephony.TelephonyManager r3 = r3.f80763e     // Catch:{ Exception -> 0x0138 }
                    r5 = 9
                    if (r3 == 0) goto L_0x0058
                    com.umeng.commonsdk.internal.utils.b r3 = com.umeng.commonsdk.internal.utils.b.this     // Catch:{ Exception -> 0x0138 }
                    android.telephony.TelephonyManager r3 = r3.f80763e     // Catch:{ Exception -> 0x0138 }
                    int r3 = r3.getNetworkType()     // Catch:{ Exception -> 0x0138 }
                    r6 = 13
                    if (r3 != r6) goto L_0x0058
                    r8 = r0[r5]     // Catch:{ Exception -> 0x0138 }
                    int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0138 }
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
                    r0.<init>()     // Catch:{ Exception -> 0x0138 }
                    r0.append(r8)     // Catch:{ Exception -> 0x0138 }
                    java.lang.String r8 = r0.toString()     // Catch:{ Exception -> 0x0138 }
                    goto L_0x00ff
                L_0x0058:
                    com.umeng.commonsdk.internal.utils.b r0 = com.umeng.commonsdk.internal.utils.b.this     // Catch:{ Exception -> 0x0138 }
                    android.telephony.TelephonyManager r0 = r0.f80763e     // Catch:{ Exception -> 0x0138 }
                    if (r0 == 0) goto L_0x00eb
                    com.umeng.commonsdk.internal.utils.b r0 = com.umeng.commonsdk.internal.utils.b.this     // Catch:{ Exception -> 0x0138 }
                    android.telephony.TelephonyManager r0 = r0.f80763e     // Catch:{ Exception -> 0x0138 }
                    int r0 = r0.getNetworkType()     // Catch:{ Exception -> 0x0138 }
                    r3 = 8
                    if (r0 == r3) goto L_0x0095
                    com.umeng.commonsdk.internal.utils.b r0 = com.umeng.commonsdk.internal.utils.b.this     // Catch:{ Exception -> 0x0138 }
                    android.telephony.TelephonyManager r0 = r0.f80763e     // Catch:{ Exception -> 0x0138 }
                    int r0 = r0.getNetworkType()     // Catch:{ Exception -> 0x0138 }
                    r3 = 10
                    if (r0 == r3) goto L_0x0095
                    com.umeng.commonsdk.internal.utils.b r0 = com.umeng.commonsdk.internal.utils.b.this     // Catch:{ Exception -> 0x0138 }
                    android.telephony.TelephonyManager r0 = r0.f80763e     // Catch:{ Exception -> 0x0138 }
                    int r0 = r0.getNetworkType()     // Catch:{ Exception -> 0x0138 }
                    if (r0 == r5) goto L_0x0095
                    com.umeng.commonsdk.internal.utils.b r0 = com.umeng.commonsdk.internal.utils.b.this     // Catch:{ Exception -> 0x0138 }
                    android.telephony.TelephonyManager r0 = r0.f80763e     // Catch:{ Exception -> 0x0138 }
                    int r0 = r0.getNetworkType()     // Catch:{ Exception -> 0x0138 }
                    r3 = 3
                    if (r0 != r3) goto L_0x00eb
                L_0x0095:
                    com.umeng.commonsdk.internal.utils.b r0 = com.umeng.commonsdk.internal.utils.b.this     // Catch:{ Exception -> 0x0138 }
                    java.lang.String r0 = r0.e()     // Catch:{ Exception -> 0x0138 }
                    boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0138 }
                    if (r3 != 0) goto L_0x00ac
                    java.lang.String r3 = "中国移动"
                    boolean r3 = r0.equals(r3)     // Catch:{ Exception -> 0x0138 }
                    if (r3 == 0) goto L_0x00ac
                    java.lang.String r8 = "0"
                    goto L_0x00ff
                L_0x00ac:
                    boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0138 }
                    if (r3 != 0) goto L_0x00cb
                    java.lang.String r3 = "中国联通"
                    boolean r3 = r0.equals(r3)     // Catch:{ Exception -> 0x0138 }
                    if (r3 == 0) goto L_0x00cb
                    int r8 = r8.getCdmaDbm()     // Catch:{ Exception -> 0x0138 }
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
                    r0.<init>()     // Catch:{ Exception -> 0x0138 }
                    r0.append(r8)     // Catch:{ Exception -> 0x0138 }
                    java.lang.String r8 = r0.toString()     // Catch:{ Exception -> 0x0138 }
                    goto L_0x00ff
                L_0x00cb:
                    boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0138 }
                    if (r3 != 0) goto L_0x00e9
                    java.lang.String r3 = "中国电信"
                    boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0138 }
                    if (r0 == 0) goto L_0x00e9
                    int r8 = r8.getEvdoDbm()     // Catch:{ Exception -> 0x0138 }
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
                    r0.<init>()     // Catch:{ Exception -> 0x0138 }
                    r0.append(r8)     // Catch:{ Exception -> 0x0138 }
                    java.lang.String r2 = r0.toString()     // Catch:{ Exception -> 0x0138 }
                L_0x00e9:
                    r8 = r2
                    goto L_0x00ff
                L_0x00eb:
                    int r8 = r8.getGsmSignalStrength()     // Catch:{ Exception -> 0x0138 }
                    int r8 = r8 * 2
                    int r8 = r8 + -113
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
                    r0.<init>()     // Catch:{ Exception -> 0x0138 }
                    r0.append(r8)     // Catch:{ Exception -> 0x0138 }
                    java.lang.String r8 = r0.toString()     // Catch:{ Exception -> 0x0138 }
                L_0x00ff:
                    java.lang.String r0 = "BaseStationUtils"
                    java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0138 }
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
                    java.lang.String r3 = "stationStrength is "
                    r2.<init>(r3)     // Catch:{ Exception -> 0x0138 }
                    r2.append(r8)     // Catch:{ Exception -> 0x0138 }
                    java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0138 }
                    r1[r4] = r2     // Catch:{ Exception -> 0x0138 }
                    com.umeng.commonsdk.statistics.common.ULog.e((java.lang.String) r0, (java.lang.Object[]) r1)     // Catch:{ Exception -> 0x0138 }
                    boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0138 }
                    if (r0 != 0) goto L_0x0132
                    android.content.Context r0 = com.umeng.commonsdk.internal.utils.b.f80761d     // Catch:{ Throwable -> 0x0132 }
                    r1 = 32772(0x8004, float:4.5923E-41)
                    android.content.Context r2 = com.umeng.commonsdk.internal.utils.b.f80761d     // Catch:{ Throwable -> 0x0132 }
                    com.umeng.commonsdk.internal.b r2 = com.umeng.commonsdk.internal.b.a(r2)     // Catch:{ Throwable -> 0x0132 }
                    com.umeng.commonsdk.internal.c r2 = r2.a()     // Catch:{ Throwable -> 0x0132 }
                    com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r0, r1, r2, r8)     // Catch:{ Throwable -> 0x0132 }
                L_0x0132:
                    com.umeng.commonsdk.internal.utils.b r8 = com.umeng.commonsdk.internal.utils.b.this     // Catch:{ Exception -> 0x0138 }
                    r8.c()     // Catch:{ Exception -> 0x0138 }
                    return
                L_0x0138:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.b.AnonymousClass1.onSignalStrengthsChanged(android.telephony.SignalStrength):void");
            }
        };
        if (context != null) {
            try {
                this.f80763e = (TelephonyManager) context.getSystemService("phone");
            } catch (Throwable unused) {
            }
        }
    }

    public static b a(Context context) {
        if (f80761d == null && context != null) {
            f80761d = context.getApplicationContext();
        }
        return a.f80765a;
    }
}
