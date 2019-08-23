package com.tencent.open.b;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.tencent.open.a.f;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static String f79682a;

    /* renamed from: b  reason: collision with root package name */
    static String f79683b;

    /* renamed from: c  reason: collision with root package name */
    static String f79684c;

    /* renamed from: d  reason: collision with root package name */
    static String f79685d;

    /* renamed from: e  reason: collision with root package name */
    private static String f79686e;

    public static String a() {
        try {
            Context a2 = com.tencent.open.d.c.a();
            if (a2 == null) {
                return "";
            }
            WifiManager wifiManager = (WifiManager) a2.getSystemService("wifi");
            if (wifiManager == null) {
                return "";
            }
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo == null) {
                return "";
            }
            return connectionInfo.getMacAddress();
        } catch (SecurityException e2) {
            f.b("openSDK_LOG.MobileInfoUtil", "getLocalMacAddress>>>", e2);
            return "";
        }
    }

    public static String b(Context context) {
        if (f79684c != null && f79684c.length() > 0) {
            return f79684c;
        }
        if (context == null) {
            return "";
        }
        try {
            String simSerialNumber = ((TelephonyManager) context.getSystemService("phone")).getSimSerialNumber();
            f79684c = simSerialNumber;
            return simSerialNumber;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c(Context context) {
        if (f79685d != null && f79685d.length() > 0) {
            return f79685d;
        }
        if (context == null) {
            return "";
        }
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            f79685d = string;
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(Context context) {
        if (f79683b != null && f79683b.length() > 0) {
            return f79683b;
        }
        if (context == null) {
            return "";
        }
        try {
            String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
            f79683b = deviceId;
            return deviceId;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d(Context context) {
        try {
            if (f79686e == null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                StringBuilder sb = new StringBuilder();
                sb.append("imei=");
                sb.append(a(context));
                sb.append('&');
                sb.append("model=");
                sb.append(Build.MODEL);
                sb.append('&');
                sb.append("os=");
                sb.append(Build.VERSION.RELEASE);
                sb.append('&');
                sb.append("apilevel=");
                sb.append(Build.VERSION.SDK_INT);
                sb.append('&');
                String b2 = a.b(context);
                if (b2 == null) {
                    b2 = "";
                }
                sb.append("network=");
                sb.append(b2);
                sb.append('&');
                sb.append("sdcard=");
                sb.append(Environment.getExternalStorageState().equals("mounted") ? 1 : 0);
                sb.append('&');
                sb.append("display=");
                sb.append(displayMetrics.widthPixels);
                sb.append('*');
                sb.append(displayMetrics.heightPixels);
                sb.append('&');
                sb.append("manu=");
                sb.append(Build.MANUFACTURER);
                sb.append("&");
                sb.append("wifi=");
                sb.append(a.c(context));
                f79686e = sb.toString();
            }
            return f79686e;
        } catch (Exception unused) {
            return null;
        }
    }
}
