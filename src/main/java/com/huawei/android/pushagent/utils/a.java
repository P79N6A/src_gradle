package com.huawei.android.pushagent.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemProperties;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.widget.Toast;
import com.huawei.android.microkernel.MKService;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.a.f;
import com.huawei.android.pushagent.utils.a.h;
import com.huawei.android.pushagent.utils.b.b;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.utils.eq;
import java.io.File;
import java.io.FileDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f25159a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b  reason: collision with root package name */
    private static int f25160b = -1;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
            if (Build.VERSION.SDK_INT == 25) {
                eq.a(toast);
            }
            toast.show();
        }
    }

    private static String A(Context context) {
        if (context == null) {
            return "";
        }
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            StringBuffer stringBuffer = new StringBuffer();
            if (signatureArr != null) {
                for (Signature charsString : signatureArr) {
                    stringBuffer.append(charsString.toCharsString());
                }
                e.a("PushLogAC2815", "Signature len is :" + signatureArr.length);
            }
            return stringBuffer.toString();
        } catch (PackageManager.NameNotFoundException unused) {
            e.d("PushLogAC2815", "package with the given name can not be found");
            return "";
        }
    }

    private static boolean B(Context context) {
        String A = A(context);
        e.a("PushLogAC2815", "signStr hashCode is :" + A.hashCode());
        return -735404696 == A.hashCode();
    }

    public static int a(int i, int i2) {
        e.a("PushLogAC2815", "enter ctrlSockets(cmd:" + i + " param:" + i2 + ")");
        try {
            return ((Integer) Class.forName("dalvik.system.Zygote").getMethod("ctrlSockets", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(null, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)})).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            e.a("PushLogAC2815", "There is no method of ctrlSockets.");
            return -2;
        }
    }

    public static int a(Socket socket) throws ClassNotFoundException {
        try {
            return ((Integer) FileDescriptor.class.getMethod("getInt$", new Class[0]).invoke((FileDescriptor) Socket.class.getMethod("getFileDescriptor$", new Class[0]).invoke(socket, new Object[0]), new Object[0])).intValue();
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            e.a("PushLogAC2815", "There is no method of ctrlSockets.");
            return 0;
        }
    }

    public static long a(String str) {
        try {
            Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse(str);
            if (parse != null) {
                return parse.getTime();
            }
            return -1;
        } catch (ParseException e2) {
            e.d("PushLogAC2815", "ParseException,timeStr:" + str + " e:" + e2.toString());
            return -1;
        }
    }

    public static ResolveInfo a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 640);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            return null;
        }
        return queryBroadcastReceivers.get(0);
    }

    public static Boolean a(Context context, String str, Intent intent) {
        if (intent == null || TextUtils.isEmpty(str)) {
            e.b("PushLogAC2815", "pkgName is empty or intent is null");
            return Boolean.FALSE;
        }
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
                int size = queryIntentActivities.size();
                for (int i = 0; i < size; i++) {
                    if (queryIntentActivities.get(i).activityInfo != null && str.equals(queryIntentActivities.get(i).activityInfo.applicationInfo.packageName)) {
                        return Boolean.TRUE;
                    }
                }
            }
        } catch (Exception e2) {
            e.c("PushLogAC2815", e2.toString(), e2);
        }
        return Boolean.FALSE;
    }

    public static String a() {
        StringBuilder sb;
        String replace = UUID.randomUUID().toString().replace("-", "");
        if (replace.length() > 15) {
            sb = new StringBuilder("_");
            replace = replace.substring(0, 15);
        } else {
            sb = new StringBuilder("_");
            sb.append("000000000000000".substring(15 - replace.length()));
        }
        sb.append(replace);
        return sb.toString();
    }

    public static String a(byte b2) {
        return new String(new char[]{f25159a[(b2 & 240) >> 4], f25159a[b2 & 15]});
    }

    public static String a(long j, String str) {
        try {
            return new SimpleDateFormat(str).format(new Date(j));
        } catch (Exception e2) {
            e.d("PushLogAC2815", "getTimeString,milliseconds:" + j + " e:" + e2.toString());
            return "";
        }
    }

    public static String a(Context context) {
        String d2 = d(context);
        if (!TextUtils.isEmpty(d2)) {
            return d2;
        }
        String b2 = b(context);
        f.a(context, "device_info", "deviceId", b2);
        return b2;
    }

    public static String a(Context context, String str, String str2) {
        String str3;
        String str4 = null;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 640);
            if (applicationInfo != null) {
                if (applicationInfo.metaData != null) {
                    Object obj = applicationInfo.metaData.get(str2);
                    if (obj == null) {
                        e.b("PushLogAC2815", "could not read meta-data from AndroidManifest.xml.");
                        return null;
                    }
                    str3 = String.valueOf(obj);
                    try {
                        e.a("PushLogAC2815", "read meta-data from AndroidManifest.xml,name is:" + str2 + ",value is:" + str3);
                    } catch (PackageManager.NameNotFoundException e2) {
                        str4 = str3;
                        e = e2;
                    }
                    return str3;
                }
            }
            e.a("PushLogAC2815", "could not read Applicationinfo from AndroidManifest.xml.");
            return null;
        } catch (PackageManager.NameNotFoundException e3) {
            e = e3;
            e.c("PushLogAC2815", e.toString(), e);
            str3 = str4;
            return str3;
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            cArr[i2] = f25159a[(b2 & 240) >> 4];
            cArr[i2 + 1] = f25159a[b2 & 15];
        }
        return new String(cArr);
    }

    public static ArrayList a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        int size = queryBroadcastReceivers == null ? 0 : queryBroadcastReceivers.size();
        ArrayList arrayList = new ArrayList();
        if (size <= 0) {
            return arrayList;
        }
        for (int i = 0; i < size; i++) {
            ResolveInfo resolveInfo = queryBroadcastReceivers.get(i);
            arrayList.add((resolveInfo.activityInfo != null ? resolveInfo.activityInfo : resolveInfo.serviceInfo).packageName);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        com.huawei.android.pushagent.b.b.a.b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0055, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r1, int r2) {
        /*
            switch(r2) {
                case 1: goto L_0x0034;
                case 2: goto L_0x0019;
                case 3: goto L_0x0004;
                default: goto L_0x0003;
            }
        L_0x0003:
            goto L_0x0055
        L_0x0004:
            y(r1)
            z(r1)
            com.huawei.android.pushagent.b.b.c r2 = com.huawei.android.pushagent.b.b.c.a(r1)
            r2.a()
            com.huawei.android.pushagent.b.b.c r1 = com.huawei.android.pushagent.b.b.c.a(r1)
            r1.b()
            goto L_0x0055
        L_0x0019:
            k(r1)
            y(r1)
            z(r1)
            com.huawei.android.pushagent.b.b.c r2 = com.huawei.android.pushagent.b.b.c.a(r1)
            r2.a()
            com.huawei.android.pushagent.b.b.c r2 = com.huawei.android.pushagent.b.b.c.a(r1)
            r2.b()
        L_0x0030:
            com.huawei.android.pushagent.b.b.a.b((android.content.Context) r1)
            return
        L_0x0034:
            y(r1)
            l(r1)
            com.huawei.android.pushagent.b.b.c r2 = com.huawei.android.pushagent.b.b.c.a(r1)
            r2.a()
            com.huawei.android.pushagent.b.b.c r2 = com.huawei.android.pushagent.b.b.c.a(r1)
            r2.b()
            com.huawei.android.pushagent.utils.a.h r2 = new com.huawei.android.pushagent.utils.a.h
            java.lang.String r0 = "pushConfig"
            r2.<init>(r1, r0)
            java.lang.String r0 = "forbiddenMultiChannel"
            r2.f(r0)
            goto L_0x0030
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.utils.a.a(android.content.Context, int):void");
    }

    public static void a(Context context, long j) {
        e.a("PushLogAC2815", "enter wakeSystem");
        ((PowerManager) context.getSystemService("power")).newWakeLock(1, "pushagent").acquire(j);
    }

    public static void a(Context context, boolean z) {
        if (context != null) {
            a(context, MKService.getAppContext() == null ? "com.huawei.android.pushagent.PushBootReceiver" : "com.huawei.deviceCloud.microKernel.push.PushBootReceiver", z);
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        if (context != null && !TextUtils.isEmpty(str)) {
            e.a("PushLogAC2815", "setReceiverState:" + context.getPackageName() + ",isEnable:" + z);
            try {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, str), !z ? 2 : 1, 1);
                return true;
            } catch (Exception e2) {
                e.c("PushLogAC2815", e2.toString(), e2);
            }
        }
        return false;
    }

    public static byte[] a(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] a(long j) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) ((int) j);
            j >>= 8;
        }
        return bArr;
    }

    public static int b(byte[] bArr) {
        return (bArr[3] & 255) | ((bArr[0] << 24) & 255) | ((bArr[1] << 16) & 255) | ((bArr[2] << 8) & 255);
    }

    public static String b(Context context) {
        String c2 = c(context);
        return TextUtils.isEmpty(c2) ? a() : c2;
    }

    public static List b(Context context, String str) {
        return context.getPackageManager().queryBroadcastReceivers(new Intent(str), 640);
    }

    public static void b() {
        e.a("PushLogAC2815", "enter powerLow");
        try {
            Class.forName("android.util.LogPower").getMethod("push", new Class[]{Integer.TYPE}).invoke(null, new Object[]{119});
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            e.a("PushLogAC2815", "need not support LogPower");
        }
    }

    private static boolean b(Context context, boolean z) {
        String str;
        String str2;
        e.a("PushLogAC2815", "existFrameworkPush:" + f25160b + ",realCheck:" + z);
        if (!z) {
            return 1 == f25160b;
        }
        try {
            if (new File("/system/framework/" + "hwpush.jar").isFile()) {
                str = "PushLogAC2815";
                str2 = "push jarFile is exist";
            } else {
                e.b("PushLogAC2815", "push jarFile is not exist");
                if (!SystemProperties.getBoolean("ro.config.push_enable", "CN".equals(SystemProperties.get("ro.product.locale.region")))) {
                    e.a("PushLogAC2815", "framework not support push");
                    return false;
                }
                String str3 = SystemProperties.get("ro.build.version.emui", "-1");
                if (TextUtils.isEmpty(str3) || (!str3.contains("2.0") && !str3.contains("2.3"))) {
                    e.a("PushLogAC2815", "can not use framework push");
                    return false;
                }
                str = "PushLogAC2815";
                str2 = "emui is 2.0 or 2.3";
            }
            e.a(str, str2);
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setClassName("android", "com.huawei.android.pushagentproxy.PushService"), SearchJediMixFeedAdapter.f42517f);
            if (queryIntentServices != null) {
                if (queryIntentServices.size() != 0) {
                    e.b("PushLogAC2815", "framework push exist, use framework push first");
                    return true;
                }
            }
            e.b("PushLogAC2815", "framework push not exist, need vote apk or sdk to support pushservice");
            return false;
        } catch (Exception e2) {
            e.d("PushLogAC2815", "get Apk version faild ,Exception e= " + e2.toString());
            return false;
        }
    }

    public static byte[] b(int i) {
        return new byte[]{(byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static int c(byte[] bArr) {
        return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
    }

    public static String c() {
        String str;
        String str2;
        Class[] clsArr = {String.class};
        Object[] objArr = {"ro.build.version.emui"};
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str3 = (String) cls.getDeclaredMethod("get", clsArr).invoke(cls, objArr);
            e.a("PushLogAC2815", "get EMUI version is:" + str3);
            return !TextUtils.isEmpty(str3) ? str3 : "";
        } catch (ClassNotFoundException unused) {
            str2 = "PushLogAC2815";
            str = " getEmuiVersion wrong, ClassNotFoundException";
            e.d(str2, str);
        } catch (LinkageError unused2) {
            str2 = "PushLogAC2815";
            str = " getEmuiVersion wrong, LinkageError";
            e.d(str2, str);
        } catch (NoSuchMethodException unused3) {
            str2 = "PushLogAC2815";
            str = " getEmuiVersion wrong, NoSuchMethodException";
            e.d(str2, str);
        } catch (NullPointerException unused4) {
            str2 = "PushLogAC2815";
            str = " getEmuiVersion wrong, NullPointerException";
            e.d(str2, str);
        } catch (IllegalAccessException unused5) {
            str2 = "PushLogAC2815";
            str = " getEmuiVersion wrong, IllegalAccessException";
            e.d(str2, str);
        } catch (IllegalArgumentException unused6) {
            str2 = "PushLogAC2815";
            str = " getEmuiVersion wrong, IllegalArgumentException";
            e.d(str2, str);
        } catch (InvocationTargetException unused7) {
            str2 = "PushLogAC2815";
            str = " getEmuiVersion wrong, InvocationTargetException";
            e.d(str2, str);
        }
    }

    public static String c(Context context) {
        String str = "";
        boolean ae = com.huawei.android.pushagent.b.b.a.a(context).ae();
        e.a("PushLogAC2815", "isMultiSimEnabledFromServer:" + ae);
        if (!b.b() || !ae) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                str = telephonyManager.getDeviceId();
            }
        } else {
            e.a("PushLogAC2815", "multicard device");
            str = b.a().a(0);
        }
        if (TextUtils.isEmpty(str) || str.matches("[0]+")) {
            e.b("PushLogAC2815", "get uniqueId from device is empty or all 0");
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() >= 16) {
            return str.substring(str.length() - 16);
        }
        stringBuffer.append(PushConstants.PUSH_TYPE_NOTIFY);
        stringBuffer.append(str);
        if (stringBuffer.length() < 16) {
            StringBuffer stringBuffer2 = new StringBuffer();
            for (int i = 0; i < 16 - stringBuffer.length(); i++) {
                stringBuffer2.append(PushConstants.PUSH_TYPE_NOTIFY);
            }
            stringBuffer.append(stringBuffer2);
        }
        return stringBuffer.toString();
    }

    public static boolean c(Context context, String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (a(context, new Intent("com.huawei.android.push.intent.REGISTRATION").setPackage(str)) != null) {
            z = true;
        }
        e.a("PushLogAC2815", "isPushClient:" + z);
        return z;
    }

    public static long d(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 56) | 0 | ((((long) bArr[1]) & 255) << 48) | ((((long) bArr[2]) & 255) << 40) | ((((long) bArr[3]) & 255) << 32) | ((((long) bArr[4]) & 255) << 24) | ((((long) bArr[5]) & 255) << 16) | ((((long) bArr[6]) & 255) << 8) | (255 & ((long) bArr[7]));
    }

    public static String d(Context context) {
        e.a("PushLogAC2815", "enter getImeiFromLocalFile()");
        String a2 = f.a(context, "device_info", "deviceId");
        if (TextUtils.isEmpty(a2) || 16 != a2.length()) {
            e.c("PushLogAC2815", "no deviceId in device_info");
            return a2;
        }
        e.a("PushLogAC2815", "get imei from localFile success");
        return a2;
    }

    public static boolean d(Context context, String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (a(context, new Intent("com.huawei.android.push.intent.REGISTER").setPackage(str)) != null) {
            z = true;
        }
        e.a("PushLogAC2815", "hasPushRegister:" + z);
        return z;
    }

    public static boolean e(Context context) {
        String str;
        String str2;
        String d2 = d(context);
        e.a("PushLogAC2815", "imei from localfile is " + com.huawei.android.pushagent.utils.a.a.e.a(d2));
        String c2 = c(context);
        e.a("PushLogAC2815", "deviceId from device is " + com.huawei.android.pushagent.utils.a.a.e.a(c2));
        String m = m(context);
        String n = n(context);
        e.a("PushLogAC2815", "mac from localfile is " + com.huawei.android.pushagent.utils.a.a.e.a(m));
        e.a("PushLogAC2815", "mac from device is " + com.huawei.android.pushagent.utils.a.a.e.a(n));
        if (TextUtils.isEmpty(d2) || TextUtils.isEmpty(c2)) {
            if (TextUtils.isEmpty(d2)) {
                f.a(context, "device_info", "deviceId", b(context));
            }
            if (TextUtils.isEmpty(m) || TextUtils.isEmpty(n)) {
                if (TextUtils.isEmpty(m) && !TextUtils.isEmpty(n)) {
                    f.a(context, "device_info", "macAddress", n);
                }
                return false;
            } else if (m.equals(n)) {
                return false;
            } else {
                str = "PushLogAC2815";
                str2 = "After check mac, it is cloned, need reset files";
            }
        } else if (d2.equals(c2)) {
            return false;
        } else {
            str = "PushLogAC2815";
            str2 = "After check imei, it is cloned, need reset files";
        }
        e.c(str, str2);
        return true;
    }

    public static boolean e(Context context, String str) {
        File file = new File(context.getCacheDir().getParent() + "/shared_prefs/" + str + ".xml");
        if (!file.exists() || !file.isFile() || !file.canWrite()) {
            if (file.exists()) {
                e.d("PushLogAC2815", "delete File:" + r3 + " failed!!");
            }
            return false;
        }
        e.a("PushLogAC2815", "enter deletePrefrence(fileName:" + str + ".xml)");
        return file.delete();
    }

    public static String f(Context context, String str) {
        String str2;
        if (a(context, str, "CHANNEL") == null) {
            return str;
        }
        e.a("PushLogAC2815", "after add downloadChannel, the new packageName is:" + str2);
        return str2;
    }

    public static void f(Context context) {
        if (e(context)) {
            new Thread(new b(context)).start();
        }
    }

    public static String g(Context context) {
        return "2815";
    }

    public static boolean g(Context context, String str) {
        if (!(context == null || str == null || "".equals(str))) {
            try {
                if (context.getPackageManager().getApplicationInfo(str, 0) == null) {
                    return false;
                }
                e.a("PushLogAC2815", str + " is installed");
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static String h(Context context) {
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            return "";
        }
        char[] charArray = simOperator.toCharArray();
        int i = 0;
        while (true) {
            if (i >= charArray.length) {
                break;
            } else if (charArray[i] < '0' || charArray[i] > '9') {
                simOperator = simOperator.substring(0, i);
            } else {
                i++;
            }
        }
        simOperator = simOperator.substring(0, i);
        return simOperator;
    }

    public static String i(Context context) {
        return a(context) + "0000000000000000";
    }

    public static String j(Context context) {
        if (context == null) {
            return "";
        }
        String str = "";
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                str = activeNetworkInfo.getExtraInfo();
            }
        }
        if (str == null) {
            str = "";
        }
        e.a("PushLogAC2815", "push apn is " + str);
        return str;
    }

    public static void k(Context context) {
        try {
            com.huawei.android.pushagent.b.b.a.a(context).f25165c.clear();
            com.huawei.android.pushagent.b.e.b.a(context).f25095a.clear();
            com.huawei.android.pushagent.b.d.a.b(context).a();
        } catch (Exception unused) {
            e.d("PushLogAC2815", "clearMemory failed!");
        }
    }

    public static void l(Context context) {
        h hVar = new h(context, "pclient_info_v2");
        for (String str : hVar.b().keySet()) {
            if (!g(context, str)) {
                hVar.f(str);
            }
        }
    }

    public static String m(Context context) {
        e.a("PushLogAC2815", "enter getMacFromLocalFile()");
        String a2 = f.a(context, "device_info", "macAddress");
        if (!TextUtils.isEmpty(a2)) {
            e.a("PushLogAC2815", "get macAddress from LocalFile success");
            return a2;
        }
        e.c("PushLogAC2815", "no macAddress in device_info");
        return a2;
    }

    public static String n(Context context) {
        String str;
        e.a("PushLogAC2815", "enter getMacAddress()");
        String str2 = "";
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            WifiInfo connectionInfo = wifiManager == null ? null : wifiManager.getConnectionInfo();
            if (connectionInfo == null) {
                e.c("PushLogAC2815", "info = null");
                return str2;
            }
            str = connectionInfo.getMacAddress();
            try {
                if (!TextUtils.isEmpty(str)) {
                    e.a("PushLogAC2815", "get Mac from device success");
                } else {
                    e.c("PushLogAC2815", "Mac is empty");
                }
            } catch (Exception e2) {
                Exception exc = e2;
                str2 = str;
                e = exc;
                e.c("PushLogAC2815", "getLocalMacAddress() exception,e=" + e.toString(), e);
                str = str2;
                return str;
            }
            return str;
        } catch (Exception e3) {
            e = e3;
            e.c("PushLogAC2815", "getLocalMacAddress() exception,e=" + e.toString(), e);
            str = str2;
            return str;
        }
    }

    public static synchronized boolean o(Context context) {
        synchronized (a.class) {
            e.a("PushLogAC2815", "existFrameworkPush:" + f25160b);
            if (-1 != f25160b) {
                return 1 == f25160b;
            }
            if (b(context, true)) {
                f25160b = 1;
            } else {
                f25160b = 0;
            }
            return 1 == f25160b;
        }
    }

    public static void p(Context context) {
        try {
            if ("com.huawei.android.pushagent".equals(context.getPackageName()) && !B(context)) {
                e.d("PushLogAC2815", "signature of apk HwPushService is not test");
                _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context, "Signature of HwPushService is not correct", 1));
            }
        } catch (Exception e2) {
            e.a("PushLogAC2815", "checkAPKSignature error", (Throwable) e2);
        }
    }

    public static int q(Context context) {
        int c2 = new h(context, "pushConfig").c("NeedMyServiceRun");
        if (c2 < 0 || c2 > 2) {
            c2 = 0;
        }
        e.a("PushLogAC2815", "in file needMyServiceRun is : " + c2);
        return c2;
    }

    public static String r(Context context) {
        String b2 = new h(context, "pushConfig").b("votedPackageName");
        e.b("PushLogAC2815", "votedPackage from file:" + b2);
        return b2;
    }

    public static boolean s(Context context) {
        int c2 = new h(context, "pushConfig").c("forbiddenMultiChannel");
        e.b("PushLogAC2815", "forbiddenMultiChannel from file:" + c2);
        return 1 == c2;
    }

    /* access modifiers changed from: private */
    public static void w(Context context) {
        e.a("PushLogAC2815", "update deviceInfo File");
        new h(context, "device_info").c();
        String b2 = b(context);
        String n = n(context);
        f.a(context, "device_info", "deviceId", b2);
        f.a(context, "device_info", "macAddress", n);
    }

    /* access modifiers changed from: private */
    public static void x(Context context) {
        h hVar = new h(context, "pclient_request_info");
        h hVar2 = new h(context, "pclient_info_v2");
        for (String str : hVar2.b().keySet()) {
            if (!TextUtils.isEmpty(str)) {
                hVar.a(str, "true");
                e.a("PushLogAC2815", "pkg : " + str + " need register again");
            }
        }
        hVar2.c();
    }

    /* access modifiers changed from: private */
    public static void y(Context context) {
        e(context, "PushConnectControl");
        e(context, "PushRouteInfo");
        e(context, "RouteInfo");
        e(context, "HeartBeatCfg");
        for (String e2 : com.huawei.android.pushagent.b.a.a.a(context).a()) {
            e(context, e2);
        }
        e(context, "socket_info");
        e(context, "update_remind");
    }

    private static void z(Context context) {
        e(context, "pclient_request_info");
        e(context, "pclient_unRegist_info_v2");
        e(context, "pclient_info_v2");
        e(context, "pclient_info");
    }
}
