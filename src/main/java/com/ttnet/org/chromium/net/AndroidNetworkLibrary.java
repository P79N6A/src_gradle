package com.ttnet.org.chromium.net;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.security.KeyChain;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.base.annotations.CalledByNativeUnchecked;
import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URLConnection;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Enumeration;
import java.util.List;

public class AndroidNetworkLibrary {
    AndroidNetworkLibrary() {
    }

    @CalledByNativeUnchecked
    public static void clearTestRootCertificates() throws NoSuchAlgorithmException, CertificateException, KeyStoreException {
        X509Util.clearTestRootCertificates();
    }

    @CalledByNative
    public static boolean haveOnlyLoopbackAddresses() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                try {
                    if (nextElement.isUp() && !nextElement.isLoopback()) {
                        return false;
                    }
                } catch (SocketException unused) {
                }
            }
            return true;
        } catch (Exception unused2) {
            return false;
        }
    }

    @CalledByNativeUnchecked
    public static void addTestRootCertificate(byte[] bArr) throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        X509Util.addTestRootCertificate(bArr);
    }

    @CalledByNative
    private static boolean getIsRoaming(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isRoaming();
    }

    @CalledByNative
    public static String getMimeTypeFromExtension(String str) {
        return URLConnection.guessContentTypeFromName("foo." + str);
    }

    @CalledByNative
    private static String getNetworkCountryIso(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getNetworkCountryIso();
    }

    @CalledByNative
    private static String getNetworkOperator(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getNetworkOperator();
    }

    @CalledByNative
    private static String getSimOperator(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getSimOperator();
    }

    @CalledByNative
    @TargetApi(24)
    private static boolean isCleartextPermitted(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        NetworkSecurityPolicy instance = NetworkSecurityPolicy.getInstance();
        if (Build.VERSION.SDK_INT >= 24) {
            return instance.isCleartextTrafficPermitted(str);
        }
        return instance.isCleartextTrafficPermitted();
    }

    @CalledByNative
    @TargetApi(23)
    private static boolean getIsCaptivePortal(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null || !networkCapabilities.hasCapability(17)) {
            return false;
        }
        return true;
    }

    @CalledByNative
    public static String getWifiSSID(Context context) {
        if (context == null) {
            return "";
        }
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
        if (registerReceiver != null) {
            WifiInfo wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo");
            if (wifiInfo != null) {
                String ssid = wifiInfo.getSSID();
                if (ssid != null) {
                    return ssid;
                }
            }
        }
        return "";
    }

    @CalledByNative
    @TargetApi(23)
    private static byte[][] getDnsServers(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return (byte[][]) Array.newInstance(byte.class, new int[]{0, 0});
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return (byte[][]) Array.newInstance(byte.class, new int[]{0, 0});
        }
        LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
        if (linkProperties == null) {
            return (byte[][]) Array.newInstance(byte.class, new int[]{0, 0});
        }
        List<InetAddress> dnsServers = linkProperties.getDnsServers();
        byte[][] bArr = new byte[dnsServers.size()][];
        for (int i = 0; i < dnsServers.size(); i++) {
            bArr[i] = dnsServers.get(i).getAddress();
        }
        return bArr;
    }

    @CalledByNative
    public static boolean storeKeyPair(Context context, byte[] bArr, byte[] bArr2) {
        try {
            Intent createInstallIntent = KeyChain.createInstallIntent();
            createInstallIntent.putExtra("PKEY", bArr2);
            createInstallIntent.putExtra("KEY", bArr);
            createInstallIntent.addFlags(268435456);
            context.startActivity(createInstallIntent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    @CalledByNative
    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return X509Util.verifyServerCertificates(bArr, str, str2);
        } catch (KeyStoreException unused) {
            return new AndroidCertVerifyResult(-1);
        } catch (NoSuchAlgorithmException unused2) {
            return new AndroidCertVerifyResult(-1);
        } catch (IllegalArgumentException unused3) {
            return new AndroidCertVerifyResult(-1);
        }
    }
}
