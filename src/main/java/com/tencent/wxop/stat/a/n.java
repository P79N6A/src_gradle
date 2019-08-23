package com.tencent.wxop.stat.a;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.a.a.a.a.a.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.dexposed.ClassUtils;
import com.tencent.wxop.stat.d;
import com.tencent.wxop.stat.h;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpHost;
import org.json.JSONObject;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    static DisplayMetrics f79818a = null;

    /* renamed from: b  reason: collision with root package name */
    static String f79819b = null;

    /* renamed from: c  reason: collision with root package name */
    public static long f79820c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static int f79821d = 0;

    /* renamed from: e  reason: collision with root package name */
    private static String f79822e = null;

    /* renamed from: f  reason: collision with root package name */
    private static String f79823f = null;
    private static Random g = null;
    private static String h = null;
    private static String i = "";
    private static String j = "";
    private static int k = -1;
    private static b l = null;
    private static String m = null;
    private static String n = null;
    private static volatile int o = -1;
    private static long p = -1;
    private static String q = "";
    private static String r = "__MTA_FIRST_ACTIVATE__";
    private static int s = -1;
    private static String t = "";

    private static Long a(String str, String str2, int i2, int i3, Long l2) {
        if (str == null) {
            return l2;
        }
        if (str2.equalsIgnoreCase(ClassUtils.PACKAGE_SEPARATOR) || str2.equalsIgnoreCase("|")) {
            str2 = "\\".concat(String.valueOf(str2));
        }
        String[] split = str.split(str2);
        if (split.length == 3) {
            try {
                Long l3 = 0L;
                for (String valueOf : split) {
                    l3 = Long.valueOf((l3.longValue() + Long.valueOf(valueOf).longValue()) * 100);
                }
                return l3;
            } catch (NumberFormatException unused) {
            }
        }
        return l2;
    }

    public static String a(int i2) {
        Calendar instance = Calendar.getInstance();
        instance.roll(6, 0);
        return new SimpleDateFormat("yyyyMMdd").format(instance.getTime());
    }

    public static String a(long j2) {
        return new SimpleDateFormat("yyyyMMdd").format(new Date(j2));
    }

    public static String a(String str) {
        if (str == null) {
            return PushConstants.PUSH_TYPE_NOTIFY;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                byte b3 = b2 & 255;
                if (b3 < 16) {
                    stringBuffer.append(PushConstants.PUSH_TYPE_NOTIFY);
                }
                stringBuffer.append(Integer.toHexString(b3));
            }
            return stringBuffer.toString();
        } catch (Throwable unused) {
            return PushConstants.PUSH_TYPE_NOTIFY;
        }
    }

    public static synchronized Random a() {
        Random random;
        synchronized (n.class) {
            if (g == null) {
                g = new Random();
            }
            random = g;
        }
        return random;
    }

    public static HttpHost a(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
                return null;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getTypeName() != null && activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                return null;
            }
            String extraInfo = activeNetworkInfo.getExtraInfo();
            if (extraInfo == null) {
                return null;
            }
            if (!extraInfo.equals("cmwap") && !extraInfo.equals("3gwap")) {
                if (!extraInfo.equals("uniwap")) {
                    if (extraInfo.equals("ctwap")) {
                        return new HttpHost("10.0.0.200", 80);
                    }
                    String defaultHost = Proxy.getDefaultHost();
                    if (defaultHost != null && defaultHost.trim().length() > 0) {
                        return new HttpHost(defaultHost, Proxy.getDefaultPort());
                    }
                    return null;
                }
            }
            return new HttpHost("10.0.0.172", 80);
        } catch (Throwable unused) {
        }
    }

    public static boolean a(h hVar) {
        if (hVar == null) {
            return false;
        }
        return c(hVar.f79898a);
    }

    public static byte[] a(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length * 2);
        while (true) {
            int read = gZIPInputStream.read(bArr2);
            if (read != -1) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayInputStream.close();
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            }
        }
    }

    public static int b() {
        if (k != -1) {
            return k;
        }
        try {
            if (q.a()) {
                k = 1;
            }
        } catch (Throwable unused) {
        }
        k = 0;
        return 0;
    }

    public static long b(String str) {
        return a(str, ClassUtils.PACKAGE_SEPARATOR, 100, 3, 0L).longValue();
    }

    public static synchronized String b(Context context) {
        synchronized (n.class) {
            if (f79822e == null || f79822e.trim().length() == 0) {
                String a2 = s.a(context);
                f79822e = a2;
                if (a2 == null || f79822e.trim().length() == 0) {
                    f79822e = Integer.toString(a().nextInt(Integer.MAX_VALUE));
                }
                String str = f79822e;
                return str;
            }
            String str2 = f79822e;
            return str2;
        }
    }

    public static synchronized b c() {
        b bVar;
        synchronized (n.class) {
            if (l == null) {
                b bVar2 = new b("MtaSDK");
                l = bVar2;
                bVar2.f79782b = false;
            }
            bVar = l;
        }
        return bVar;
    }

    public static synchronized String c(Context context) {
        String str;
        synchronized (n.class) {
            if (f79823f == null || f79823f.trim().length() == 0) {
                f79823f = s.b(context);
            }
            str = f79823f;
        }
        return str;
    }

    public static boolean c(String str) {
        return (str == null || str.trim().length() == 0) ? false : true;
    }

    public static long d() {
        long currentTimeMillis;
        try {
            Calendar instance = Calendar.getInstance();
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            currentTimeMillis = instance.getTimeInMillis();
        } catch (Throwable unused) {
            currentTimeMillis = System.currentTimeMillis();
        }
        return currentTimeMillis + 86400000;
    }

    public static boolean d(Context context) {
        try {
            if (s.a(context, "android.permission.ACCESS_WIFI_STATE")) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
                    if (allNetworkInfo != null) {
                        for (int i2 = 0; i2 < allNetworkInfo.length; i2++) {
                            if (allNetworkInfo[i2].getTypeName().equalsIgnoreCase("WIFI") && allNetworkInfo[i2].isConnected()) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            l.b("can not get the permission of android.permission.ACCESS_WIFI_STATE");
            return false;
        } catch (Throwable unused) {
        }
    }

    public static JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("n", o.a());
            String d2 = o.d();
            if (d2 != null && d2.length() > 0) {
                jSONObject.put("na", d2);
            }
            int b2 = o.b();
            if (b2 > 0) {
                jSONObject.put("fx", b2 / 1000000);
            }
            int c2 = o.c();
            if (c2 > 0) {
                jSONObject.put("fn", c2 / 1000000);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private static long f() {
        if (p > 0) {
            return p;
        }
        long j2 = 1;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            j2 = (long) (Integer.valueOf(bufferedReader.readLine().split("\\s+")[1]).intValue() * 1024);
            bufferedReader.close();
        } catch (Exception unused) {
        }
        p = j2;
        return j2;
    }

    public static String f(Context context) {
        if (c(i)) {
            return i;
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            i = str;
            if (str == null) {
                return "";
            }
        } catch (Throwable unused) {
        }
        return i;
    }

    public static String g(Context context) {
        String str = "";
        try {
            if (!s.a(context, "android.permission.INTERNET") || !s.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                l.e("can not get the permission of android.permission.ACCESS_WIFI_STATE");
                return str;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                String typeName = activeNetworkInfo.getTypeName();
                String extraInfo = activeNetworkInfo.getExtraInfo();
                if (typeName != null) {
                    if (typeName.equalsIgnoreCase("WIFI")) {
                        return "WIFI";
                    }
                    if (typeName.equalsIgnoreCase("MOBILE")) {
                        return extraInfo != null ? extraInfo : "MOBILE";
                    }
                    if (extraInfo != null) {
                        return extraInfo;
                    }
                    str = typeName;
                }
            }
            return str;
        } catch (Throwable unused) {
        }
    }

    public static Integer h(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return Integer.valueOf(telephonyManager.getNetworkType());
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String i(Context context) {
        if (c(j)) {
            return j;
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            j = str;
            if (str == null || j.length() == 0) {
                return "unknown";
            }
        } catch (Throwable unused) {
        }
        return j;
    }

    public static String j(Context context) {
        if (c(m)) {
            return m;
        }
        try {
            if (s.a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                String externalStorageState = Environment.getExternalStorageState();
                if (externalStorageState != null && externalStorageState.equals("mounted")) {
                    String path = Environment.getExternalStorageDirectory().getPath();
                    if (path != null) {
                        new StatFs(path);
                        String str = String.valueOf((((long) r1.getAvailableBlocks()) * ((long) r1.getBlockSize())) / 1000000) + "/" + String.valueOf((((long) r1.getBlockCount()) * ((long) r1.getBlockSize())) / 1000000);
                        m = str;
                        return str;
                    }
                }
            } else {
                l.b("can not get the permission of android.permission.WRITE_EXTERNAL_STORAGE");
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    static String k(Context context) {
        try {
            if (n != null) {
                return n;
            }
            int myPid = Process.myPid();
            Iterator<ActivityManager.RunningAppProcessInfo> it2 = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it2.next();
                if (next.pid == myPid) {
                    n = next.processName;
                    break;
                }
            }
            return n;
        } catch (Throwable unused) {
        }
    }

    public static String l(Context context) {
        return a(context, a.f79780b);
    }

    public static synchronized Integer m(Context context) {
        Integer valueOf;
        synchronized (n.class) {
            if (o <= 0) {
                o = r.a(context, "MTA_EVENT_INDEX", 0);
                r.b(context, "MTA_EVENT_INDEX", o + PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
            } else if (o % PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE == 0) {
                try {
                    int i2 = o + PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                    if (o >= 2147383647) {
                        i2 = 0;
                    }
                    r.b(context, "MTA_EVENT_INDEX", i2);
                } catch (Throwable th) {
                    l.c(th);
                }
            }
            int i3 = o + 1;
            o = i3;
            valueOf = Integer.valueOf(i3);
        }
        return valueOf;
    }

    public static String o(Context context) {
        if (c(q)) {
            return q;
        }
        try {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            if (sensorManager != null) {
                List<Sensor> sensorList = sensorManager.getSensorList(-1);
                if (sensorList != null) {
                    StringBuilder sb = new StringBuilder(sensorList.size() * 10);
                    for (int i2 = 0; i2 < sensorList.size(); i2++) {
                        sb.append(sensorList.get(i2).getType());
                        if (i2 != sensorList.size() - 1) {
                            sb.append(",");
                        }
                    }
                    q = sb.toString();
                }
            }
        } catch (Throwable unused) {
        }
        return q;
    }

    public static synchronized int p(Context context) {
        synchronized (n.class) {
            if (s != -1) {
                int i2 = s;
                return i2;
            }
            q(context);
            int i3 = s;
            return i3;
        }
    }

    public static void q(Context context) {
        int a2 = r.a(context, r, 1);
        s = a2;
        if (a2 == 1) {
            r.b(context, r, 0);
        }
    }

    public static String e(Context context) {
        if (h != null) {
            return h;
        }
        try {
            if (s.a(context, "android.permission.READ_PHONE_STATE")) {
                if (context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0) {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager != null) {
                        h = telephonyManager.getSimOperator();
                    }
                }
            } else {
                l.e("Could not get permission of android.permission.READ_PHONE_STATE");
            }
        } catch (Throwable unused) {
        }
        return h;
    }

    public static String a(Context context, String str) {
        if (d.w) {
            if (n == null) {
                n = k(context);
            }
            if (n != null) {
                return str + "_" + n;
            }
        }
        return str;
    }

    public static String n(Context context) {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryInfo(memoryInfo);
            return String.valueOf(memoryInfo.availMem / 1000000) + "/" + String.valueOf(f() / 1000000);
        } catch (Throwable th) {
            a.b(th);
            return null;
        }
    }

    public static int a(Context context, boolean z) {
        if (z) {
            f79821d = r.a(context, "mta.qq.com.difftime", 0);
        }
        return f79821d;
    }
}
