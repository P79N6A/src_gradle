package com.amap.api.mapcore2d;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.text.SimpleDateFormat;
import java.util.Hashtable;
import java.util.Random;
import org.json.JSONObject;

public final class gf {

    /* renamed from: a  reason: collision with root package name */
    static String f6226a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f6227b;

    /* renamed from: c  reason: collision with root package name */
    private static String[] f6228c;

    /* renamed from: d  reason: collision with root package name */
    private static Hashtable<String, Long> f6229d = new Hashtable<>();

    /* renamed from: e  reason: collision with root package name */
    private static SparseArray<String> f6230e = null;

    /* renamed from: f  reason: collision with root package name */
    private static SimpleDateFormat f6231f = null;
    private static String[] g = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    public static double a(double d2) {
        double d3 = (double) ((long) (d2 * 1000000.0d));
        Double.isNaN(d3);
        return d3 / 1000000.0d;
    }

    public static float a(float f2) {
        double d2 = (double) f2;
        Double.isNaN(d2);
        double d3 = (double) ((long) (d2 * 100.0d));
        Double.isNaN(d3);
        return (float) (d3 / 100.0d);
    }

    public static float a(double[] dArr) {
        if (dArr.length != 4) {
            return 0.0f;
        }
        float[] fArr = new float[1];
        Location.distanceBetween(dArr[0], dArr[1], dArr[2], dArr[3], fArr);
        return fArr[0];
    }

    public static int a(int i) {
        return (i * 2) - 113;
    }

