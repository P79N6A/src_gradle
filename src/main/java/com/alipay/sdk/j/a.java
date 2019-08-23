package com.alipay.sdk.j;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    private static a f5515d;

    /* renamed from: a  reason: collision with root package name */
    public String f5516a;

    /* renamed from: b  reason: collision with root package name */
    private String f5517b;

    /* renamed from: c  reason: collision with root package name */
    private String f5518c;

    public final String b() {
        if (TextUtils.isEmpty(this.f5518c)) {
            this.f5518c = "000000000000000";
        }
        return this.f5518c;
    }

    public final String a() {
        if (TextUtils.isEmpty(this.f5517b)) {
            this.f5517b = "000000000000000";
        }
        return this.f5517b;
    }

    public static a a(Context context) {
        if (f5515d == null) {
            f5515d = new a(context);
        }
        return f5515d;
    }

    public static String d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    private void a(String str) {
        if (str != null) {
            byte[] bytes = str.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                if (bytes[i] < 48 || bytes[i] > 57) {
                    bytes[i] = 48;
                }
            }
            new String(bytes);
            str = (r1 + "000000000000000").substring(0, 15);
        }
        this.f5518c = str;
    }

    public static c b(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.getType() == 0) {
                return c.a(activeNetworkInfo.getSubtype());
            }
            if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
                return c.NONE;
            }
            return c.WIFI;
        } catch (Exception unused) {
            return c.NONE;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        if (android.text.TextUtils.isEmpty(r3.f5516a) == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004a, code lost:
        if (android.text.TextUtils.isEmpty(r3.f5516a) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004c, code lost:
        r3.f5516a = "00:00:00:00:00:00";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0050, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private a(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r4.getSystemService(r0)     // Catch:{ Exception -> 0x0053 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0053 }
            java.lang.String r1 = r0.getDeviceId()     // Catch:{ Exception -> 0x0053 }
            r3.a((java.lang.String) r1)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = r0.getSubscriberId()     // Catch:{ Exception -> 0x0053 }
            if (r0 == 0) goto L_0x0030
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0053 }
            r1.<init>()     // Catch:{ Exception -> 0x0053 }
            r1.append(r0)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = "000000000000000"
            r1.append(r0)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0053 }
            r1 = 0
            r2 = 15
            java.lang.String r0 = r0.substring(r1, r2)     // Catch:{ Exception -> 0x0053 }
        L_0x0030:
            r3.f5517b = r0     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = "wifi"
            java.lang.Object r4 = r4.getSystemService(r0)     // Catch:{ Exception -> 0x0053 }
            android.net.wifi.WifiManager r4 = (android.net.wifi.WifiManager) r4     // Catch:{ Exception -> 0x0053 }
            android.net.wifi.WifiInfo r4 = r4.getConnectionInfo()     // Catch:{ Exception -> 0x0053 }
            java.lang.String r4 = r4.getMacAddress()     // Catch:{ Exception -> 0x0053 }
            r3.f5516a = r4     // Catch:{ Exception -> 0x0053 }
            java.lang.String r4 = r3.f5516a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0060
        L_0x004c:
            java.lang.String r4 = "00:00:00:00:00:00"
            r3.f5516a = r4
            return
        L_0x0051:
            r4 = move-exception
            goto L_0x0061
        L_0x0053:
            r4 = move-exception
            com.google.a.a.a.a.a.a.b(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r4 = r3.f5516a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0060
            goto L_0x004c
        L_0x0060:
            return
        L_0x0061:
            java.lang.String r0 = r3.f5516a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "00:00:00:00:00:00"
            r3.f5516a = r0
        L_0x006d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.j.a.<init>(android.content.Context):void");
    }

    public static String c(Context context) {
        String str;
        a a2 = a(context);
        String b2 = a2.b();
        String str2 = b2 + "|";
        if (TextUtils.isEmpty(a2.a())) {
            str = str2 + "000000000000000";
        } else {
            str = str2 + r2;
        }
        return str.substring(0, 8);
    }
}
