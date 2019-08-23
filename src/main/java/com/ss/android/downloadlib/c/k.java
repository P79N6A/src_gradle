package com.ss.android.downloadlib.c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.download.api.b.c;
import com.ss.android.downloadad.api.b.a;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.downloadlib.addownload.d.d;
import com.ss.android.ugc.aweme.app.f;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f28898a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b  reason: collision with root package name */
    private static Object[] f28899b = new Object[0];

    /* renamed from: c  reason: collision with root package name */
    private static Object[] f28900c = new Object[73];

    /* renamed from: d  reason: collision with root package name */
    private static String f28901d;

    public static String a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    return a(instance.digest());
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    private static String a(byte[] bArr) {
        if (bArr != null) {
            return a(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    private static String a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        } else if (i2 + 0 <= bArr.length) {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte b2 = bArr[i5 + 0] & 255;
                int i6 = i4 + 1;
                cArr[i4] = f28898a[b2 >> 4];
                i4 = i6 + 1;
                cArr[i6] = f28898a[b2 & 15];
            }
            return new String(cArr, 0, i3);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void a(String str, int i) {
        try {
            Class<?> cls = Class.forName("android.os.FileUtils");
            if (cls != null) {
                Method method = cls.getMethod("setPermissions", new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                if (method != null) {
                    int intValue = ((Integer) method.invoke(null, new Object[]{str, 420, -1, -1})).intValue();
                    if (intValue != 0) {
                        StringBuilder sb = new StringBuilder("android.os.FileUtils.setPermissions() returned ");
                        sb.append(intValue);
                        sb.append(" for '");
                        sb.append(str);
                        sb.append("', probably didn't work.");
                    }
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        } catch (Throwable unused2) {
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (!(jSONObject == null || jSONObject2 == null)) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            } catch (JSONException unused) {
            }
        }
    }

    public static boolean a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean a(int i, int i2, String str, String str2) {
        if (i2 == 0 && TextUtils.isEmpty(str2)) {
            return true;
        }
        if ((i2 <= 0 || i < i2) && a(str, str2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean a(a aVar) {
        if (aVar == null) {
            return false;
        }
        return a(aVar.f28654e, aVar.f28655f, aVar.g).a();
    }

    public static boolean a(c cVar) {
        if (cVar == null) {
            return false;
        }
        return a(cVar.q(), cVar.m(), cVar.n()).a();
    }

    public static boolean a(Context context, Intent intent) {
        if (context == null) {
            context = com.ss.android.downloadlib.addownload.k.a();
        }
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        return queryIntentActivities != null && queryIntentActivities.size() > 0;
    }

    public static boolean a(Context context, String str, String str2) {
        PackageInfo packageInfo;
        boolean z = false;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0);
                if (packageArchiveInfo == null || !packageArchiveInfo.packageName.equals(str2)) {
                    return false;
                }
                int i = packageArchiveInfo.versionCode;
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str2, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    if (i == packageInfo.versionCode) {
                        z = true;
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return z;
    }

    public static void a(Context context, c cVar) throws com.ss.android.downloadlib.addownload.b.a {
        if (context == null) {
            throw new com.ss.android.downloadlib.addownload.b.a(0);
        } else if (a(cVar)) {
            Intent g = g(context, cVar.q());
            if (g == null) {
                throw new com.ss.android.downloadlib.addownload.b.a(0);
            }
            g.putExtra("START_ONLY_FOR_ANDROID", true);
            try {
                context.startActivity(g);
                throw new com.ss.android.downloadlib.addownload.b.a(2, 0, cVar.q());
            } catch (Exception unused) {
                throw new com.ss.android.downloadlib.addownload.b.a(0);
            }
        } else {
            throw new com.ss.android.downloadlib.addownload.b.a(0);
        }
    }

    public static String a() {
        if (TextUtils.isEmpty(f28901d) && com.ss.android.downloadlib.addownload.k.a() != null) {
            try {
                f28901d = com.ss.android.downloadlib.addownload.k.a().getPackageName();
            } catch (Exception unused) {
            }
        }
        return f28901d;
    }

    public static void a(Activity activity) {
        if (activity != null && !activity.isFinishing()) {
            activity.finish();
        }
    }

    public static boolean c(String str) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            return true;
        }
        return false;
    }

    public static Activity c(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                new StringBuilder("find non-ContextWrapper in view: ").append(context);
                return null;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        if (r10 != null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r10.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        if (r10 != null) goto L_0x0083;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0069 A[Catch:{ Throwable -> 0x0094, all -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f A[SYNTHETIC, Splitter:B:28:0x008f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(android.content.Context r10) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 20
            if (r0 <= r2) goto L_0x0098
            if (r10 != 0) goto L_0x000b
            goto L_0x0098
        L_0x000b:
            r0 = 0
            java.lang.String r2 = "#de000000"
            int r2 = android.graphics.Color.parseColor(r2)     // Catch:{ Throwable -> 0x0093, all -> 0x0089 }
            r3 = 2
            int[] r3 = new int[r3]     // Catch:{ Throwable -> 0x0093, all -> 0x0089 }
            r3 = {16842904, 16842901} // fill-array     // Catch:{ Throwable -> 0x0093, all -> 0x0089 }
            r4 = 2131493146(0x7f0c011a, float:1.8609764E38)
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r4, r3)     // Catch:{ Throwable -> 0x0093, all -> 0x0089 }
            int r0 = r10.getColor(r1, r1)     // Catch:{ Throwable -> 0x0094, all -> 0x0087 }
            r3 = 1
            if (r2 != r0) goto L_0x0028
        L_0x0026:
            r4 = 1
            goto L_0x0067
        L_0x0028:
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = r2 | r4
            r4 = r4 | r0
            int r6 = android.graphics.Color.red(r5)     // Catch:{ Throwable -> 0x0094, all -> 0x0087 }
            int r7 = android.graphics.Color.red(r4)     // Catch:{ Throwable -> 0x0094, all -> 0x0087 }
            int r6 = r6 - r7
            int r7 = android.graphics.Color.green(r5)     // Catch:{ Throwable -> 0x0094, all -> 0x0087 }
            int r8 = android.graphics.Color.green(r4)     // Catch:{ Throwable -> 0x0094, all -> 0x0087 }
            int r7 = r7 - r8
            int r5 = android.graphics.Color.blue(r5)     // Catch:{ Throwable -> 0x0094, all -> 0x0087 }
            int r4 = android.graphics.Color.blue(r4)     // Catch:{ Throwable -> 0x0094, all -> 0x0087 }
            int r5 = r5 - r4
            int r6 = r6 * r6
            int r7 = r7 * r7
            int r6 = r6 + r7
            int r5 = r5 * r5
            int r6 = r6 + r5
            double r4 = (double) r6     // Catch:{ Throwable -> 0x0094, all -> 0x0087 }
            double r4 = java.lang.Math.sqrt(r4)     // Catch:{ Throwable -> 0x0094, all -> 0x0087 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0094, all -> 0x0087 }
            java.lang.String r7 = "value:"
            r6.<init>(r7)     // Catch:{ Throwable -> 0x0094, all -> 0x0087 }
            r6.append(r4)     // Catch:{ Throwable -> 0x0094, all -> 0x0087 }
            r6 = 4638144666238189568(0x405e000000000000, double:120.0)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0066
            goto L_0x0026
        L_0x0066:
            r4 = 0
        L_0x0067:
            if (r4 == 0) goto L_0x0081
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0094, all -> 0x0087 }
            java.lang.String r5 = "similar color:"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0094, all -> 0x0087 }
            r4.append(r2)     // Catch:{ Throwable -> 0x0094, all -> 0x0087 }
            java.lang.String r2 = " "
            r4.append(r2)     // Catch:{ Throwable -> 0x0094, all -> 0x0087 }
            r4.append(r0)     // Catch:{ Throwable -> 0x0094, all -> 0x0087 }
            if (r10 == 0) goto L_0x0080
            r10.recycle()     // Catch:{ Throwable -> 0x0080 }
        L_0x0080:
            return r3
        L_0x0081:
            if (r10 == 0) goto L_0x0097
        L_0x0083:
            r10.recycle()     // Catch:{ Throwable -> 0x0097 }
            goto L_0x0097
        L_0x0087:
            r0 = move-exception
            goto L_0x008d
        L_0x0089:
            r10 = move-exception
            r9 = r0
            r0 = r10
            r10 = r9
        L_0x008d:
            if (r10 == 0) goto L_0x0092
            r10.recycle()     // Catch:{ Throwable -> 0x0092 }
        L_0x0092:
            throw r0
        L_0x0093:
            r10 = r0
        L_0x0094:
            if (r10 == 0) goto L_0x0097
            goto L_0x0083
        L_0x0097:
            return r1
        L_0x0098:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.c.k.b(android.content.Context):boolean");
    }

    public static boolean b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new File(str).exists();
        }
        return false;
    }

    public static String a(long j) {
        double d2;
        long[] jArr = {1099511627776L, 1073741824, 1048576, 1024, 1};
        int i = 0;
        String[] strArr = {"TB", "GB", "MB", "KB", "B"};
        if (j < 1) {
            return "0 " + strArr[4];
        }
        String str = null;
        while (true) {
            if (i >= 5) {
                break;
            }
            long j2 = jArr[i];
            if (j >= j2) {
                String str2 = strArr[i];
                if (j2 > 1) {
                    double d3 = (double) j;
                    double d4 = (double) j2;
                    Double.isNaN(d3);
                    Double.isNaN(d4);
                    d2 = d3 / d4;
                } else {
                    d2 = (double) j;
                }
                str = new DecimalFormat("#.##").format(d2) + " " + str2;
            } else {
                i++;
            }
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0030 A[SYNTHETIC, Splitter:B:21:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0037 A[SYNTHETIC, Splitter:B:29:0x0037] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.File r6) {
        /*
            r0 = 0
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ Exception -> 0x0034, all -> 0x002c }
            if (r1 != 0) goto L_0x000a
            return r0
        L_0x000a:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0034, all -> 0x002c }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0034, all -> 0x002c }
            r6 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r6]     // Catch:{ Exception -> 0x0035, all -> 0x002a }
        L_0x0013:
            r4 = 0
            int r5 = r2.read(r3, r4, r6)     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            if (r5 <= 0) goto L_0x001e
            r1.update(r3, r4, r5)     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            goto L_0x0013
        L_0x001e:
            byte[] r6 = r1.digest()     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            java.lang.String r6 = a((byte[]) r6)     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            r2.close()     // Catch:{ IOException -> 0x0029 }
        L_0x0029:
            return r6
        L_0x002a:
            r6 = move-exception
            goto L_0x002e
        L_0x002c:
            r6 = move-exception
            r2 = r0
        L_0x002e:
            if (r2 == 0) goto L_0x0033
            r2.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            throw r6
        L_0x0034:
            r2 = r0
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.c.k.a(java.io.File):java.lang.String");
    }

    public static long a(JSONObject jSONObject, String str) {
        long j;
        if (jSONObject == null) {
            return 0;
        }
        try {
            j = Long.valueOf(jSONObject.optString(str)).longValue();
        } catch (Exception unused) {
            j = 0;
        }
        return j;
    }

    @Deprecated
    public static boolean b(Context context, String str) {
        if (context == null) {
            context = com.ss.android.downloadlib.addownload.k.a();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Drawable a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(str, 0);
        if (packageArchiveInfo != null) {
            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
            applicationInfo.sourceDir = str;
            applicationInfo.publicSourceDir = str;
            try {
                return applicationInfo.loadIcon(packageManager);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Deprecated
    public static void d(Context context, String str) throws com.ss.android.downloadlib.addownload.b.a {
        if (context == null) {
            throw new com.ss.android.downloadlib.addownload.b.a(0);
        } else if (b(context, str)) {
            Intent g = g(context, str);
            if (g == null) {
                throw new com.ss.android.downloadlib.addownload.b.a(0);
            }
            g.putExtra("START_ONLY_FOR_ANDROID", true);
            try {
                context.startActivity(g);
                throw new com.ss.android.downloadlib.addownload.b.a(2, 0, str);
            } catch (Exception unused) {
                throw new com.ss.android.downloadlib.addownload.b.a(0);
            }
        } else {
            throw new com.ss.android.downloadlib.addownload.b.a(0);
        }
    }

    public static boolean e(Context context, String str) {
        if (context == null) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            intent.addFlags(268435456);
            intent.putExtra(f.f34168b, str);
            context.startActivity(intent);
        } catch (Throwable unused) {
        }
        return true;
    }

    public static String f(Context context, String str) {
        String str2 = "";
        if (context == null || TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0);
                if (packageArchiveInfo == null) {
                    return str2;
                }
                str2 = packageArchiveInfo.packageName;
            }
        } catch (Exception unused) {
        }
        return str2;
    }

    private static Intent g(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static int a(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    if (str.equals(str2)) {
                        return 0;
                    }
                    String[] split = str.split("\\.");
                    String[] split2 = str2.split("\\.");
                    int min = Math.min(split.length, split2.length);
                    int i = 0;
                    int i2 = 0;
                    while (i < min) {
                        i2 = Integer.parseInt(split[i]) - Integer.parseInt(split2[i]);
                        if (i2 != 0) {
                            break;
                        }
                        i++;
                    }
                    if (i2 == 0) {
                        for (int i3 = i; i3 < split.length; i3++) {
                            if (Integer.parseInt(split[i3]) > 0) {
                                return 1;
                            }
                        }
                        while (i < split2.length) {
                            if (Integer.parseInt(split2[i]) > 0) {
                                return -1;
                            }
                            i++;
                        }
                        return 0;
                    } else if (i2 > 0) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            }
            return -2;
        } catch (Exception unused) {
            return -2;
        }
    }

    public static boolean c(Context context, String str) {
        PackageInfo packageInfo;
        boolean z = false;
        if (context == null || str == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0);
                if (packageArchiveInfo == null) {
                    return false;
                }
                String str2 = packageArchiveInfo.packageName;
                int i = packageArchiveInfo.versionCode;
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str2, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    if (i <= packageInfo.versionCode) {
                        z = true;
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return z;
    }

    public static int b(String str, int i, String str2) {
        int i2 = d.f28770a;
        if (TextUtils.isEmpty(str)) {
            return i2;
        }
        try {
            PackageInfo packageInfo = com.ss.android.downloadlib.addownload.k.a().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                int i3 = d.f28771b;
                try {
                    if (!a(packageInfo.versionCode, i, packageInfo.versionName, str2)) {
                        i2 = d.f28772c;
                    }
                } catch (Exception unused) {
                }
                i2 = i3;
            }
        } catch (Exception unused2) {
        }
        return i2;
    }

    public static void b(Context context, String str, String str2) throws com.ss.android.downloadlib.addownload.b.a {
        if (context != null) {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            intent.addFlags(268435456);
            if (a(context, intent)) {
                if (Build.VERSION.SDK_INT < 26 || Build.VERSION.SDK_INT >= 29) {
                    intent.putExtra(f.f34168b, str);
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    context.startActivity(intent);
                } else {
                    TTDelegateActivity.a(str);
                }
                throw new com.ss.android.downloadlib.addownload.b.a(1, 0, str2);
            }
            throw new com.ss.android.downloadlib.addownload.b.a(0);
        }
        throw new com.ss.android.downloadlib.addownload.b.a(0);
    }

    public static d a(String str, int i, String str2) {
        d dVar = new d();
        if (TextUtils.isEmpty(str)) {
            return dVar;
        }
        try {
            PackageInfo packageInfo = com.ss.android.downloadlib.addownload.k.a().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                dVar.a(d.f28771b);
                if (com.ss.android.downloadlib.addownload.k.k != null && !a(packageInfo.versionCode, i, packageInfo.versionName, str2)) {
                    dVar.a(d.f28772c);
                }
            }
        } catch (Exception unused) {
        }
        return dVar;
    }
}
