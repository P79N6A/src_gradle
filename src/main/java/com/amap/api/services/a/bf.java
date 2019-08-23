package com.amap.api.services.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.security.MessageDigest;
import java.util.Locale;

public class bf {

    /* renamed from: a  reason: collision with root package name */
    static String f6587a = null;

    /* renamed from: b  reason: collision with root package name */
    static boolean f6588b = false;

    /* renamed from: c  reason: collision with root package name */
    private static String f6589c = "";

    /* renamed from: d  reason: collision with root package name */
    private static String f6590d = "";

    /* renamed from: e  reason: collision with root package name */
    private static String f6591e = "";

    /* renamed from: f  reason: collision with root package name */
    private static String f6592f = "";

    static boolean a() {
        try {
            if (f6588b) {
                return true;
            }
            if (b(f6587a)) {
                f6588b = true;
                return true;
            } else if (!TextUtils.isEmpty(f6587a)) {
                f6588b = false;
                f6587a = null;
                return false;
            } else if (b(f6590d)) {
                f6588b = true;
                return true;
            } else if (TextUtils.isEmpty(f6590d)) {
                return true;
            } else {
                f6588b = false;
                f6590d = null;
                return false;
            }
        } catch (Throwable unused) {
            return true;
        }
    }

    public static String a(Context context) {
        try {
            return h(context);
        } catch (Throwable unused) {
            return f6592f;
        }
    }

    static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            f6592f = str;
        }
    }

    public static String f(Context context) {
        try {
            return h(context);
        } catch (Throwable th) {
            bx.a(th, "AI", "gKy");
            return f6592f;
        }
    }

    public static String b(Context context) {
        try {
            if (!"".equals(f6589c)) {
                return f6589c;
            }
            PackageManager packageManager = context.getPackageManager();
            f6589c = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0));
            return f6589c;
        } catch (Throwable th) {
            bx.a(th, "AI", "gAN");
        }
    }

    public static String c(Context context) {
        try {
            if (f6590d != null && !"".equals(f6590d)) {
                return f6590d;
            }
            String packageName = context.getPackageName();
            f6590d = packageName;
            if (!b(packageName)) {
                f6590d = context.getPackageName();
            }
            return f6590d;
        } catch (Throwable th) {
            bx.a(th, "AI", "gpck");
        }
    }

    public static String d(Context context) {
        try {
            if (!"".equals(f6591e)) {
                return f6591e;
            }
            f6591e = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (f6591e == null) {
                return "";
            }
            return f6591e;
        } catch (Throwable th) {
            bx.a(th, "AI", "gAV");
        }
    }

    private static String h(Context context) throws PackageManager.NameNotFoundException {
        if (f6592f == null || f6592f.equals("")) {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return f6592f;
            }
            String string = applicationInfo.metaData.getString("com.amap.api.v2.apikey");
            f6592f = string;
            if (string == null) {
                f6592f = g(context);
            }
        }
        return f6592f;
    }

    private static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        str.toCharArray();
        for (char c2 : str.toCharArray()) {
            if (('A' > c2 || c2 > 'z') && (('0' > c2 || c2 > ':') && c2 != '.')) {
                try {
                    ca.b(bo.a(), str, "errorPackage");
                } catch (Throwable unused) {
                }
                return false;
            }
        }
        return true;
    }

    public static String e(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            byte[] digest = MessageDigest.getInstance("SHA1").digest(packageInfo.signatures[0].toByteArray());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                String upperCase = Integer.toHexString(b2 & 255).toUpperCase(Locale.US);
                if (upperCase.length() == 1) {
                    stringBuffer.append(PushConstants.PUSH_TYPE_NOTIFY);
                }
                stringBuffer.append(upperCase);
                stringBuffer.append(":");
            }
            String str = packageInfo.packageName;
            if (b(str)) {
                str = packageInfo.packageName;
            }
            if (!TextUtils.isEmpty(f6590d)) {
                str = c(context);
            }
            stringBuffer.append(str);
            String stringBuffer2 = stringBuffer.toString();
            f6587a = stringBuffer2;
            return stringBuffer2;
        } catch (Throwable th) {
            bx.a(th, "AI", "gsp");
            return f6587a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d A[Catch:{ Throwable -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0052 A[SYNTHETIC, Splitter:B:30:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005b A[SYNTHETIC, Splitter:B:37:0x005b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String g(android.content.Context r5) {
        /*
            java.lang.String r0 = "k.store"
            java.lang.String r5 = com.amap.api.services.a.by.a((android.content.Context) r5, (java.lang.String) r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r5 = r0.exists()
            if (r5 != 0) goto L_0x0014
            java.lang.String r5 = ""
            return r5
        L_0x0014:
            r5 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x003c, all -> 0x0038 }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x003c, all -> 0x0038 }
            int r5 = r1.available()     // Catch:{ Throwable -> 0x0036 }
            byte[] r5 = new byte[r5]     // Catch:{ Throwable -> 0x0036 }
            r1.read(r5)     // Catch:{ Throwable -> 0x0036 }
            java.lang.String r5 = com.amap.api.services.a.bo.a((byte[]) r5)     // Catch:{ Throwable -> 0x0036 }
            int r2 = r5.length()     // Catch:{ Throwable -> 0x0036 }
            r3 = 32
            if (r2 != r3) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            java.lang.String r5 = ""
        L_0x0032:
            r1.close()     // Catch:{ Throwable -> 0x0035 }
        L_0x0035:
            return r5
        L_0x0036:
            r5 = move-exception
            goto L_0x0040
        L_0x0038:
            r0 = move-exception
            r1 = r5
            r5 = r0
            goto L_0x0059
        L_0x003c:
            r1 = move-exception
            r4 = r1
            r1 = r5
            r5 = r4
        L_0x0040:
            java.lang.String r2 = "AI"
            java.lang.String r3 = "gKe"
            com.amap.api.services.a.bx.a((java.lang.Throwable) r5, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0058 }
            boolean r5 = r0.exists()     // Catch:{ Throwable -> 0x0050 }
            if (r5 == 0) goto L_0x0050
            r0.delete()     // Catch:{ Throwable -> 0x0050 }
        L_0x0050:
            if (r1 == 0) goto L_0x0055
            r1.close()     // Catch:{ Throwable -> 0x0055 }
        L_0x0055:
            java.lang.String r5 = ""
            return r5
        L_0x0058:
            r5 = move-exception
        L_0x0059:
            if (r1 == 0) goto L_0x005e
            r1.close()     // Catch:{ Throwable -> 0x005e }
        L_0x005e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.bf.g(android.content.Context):java.lang.String");
    }
}
