package com.bytedance.usergrowth.data.deviceinfo;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.usergrowth.data.deviceinfo.DeviceInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22849a;

    /* renamed from: b  reason: collision with root package name */
    private final i f22850b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f22851c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f22852d;

    /* renamed from: e  reason: collision with root package name */
    private a<Boolean> f22853e = new a<Boolean>() {

        /* renamed from: b  reason: collision with root package name */
        private Boolean f22856b;

        public final /* synthetic */ Object a() {
            if (this.f22856b == null) {
                this.f22856b = Boolean.valueOf(c.a(c.this.f22849a, "com.android.vending"));
            }
            return this.f22856b;
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private a<Boolean> f22854f = new a<Boolean>() {

        /* renamed from: b  reason: collision with root package name */
        private Boolean f22858b;

        public final /* synthetic */ Object a() {
            if (this.f22858b == null) {
                this.f22858b = Boolean.valueOf(c.a(c.this.f22849a, "com.google.android.gms"));
            }
            return this.f22858b;
        }
    };

    interface a<T> {
        T a();
    }

    private List<Account> b() {
        boolean z;
        try {
            if (this.f22849a.checkCallingOrSelfPermission("android.permission.GET_ACCOUNTS") == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Account[] accounts = ((AccountManager) this.f22849a.getSystemService("account")).getAccounts();
                if (accounts == null) {
                    return null;
                }
                return Arrays.asList(accounts);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    private String[] a() {
        String[] strArr;
        int i = 0;
        if (this.f22849a == null) {
            return new String[0];
        }
        try {
            if (Build.VERSION.SDK_INT >= 22) {
                List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(this.f22849a).getActiveSubscriptionInfoList();
                if (activeSubscriptionInfoList != null) {
                    if (!activeSubscriptionInfoList.isEmpty()) {
                        strArr = new String[activeSubscriptionInfoList.size()];
                        while (i < activeSubscriptionInfoList.size()) {
                            try {
                                strArr[i] = activeSubscriptionInfoList.get(i).getIccId();
                                i++;
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
                return new String[0];
            }
            String[] strArr2 = new String[1];
            try {
                strArr2[0] = ((TelephonyManager) this.f22849a.getSystemService("phone")).getSimSerialNumber();
            } catch (Throwable unused2) {
            }
            strArr = strArr2;
        } catch (Throwable unused3) {
            strArr = null;
        }
        return strArr;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0054 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$RestartUploadInfo$Builder r0 = com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.RestartUploadInfo.newBuilder()     // Catch:{ Throwable -> 0x00da }
            java.lang.String[] r1 = r9.a()     // Catch:{ Throwable -> 0x00da }
            if (r1 != 0) goto L_0x0010
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00da }
            r1.<init>()     // Catch:{ Throwable -> 0x00da }
            goto L_0x002e
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00da }
            r2.<init>()     // Catch:{ Throwable -> 0x00da }
            int r3 = r1.length     // Catch:{ Throwable -> 0x00da }
            r4 = 0
        L_0x0017:
            if (r4 >= r3) goto L_0x002d
            r5 = r1[r4]     // Catch:{ Throwable -> 0x00da }
            com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$SimSerial$Builder r6 = com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.SimSerial.newBuilder()     // Catch:{ Throwable -> 0x00da }
            com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$SimSerial$Builder r5 = r6.setSimSerialNumber(r5)     // Catch:{ Throwable -> 0x00da }
            com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$SimSerial r5 = r5.build()     // Catch:{ Throwable -> 0x00da }
            r2.add(r5)     // Catch:{ Throwable -> 0x00da }
            int r4 = r4 + 1
            goto L_0x0017
        L_0x002d:
            r1 = r2
        L_0x002e:
            com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$RestartUploadInfo$Builder r1 = r0.addAllSimSerial(r1)     // Catch:{ Throwable -> 0x00da }
            java.util.List r2 = r9.b()     // Catch:{ Throwable -> 0x00da }
            java.util.List r2 = a(r2)     // Catch:{ Throwable -> 0x00da }
            r1.addAllSystemAccounts(r2)     // Catch:{ Throwable -> 0x00da }
            android.bluetooth.BluetoothAdapter r1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ Throwable -> 0x00da }
            if (r1 == 0) goto L_0x005b
            boolean r2 = r1.isEnabled()     // Catch:{ Throwable -> 0x00da }
            if (r2 == 0) goto L_0x005b
            android.content.Context r2 = r9.f22849a     // Catch:{ Throwable -> 0x0054 }
            com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$BluetoothInfo r2 = com.bytedance.usergrowth.data.deviceinfo.b.a((android.content.Context) r2, (android.bluetooth.BluetoothAdapter) r1)     // Catch:{ Throwable -> 0x0054 }
            if (r2 == 0) goto L_0x0054
            r0.setLocalBtInfo((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.BluetoothInfo) r2)     // Catch:{ Throwable -> 0x0054 }
        L_0x0054:
            java.util.List r1 = com.bytedance.usergrowth.data.deviceinfo.b.a((android.bluetooth.BluetoothAdapter) r1)     // Catch:{ Throwable -> 0x00da }
            r0.addAllBondedBtList(r1)     // Catch:{ Throwable -> 0x00da }
        L_0x005b:
            boolean r1 = r9.f22851c     // Catch:{ Throwable -> 0x00da }
            if (r1 == 0) goto L_0x0089
            boolean r1 = r9.f22852d     // Catch:{ Throwable -> 0x00da }
            if (r1 == 0) goto L_0x0080
            com.bytedance.usergrowth.data.deviceinfo.c$a<java.lang.Boolean> r1 = r9.f22853e     // Catch:{ Throwable -> 0x00da }
            java.lang.Object r1 = r1.a()     // Catch:{ Throwable -> 0x00da }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Throwable -> 0x00da }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x00da }
            if (r1 != 0) goto L_0x0089
            com.bytedance.usergrowth.data.deviceinfo.c$a<java.lang.Boolean> r1 = r9.f22854f     // Catch:{ Throwable -> 0x00da }
            java.lang.Object r1 = r1.a()     // Catch:{ Throwable -> 0x00da }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Throwable -> 0x00da }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x00da }
            if (r1 == 0) goto L_0x0080
            goto L_0x0089
        L_0x0080:
            android.content.Context r1 = r9.f22849a     // Catch:{ Throwable -> 0x00da }
            java.util.List r1 = com.bytedance.usergrowth.data.deviceinfo.a.a(r1)     // Catch:{ Throwable -> 0x00da }
            r0.addAllAppList(r1)     // Catch:{ Throwable -> 0x00da }
        L_0x0089:
            com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$RestartUploadInfo r0 = r0.build()     // Catch:{ Throwable -> 0x00da }
            byte[] r1 = r0.toByteArray()     // Catch:{ Throwable -> 0x00da }
            int r2 = r1.length     // Catch:{ Throwable -> 0x00da }
            byte[] r5 = com.bytedance.frameworks.core.encrypt.TTEncryptUtils.a(r1, r2)     // Catch:{ Throwable -> 0x00da }
            com.bytedance.usergrowth.data.a.a.g r3 = com.bytedance.usergrowth.data.deviceinfo.i.b()     // Catch:{ Throwable -> 0x00da }
            java.lang.String r1 = "/weasel/v1/info/"
            java.lang.String r4 = com.bytedance.usergrowth.data.a.a.a(r1)     // Catch:{ Throwable -> 0x00da }
            r6 = 1
            r7 = 0
            java.lang.String r8 = "text/plain;charset=utf-8"
            java.lang.String r1 = r3.a(r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x00da }
            com.bytedance.usergrowth.data.deviceinfo.i.c()     // Catch:{ Throwable -> 0x00da }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00da }
            r2.<init>()     // Catch:{ Throwable -> 0x00da }
            java.lang.Class<com.bytedance.usergrowth.data.deviceinfo.i> r3 = com.bytedance.usergrowth.data.deviceinfo.i.class
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ Throwable -> 0x00da }
            r2.append(r3)     // Catch:{ Throwable -> 0x00da }
            java.lang.String r3 = " => "
            r2.append(r3)     // Catch:{ Throwable -> 0x00da }
            r2.append(r0)     // Catch:{ Throwable -> 0x00da }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00da }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x00da }
            java.lang.String r1 = "msg"
            java.lang.String r0 = r0.optString(r1)     // Catch:{ Throwable -> 0x00da }
            com.bytedance.usergrowth.data.deviceinfo.i.c()     // Catch:{ Throwable -> 0x00da }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00da }
            java.lang.String r2 = "/weasel/v1/info/ 返回 :"
            r1.<init>(r2)     // Catch:{ Throwable -> 0x00da }
            r1.append(r0)     // Catch:{ Throwable -> 0x00da }
            return
        L_0x00da:
            r0 = move-exception
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "stacktrace"
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch:{ JSONException -> 0x00e9 }
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x00e9 }
        L_0x00e9:
            com.bytedance.usergrowth.data.a.a.e r0 = com.bytedance.usergrowth.data.deviceinfo.i.c()
            java.lang.String r2 = "weasel_info_failed"
            r0.a(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.usergrowth.data.deviceinfo.c.run():void");
    }

    private static List<DeviceInfo.SystemAccount> a(List<Account> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (Account next : list) {
            arrayList.add(DeviceInfo.SystemAccount.newBuilder().setName(next.name).setType(next.type).build());
        }
        return arrayList;
    }

    public static boolean a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 16777216) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    c(Context context, i iVar, boolean z, boolean z2) {
        this.f22849a = context;
        this.f22850b = iVar;
        this.f22851c = z;
        this.f22852d = z2;
    }
}
