package com.bytedance.common.utility;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Pair;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.UnsupportedEncodingException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.List;

public class NetworkUtils {
    private static boolean sIsReceiverRegisted;
    private static NetworkType sNetworkType = NetworkType.UNKNOWN;
    private static NetworkTypeInterceptor sNetworkTypeInterceptor;

    public enum NetworkType {
        UNKNOWN(-1),
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        
        final int nativeInt;

        public final int getValue() {
            return this.nativeInt;
        }

        public final boolean isWifi() {
            if (this == WIFI) {
                return true;
            }
            return false;
        }

        public final boolean is2G() {
            if (this == MOBILE || this == MOBILE_2G) {
                return true;
            }
            return false;
        }

        public final boolean isAvailable() {
            if (this == UNKNOWN || this == NONE) {
                return false;
            }
            return true;
        }

        private NetworkType(int i) {
            this.nativeInt = i;
        }
    }

    public enum CompressType {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        private CompressType(int i) {
            this.nativeInt = i;
        }
    }

    public interface NetworkTypeInterceptor {
        NetworkType getNetworkType();
    }

    static void setNetworkType(NetworkType networkType) {
        sNetworkType = networkType;
    }

    public static void setNetworkTypeInterceptor(NetworkTypeInterceptor networkTypeInterceptor) {
        sNetworkTypeInterceptor = networkTypeInterceptor;
    }

    public static NetworkType getNetworkTypeFast(Context context) {
        checkNetworkTypeInit(context);
        return sNetworkType;
    }

    public static String getNetworkAccessType(Context context) {
        return getNetworkAccessType(getNetworkType(context));
    }

    public static boolean is2GFast(Context context) {
        checkNetworkTypeInit(context);
        return sNetworkType.is2G();
    }

    public static boolean isNetworkAvailableFast(Context context) {
        checkNetworkTypeInit(context);
        return sNetworkType.isAvailable();
    }

    public static boolean isWifiFast(Context context) {
        checkNetworkTypeInit(context);
        return sNetworkType.isWifi();
    }

    public static boolean is2G(Context context) {
        NetworkType networkType = getNetworkType(context);
        if (networkType == NetworkType.MOBILE || networkType == NetworkType.MOBILE_2G) {
            return true;
        }
        return false;
    }

    public static boolean isNetworkAvailable(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static void checkNetworkTypeInit(Context context) {
        if (sNetworkTypeInterceptor == null || sNetworkTypeInterceptor.getNetworkType() == NetworkType.NONE) {
            registerReceiver(context);
            if (sNetworkType == NetworkType.UNKNOWN) {
                sNetworkType = getNetworkType(context);
            }
            return;
        }
        sNetworkType = sNetworkTypeInterceptor.getNetworkType();
    }

    public static String getMacAddress(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                String macAddressNew = getMacAddressNew(context);
                if (!StringUtils.isEmpty(macAddressNew)) {
                    return macAddressNew;
                }
            }
            WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getMacAddress();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String getNetworkAccessType(NetworkType networkType) {
        if (networkType == NetworkType.WIFI) {
            return "wifi";
        }
        if (networkType == NetworkType.MOBILE_2G) {
            return "2g";
        }
        if (networkType == NetworkType.MOBILE_3G) {
            return "3g";
        }
        if (networkType == NetworkType.MOBILE_4G) {
            return "4g";
        }
        if (networkType == NetworkType.MOBILE) {
            return "mobile";
        }
        return "";
    }

    public static boolean isWifi(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    if (sNetworkTypeInterceptor == null || sNetworkTypeInterceptor.getNetworkType() == NetworkType.NONE) {
                        if (1 == activeNetworkInfo.getType()) {
                            return true;
                        }
                        return false;
                    } else if (sNetworkTypeInterceptor.getNetworkType() == NetworkType.WIFI) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static void registerReceiver(Context context) {
        if (!sIsReceiverRegisted && context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            context.getApplicationContext().registerReceiver(new NetworkConnectChangeReceiver(), intentFilter);
            sIsReceiverRegisted = true;
        }
    }

    private static String getMacAddressNew(Context context) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                byte[] hardwareAddress = nextElement.getHardwareAddress();
                if (!(hardwareAddress == null || hardwareAddress.length == 0)) {
                    StringBuilder sb = new StringBuilder();
                    for (byte valueOf : hardwareAddress) {
                        sb.append(String.format("%02X:", new Object[]{Byte.valueOf(valueOf)}));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    String sb2 = sb.toString();
                    if (nextElement.getName().equals("wlan0")) {
                        return sb2;
                    }
                }
            }
            return null;
        } catch (SocketException unused) {
            return null;
        }
    }

    public static NetworkType getNetworkType(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    int type = activeNetworkInfo.getType();
                    if (1 == type) {
                        return NetworkType.WIFI;
                    }
                    if (type != 0) {
                        return NetworkType.MOBILE;
                    }
                    switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                        case 14:
                        case 15:
                            return NetworkType.MOBILE_3G;
                        case 13:
                            return NetworkType.MOBILE_4G;
                        default:
                            return NetworkType.MOBILE;
                    }
                }
            }
            return NetworkType.NONE;
        } catch (Throwable unused) {
            return NetworkType.MOBILE;
        }
    }

    private static String encode(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String format(List<Pair<String, String>> list, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (Pair next : list) {
            String encode = encode((String) next.first, str);
            String str3 = (String) next.second;
            if (str3 != null) {
                str2 = encode(str3, str);
            } else {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(encode);
            sb.append("=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
