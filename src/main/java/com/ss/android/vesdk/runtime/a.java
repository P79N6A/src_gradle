package com.ss.android.vesdk.runtime;

import android.content.Context;
import android.os.Environment;
import android.support.annotation.NonNull;
import com.ss.android.ttve.common.TECloudCtrlInvoker;
import com.ss.android.vesdk.y;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f78087a = "VECloudCtrlManager";

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f78088d;

    /* renamed from: e  reason: collision with root package name */
    private static String[] f78089e = {"vesdk_log_command"};

    /* renamed from: b  reason: collision with root package name */
    private boolean f78090b = false;

    /* renamed from: c  reason: collision with root package name */
    private TECloudCtrlInvoker f78091c = new TECloudCtrlInvoker();

    /* renamed from: f  reason: collision with root package name */
    private String f78092f = Environment.getExternalStorageDirectory().toString();

    private a() {
    }

    public static a a() {
        if (f78088d == null) {
            synchronized (a.class) {
                if (f78088d == null) {
                    f78088d = new a();
                }
            }
        }
        return f78088d;
    }

    public final void a(@NonNull String str) {
        this.f78092f = str;
        for (String str2 : f78089e) {
            String str3 = (String) com.ss.android.vesdk.runtime.a.a.a().b(str2, "");
            if (!str3.isEmpty()) {
                b(str2, str3);
            }
        }
    }

    private static void a(@NonNull String str, @NonNull String str2) {
        com.ss.android.vesdk.runtime.a.a.a().a(str, str2);
    }

    public final void a(@NonNull Context context, @NonNull String str) {
        y.b(f78087a, str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("command");
            com.ss.android.vesdk.runtime.a.a.a().a(context);
            a(string, jSONObject.toString());
        } catch (Exception e2) {
            String str2 = f78087a;
            y.d(str2, " json parse failed " + e2.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ Exception -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029 A[Catch:{ Exception -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b4 A[Catch:{ Exception -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1 A[Catch:{ Exception -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f2 A[Catch:{ Exception -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f5 A[Catch:{ Exception -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0171 A[Catch:{ Exception -> 0x0199 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int b(@android.support.annotation.NonNull java.lang.String r13, @android.support.annotation.NonNull java.lang.String r14) {
        /*
            r12 = this;
            r0 = -1
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0199 }
            r2.<init>(r14)     // Catch:{ Exception -> 0x0199 }
            int r14 = r13.hashCode()     // Catch:{ Exception -> 0x0199 }
            r3 = 2043549244(0x79ce163c, float:1.3375801E35)
            if (r14 == r3) goto L_0x0011
            goto L_0x001b
        L_0x0011:
            java.lang.String r14 = "vesdk_log_command"
            boolean r14 = r13.equals(r14)     // Catch:{ Exception -> 0x0199 }
            if (r14 == 0) goto L_0x001b
            r14 = 0
            goto L_0x001c
        L_0x001b:
            r14 = -1
        L_0x001c:
            if (r14 == 0) goto L_0x0029
            java.lang.String r14 = f78087a     // Catch:{ Exception -> 0x0199 }
            java.lang.String r1 = " json contail invalid command "
            com.ss.android.vesdk.y.d(r14, r1)     // Catch:{ Exception -> 0x0199 }
            r13 = -2
            r0 = -2
            goto L_0x01b6
        L_0x0029:
            java.lang.String r14 = "false"
            java.lang.String r3 = "2018-12-08 00:00:00"
            java.lang.String r4 = "2018-12-08 00:00:00"
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "enable"
            boolean r7 = r2.has(r7)     // Catch:{ Exception -> 0x0199 }
            if (r7 == 0) goto L_0x0041
            java.lang.String r14 = "enable"
            java.lang.String r14 = r2.getString(r14)     // Catch:{ Exception -> 0x0199 }
        L_0x0041:
            java.lang.String r7 = "starttime"
            boolean r7 = r2.has(r7)     // Catch:{ Exception -> 0x0199 }
            if (r7 == 0) goto L_0x004f
            java.lang.String r3 = "starttime"
            java.lang.String r3 = r2.getString(r3)     // Catch:{ Exception -> 0x0199 }
        L_0x004f:
            java.lang.String r7 = "endtime"
            boolean r7 = r2.has(r7)     // Catch:{ Exception -> 0x0199 }
            if (r7 == 0) goto L_0x005d
            java.lang.String r4 = "endtime"
            java.lang.String r4 = r2.getString(r4)     // Catch:{ Exception -> 0x0199 }
        L_0x005d:
            java.lang.String r7 = "level"
            boolean r7 = r2.has(r7)     // Catch:{ Exception -> 0x0199 }
            if (r7 == 0) goto L_0x006b
            java.lang.String r5 = "level"
            java.lang.String r5 = r2.getString(r5)     // Catch:{ Exception -> 0x0199 }
        L_0x006b:
            java.lang.String r7 = "sign"
            boolean r7 = r2.has(r7)     // Catch:{ Exception -> 0x0199 }
            if (r7 == 0) goto L_0x0079
            java.lang.String r6 = "sign"
            java.lang.String r6 = r2.getString(r6)     // Catch:{ Exception -> 0x0199 }
        L_0x0079:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0199 }
            r2.<init>()     // Catch:{ Exception -> 0x0199 }
            r2.append(r13)     // Catch:{ Exception -> 0x0199 }
            r2.append(r14)     // Catch:{ Exception -> 0x0199 }
            r2.append(r3)     // Catch:{ Exception -> 0x0199 }
            r2.append(r4)     // Catch:{ Exception -> 0x0199 }
            r2.append(r5)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0199 }
            com.ss.android.ttve.common.TECloudCtrlInvoker r7 = r12.f78091c     // Catch:{ Exception -> 0x0199 }
            boolean r8 = r2.isEmpty()     // Catch:{ Exception -> 0x0199 }
            r9 = 1
            if (r8 != 0) goto L_0x00b1
            boolean r8 = r6.isEmpty()     // Catch:{ Exception -> 0x0199 }
            if (r8 == 0) goto L_0x00a1
            goto L_0x00b1
        L_0x00a1:
            byte[] r2 = r2.getBytes()     // Catch:{ Exception -> 0x0199 }
            byte[] r6 = r6.getBytes()     // Catch:{ Exception -> 0x0199 }
            int r2 = r7.nativeVerifyJson(r2, r6)     // Catch:{ Exception -> 0x0199 }
            if (r2 != 0) goto L_0x00b1
            r2 = 1
            goto L_0x00b2
        L_0x00b1:
            r2 = 0
        L_0x00b2:
            if (r2 != 0) goto L_0x00c1
            java.lang.String r14 = ""
            a((java.lang.String) r13, (java.lang.String) r14)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r14 = f78087a     // Catch:{ Exception -> 0x0199 }
            java.lang.String r1 = "Cloud Ctrl Command Json is doctored"
            com.ss.android.vesdk.y.d(r14, r1)     // Catch:{ Exception -> 0x0199 }
            return r0
        L_0x00c1:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0199 }
            java.lang.String r6 = "yyyy-MM-dd HH:mm:ss"
            r2.<init>(r6)     // Catch:{ Exception -> 0x0199 }
            java.util.Date r3 = r2.parse(r3)     // Catch:{ Exception -> 0x0199 }
            long r6 = r3.getTime()     // Catch:{ Exception -> 0x0199 }
            java.util.Date r2 = r2.parse(r4)     // Catch:{ Exception -> 0x0199 }
            long r2 = r2.getTime()     // Catch:{ Exception -> 0x0199 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0199 }
            int r4 = r5.hashCode()     // Catch:{ Exception -> 0x0199 }
            r8 = 68
            if (r4 == r8) goto L_0x00e5
            goto L_0x00ef
        L_0x00e5:
            java.lang.String r4 = "D"
            boolean r4 = r5.equals(r4)     // Catch:{ Exception -> 0x0199 }
            if (r4 == 0) goto L_0x00ef
            r4 = 0
            goto L_0x00f0
        L_0x00ef:
            r4 = -1
        L_0x00f0:
            if (r4 == 0) goto L_0x00f5
            com.ss.android.ttve.common.h$a r4 = com.ss.android.ttve.common.h.a.LEVEL3     // Catch:{ Exception -> 0x0199 }
            goto L_0x00f7
        L_0x00f5:
            com.ss.android.ttve.common.h$a r4 = com.ss.android.ttve.common.h.a.LEVEL0     // Catch:{ Exception -> 0x0199 }
        L_0x00f7:
            boolean r5 = r12.f78090b     // Catch:{ Exception -> 0x0199 }
            if (r5 != 0) goto L_0x015d
            java.lang.String r5 = "true"
            boolean r5 = r14.equals(r5)     // Catch:{ Exception -> 0x0199 }
            if (r5 == 0) goto L_0x015d
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x015d
            int r5 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x015d
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0199 }
            r14.<init>()     // Catch:{ Exception -> 0x0199 }
            java.lang.String r2 = r12.f78092f     // Catch:{ Exception -> 0x0199 }
            r14.append(r2)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r2 = "/vesdklog"
            r14.append(r2)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0199 }
            java.lang.String r2 = f78087a     // Catch:{ Exception -> 0x0199 }
            com.ss.android.vesdk.y.b(r2, r14)     // Catch:{ Exception -> 0x0199 }
            com.ss.android.ttve.common.h r2 = com.ss.android.ttve.common.h.a()     // Catch:{ Exception -> 0x0199 }
            int r3 = r4.ordinal()     // Catch:{ Exception -> 0x0199 }
            com.ss.android.ttve.common.TESpdLogInvoker r2 = r2.f31183a     // Catch:{ Exception -> 0x0199 }
            r5 = 3
            int r14 = r2.initSpdLog(r14, r3, r5)     // Catch:{ Exception -> 0x0199 }
            if (r14 >= 0) goto L_0x0135
            goto L_0x0136
        L_0x0135:
            r14 = 0
        L_0x0136:
            if (r14 >= 0) goto L_0x014d
            java.lang.String r1 = f78087a     // Catch:{ Exception -> 0x0199 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0199 }
            java.lang.String r3 = " TESpdLog init fail "
            r2.<init>(r3)     // Catch:{ Exception -> 0x0199 }
            r2.append(r14)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r14 = r2.toString()     // Catch:{ Exception -> 0x0199 }
            com.ss.android.vesdk.y.d(r1, r14)     // Catch:{ Exception -> 0x0199 }
            r13 = -3
            return r13
        L_0x014d:
            com.ss.android.ttve.common.h r14 = com.ss.android.ttve.common.h.a()     // Catch:{ Exception -> 0x0199 }
            com.ss.android.ttve.common.TESpdLogInvoker r14 = r14.f31183a     // Catch:{ Exception -> 0x0199 }
            int r2 = r4.ordinal()     // Catch:{ Exception -> 0x0199 }
            r14.setLevel(r2)     // Catch:{ Exception -> 0x0199 }
            r12.f78090b = r9     // Catch:{ Exception -> 0x0199 }
            goto L_0x0197
        L_0x015d:
            java.lang.String r4 = "false"
            boolean r14 = r14.equals(r4)     // Catch:{ Exception -> 0x0199 }
            if (r14 != 0) goto L_0x016d
            int r14 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r14 >= 0) goto L_0x0197
            int r14 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r14 < 0) goto L_0x0197
        L_0x016d:
            boolean r14 = r12.f78090b     // Catch:{ Exception -> 0x0199 }
            if (r14 == 0) goto L_0x017c
            com.ss.android.ttve.common.h r14 = com.ss.android.ttve.common.h.a()     // Catch:{ Exception -> 0x0199 }
            com.ss.android.ttve.common.TESpdLogInvoker r14 = r14.f31183a     // Catch:{ Exception -> 0x0199 }
            r14.close()     // Catch:{ Exception -> 0x0199 }
            r12.f78090b = r1     // Catch:{ Exception -> 0x0199 }
        L_0x017c:
            java.lang.String r14 = f78087a     // Catch:{ Exception -> 0x0199 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0199 }
            r2.<init>()     // Catch:{ Exception -> 0x0199 }
            r2.append(r13)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r3 = " expired"
            r2.append(r3)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0199 }
            com.ss.android.vesdk.y.b(r14, r2)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r14 = ""
            a((java.lang.String) r13, (java.lang.String) r14)     // Catch:{ Exception -> 0x0199 }
        L_0x0197:
            r0 = 0
            goto L_0x01b6
        L_0x0199:
            r14 = move-exception
            java.lang.String r1 = f78087a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " json parse failed "
            r2.<init>(r3)
            java.lang.String r14 = r14.toString()
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            com.ss.android.vesdk.y.d(r1, r14)
            java.lang.String r14 = ""
            a((java.lang.String) r13, (java.lang.String) r14)
        L_0x01b6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.runtime.a.b(java.lang.String, java.lang.String):int");
    }
}
