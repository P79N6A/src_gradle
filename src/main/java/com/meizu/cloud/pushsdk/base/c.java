package com.meizu.cloud.pushsdk.base;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static String f27062a = "";

    /* renamed from: b  reason: collision with root package name */
    private static String f27063b = "";

    public static String a(Context context) {
        String str;
        if (TextUtils.isEmpty(f27063b)) {
            if (a()) {
                str = i.a(context);
            } else if (TextUtils.isEmpty(f27063b)) {
                StringBuilder sb = new StringBuilder();
                String str2 = Build.SERIAL;
                DebugLogger.i("DeviceUtils", "device serial " + str2);
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(str2);
                    String b2 = b(context);
                    DebugLogger.e("DeviceUtils", "mac address " + b2);
                    if (!TextUtils.isEmpty(b2)) {
                        sb.append(b2.replace(":", "").toUpperCase());
                        str = sb.toString();
                    }
                }
                return null;
            }
            f27063b = str;
        }
        return f27063b;
    }

    private static String a(String str) {
        String str2;
        String str3;
        String str4 = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("/sys/class/net/" + str + "/address");
            Scanner scanner = new Scanner(fileInputStream);
            if (scanner.hasNextLine()) {
                str4 = scanner.nextLine().trim();
            }
            fileInputStream.close();
        } catch (FileNotFoundException unused) {
            str2 = "DeviceUtils";
            str3 = "getMacAddressWithIfName File not found Exception";
            DebugLogger.e(str2, str3);
            return str4;
        } catch (IOException unused2) {
            str2 = "DeviceUtils";
            str3 = "getMacAddressWithIfName IOException";
            DebugLogger.e(str2, str3);
            return str4;
        }
        return str4;
    }

    public static boolean a() {
        String a2 = k.a("ro.target.product");
        if (!TextUtils.isEmpty(a2)) {
            DebugLogger.i("DeviceUtils", "current product is " + a2);
            return false;
        }
        DebugLogger.i("DeviceUtils", "current product is phone");
        return true;
    }

    public static String b(Context context) {
        String macAddress;
        String str;
        if (!TextUtils.isEmpty(f27062a)) {
            return f27062a;
        }
        try {
            String str2 = null;
            if (Build.VERSION.SDK_INT >= 23) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        if (activeNetworkInfo.getType() == 1) {
                            str = "wlan0";
                        } else if (activeNetworkInfo.getType() == 9) {
                            str = "eth0";
                        }
                        str2 = a(str);
                    } else {
                        macAddress = a("wlan0");
                        if (TextUtils.isEmpty(macAddress)) {
                            macAddress = a("eth0");
                        }
                    }
                }
                f27062a = str2;
                return f27062a;
            }
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager != null) {
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                if (connectionInfo != null) {
                    macAddress = connectionInfo.getMacAddress();
                }
            }
            f27062a = str2;
            return f27062a;
            str2 = macAddress;
            f27062a = str2;
        } catch (Exception unused) {
            DebugLogger.e("DeviceUtils", "get address exception ");
        }
        return f27062a;
    }
}