    public static int a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected()) {
            return networkInfo.getType();
        }
        return -1;
    }

    public static long a() {
        return System.currentTimeMillis();
    }

    public static Object a(Context context, String str) {
        Object obj;
        if (context == null) {
            return null;
        }
        try {
            obj = context.getApplicationContext().getSystemService(str);
        } catch (Throwable th) {
            gc.a(th, "Utils", "getServ");
            obj = null;
        }
        return obj;
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return c() < 17 ? b(context, "android.provider.Settings$System") : b(context, "android.provider.Settings$Global");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && !str.equals("00:00:00:00:00:00") && !str.contains(" :");
    }

    public static boolean a(JSONObject jSONObject, String str) {
        return cz.a(jSONObject, str);
    }

    public static byte[] a(int i, byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            bArr = new byte[2];
        }
        bArr[0] = (byte) (i & 255);
        bArr[1] = (byte) ((i & 65280) >> 8);
        return bArr;
    }

    public static byte[] a(long j) {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) ((int) ((j >> (i * 8)) & 255));
        }
        return bArr;
    }

    public static byte[] a(byte[] bArr) {
        try {
            return cz.b(bArr);
        } catch (Throwable th) {
            gc.a(th, "Utils", "gz");
            return null;
        }
    }

    public static String[] a(TelephonyManager telephonyManager) {
        int i;
        String networkOperator = telephonyManager != null ? telephonyManager.getNetworkOperator() : null;
        String[] strArr = {PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY};
        if (!TextUtils.isEmpty(networkOperator) && TextUtils.isDigitsOnly(networkOperator) && networkOperator.length() > 4) {
            strArr[0] = networkOperator.substring(0, 3);
            char[] charArray = networkOperator.substring(3).toCharArray();
            int i2 = 0;
            while (i2 < charArray.length && Character.isDigit(charArray[i2])) {
                i2++;
            }
            strArr[1] = networkOperator.substring(3, i2 + 3);
        }
        try {
            i = Integer.parseInt(strArr[0]);
        } catch (Throwable th) {
            gc.a(th, "Utils", "getMccMnc");
            i = 0;
        }
        if (i == 0) {
            strArr[0] = PushConstants.PUSH_TYPE_NOTIFY;
        }
        if (strArr[0].equals(PushConstants.PUSH_TYPE_NOTIFY) || strArr[1].equals(PushConstants.PUSH_TYPE_NOTIFY)) {
            return (!strArr[0].equals(PushConstants.PUSH_TYPE_NOTIFY) || !strArr[1].equals(PushConstants.PUSH_TYPE_NOTIFY) || f6228c == null) ? strArr : f6228c;
        }
        f6228c = strArr;
        return strArr;
    }

    public static double b(double d2) {
        double d3 = (double) ((long) (d2 * 100.0d));
        Double.isNaN(d3);
        return d3 / 100.0d;
    }

    public static long b() {
        return SystemClock.elapsedRealtime();
    }

    public static String b(int i) {
        switch (i) {
            case 0:
                return "success";
            case 1:
                return "重要参数为空";
            case 2:
                return "WIFI信息不足";
            case 3:
                return "请求参数获取出现异常";
            case 4:
                return "网络连接异常";
            case 5:
                return "解析数据异常";
            case 6:
                return "定位结果错误";
            case e.l /*?: ONE_ARG  (7 int)*/:
                return "KEY错误";
            case 8:
                return "其他错误";
            case 9:
                return "初始化异常";
            case 10:
                return "定位服务启动失败";
            case 11:
                return "错误的基站信息，请检查是否插入SIM卡";
            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                return "缺少定位权限";
            case 13:
                return "网络定位失败，请检查设备是否插入sim卡，是否开启移动网络或开启了wifi模块";
            case 14:
                return "GPS 定位失败，由于设备当前 GPS 状态差,建议持设备到相对开阔的露天场所再次尝试";
            case 15:
                return "当前返回位置为模拟软件返回，请关闭模拟软件，或者在option中设置允许模拟";
            default:
                return "其他错误";
        }
    }

    public static String b(Context context) {
        PackageInfo packageInfo;
        if (!TextUtils.isEmpty(gc.f6225f)) {
            return gc.f6225f;
        }
        CharSequence charSequence = null;
        if (context == null) {
            return null;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(cp.c(context), 64);
        } catch (Throwable th) {
            gc.a(th, "Utils", "getAppName part");
            packageInfo = null;
        }
        try {
            if (TextUtils.isEmpty(gc.g)) {
                gc.g = null;
            }
        } catch (Throwable th2) {
            gc.a(th2, "Utils", "getAppName");
        }
        StringBuilder sb = new StringBuilder();
        if (packageInfo != null) {
            if (packageInfo.applicationInfo != null) {
                charSequence = packageInfo.applicationInfo.loadLabel(context.getPackageManager());
            }
            if (charSequence != null) {
                sb.append(charSequence.toString());
            }
            if (!TextUtils.isEmpty(packageInfo.versionName)) {
                sb.append(packageInfo.versionName);
            }
        }
        String c2 = cp.c(context);
        if (!TextUtils.isEmpty(c2)) {
            sb.append(",");
            sb.append(c2);
        }
        if (!TextUtils.isEmpty(gc.g)) {
            sb.append(",");
            sb.append(gc.g);
        }
        String sb2 = sb.toString();
        gc.f6225f = sb2;
        return sb2;
    }

    public static String b(TelephonyManager telephonyManager) {
        int i = 0;
        if (f6230e == null) {
            SparseArray<String> sparseArray = new SparseArray<>();
            f6230e = sparseArray;
            sparseArray.append(0, "UNKWN");
            f6230e.append(1, "GPRS");
            f6230e.append(2, "EDGE");
            f6230e.append(3, "UMTS");
            f6230e.append(4, "CDMA");
            f6230e.append(5, "EVDO_0");
            f6230e.append(6, "EVDO_A");
            f6230e.append(7, "1xRTT");
            f6230e.append(8, "HSDPA");
            f6230e.append(9, "HSUPA");
            f6230e.append(10, "HSPA");
            f6230e.append(11, "IDEN");
            f6230e.append(12, "EVDO_B");
            f6230e.append(13, "LTE");
            f6230e.append(14, "EHRPD");
            f6230e.append(15, "HSPAP");
        }
        if (telephonyManager != null) {
            i = telephonyManager.getNetworkType();
        }
        return f6230e.get(i, "UNKWN");
    }

    private static boolean b(Context context, String str) throws Throwable {
        return ((Integer) gd.a(str, "getInt", new Object[]{context.getContentResolver(), ((String) gd.a(str, "AIRPLANE_MODE_ON")).toString()}, (Class<?>[]) new Class[]{ContentResolver.class, String.class})).intValue() == 1;
    }

    public static byte[] b(int i, byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            bArr = new byte[4];
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) ((i >> (i2 * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] b(String str) {
        return a(Integer.parseInt(str), (byte[]) null);
    }

    public static int c() {
        if (f6227b > 0) {
            return f6227b;
        }
        int i = 0;
        try {
            i = gd.b("android.os.Build$VERSION", "SDK_INT");
        } catch (Throwable unused) {
        }
        return i;
    }

    public static NetworkInfo c(Context context) {
        try {
            return ct.n(context);
        } catch (Throwable th) {
            gc.a(th, "Utils", "getNetWorkInfo");
            return null;
        }
    }

    public static byte[] c(String str) {
        return b(Integer.parseInt(str), (byte[]) null);
    }

    public static String d() {
        return Build.MODEL;
    }

    public static String e() {
        return Build.VERSION.RELEASE;
    }

    public static int f() {
        return new Random().nextInt(65536) - 32768;
    }
}
