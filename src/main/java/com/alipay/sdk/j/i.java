package com.alipay.sdk.j;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebView;
import com.alipay.sdk.app.j;
import com.alipay.sdk.app.k;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"SetJavaScriptEnabled", "DefaultLocale"})
public final class i {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Signature[] f5534a;

        /* renamed from: b  reason: collision with root package name */
        public int f5535b;

        public final boolean a() {
            boolean z = false;
            if (this.f5534a == null || this.f5534a.length <= 0) {
                return false;
            }
            int i = 0;
            while (true) {
                if (i >= this.f5534a.length) {
                    break;
                }
                String a2 = i.a(this.f5534a[i].toByteArray());
                if (a2 != null && !TextUtils.equals(a2, "b6cbad6cbd5ed0d209afc69ad3b7a617efaae9b3c47eabe0be42d924936fa78c8001b1fd74b079e5ff9690061dacfa4768e981a526b9ca77156ca36251cf2f906d105481374998a7e6e6e18f75ca98b8ed2eaf86ff402c874cca0a263053f22237858206867d210020daa38c48b20cc9dfd82b44a51aeb5db459b22794e2d649")) {
                    com.alipay.sdk.app.a.a.a("biz", "PublicKeyUnmatch", a2);
                    z = true;
                    break;
                }
                i++;
            }
            return z;
        }
    }

    public static String a() {
        return "Android " + Build.VERSION.RELEASE;
    }

    public static String b() {
        String d2 = d();
        int indexOf = d2.indexOf("-");
        if (indexOf != -1) {
            d2 = d2.substring(0, indexOf);
        }
        int indexOf2 = d2.indexOf("\n");
        if (indexOf2 != -1) {
            d2 = d2.substring(0, indexOf2);
        }
        return "Linux ".concat(String.valueOf(d2));
    }

    public static String c() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 24; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    sb.append(String.valueOf((char) ((int) Math.round((Math.random() * 25.0d) + 65.0d))));
                    break;
                case 1:
                    sb.append(String.valueOf((char) ((int) Math.round((Math.random() * 25.0d) + 97.0d))));
                    break;
                case 2:
                    sb.append(String.valueOf(new Random().nextInt(10)));
                    break;
            }
        }
        return sb.toString();
    }

    private static String d() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(readLine);
            if (!matcher.matches()) {
                return "Unavailable";
            }
            if (matcher.groupCount() < 4) {
                return "Unavailable";
            }
            return matcher.group(1) + "\n" + matcher.group(2) + " " + matcher.group(3) + "\n" + matcher.group(4);
        } catch (IOException unused) {
            return "Unavailable";
        } catch (Throwable th) {
            bufferedReader.close();
            throw th;
        }
    }

    public static boolean a(String str) {
        return Pattern.compile("^http(s)?://([a-z0-9_\\-]+\\.)*(alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$").matcher(str).matches();
    }

    public static String e(Context context) {
        return context.getResources().getConfiguration().locale.toString();
    }

    public static boolean c(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.eg.android.AlipayGphone", SearchJediMixFeedAdapter.f42517f);
            if (packageInfo != null && packageInfo.versionCode < 99) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(Context context) {
        try {
            if (context.getPackageManager().getPackageInfo("com.alipay.android.app", SearchJediMixFeedAdapter.f42517f) == null) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static String d(Context context) {
        String a2 = a();
        String b2 = b();
        String e2 = e(context);
        String f2 = f(context);
        return " (" + a2 + ";" + b2 + ";" + e2 + ";;" + f2 + ")(sdk android)";
    }

    public static String f(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels + "*" + displayMetrics.heightPixels;
    }

    public static String g(Context context) {
        String str = "";
        try {
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
                if (next.processName.equals("com.eg.android.AlipayGphone")) {
                    str = str + "#M";
                } else if (next.processName.startsWith("com.eg.android.AlipayGphone:")) {
                    str = str + "#" + next.processName.replace("com.eg.android.AlipayGphone:", "");
                }
            }
        } catch (Throwable unused) {
            str = "";
        }
        if (str.length() > 0) {
            str = str.substring(1);
        }
        if (str.length() == 0) {
            return "N";
        }
        return str;
    }

    public static boolean b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.eg.android.AlipayGphone", SearchJediMixFeedAdapter.f42517f);
            if (packageInfo != null && packageInfo.versionCode > 73) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            com.alipay.sdk.app.a.a.a("biz", "CheckClientExistEx", th);
            return false;
        }
    }

    public static String h(Context context) {
        boolean z;
        try {
            List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < installedPackages.size(); i++) {
                PackageInfo packageInfo = installedPackages.get(i);
                int i2 = packageInfo.applicationInfo.flags;
                if ((i2 & 1) == 0 && (i2 & SearchJediMixFeedAdapter.f42517f) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (packageInfo.packageName.equals("com.eg.android.AlipayGphone")) {
                        sb.append(packageInfo.packageName);
                        sb.append(packageInfo.versionCode);
                        sb.append("-");
                    } else if (!packageInfo.packageName.contains("theme") && !packageInfo.packageName.startsWith("com.google.") && !packageInfo.packageName.startsWith("com.android.")) {
                        sb.append(packageInfo.packageName);
                        sb.append("-");
                    }
                }
            }
            return sb.toString();
        } catch (Throwable th) {
            com.alipay.sdk.app.a.a.a("biz", "GetInstalledAppEx", th);
            return "";
        }
    }

    public static String a(byte[] bArr) {
        try {
            String obj = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey().toString();
            if (obj.indexOf("modulus") != -1) {
                return obj.substring(obj.indexOf("modulus") + 8, obj.lastIndexOf(",")).trim();
            }
        } catch (Exception e2) {
            com.alipay.sdk.app.a.a.a("auth", "GetPublicKeyFromSignEx", (Throwable) e2);
        }
        return null;
    }

    private static boolean a(PackageInfo packageInfo) {
        String str = "";
        boolean z = false;
        if (packageInfo == null) {
            str = str + "info == null";
        } else if (packageInfo.signatures == null) {
            str = str + "info.signatures == null";
        } else if (packageInfo.signatures.length <= 0) {
            str = str + "info.signatures.length <= 0";
        } else {
            z = true;
        }
        if (!z) {
            com.alipay.sdk.app.a.a.a("auth", "NotIncludeSignatures", str);
        }
        return z;
    }

    private static PackageInfo b(Context context, String str) {
        for (PackageInfo next : context.getPackageManager().getInstalledPackages(192)) {
            if (next.packageName.equals(str)) {
                return next;
            }
        }
        return null;
    }

    public static a a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(str, 192);
            if (!a(packageInfo2)) {
                try {
                    packageInfo = b(context, str);
                } catch (Throwable th) {
                    com.alipay.sdk.app.a.a.a("auth", "GetInstalledPackagesEx", th);
                }
                if (a(packageInfo) || packageInfo == null) {
                    return null;
                }
                a aVar = new a();
                aVar.f5534a = packageInfo.signatures;
                aVar.f5535b = packageInfo.versionCode;
                return aVar;
            }
            packageInfo = packageInfo2;
        } catch (Throwable th2) {
            com.alipay.sdk.app.a.a.a("auth", "GetInstalledPackagesEx", th2);
            packageInfo = null;
        }
        if (a(packageInfo)) {
            return null;
        }
        a aVar2 = new a();
        aVar2.f5534a = packageInfo.signatures;
        aVar2.f5535b = packageInfo.versionCode;
        return aVar2;
        throw th;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(1:2)|3|(3:5|6|(1:8))|9|11|12|13|14|(1:16)|18|(1:20)|21|22) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x00c4 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d2 A[Catch:{ Throwable -> 0x00ee }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.webkit.WebView a(android.app.Activity r5, java.lang.String r6, java.lang.String r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x001f
            android.content.Context r0 = r5.getApplicationContext()
            android.webkit.CookieSyncManager r0 = android.webkit.CookieSyncManager.createInstance(r0)
            r0.sync()
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            r0.setCookie(r6, r7)
            android.webkit.CookieSyncManager r7 = android.webkit.CookieSyncManager.getInstance()
            r7.sync()
        L_0x001f:
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r5)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            r1 = 1
            r7.setOrientation(r1)
            r5.setContentView(r7, r0)
            android.webkit.WebView r2 = new android.webkit.WebView
            r2.<init>(r5)
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.weight = r3
            r3 = 0
            r2.setVisibility(r3)
            r7.addView(r2, r0)
            android.webkit.WebSettings r7 = r2.getSettings()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = r7.getUserAgentString()
            r0.append(r4)
            java.lang.String r4 = d(r5)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r7.setUserAgentString(r0)
            android.webkit.WebSettings$RenderPriority r0 = android.webkit.WebSettings.RenderPriority.HIGH
            r7.setRenderPriority(r0)
            r7.setSupportMultipleWindows(r1)
            r7.setJavaScriptEnabled(r1)
            r7.setSavePassword(r3)
            r7.setJavaScriptCanOpenWindowsAutomatically(r1)
            int r0 = r7.getMinimumFontSize()
            int r0 = r0 + 8
            r7.setMinimumFontSize(r0)
            r7.setAllowFileAccess(r3)
            android.webkit.WebSettings$TextSize r0 = android.webkit.WebSettings.TextSize.NORMAL
            r7.setTextSize(r0)
            r2.setVerticalScrollbarOverlay(r1)
            com.alipay.sdk.j.k r7 = new com.alipay.sdk.j.k
            r7.<init>(r5)
            r2.setDownloadListener(r7)
            int r5 = android.os.Build.VERSION.SDK_INT
            r7 = 7
            if (r5 < r7) goto L_0x00b4
            android.webkit.WebSettings r5 = r2.getSettings()     // Catch:{ Exception -> 0x00b4 }
            java.lang.Class r5 = r5.getClass()     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r7 = "setDomStorageEnabled"
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x00b4 }
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x00b4 }
            r0[r3] = r4     // Catch:{ Exception -> 0x00b4 }
            java.lang.reflect.Method r5 = r5.getMethod(r7, r0)     // Catch:{ Exception -> 0x00b4 }
            if (r5 == 0) goto L_0x00b4
            android.webkit.WebSettings r7 = r2.getSettings()     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00b4 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00b4 }
            r0[r3] = r4     // Catch:{ Exception -> 0x00b4 }
            r5.invoke(r7, r0)     // Catch:{ Exception -> 0x00b4 }
        L_0x00b4:
            java.lang.String r5 = "searchBoxJavaBridge_"
            r2.removeJavascriptInterface(r5)     // Catch:{ Throwable -> 0x00c4 }
            java.lang.String r5 = "accessibility"
            r2.removeJavascriptInterface(r5)     // Catch:{ Throwable -> 0x00c4 }
            java.lang.String r5 = "accessibilityTraversal"
            r2.removeJavascriptInterface(r5)     // Catch:{ Throwable -> 0x00c4 }
            goto L_0x00ef
        L_0x00c4:
            java.lang.Class r5 = r2.getClass()     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r7 = "removeJavascriptInterface"
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ Throwable -> 0x00ee }
            java.lang.reflect.Method r5 = r5.getMethod(r7, r0)     // Catch:{ Throwable -> 0x00ee }
            if (r5 == 0) goto L_0x00ef
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r0 = "searchBoxJavaBridge_"
            r7[r3] = r0     // Catch:{ Throwable -> 0x00ee }
            r5.invoke(r2, r7)     // Catch:{ Throwable -> 0x00ee }
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r0 = "accessibility"
            r7[r3] = r0     // Catch:{ Throwable -> 0x00ee }
            r5.invoke(r2, r7)     // Catch:{ Throwable -> 0x00ee }
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r0 = "accessibilityTraversal"
            r7[r3] = r0     // Catch:{ Throwable -> 0x00ee }
            r5.invoke(r2, r7)     // Catch:{ Throwable -> 0x00ee }
            goto L_0x00ef
        L_0x00ee:
        L_0x00ef:
            int r5 = android.os.Build.VERSION.SDK_INT
            r7 = 19
            if (r5 < r7) goto L_0x00fc
            android.webkit.WebSettings r5 = r2.getSettings()
            r5.setCacheMode(r1)
        L_0x00fc:
            com.alipay.sdk.j.j.a(r2, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.j.i.a(android.app.Activity, java.lang.String, java.lang.String):android.webkit.WebView");
    }

    public static boolean a(WebView webView, String str, Activity activity) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str.toLowerCase().startsWith("alipays://platformapi/startApp?".toLowerCase()) || str.toLowerCase().startsWith("intent://platformapi/startapp?".toLowerCase())) {
            try {
                a a2 = a(activity, "com.eg.android.AlipayGphone");
                if (a2 != null) {
                    if (!a2.a()) {
                        if (str.startsWith("intent://platformapi/startapp")) {
                            str = str.replaceFirst("intent://platformapi/startapp\\?", "alipays://platformapi/startApp?");
                        }
                        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        return true;
                    }
                }
                return true;
            } catch (Throwable unused) {
            }
        } else if (TextUtils.equals(str, "sdklite://h5quit") || TextUtils.equals(str, "http://m.alipay.com/?action=h5quit")) {
            j.f5444a = j.a();
            activity.finish();
            return true;
        } else if (str.startsWith("sdklite://h5quit?result=")) {
            try {
                String substring = str.substring(str.indexOf("sdklite://h5quit?result=") + 24);
                int parseInt = Integer.parseInt(substring.substring(substring.lastIndexOf("&end_code=") + 10));
                if (parseInt != k.SUCCEEDED.h) {
                    if (parseInt != k.PAY_WAITTING.h) {
                        k a3 = k.a(k.FAILED.h);
                        j.f5444a = j.a(a3.h, a3.i, "");
                        activity.runOnUiThread(new l(activity));
                        return true;
                    }
                }
                StringBuilder sb = new StringBuilder();
                String decode = URLDecoder.decode(str);
                String substring2 = decode.substring(decode.indexOf("sdklite://h5quit?result=") + 24, decode.lastIndexOf("&end_code="));
                if (substring2.contains("&return_url=")) {
                    String str2 = substring2.split("&return_url=")[0];
                    int indexOf = substring2.indexOf("&return_url=") + 12;
                    sb.append(str2);
                    sb.append("&return_url=");
                    sb.append(substring2.substring(indexOf, substring2.indexOf("\"&", indexOf)));
                    sb.append(substring2.substring(substring2.indexOf("\"&", indexOf)));
                    substring2 = sb.toString();
                }
                k a4 = k.a(parseInt);
                j.f5444a = j.a(a4.h, a4.i, substring2);
            } catch (Exception unused2) {
                k a5 = k.a(k.PARAMS_ERROR.h);
                j.f5444a = j.a(a5.h, a5.i, "");
            }
            activity.runOnUiThread(new l(activity));
            return true;
        } else {
            j.a(webView, str);
            return true;
        }
    }
}
