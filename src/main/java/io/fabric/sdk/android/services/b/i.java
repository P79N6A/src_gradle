package io.fabric.sdk.android.services.b;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.q.c;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator<File> f83171a = new Comparator<File>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return (int) (((File) obj).lastModified() - ((File) obj2).lastModified());
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f83172b;

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f83173c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: d  reason: collision with root package name */
    private static long f83174d = -1;

    public enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        private static final Map<String, a> matcher = null;

        public static a getValue() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                return UNKNOWN;
            }
            a aVar = matcher.get(str.toLowerCase(Locale.US));
            if (aVar == null) {
                aVar = UNKNOWN;
            }
            return aVar;
        }

        static {
            HashMap hashMap = new HashMap(4);
            matcher = hashMap;
            hashMap.put("armeabi-v7a", ARMV7);
            matcher.put("armeabi", ARMV6);
            matcher.put("arm64-v8a", ARM64);
            matcher.put("x86", X86_32);
        }
    }

    private static String a(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return a(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            StringBuilder sb = new StringBuilder("Could not create hashing algorithm: ");
            sb.append(str);
            sb.append(", returning empty string.");
            return "";
        }
    }

    public static String a(String... strArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i <= 0; i++) {
            String str = strArr[0];
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String append : arrayList) {
            sb.append(append);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return a(sb2);
        }
        return null;
    }

    public static void a(Context context, String str) {
        k(context);
    }

    public static boolean a(Context context, String str, boolean z) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                int a2 = a(context, str, "bool");
                if (a2 > 0) {
                    return resources.getBoolean(a2);
                }
                int a3 = a(context, str, "string");
                if (a3 > 0) {
                    return Boolean.parseBoolean(context.getString(a3));
                }
            }
        }
        return z;
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i] & 255;
            int i2 = i * 2;
            cArr[i2] = f83173c[b2 >>> 4];
            cArr[i2 + 1] = f83173c[b2 & 15];
        }
        return new String(cArr);
    }

    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        new java.lang.StringBuilder("Unexpected meminfo format while computing RAM: ").append(r3);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0064 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized long a() {
        /*
            java.lang.Class<io.fabric.sdk.android.services.b.i> r0 = io.fabric.sdk.android.services.b.i.class
            monitor-enter(r0)
            long r1 = f83174d     // Catch:{ all -> 0x0075 }
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0071
            r1 = 0
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = "/proc/meminfo"
            r3.<init>(r4)     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = "MemTotal"
            java.lang.String r3 = a((java.io.File) r3, (java.lang.String) r4)     // Catch:{ all -> 0x0075 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0075 }
            if (r4 != 0) goto L_0x006e
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = r3.toUpperCase(r4)     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = "KB"
            boolean r4 = r3.endsWith(r4)     // Catch:{ NumberFormatException -> 0x0064 }
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = "KB"
            r5 = 1024(0x400, float:1.435E-42)
            long r4 = a((java.lang.String) r3, (java.lang.String) r4, (int) r5)     // Catch:{ NumberFormatException -> 0x0064 }
            goto L_0x006f
        L_0x0037:
            java.lang.String r4 = "MB"
            boolean r4 = r3.endsWith(r4)     // Catch:{ NumberFormatException -> 0x0064 }
            if (r4 == 0) goto L_0x0048
            java.lang.String r4 = "MB"
            r5 = 1048576(0x100000, float:1.469368E-39)
            long r4 = a((java.lang.String) r3, (java.lang.String) r4, (int) r5)     // Catch:{ NumberFormatException -> 0x0064 }
            goto L_0x006f
        L_0x0048:
            java.lang.String r4 = "GB"
            boolean r4 = r3.endsWith(r4)     // Catch:{ NumberFormatException -> 0x0064 }
            if (r4 == 0) goto L_0x0059
            java.lang.String r4 = "GB"
            r5 = 1073741824(0x40000000, float:2.0)
            long r4 = a((java.lang.String) r3, (java.lang.String) r4, (int) r5)     // Catch:{ NumberFormatException -> 0x0064 }
            goto L_0x006f
        L_0x0059:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0064 }
            java.lang.String r5 = "Unexpected meminfo format while computing RAM: "
            r4.<init>(r5)     // Catch:{ NumberFormatException -> 0x0064 }
            r4.append(r3)     // Catch:{ NumberFormatException -> 0x0064 }
            goto L_0x006e
        L_0x0064:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = "Unexpected meminfo format while computing RAM: "
            r4.<init>(r5)     // Catch:{ all -> 0x0075 }
            r4.append(r3)     // Catch:{ all -> 0x0075 }
        L_0x006e:
            r4 = r1
        L_0x006f:
            f83174d = r4     // Catch:{ all -> 0x0075 }
        L_0x0071:
            long r1 = f83174d     // Catch:{ all -> 0x0075 }
            monitor-exit(r0)
            return r1
        L_0x0075:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.b.i.a():long");
    }

    public static SharedPreferences a(Context context) {
        return c.a(context, "com.crashlytics.prefs", 0);
    }

    public static String b(InputStream inputStream) {
        return a(inputStream, "SHA-1");
    }

    public static boolean b(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean e(Context context) {
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static int g(Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    public static String i(Context context) {
        int a2 = a(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (a2 == 0) {
            return null;
        }
        String string = context.getResources().getString(a2);
        new StringBuilder("Unity Editor version is: ").append(string);
        return string;
    }

    private static boolean k(Context context) {
        if (f83172b == null) {
            f83172b = Boolean.valueOf(a(context, "com.crashlytics.Trace", false));
        }
        return f83172b.booleanValue();
    }

    private static String l(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                return context.getResources().getResourcePackageName(i);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return context.getPackageName();
    }

    public static Float b(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        return Float.valueOf(((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
    }

    public static boolean c(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if ("sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT) || string == null) {
            return true;
        }
        return false;
    }

    public static boolean d(Context context) {
        boolean c2 = c(context);
        String str = Build.TAGS;
        if ((!c2 && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (c2 || !file.exists()) {
            return false;
        }
        return true;
    }

    public static String h(Context context) {
        int a2 = a(context, "io.fabric.android.build_id", "string");
        if (a2 == 0) {
            a2 = a(context, "com.crashlytics.android.build_id", "string");
        }
        if (a2 == 0) {
            return null;
        }
        String string = context.getResources().getString(a2);
        new StringBuilder("Build ID is: ").append(string);
        return string;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean j(Context context) {
        boolean z = true;
        if (!d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            z = false;
        }
        return z;
    }

    public static String f(Context context) {
        InputStream inputStream;
        String str = null;
        try {
            inputStream = context.getResources().openRawResource(g(context));
            try {
                String b2 = b(inputStream);
                if (!b(b2)) {
                    str = b2;
                }
                a((Closeable) inputStream, "Failed to close icon input stream.");
                return str;
            } catch (Exception e2) {
                e = e2;
                try {
                    new StringBuilder("Could not calculate hash for app icon:").append(e.getMessage());
                    a((Closeable) inputStream, "Failed to close icon input stream.");
                    return null;
                } catch (Throwable th) {
                    th = th;
                    a((Closeable) inputStream, "Failed to close icon input stream.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            inputStream = null;
            new StringBuilder("Could not calculate hash for app icon:").append(e.getMessage());
            a((Closeable) inputStream, "Failed to close icon input stream.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            a((Closeable) inputStream, "Failed to close icon input stream.");
            throw th;
        }
    }

    public static String a(InputStream inputStream) throws IOException {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }

    public static String a(String str) {
        return a(str, "SHA-1");
    }

    public static void b(Context context, String str) {
        k(context);
    }

    public static String c(Context context, String str) {
        int a2 = a(context, str, "string");
        if (a2 > 0) {
            return context.getString(a2);
        }
        return "";
    }

    private static boolean d(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public static ActivityManager.RunningAppProcessInfo a(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.processName.equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        new java.lang.StringBuilder("Error parsing ").append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        r5 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.io.File r5, java.lang.String r6) {
        /*
            boolean r0 = r5.exists()
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            r2.<init>(r5)     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            r3 = 1024(0x400, float:1.435E-42)
            r0.<init>(r2, r3)     // Catch:{ Exception -> 0x003d, all -> 0x003a }
        L_0x0013:
            java.lang.String r2 = r0.readLine()     // Catch:{ Exception -> 0x003e }
            if (r2 == 0) goto L_0x0034
            java.lang.String r3 = "\\s*:\\s*"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch:{ Exception -> 0x003e }
            r4 = 2
            java.lang.String[] r2 = r3.split(r2, r4)     // Catch:{ Exception -> 0x003e }
            int r3 = r2.length     // Catch:{ Exception -> 0x003e }
            r4 = 1
            if (r3 <= r4) goto L_0x0013
            r3 = 0
            r3 = r2[r3]     // Catch:{ Exception -> 0x003e }
            boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x003e }
            if (r3 == 0) goto L_0x0013
            r6 = r2[r4]     // Catch:{ Exception -> 0x003e }
            r1 = r6
        L_0x0034:
            java.lang.String r5 = "Failed to close system file reader."
            a((java.io.Closeable) r0, (java.lang.String) r5)
            goto L_0x0050
        L_0x003a:
            r5 = move-exception
            r0 = r1
            goto L_0x004a
        L_0x003d:
            r0 = r1
        L_0x003e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "Error parsing "
            r6.<init>(r2)     // Catch:{ all -> 0x0049 }
            r6.append(r5)     // Catch:{ all -> 0x0049 }
            goto L_0x0034
        L_0x0049:
            r5 = move-exception
        L_0x004a:
            java.lang.String r6 = "Failed to close system file reader."
            a((java.io.Closeable) r0, (java.lang.String) r6)
            throw r5
        L_0x0050:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.b.i.a(java.io.File, java.lang.String):java.lang.String");
    }

    private static String a(InputStream inputStream, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return a(instance.digest());
                }
                instance.update(bArr, 0, read);
            }
        } catch (Exception unused) {
            return "";
        }
    }

    static String a(String str, String str2) {
        return a(str.getBytes(), str2);
    }

    public static void a(Context context, int i, String str) {
        k(context);
    }

    public static int a(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, l(context));
    }

    private static long a(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }
}
