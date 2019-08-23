package com.xiaomi.push;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import java.util.ArrayList;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private static String f82302a = null;

    /* renamed from: a  reason: collision with other field name */
    private static volatile boolean f625a = false;

    /* renamed from: b  reason: collision with root package name */
    private static String f82303b = "";

    /* renamed from: c  reason: collision with root package name */
    private static String f82304c;

    /* renamed from: d  reason: collision with root package name */
    private static String f82305d;

    /* renamed from: e  reason: collision with root package name */
    private static String f82306e;

    @TargetApi(17)
    public static int a() {
        if (Build.VERSION.SDK_INT >= 17) {
            Object a2 = au.a("android.os.UserHandle", "myUserId", new Object[0]);
            if (a2 != null) {
                return Integer.class.cast(a2).intValue();
            }
        }
        return -1;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m442a() {
        if (Build.VERSION.SDK_INT > 8 && Build.VERSION.SDK_INT < 26) {
            return Build.SERIAL;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return (String) au.a("android.os.Build", "getSerial", (Object[]) null);
        }
        return null;
    }

    public static String a(Context context) {
        String e2 = e(context);
        return "a-" + az.b(null + e2 + null);
    }

    public static String a(Context context, boolean z) {
        if (f82304c == null) {
            String str = "";
            if (!m.d()) {
                str = z ? f(context) : o(context);
            }
            String e2 = e(context);
            String a2 = a();
            StringBuilder sb = new StringBuilder("a-");
            sb.append(az.b(str + e2 + a2));
            f82304c = sb.toString();
        }
        return f82304c;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static ArrayList<String> m443a(Context context) {
        g(context);
        i(context);
        if (TextUtils.isEmpty(f82302a)) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(f82302a);
        if (TextUtils.isEmpty(f82303b)) {
            return arrayList;
        }
        for (String add : f82303b.split(",")) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "update vdevid = "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.b.c(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0019
            goto L_0x008d
        L_0x0019:
            f82306e = r4
            r4 = 0
            boolean r0 = a((android.content.Context) r3)     // Catch:{ IOException -> 0x006f }
            if (r0 == 0) goto L_0x0057
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x006f }
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ IOException -> 0x006f }
            java.lang.String r2 = "/Xiaomi/"
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x006f }
            boolean r1 = r0.exists()     // Catch:{ IOException -> 0x006f }
            if (r1 == 0) goto L_0x003c
            boolean r1 = r0.isFile()     // Catch:{ IOException -> 0x006f }
            if (r1 == 0) goto L_0x003c
            r0.delete()     // Catch:{ IOException -> 0x006f }
        L_0x003c:
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x006f }
            java.lang.String r2 = ".vdevid"
            r1.<init>(r0, r2)     // Catch:{ IOException -> 0x006f }
            com.xiaomi.push.v r0 = com.xiaomi.push.v.a(r3, r1)     // Catch:{ IOException -> 0x006f }
            com.xiaomi.push.z.a((java.io.File) r1)     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            java.lang.String r4 = f82306e     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            com.xiaomi.push.z.a((java.io.File) r1, (java.lang.String) r4)     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            r4 = r0
            goto L_0x0057
        L_0x0051:
            r3 = move-exception
            r4 = r0
            goto L_0x008e
        L_0x0054:
            r3 = move-exception
            r4 = r0
            goto L_0x0070
        L_0x0057:
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x006f }
            java.io.File r3 = r3.getFilesDir()     // Catch:{ IOException -> 0x006f }
            java.lang.String r1 = ".vdevid"
            r0.<init>(r3, r1)     // Catch:{ IOException -> 0x006f }
            java.lang.String r3 = f82306e     // Catch:{ IOException -> 0x006f }
            com.xiaomi.push.z.a((java.io.File) r0, (java.lang.String) r3)     // Catch:{ IOException -> 0x006f }
            if (r4 == 0) goto L_0x008d
            r4.a()
            return
        L_0x006d:
            r3 = move-exception
            goto L_0x008e
        L_0x006f:
            r3 = move-exception
        L_0x0070:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r0.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r1 = "update vdevid failure :"
            r0.append(r1)     // Catch:{ all -> 0x006d }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x006d }
            r0.append(r3)     // Catch:{ all -> 0x006d }
            java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x006d }
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r3)     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x008d
            r4.a()
        L_0x008d:
            return
        L_0x008e:
            if (r4 == 0) goto L_0x0093
            r4.a()
        L_0x0093:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.j.a(android.content.Context, java.lang.String):void");
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m444a(Context context) {
        boolean z = false;
        if (!n.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") || m.a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            z = true;
        }
        return !z ? u.a(context) : z;
    }

    private static boolean a(String str) {
        return !TextUtils.isEmpty(str) && str.length() <= 15 && str.length() >= 14 && az.b(str) && !az.c(str);
    }

    public static String b(Context context) {
        try {
            return k.a(context).a();
        } catch (Exception e2) {
            b.a("failure to get gaid:" + e2.getMessage());
            return null;
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    private static boolean m445b(Context context) {
        return context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(java.lang.String r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0009
            goto L_0x0063
        L_0x0009:
            int r0 = r7.length()
            r3 = 17
            if (r0 == r3) goto L_0x0012
            goto L_0x0063
        L_0x0012:
            java.lang.String r0 = "^([A-Fa-f0-9]{2}[-,:]){5}[A-Fa-f0-9]{2}$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r7)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L_0x0023
            goto L_0x0063
        L_0x0023:
            char r0 = r7.charAt(r1)
            r3 = 48
            if (r0 == r3) goto L_0x0033
            r3 = 102(0x66, float:1.43E-43)
            if (r0 == r3) goto L_0x0033
            r3 = 70
            if (r0 != r3) goto L_0x005e
        L_0x0033:
            r3 = 1
        L_0x0034:
            int r4 = r7.length()
            if (r3 >= r4) goto L_0x005e
            char r4 = r7.charAt(r3)
            if (r4 == r0) goto L_0x0042
            r7 = 0
            goto L_0x005f
        L_0x0042:
            int r4 = r7.length()
            int r4 = r4 - r2
            if (r3 >= r4) goto L_0x005c
            int r4 = r3 + 1
            char r5 = r7.charAt(r4)
            r6 = 45
            if (r5 == r6) goto L_0x005b
            char r5 = r7.charAt(r4)
            r6 = 58
            if (r5 != r6) goto L_0x005c
        L_0x005b:
            r3 = r4
        L_0x005c:
            int r3 = r3 + r2
            goto L_0x0034
        L_0x005e:
            r7 = 1
        L_0x005f:
            if (r7 == 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r1 = 1
        L_0x0063:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.j.b(java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(android.content.Context r4) {
        /*
            boolean r0 = a((android.content.Context) r4)
            r1 = 0
            if (r0 != 0) goto L_0x0009
            goto L_0x007b
        L_0x0009:
            java.lang.String r0 = f82306e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0014
        L_0x0011:
            java.lang.String r1 = f82306e
            goto L_0x007b
        L_0x0014:
            java.io.File r0 = new java.io.File
            java.io.File r2 = r4.getFilesDir()
            java.lang.String r3 = ".vdevid"
            r0.<init>(r2, r3)
            java.lang.String r0 = com.xiaomi.push.z.a((java.io.File) r0)
            f82306e = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002c
            goto L_0x0011
        L_0x002c:
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            java.lang.String r3 = "/Xiaomi/"
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            java.lang.String r3 = ".vdevid"
            r2.<init>(r0, r3)     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            com.xiaomi.push.v r4 = com.xiaomi.push.v.a(r4, r2)     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            java.lang.String r0 = ""
            f82306e = r0     // Catch:{ IOException -> 0x0056 }
            java.lang.String r0 = com.xiaomi.push.z.a((java.io.File) r2)     // Catch:{ IOException -> 0x0056 }
            if (r0 == 0) goto L_0x004e
            f82306e = r0     // Catch:{ IOException -> 0x0056 }
        L_0x004e:
            java.lang.String r1 = f82306e     // Catch:{ IOException -> 0x0056 }
            if (r4 == 0) goto L_0x007b
            r4.a()
            goto L_0x007b
        L_0x0056:
            r0 = move-exception
            goto L_0x005d
        L_0x0058:
            r4 = move-exception
            goto L_0x007f
        L_0x005a:
            r4 = move-exception
            r0 = r4
            r4 = r1
        L_0x005d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
            r1.<init>()     // Catch:{ all -> 0x007c }
            java.lang.String r2 = "getVDevID failure :"
            r1.append(r2)     // Catch:{ all -> 0x007c }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x007c }
            r1.append(r0)     // Catch:{ all -> 0x007c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x007c }
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r0)     // Catch:{ all -> 0x007c }
            if (r4 == 0) goto L_0x0011
            r4.a()
            goto L_0x0011
        L_0x007b:
            return r1
        L_0x007c:
            r0 = move-exception
            r1 = r4
            r4 = r0
        L_0x007f:
            if (r1 == 0) goto L_0x0084
            r1.a()
        L_0x0084:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.j.c(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String d(android.content.Context r6) {
        /*
            boolean r0 = a((android.content.Context) r6)
            r1 = 0
            if (r0 == 0) goto L_0x00c9
            boolean r0 = f625a
            if (r0 == 0) goto L_0x000d
            goto L_0x00c9
        L_0x000d:
            r0 = 1
            f625a = r0
            java.io.File r0 = new java.io.File
            java.io.File r2 = r6.getFilesDir()
            java.lang.String r3 = ".vdevid"
            r0.<init>(r2, r3)
            java.lang.String r0 = com.xiaomi.push.z.a((java.io.File) r0)
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0044, all -> 0x0041 }
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ IOException -> 0x0044, all -> 0x0041 }
            java.lang.String r4 = "/Xiaomi/"
            r2.<init>(r3, r4)     // Catch:{ IOException -> 0x0044, all -> 0x0041 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0044, all -> 0x0041 }
            java.lang.String r4 = ".vdevid"
            r3.<init>(r2, r4)     // Catch:{ IOException -> 0x0044, all -> 0x0041 }
            com.xiaomi.push.v r2 = com.xiaomi.push.v.a(r6, r3)     // Catch:{ IOException -> 0x0044, all -> 0x0041 }
            java.lang.String r3 = com.xiaomi.push.z.a((java.io.File) r3)     // Catch:{ IOException -> 0x003f }
            if (r2 == 0) goto L_0x0065
            r2.a()
            goto L_0x0065
        L_0x003f:
            r3 = move-exception
            goto L_0x0047
        L_0x0041:
            r6 = move-exception
            goto L_0x00c3
        L_0x0044:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0047:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
            r4.<init>()     // Catch:{ all -> 0x00c1 }
            java.lang.String r5 = "check id failure :"
            r4.append(r5)     // Catch:{ all -> 0x00c1 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00c1 }
            r4.append(r3)     // Catch:{ all -> 0x00c1 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x00c1 }
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r3)     // Catch:{ all -> 0x00c1 }
            if (r2 == 0) goto L_0x0064
            r2.a()
        L_0x0064:
            r3 = r1
        L_0x0065:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x00b9
            f82306e = r0
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x0089
            int r2 = r3.length()
            r4 = 128(0x80, float:1.794E-43)
            if (r2 <= r4) goto L_0x007c
            goto L_0x0089
        L_0x007c:
            boolean r6 = android.text.TextUtils.equals(r0, r3)
            if (r6 != 0) goto L_0x009d
            java.lang.String r6 = "vid changed, need sync"
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r6)
            r1 = r3
            goto L_0x00c9
        L_0x0089:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "recover vid :"
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r2)
            a((android.content.Context) r6, (java.lang.String) r0)
        L_0x009d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "vdevid = "
            r6.<init>(r0)
            java.lang.String r0 = f82306e
            r6.append(r0)
            java.lang.String r0 = " "
            r6.append(r0)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            com.xiaomi.channel.commonutils.logger.b.c(r6)
            goto L_0x00c9
        L_0x00b9:
            java.lang.String r6 = "empty local vid"
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r6)
            java.lang.String r1 = "F*"
            goto L_0x00c9
        L_0x00c1:
            r6 = move-exception
            r1 = r2
        L_0x00c3:
            if (r1 == 0) goto L_0x00c8
            r1.a()
        L_0x00c8:
            throw r6
        L_0x00c9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.j.d(android.content.Context):java.lang.String");
    }

    public static String e(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            b.a(th);
            return null;
        }
    }

    public static String f(Context context) {
        String g = g(context);
        int i = 10;
        while (g == null && i > 0) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException unused) {
            }
            g = g(context);
            i--;
        }
        return g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054 A[Catch:{ Throwable -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059 A[Catch:{ Throwable -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007e A[Catch:{ Throwable -> 0x0082 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String g(android.content.Context r5) {
        /*
            boolean r0 = com.xiaomi.push.m.d()
            r1 = 0
            if (r0 == 0) goto L_0x000b
        L_0x0007:
            java.lang.String r1 = ""
            goto L_0x0086
        L_0x000b:
            java.lang.String r0 = f82302a
            if (r0 == 0) goto L_0x0013
            java.lang.String r1 = f82302a
            goto L_0x0086
        L_0x0013:
            boolean r0 = com.xiaomi.push.m.a()     // Catch:{ Throwable -> 0x0082 }
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = "miui.telephony.TelephonyManager"
            java.lang.String r2 = "getDefault"
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x0082 }
            java.lang.Object r0 = com.xiaomi.push.au.a((java.lang.String) r0, (java.lang.String) r2, (java.lang.Object[]) r4)     // Catch:{ Throwable -> 0x0082 }
            if (r0 == 0) goto L_0x003d
            java.lang.String r2 = "getMiuiDeviceId"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x0082 }
            java.lang.Object r0 = com.xiaomi.push.au.a((java.lang.Object) r0, (java.lang.String) r2, (java.lang.Object[]) r3)     // Catch:{ Throwable -> 0x0082 }
            if (r0 == 0) goto L_0x003d
            boolean r2 = r0 instanceof java.lang.String     // Catch:{ Throwable -> 0x0082 }
            if (r2 == 0) goto L_0x003d
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Object r0 = r2.cast(r0)     // Catch:{ Throwable -> 0x0082 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0082 }
            goto L_0x003e
        L_0x003d:
            r0 = r1
        L_0x003e:
            if (r0 != 0) goto L_0x0077
            boolean r2 = b((android.content.Context) r5)     // Catch:{ Throwable -> 0x0082 }
            if (r2 == 0) goto L_0x0077
            java.lang.String r2 = "phone"
            java.lang.Object r5 = r5.getSystemService(r2)     // Catch:{ Throwable -> 0x0082 }
            android.telephony.TelephonyManager r5 = (android.telephony.TelephonyManager) r5     // Catch:{ Throwable -> 0x0082 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0082 }
            r3 = 26
            if (r2 >= r3) goto L_0x0059
            java.lang.String r5 = r5.getDeviceId()     // Catch:{ Throwable -> 0x0082 }
            goto L_0x0078
        L_0x0059:
            r2 = 1
            int r3 = r5.getPhoneType()     // Catch:{ Throwable -> 0x0082 }
            if (r2 != r3) goto L_0x0069
            java.lang.String r0 = "getImei"
            java.lang.Object r5 = com.xiaomi.push.au.a((java.lang.Object) r5, (java.lang.String) r0, (java.lang.Object[]) r1)     // Catch:{ Throwable -> 0x0082 }
        L_0x0066:
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x0082 }
            goto L_0x0078
        L_0x0069:
            r2 = 2
            int r3 = r5.getPhoneType()     // Catch:{ Throwable -> 0x0082 }
            if (r2 != r3) goto L_0x0077
            java.lang.String r0 = "getMeid"
            java.lang.Object r5 = com.xiaomi.push.au.a((java.lang.Object) r5, (java.lang.String) r0, (java.lang.Object[]) r1)     // Catch:{ Throwable -> 0x0082 }
            goto L_0x0066
        L_0x0077:
            r5 = r0
        L_0x0078:
            boolean r0 = a((java.lang.String) r5)     // Catch:{ Throwable -> 0x0082 }
            if (r0 == 0) goto L_0x0007
            f82302a = r5     // Catch:{ Throwable -> 0x0082 }
            r1 = r5
            goto L_0x0086
        L_0x0082:
            r5 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r5)
        L_0x0086:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.j.g(android.content.Context):java.lang.String");
    }

    public static String h(Context context) {
        String j = j(context);
        int i = 10;
        while (j == null && i > 0) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException unused) {
            }
            j = j(context);
            i--;
        }
        return j;
    }

    public static String i(Context context) {
        Object a2;
        if (!m.d() && Build.VERSION.SDK_INT >= 22) {
            if (!TextUtils.isEmpty(f82303b)) {
                return f82303b;
            }
            if (b(context)) {
                g(context);
                if (!TextUtils.isEmpty(f82302a)) {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        Integer num = (Integer) au.a((Object) telephonyManager, "getPhoneCount", new Object[0]);
                        if (num != null && num.intValue() > 1) {
                            String str = null;
                            for (int i = 0; i < num.intValue(); i++) {
                                if (Build.VERSION.SDK_INT < 26) {
                                    a2 = au.a((Object) telephonyManager, "getDeviceId", Integer.valueOf(i));
                                } else if (1 == telephonyManager.getPhoneType()) {
                                    a2 = au.a((Object) telephonyManager, "getImei", Integer.valueOf(i));
                                } else {
                                    if (2 == telephonyManager.getPhoneType()) {
                                        a2 = au.a((Object) telephonyManager, "getMeid", Integer.valueOf(i));
                                    }
                                    if (!TextUtils.isEmpty(str) && !TextUtils.equals(f82302a, str) && a(str)) {
                                        f82303b += str + ",";
                                    }
                                }
                                str = (String) a2;
                                f82303b += str + ",";
                            }
                            int length = f82303b.length();
                            if (length > 0) {
                                f82303b = f82303b.substring(0, length - 1);
                            }
                            return f82303b;
                        }
                    } catch (Exception e2) {
                        b.d(e2.toString());
                    }
                }
            }
        }
        return "";
    }

    public static String j(Context context) {
        i(context);
        if (TextUtils.isEmpty(f82303b)) {
            return "";
        }
        String str = "";
        for (String a2 : f82303b.split(",")) {
            if (a(a2)) {
                str = str + az.a(a2) + ",";
            }
        }
        return str.length() > 0 ? str.substring(0, str.length() - 1) : str;
    }

    public static String k(Context context) {
        String str;
        synchronized (j.class) {
            try {
                if (f82305d != null) {
                    str = f82305d;
                } else {
                    String e2 = e(context);
                    String a2 = a();
                    str = az.b(e2 + a2);
                    f82305d = str;
                }
            } catch (Throwable th) {
                Class<j> cls = j.class;
                throw th;
            }
        }
        return str;
    }

    public static String l(Context context) {
        String b2;
        synchronized (j.class) {
            try {
                String e2 = e(context);
                b2 = az.b(e2 + null);
            } catch (Throwable th) {
                Class<j> cls = j.class;
                throw th;
            }
        }
        return b2;
    }

    public static String m(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
    }

    public static String n(Context context) {
        if (!m.d()) {
            try {
                String macAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
                if (b(macAddress)) {
                    return az.c(macAddress);
                }
            } catch (Exception e2) {
                b.a((Throwable) e2);
                return null;
            }
        }
        return "";
    }

    private static String o(Context context) {
        String g = g(context);
        int i = 10;
        while (TextUtils.isEmpty(g) && i > 0) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException unused) {
            }
            g = g(context);
            i--;
        }
        return g;
    }
}
