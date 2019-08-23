package cn.com.chinatelecom.a.a.e;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import cn.com.chinatelecom.a.a.c.e;
import java.io.File;

public final class a {
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if (r1 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (r1 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006f, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<java.lang.String> a() {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "/mnt/sdcard"
            r0.add(r1)
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x006a, all -> 0x0062 }
            java.lang.String r3 = "/system/etcold.fstab"
            r2.<init>(r3)     // Catch:{ Exception -> 0x006a, all -> 0x0062 }
            boolean r3 = r2.exists()     // Catch:{ Exception -> 0x006a, all -> 0x0062 }
            if (r3 == 0) goto L_0x005f
            java.util.Scanner r3 = new java.util.Scanner     // Catch:{ Exception -> 0x006a, all -> 0x0062 }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r2, r4)     // Catch:{ Exception -> 0x006a, all -> 0x0062 }
        L_0x001f:
            boolean r1 = r3.hasNext()     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            if (r1 == 0) goto L_0x0059
            java.lang.String r1 = r3.nextLine()     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            java.lang.String r2 = "dev_mount"
            boolean r2 = r1.startsWith(r2)     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            if (r2 == 0) goto L_0x001f
            java.lang.String r2 = " "
            java.lang.String[] r1 = r1.split(r2)     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            r2 = 2
            r1 = r1[r2]     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            java.lang.String r2 = ":"
            boolean r2 = r1.contains(r2)     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            if (r2 == 0) goto L_0x004d
            r2 = 0
            r4 = 58
            int r4 = r1.indexOf(r4)     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            java.lang.String r1 = r1.substring(r2, r4)     // Catch:{ Exception -> 0x005d, all -> 0x005b }
        L_0x004d:
            java.lang.String r2 = "/mnt/sdcard"
            boolean r2 = r2.equals(r1)     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            if (r2 != 0) goto L_0x001f
            r0.add(r1)     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            goto L_0x001f
        L_0x0059:
            r1 = r3
            goto L_0x005f
        L_0x005b:
            r0 = move-exception
            goto L_0x0064
        L_0x005d:
            r1 = r3
            goto L_0x006a
        L_0x005f:
            if (r1 == 0) goto L_0x006f
            goto L_0x006c
        L_0x0062:
            r0 = move-exception
            r3 = r1
        L_0x0064:
            if (r3 == 0) goto L_0x0069
            r3.close()
        L_0x0069:
            throw r0
        L_0x006a:
            if (r1 == 0) goto L_0x006f
        L_0x006c:
            r1.close()
        L_0x006f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.a.a.e.a.a():java.util.ArrayList");
    }

    public static File b() {
        File file;
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState == null || !externalStorageState.contains("removed")) {
            file = new File(Environment.getExternalStorageDirectory().getPath() + File.separator + "ctaccount");
        } else {
            file = new File("/mnt/sdcard/ctaccount");
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file.exists()) {
            file = new File("/mnt/sdcard/ctaccount");
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        if (!file.exists()) {
            file = new File("/mnt/sdcard2/ctaccount");
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        if (!file.exists()) {
            file = new File("/mnt/emmc/ctaccount");
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        if (!file.exists()) {
            file = new File("/storage/sdcard1/ctaccount");
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        if (!file.exists()) {
            file = new File("/storage/sdcard2/ctaccount");
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return file;
    }

    @TargetApi(23)
    public static boolean a(Context context) {
        try {
            return Settings.System.canWrite(context);
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean a(Context context, String[] strArr) {
        if (context == null) {
            return true;
        }
        PackageManager packageManager = context.getPackageManager();
        for (int i = 0; i <= 0; i++) {
            if (-1 == packageManager.checkPermission(strArr[0], context.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    public static String a(Context context, String str, String str2) {
        String string = Settings.System.getString(context.getContentResolver(), str);
        if (!TextUtils.isEmpty(string)) {
            try {
                return e.b(string, str2);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static boolean a(Context context, String str, String str2, String str3) {
        if (Build.VERSION.SDK_INT < 23 || a(context)) {
            try {
                return Settings.System.putString(context.getContentResolver(), str3, e.a(str, str2));
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
