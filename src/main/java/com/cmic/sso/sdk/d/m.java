package com.cmic.sso.sdk.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.cmic.sso.sdk.a.b;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.dexposed.ClassUtils;
import java.io.IOException;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private static final String f23083a = "m";

    /* renamed from: d  reason: collision with root package name */
    private static m f23084d;

    /* renamed from: b  reason: collision with root package name */
    private boolean f23085b;

    /* renamed from: c  reason: collision with root package name */
    private Context f23086c;

    public static String e() {
        return Build.ID;
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f23085b;
    }

    public String c() {
        try {
            b.C0247b a2 = b.a().a(this.f23086c);
            String f2 = a2.f((a2.f() + 1) % 2);
            if (f2 == null) {
                return "";
            }
            return f2;
        } catch (Exception unused) {
            return "";
        }
    }

    public String d() {
        try {
            b.C0247b a2 = b.a().a(this.f23086c);
            String g = a2.g((a2.f() + 1) % 2);
            if (g == null) {
                g = "";
            }
            return g;
        } catch (Exception unused) {
            return "";
        }
    }

    public String b() {
        try {
            b.C0247b a2 = b.a().a(this.f23086c);
            String f2 = a2.f(a2.f());
            if (TextUtils.isEmpty(f2)) {
                TelephonyManager telephonyManager = (TelephonyManager) this.f23086c.getSystemService("phone");
                String subscriberId = telephonyManager.getSubscriberId();
                if (TextUtils.isEmpty(subscriberId)) {
                    this.f23085b = true;
                    if (TextUtils.isEmpty(telephonyManager.getSimOperator())) {
                        return "";
                    }
                    String a3 = w.a();
                    f2 = r0 + a3.substring(a3.length() - 11, a3.length());
                } else {
                    f2 = subscriberId;
                }
            }
            f.b(f23083a, "imsi=" + f2);
            return f2;
        } catch (Exception unused) {
            return "";
        }
    }

    private m(Context context) {
        this.f23086c = context;
    }

    public static m a(Context context) {
        if (f23084d == null) {
            f23084d = new m(context);
        }
        return f23084d;
    }

    public static String g(Context context) {
        try {
            return Settings.System.getString(context.getContentResolver(), "android_id");
        } catch (Exception unused) {
            return "";
        }
    }

    public static String h(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSimSerialNumber();
        } catch (Exception unused) {
            return "";
        }
    }

    @SuppressLint({"MissingPermission"})
    public static String e(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getSimSerialNumber();
            }
            return null;
        } catch (Exception unused) {
            f.b(f23083a, "getIccid() failed...");
            return null;
        }
    }

    public static String i(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            WifiInfo wifiInfo = null;
            if (wifiManager != null) {
                wifiInfo = wifiManager.getConnectionInfo();
            }
            if (wifiInfo != null) {
                return wifiInfo.getSSID();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    @SuppressLint({"MissingPermission"})
    public static String f(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        try {
            return (String) Class.forName("android.telephony.TelephonyManager").getMethod("getSimSerialNumber", new Class[]{Integer.TYPE}).invoke(telephonyManager, new Object[]{1});
        } catch (Exception unused) {
            f.a(f23083a, "subiccId reflect error");
            return "";
        }
    }

    @SuppressLint({"MissingPermission"})
    public static String j(Context context) {
        try {
            if (j.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
                if (j.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                    LocationManager locationManager = (LocationManager) context.getSystemService("location");
                    Location location = null;
                    if (locationManager != null) {
                        location = locationManager.getLastKnownLocation("gps");
                    }
                    if (location == null) {
                        return "";
                    }
                    return a(location.getLatitude(), location.getLongitude(), context);
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public String b(Context context) {
        try {
            b.C0247b a2 = b.a().a(context);
            String g = a2.g(a2.f());
            if (TextUtils.isEmpty(g)) {
                g = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
            }
            f.b("UMC_SDK", "imei is " + g);
            if (g == null) {
                g = "";
            }
            return g;
        } catch (Exception unused) {
            return "";
        }
    }

    private static String a(int i) {
        return (i & 255) + ClassUtils.PACKAGE_SEPARATOR + ((i >> 8) & 255) + ClassUtils.PACKAGE_SEPARATOR + ((i >> 16) & 255) + ClassUtils.PACKAGE_SEPARATOR + ((i >> 24) & 255);
    }

    public static String c(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager != null) {
                if (wifiManager.isWifiEnabled()) {
                    WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                    String str = f23083a;
                    f.a(str, "getWifiIp() wi=" + connectionInfo);
                    if (connectionInfo == null) {
                        return "";
                    }
                    int ipAddress = connectionInfo.getIpAddress();
                    String str2 = f23083a;
                    f.a(str2, "getWifiIp() ipAdd=" + ipAddress);
                    if (ipAddress == 0) {
                        return "";
                    }
                    String a2 = a(ipAddress);
                    String str3 = f23083a;
                    f.a(str3, "getWifiIp() ip=" + a2);
                    if (!TextUtils.isEmpty(a2)) {
                        if (!a2.startsWith(PushConstants.PUSH_TYPE_NOTIFY)) {
                            return a2;
                        }
                    }
                    return "";
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    @SuppressLint({"HardwareIds"})
    public static String d(Context context) {
        try {
            if (Build.VERSION.SDK_INT < 23) {
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    return "";
                }
                String macAddress = wifiManager.getConnectionInfo().getMacAddress();
                if (TextUtils.isEmpty(macAddress)) {
                    return "";
                }
                if ("02:00:00:00:00:00".equals(macAddress)) {
                    return "";
                }
                return macAddress;
            }
            for (T t : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (t.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = t.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte valueOf : hardwareAddress) {
                        sb.append(String.format("%02X:", new Object[]{Byte.valueOf(valueOf)}));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
            return "";
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r6.equals("46006") != false) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x00b2
            int r0 = r6.length()
            r1 = 5
            if (r0 >= r1) goto L_0x000f
            goto L_0x00b2
        L_0x000f:
            r0 = 0
            java.lang.String r6 = r6.substring(r0, r1)
            r2 = -1
            int r3 = r6.hashCode()
            r4 = 49679479(0x2f60c77, float:3.6153606E-37)
            if (r3 == r4) goto L_0x0083
            r4 = 49679502(0x2f60c8e, float:3.6153657E-37)
            if (r3 == r4) goto L_0x0078
            switch(r3) {
                case 49679470: goto L_0x006e;
                case 49679471: goto L_0x0064;
                case 49679472: goto L_0x005a;
                case 49679473: goto L_0x0050;
                case 49679474: goto L_0x0046;
                case 49679475: goto L_0x003b;
                case 49679476: goto L_0x0032;
                case 49679477: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x008d
        L_0x0028:
            java.lang.String r0 = "46007"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x008d
            r1 = 2
            goto L_0x008e
        L_0x0032:
            java.lang.String r0 = "46006"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x008d
            goto L_0x008e
        L_0x003b:
            java.lang.String r0 = "46005"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x008d
            r1 = 8
            goto L_0x008e
        L_0x0046:
            java.lang.String r0 = "46004"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x008d
            r1 = 3
            goto L_0x008e
        L_0x0050:
            java.lang.String r0 = "46003"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x008d
            r1 = 7
            goto L_0x008e
        L_0x005a:
            java.lang.String r0 = "46002"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x008d
            r1 = 1
            goto L_0x008e
        L_0x0064:
            java.lang.String r0 = "46001"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x008d
            r1 = 4
            goto L_0x008e
        L_0x006e:
            java.lang.String r1 = "46000"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x008d
            r1 = 0
            goto L_0x008e
        L_0x0078:
            java.lang.String r0 = "46011"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x008d
            r1 = 9
            goto L_0x008e
        L_0x0083:
            java.lang.String r0 = "46009"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x008d
            r1 = 6
            goto L_0x008e
        L_0x008d:
            r1 = -1
        L_0x008e:
            switch(r1) {
                case 0: goto L_0x00a8;
                case 1: goto L_0x00a8;
                case 2: goto L_0x00a8;
                case 3: goto L_0x00a8;
                case 4: goto L_0x009e;
                case 5: goto L_0x009e;
                case 6: goto L_0x009e;
                case 7: goto L_0x0094;
                case 8: goto L_0x0094;
                case 9: goto L_0x0094;
                default: goto L_0x0091;
            }
        L_0x0091:
            java.lang.String r6 = "0"
            return r6
        L_0x0094:
            java.lang.String r6 = f23083a
            java.lang.String r0 = "中国电信"
            com.cmic.sso.sdk.d.f.a(r6, r0)
            java.lang.String r6 = "3"
            return r6
        L_0x009e:
            java.lang.String r6 = f23083a
            java.lang.String r0 = "中国联通"
            com.cmic.sso.sdk.d.f.a(r6, r0)
            java.lang.String r6 = "2"
            return r6
        L_0x00a8:
            java.lang.String r6 = f23083a
            java.lang.String r0 = "中国移动"
            com.cmic.sso.sdk.d.f.a(r6, r0)
            java.lang.String r6 = "1"
            return r6
        L_0x00b2:
            java.lang.String r6 = "0"
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmic.sso.sdk.d.m.a(java.lang.String):java.lang.String");
    }

    private static String a(double d2, double d3, Context context) {
        try {
            List<Address> fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation(d2, d3, 1);
            if (fromLocation.size() > 0) {
                String address = fromLocation.get(0).toString();
                int indexOf = address.indexOf("0:\"") + 3;
                return address.substring(indexOf, address.indexOf("\"", indexOf));
            }
        } catch (IOException unused) {
        }
        return "获取失败";
    }
}
