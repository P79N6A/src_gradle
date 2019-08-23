package com.tencent.open.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.open.a.f;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import org.json.JSONException;
import org.json.JSONObject;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static String f79753a = "";

    /* renamed from: b  reason: collision with root package name */
    public static String f79754b = "";

    /* renamed from: c  reason: collision with root package name */
    private static String f79755c = "";

    /* renamed from: d  reason: collision with root package name */
    private static String f79756d = "";

    /* renamed from: e  reason: collision with root package name */
    private static int f79757e = -1;

    /* renamed from: f  reason: collision with root package name */
    private static String f79758f = null;
    private static String g = "0123456789ABCDEF";

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f79759a;

        /* renamed from: b  reason: collision with root package name */
        public long f79760b;

        /* renamed from: c  reason: collision with root package name */
        public long f79761c;

        public a(String str, int i) {
            this.f79759a = str;
            this.f79760b = (long) i;
            if (this.f79759a != null) {
                this.f79761c = (long) this.f79759a.length();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            boolean r1 = d((android.content.Context) r4)     // Catch:{ Exception -> 0x0017 }
            if (r1 == 0) goto L_0x000f
            java.lang.String r2 = "com.tencent.mtt"
            java.lang.String r3 = "com.tencent.mtt.MainActivity"
            a(r4, r2, r3, r5)     // Catch:{ Exception -> 0x0018 }
            goto L_0x0042
        L_0x000f:
            java.lang.String r2 = "com.android.browser"
            java.lang.String r3 = "com.android.browser.BrowserActivity"
            a(r4, r2, r3, r5)     // Catch:{ Exception -> 0x0018 }
            goto L_0x0042
        L_0x0017:
            r1 = 0
        L_0x0018:
            if (r1 == 0) goto L_0x0033
            java.lang.String r1 = "com.android.browser"
            java.lang.String r2 = "com.android.browser.BrowserActivity"
            a(r4, r1, r2, r5)     // Catch:{ Exception -> 0x0022 }
            goto L_0x0042
        L_0x0022:
            java.lang.String r1 = "com.google.android.browser"
            java.lang.String r2 = "com.android.browser.BrowserActivity"
            a(r4, r1, r2, r5)     // Catch:{ Exception -> 0x002a }
            goto L_0x0042
        L_0x002a:
            java.lang.String r1 = "com.android.chrome"
            java.lang.String r2 = "com.google.android.apps.chrome.Main"
            a(r4, r1, r2, r5)     // Catch:{ Exception -> 0x0032 }
            goto L_0x0042
        L_0x0032:
            return r0
        L_0x0033:
            java.lang.String r1 = "com.google.android.browser"
            java.lang.String r2 = "com.android.browser.BrowserActivity"
            a(r4, r1, r2, r5)     // Catch:{ Exception -> 0x003b }
            goto L_0x0042
        L_0x003b:
            java.lang.String r1 = "com.android.chrome"
            java.lang.String r2 = "com.google.android.apps.chrome.Main"
            a(r4, r1, r2, r5)     // Catch:{ Exception -> 0x0044 }
        L_0x0042:
            r4 = 1
            return r4
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.d.h.a(android.content.Context, java.lang.String):boolean");
    }

    public static boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return true;
        }
        NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
        if (allNetworkInfo != null) {
            for (NetworkInfo isConnectedOrConnecting : allNetworkInfo) {
                if (isConnectedOrConnecting.isConnectedOrConnecting()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String a() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces != null && networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress()) {
                            return nextElement.getHostAddress().toString();
                        }
                    }
                }
            }
        } catch (SocketException e2) {
            f.a("openSDK_LOG.Util", "getUserIp SocketException ", e2);
        }
        return "";
    }

    public static byte[] e(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static Bundle a(String str) {
        Bundle bundle = new Bundle();
        if (str == null) {
            return bundle;
        }
        try {
            for (String split : str.split("&")) {
                String[] split2 = split.split("=");
                if (split2.length == 2) {
                    bundle.putString(URLDecoder.decode(split2[0]), URLDecoder.decode(split2[1]));
                }
            }
            return bundle;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bundle b(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            Bundle a2 = a(url.getQuery());
            a2.putAll(a(url.getRef()));
            return a2;
        } catch (MalformedURLException unused) {
            return new Bundle();
        }
    }

    public static JSONObject c(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            JSONObject a2 = a((JSONObject) null, url.getQuery());
            a(a2, url.getRef());
            return a2;
        } catch (MalformedURLException unused) {
            return new JSONObject();
        }
    }

    public static String b(Context context) {
        if (context == null) {
            return "";
        }
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            Criteria criteria = new Criteria();
            criteria.setCostAllowed(false);
            criteria.setAccuracy(2);
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider != null) {
                Location lastKnownLocation = locationManager.getLastKnownLocation(bestProvider);
                if (lastKnownLocation == null) {
                    return "";
                }
                double latitude = lastKnownLocation.getLatitude();
                double longitude = lastKnownLocation.getLongitude();
                String str = latitude + "*" + longitude;
                f79758f = str;
                return str;
            }
        } catch (Exception e2) {
            f.b("openSDK_LOG.Util", "getLocation>>>", e2);
        }
        return "";
    }

    public static boolean c(Context context) {
        double d2;
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            d2 = Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d));
        } catch (Throwable unused) {
            d2 = 0.0d;
        }
        if (d2 > 6.5d) {
            return true;
        }
        return false;
    }

    public static JSONObject d(String str) throws JSONException {
        if (str.equals("false")) {
            str = "{value : false}";
        }
        if (str.equals("true")) {
            str = "{value : true}";
        }
        if (str.contains("allback(")) {
            str = str.replaceFirst("[\\s\\S]*allback\\(([\\s\\S]*)\\);[^\\)]*\\z", "$1").trim();
        }
        if (str.contains("online[0]=")) {
            str = "{online:" + str.charAt(str.length() - 2) + "}";
        }
        return new JSONObject(str);
    }

    private static boolean d(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.tencent.mtt", 64);
            String str = packageInfo.versionName;
            if (f.a(str, "4.3") >= 0 && !str.startsWith("4.4")) {
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr != null) {
                    try {
                        MessageDigest instance = MessageDigest.getInstance("MD5");
                        instance.update(signatureArr[0].toByteArray());
                        String a2 = a(instance.digest());
                        instance.reset();
                        if (a2.equals("d8391a394d4a179e6fe7bdb8a301258b")) {
                            return true;
                        }
                    } catch (NoSuchAlgorithmException e2) {
                        f.e("openSDK_LOG.Util", "isQQBrowerAvailable has exception: " + e2.getMessage());
                    }
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            String num = Integer.toString(b2 & 255, 16);
            if (num.length() == 1) {
                num = PushConstants.PUSH_TYPE_NOTIFY + num;
            }
            sb.append(num);
        }
        return sb.toString();
    }

    public static String c(Context context, String str) {
        if (context == null) {
            return "";
        }
        b(context, str);
        return f79755c;
    }

    public static void b(Context context, String str) {
        if (context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
                String str2 = packageInfo.versionName;
                f79753a = str2;
                f79755c = str2.substring(0, f79753a.lastIndexOf(46));
                String str3 = f79753a;
                f79756d = str3.substring(str3.lastIndexOf(46) + 1, f79753a.length());
                f79757e = packageInfo.versionCode;
            } catch (PackageManager.NameNotFoundException e2) {
                f.e("openSDK_LOG.Util", "getPackageInfo has exception: " + e2.getMessage());
            } catch (Exception e3) {
                f.e("openSDK_LOG.Util", "getPackageInfo has exception: " + e3.getMessage());
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONObject a(org.json.JSONObject r7, java.lang.String r8) {
        /*
            if (r7 != 0) goto L_0x0007
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
        L_0x0007:
            if (r8 == 0) goto L_0x0056
            java.lang.String r0 = "&"
            java.lang.String[] r8 = r8.split(r0)
            int r0 = r8.length
            r1 = 0
            r2 = 0
        L_0x0012:
            if (r2 >= r0) goto L_0x0056
            r3 = r8[r2]
            java.lang.String r4 = "="
            java.lang.String[] r3 = r3.split(r4)
            int r4 = r3.length
            r5 = 2
            if (r4 != r5) goto L_0x0053
            r4 = 1
            r5 = r3[r1]     // Catch:{ Exception -> 0x0034 }
            java.lang.String r5 = java.net.URLDecoder.decode(r5)     // Catch:{ Exception -> 0x0034 }
            r3[r1] = r5     // Catch:{ Exception -> 0x0034 }
            r5 = r3[r4]     // Catch:{ Exception -> 0x0034 }
            java.lang.String r5 = java.net.URLDecoder.decode(r5)     // Catch:{ Exception -> 0x0034 }
            r3[r4] = r5     // Catch:{ Exception -> 0x0034 }
            goto L_0x0034
        L_0x0032:
            r3 = move-exception
            goto L_0x003c
        L_0x0034:
            r5 = r3[r1]     // Catch:{ JSONException -> 0x0032 }
            r3 = r3[r4]     // Catch:{ JSONException -> 0x0032 }
            r7.put(r5, r3)     // Catch:{ JSONException -> 0x0032 }
            goto L_0x0053
        L_0x003c:
            java.lang.String r4 = "openSDK_LOG.Util"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "decodeUrlToJson has exception: "
            r5.<init>(r6)
            java.lang.String r3 = r3.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.open.a.f.e(r4, r3)
        L_0x0053:
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0056:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.d.h.a(org.json.JSONObject, java.lang.String):org.json.JSONObject");
    }

    private static void a(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        intent.setData(Uri.parse(str3));
        context.startActivity(intent);
    }

    public static Bundle a(String str, String str2, String str3, String str4, String str5, String str6) {
        return a(str, str3, str4, str2, str5, str6, "", "", "", "", "", "");
    }

    public static Bundle a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        bundle.putString("result", str);
        bundle.putString("code", str2);
        bundle.putString("tmcost", str3);
        bundle.putString("rate", str4);
        bundle.putString("cmd", str5);
        bundle.putString("uin", str6);
        bundle.putString("appid", str7);
        bundle.putString("share_type", str8);
        bundle.putString("detail", str9);
        bundle.putString("os_ver", Build.VERSION.RELEASE);
        bundle.putString("network", com.tencent.open.b.a.a(c.a()));
        bundle.putString("apn", com.tencent.open.b.a.b(c.a()));
        bundle.putString("model_name", Build.MODEL);
        bundle.putString("sdk_ver", "3.3.0.lite");
        bundle.putString("packagename", c.b());
        bundle.putString("app_ver", c(c.a(), c.b()));
        return bundle;
    }

    public static Bundle a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        Bundle bundle = new Bundle();
        bundle.putString("openid", str);
        bundle.putString("report_type", str2);
        bundle.putString("act_type", str3);
        bundle.putString("via", str4);
        bundle.putString("app_id", str5);
        bundle.putString("result", str6);
        bundle.putString("type", str7);
        bundle.putString("login_status", str8);
        bundle.putString("need_user_auth", str9);
        bundle.putString("to_uin", str10);
        bundle.putString("call_source", str11);
        bundle.putString("to_type", str12);
        return bundle;
    }
}
