package com.ss.android.socialbase.appdownloader;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import com.ss.android.socialbase.appdownloader.depend.AbsAppDownloadDepend;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadDepend;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadEventHandler;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.constants.f;
import com.ss.android.socialbase.downloader.depend.n;
import com.ss.android.socialbase.downloader.depend.u;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.b;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;

public class AppDownloadUtils {
    private static NotificationChannel mNotificationChannel;

    public static int getPackageInfoFlag() {
        if (AppDownloader.getInstance().isUsePackageFlagConfiguration()) {
            return 16384;
        }
        return 0;
    }

    public static boolean isMainThread() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public static boolean canNotAutoInstall(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optBoolean("bind_app", false) || !jSONObject.optBoolean("auto_install_with_notification", true)) {
                return true;
            }
            return false;
        } catch (JSONException unused) {
        }
    }

    public static int getNotificationType(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == -2) {
            return 2;
        }
        if (i == 1) {
            return 4;
        }
        if (f.b(i)) {
            return 1;
        }
        if (f.a(i)) {
            return 3;
        }
        return 0;
    }

    public static boolean isApkMineType(String str) {
        if (TextUtils.isEmpty(str) || !str.equals("application/vnd.android.package-archive")) {
            return false;
        }
        return true;
    }

    public static boolean isAutoInstallWithoutNotification(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (new JSONObject(str).optBoolean("auto_install_without_notification", false)) {
                return true;
            }
        } catch (JSONException unused) {
        }
        return false;
    }

    public static boolean isBindApp(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (new JSONObject(str).optBoolean("bind_app", false)) {
                return true;
            }
        } catch (JSONException unused) {
        }
        return false;
    }

    @TargetApi(26)
    public static String getNotificationChannelId(@NonNull Context context) {
        try {
            if (mNotificationChannel == null) {
                NotificationChannel notificationChannel = new NotificationChannel("111111", "channel_appdownloader", 3);
                mNotificationChannel = notificationChannel;
                notificationChannel.setSound(null, null);
                mNotificationChannel.setShowBadge(false);
                ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(mNotificationChannel);
            }
        } catch (Throwable unused) {
        }
        return "111111";
    }

    public static String bytesToHuman(long j) {
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
                str = format(j, j2, strArr[i]);
                break;
            }
            i++;
        }
        return str;
    }

    public static String getAppDownloadPath(Context context) {
        String str;
        File file;
        Context applicationContext = context.getApplicationContext();
        try {
            str = Environment.getExternalStorageState();
        } catch (NullPointerException unused) {
            str = "";
        } catch (IncompatibleClassChangeError unused2) {
            str = "";
        }
        if ("mounted".equals(str)) {
            file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        } else {
            file = applicationContext.getFilesDir();
        }
        if (file != null) {
            if (file.exists()) {
                if (!file.isDirectory()) {
                    throw new IllegalStateException(file.getAbsolutePath() + " already exists and is not a directory");
                }
            } else if (!file.mkdirs()) {
                throw new IllegalStateException("Unable to create directory: " + file.getAbsolutePath());
            }
            return file.getAbsolutePath();
        }
        throw new IllegalStateException("Failed to get storage directory");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (r8 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r8.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008f, code lost:
        if (r8 != null) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008a A[SYNTHETIC, Splitter:B:33:0x008a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isMaterialNotification(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 20
            if (r0 <= r2) goto L_0x0093
            if (r8 != 0) goto L_0x000b
            goto L_0x0093
        L_0x000b:
            r0 = 0
            r2 = 2131624006(0x7f0e0046, float:1.887518E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            boolean r3 = r3.useReflectParseRes()     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            if (r3 == 0) goto L_0x001f
            java.lang.String r2 = "appdownloader_notification_title_color"
            int r2 = com.ss.android.socialbase.appdownloader.d.e(r8, r2)     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
        L_0x001f:
            android.content.res.Resources r3 = r8.getResources()     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            int r2 = r3.getColor(r2)     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            r3 = 16842904(0x1010098, float:2.3693984E-38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            boolean r4 = r4.useReflectParseRes()     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            if (r4 == 0) goto L_0x003c
            java.lang.String r3 = "textColor"
            java.lang.String r4 = "android"
            int r3 = com.ss.android.socialbase.appdownloader.d.b(r8, r3, r4)     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
        L_0x003c:
            r4 = 16842901(0x1010095, float:2.3693976E-38)
            com.ss.android.socialbase.appdownloader.AppDownloader r5 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            boolean r5 = r5.useReflectParseRes()     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            if (r5 == 0) goto L_0x0051
            java.lang.String r4 = "textSize"
            java.lang.String r5 = "android"
            int r4 = com.ss.android.socialbase.appdownloader.d.b(r8, r4, r5)     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
        L_0x0051:
            r5 = 2
            int[] r5 = new int[r5]     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            r5[r1] = r3     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            r3 = 1
            r5[r3] = r4     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            r4 = 2131493519(0x7f0c028f, float:1.861052E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r6 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            boolean r6 = r6.useReflectParseRes()     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            if (r6 == 0) goto L_0x006c
            java.lang.String r4 = "appdownloader_style_notification_title"
            int r4 = com.ss.android.socialbase.appdownloader.d.c(r8, r4)     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
        L_0x006c:
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r4, r5)     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            int r0 = r8.getColor(r1, r1)     // Catch:{ Throwable -> 0x008f, all -> 0x0082 }
            if (r2 != r0) goto L_0x007c
            if (r8 == 0) goto L_0x007b
            r8.recycle()     // Catch:{ Throwable -> 0x007b }
        L_0x007b:
            return r3
        L_0x007c:
            if (r8 == 0) goto L_0x0092
        L_0x007e:
            r8.recycle()     // Catch:{ Throwable -> 0x0092 }
            goto L_0x0092
        L_0x0082:
            r0 = move-exception
            r7 = r0
            r0 = r8
            r8 = r7
            goto L_0x0088
        L_0x0087:
            r8 = move-exception
        L_0x0088:
            if (r0 == 0) goto L_0x008d
            r0.recycle()     // Catch:{ Throwable -> 0x008d }
        L_0x008d:
            throw r8
        L_0x008e:
            r8 = r0
        L_0x008f:
            if (r8 == 0) goto L_0x0092
            goto L_0x007e
        L_0x0092:
            return r1
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.AppDownloadUtils.isMaterialNotification(android.content.Context):boolean");
    }

    public static boolean isPackageNameValid(DownloadInfo downloadInfo, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!TextUtils.isEmpty(downloadInfo.getPackageName()) && str.equals(downloadInfo.getPackageName())) {
            return true;
        }
        if (TextUtils.isEmpty(downloadInfo.getName()) || !isPackageNameEqualsWithApk(b.q(), downloadInfo, str)) {
            return false;
        }
        return true;
    }

    private static String format(long j, long j2, String str) {
        double d2;
        if (j2 > 1) {
            double d3 = (double) j;
            double d4 = (double) j2;
            Double.isNaN(d3);
            Double.isNaN(d4);
            d2 = d3 / d4;
        } else {
            d2 = (double) j;
        }
        return new DecimalFormat("#.##").format(d2) + " " + str;
    }

    public static String getValidName(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (!TextUtils.isEmpty(lastPathSegment)) {
            str2 = lastPathSegment;
        } else if (TextUtils.isEmpty(str2)) {
            str2 = "default.apk";
        }
        if (isApkMineType(str3) && !str2.endsWith(".apk")) {
            str2 = str2 + ".apk";
        }
        return str2;
    }

    public static boolean isApkInstalled(Context context, String str, String str2) {
        PackageInfo packageInfo;
        boolean z = false;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            File file = new File(str, str2);
            if (file.exists()) {
                PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), getPackageInfoFlag());
                if (packageArchiveInfo == null) {
                    return false;
                }
                String str3 = packageArchiveInfo.packageName;
                int i = packageArchiveInfo.versionCode;
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str3, getPackageInfoFlag());
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    if (i <= packageInfo.versionCode) {
                        z = true;
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return z;
    }

    public static boolean isPackageNameEqualsWithApk(Context context, DownloadInfo downloadInfo, String str) {
        PackageInfo packageInfo;
        boolean z = false;
        if (context == null) {
            return false;
        }
        try {
            File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
            if (file.exists()) {
                PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), getPackageInfoFlag());
                if (packageArchiveInfo == null || !packageArchiveInfo.packageName.equals(str)) {
                    return false;
                }
                int i = packageArchiveInfo.versionCode;
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str, getPackageInfoFlag());
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

    public static int startViewIntent(Context context, int i, boolean z) {
        boolean z2;
        DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i);
        if (downloadInfo == null || TextUtils.isEmpty(downloadInfo.getMimeType()) || !downloadInfo.getMimeType().equals("application/vnd.android.package-archive")) {
            return 2;
        }
        int[] iArr = {0};
        Intent buildViewIntent = buildViewIntent(context, i, z, iArr);
        if (buildViewIntent != null) {
            IAppDownloadDepend appDownloadDepend = AppDownloader.getInstance().getAppDownloadDepend();
            if (appDownloadDepend == null || !(appDownloadDepend instanceof AbsAppDownloadDepend)) {
                z2 = true;
            } else {
                z2 = ((AbsAppDownloadDepend) appDownloadDepend).needClearWhenTaskReset();
            }
            int i2 = 268435456;
            if (z2) {
                i2 = 268959744;
            }
            buildViewIntent.addFlags(i2);
            try {
                context.startActivity(buildViewIntent);
                return 1;
            } catch (Throwable unused) {
                return 0;
            }
        } else if (iArr[0] == 1) {
            return 2;
        } else {
            return 0;
        }
    }

    private static Intent buildViewIntent(Context context, int i, boolean z, int[] iArr) {
        Intent intent;
        boolean z2;
        boolean z3;
        Context context2 = context;
        int i2 = i;
        boolean z4 = z;
        DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i2);
        if (downloadInfo == null || TextUtils.isEmpty(downloadInfo.getSavePath()) || TextUtils.isEmpty(downloadInfo.getName())) {
            return null;
        }
        File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(file.getAbsolutePath(), getPackageInfoFlag());
        int i3 = 1;
        if (isApkInstalled(context2, downloadInfo.getSavePath(), downloadInfo.getName())) {
            if (packageArchiveInfo != null) {
                intent = packageManager.getLaunchIntentForPackage(packageArchiveInfo.packageName);
            } else {
                intent = null;
            }
            z2 = false;
        } else {
            Uri uriForFile = getUriForFile(i2, Downloader.getInstance(context).getDownloadFileUriProvider(i2), context2, AppDownloader.getInstance().getFileProviderAuthority(), file);
            if (uriForFile == null || !file.exists()) {
                return null;
            }
            if (!TextUtils.isEmpty(downloadInfo.getPackageName()) && packageArchiveInfo != null && !packageArchiveInfo.packageName.equals(downloadInfo.getPackageName())) {
                IAppDownloadEventHandler appDownloadEventHandler = AppDownloader.getInstance().getAppDownloadEventHandler();
                if (appDownloadEventHandler != null) {
                    appDownloadEventHandler.handleAppInstallError(i, 8, downloadInfo.getPackageName(), packageArchiveInfo.packageName, "");
                    if (appDownloadEventHandler.isForbidInvalidatePackageInstall()) {
                        return null;
                    }
                }
                u downloadNotificationEventListener = Downloader.getInstance(context).getDownloadNotificationEventListener(i2);
                if (downloadNotificationEventListener != null) {
                    downloadNotificationEventListener.a(8, downloadInfo, packageArchiveInfo.packageName, "");
                    IAppDownloadDepend appDownloadDepend = AppDownloader.getInstance().getAppDownloadDepend();
                    if ((appDownloadDepend instanceof AbsAppDownloadDepend) && ((AbsAppDownloadDepend) appDownloadDepend).isForbiddenInstallForInvalidatePackageName()) {
                        return null;
                    }
                }
            }
            intent = new Intent("android.intent.action.VIEW");
            if (Build.VERSION.SDK_INT >= 24) {
                intent.addFlags(1);
            }
            intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
            IAppDownloadEventHandler appDownloadEventHandler2 = AppDownloader.getInstance().getAppDownloadEventHandler();
            if (appDownloadEventHandler2 != null) {
                z3 = appDownloadEventHandler2.installIntercept(i2, z4);
            } else {
                z3 = false;
            }
            u downloadNotificationEventListener2 = Downloader.getInstance(context).getDownloadNotificationEventListener(i2);
            if (downloadNotificationEventListener2 != null) {
                z2 = downloadNotificationEventListener2.a(z4);
            } else {
                z2 = z3;
            }
        }
        if (!z2) {
            i3 = 0;
        }
        iArr[0] = i3;
        if (z2) {
            return null;
        }
        return intent;
    }

    public static Uri getUriForFile(int i, n nVar, Context context, String str, File file) {
        Uri uri;
        if (nVar != null) {
            try {
                uri = nVar.a(str, file.getAbsolutePath());
            } catch (Throwable unused) {
            }
        } else {
            IAppDownloadFileUriProvider appFileUriProvider = AppDownloader.getInstance().getAppFileUriProvider();
            if (appFileUriProvider != null) {
                uri = appFileUriProvider.getUriForFile(i, str, file.getAbsolutePath());
            }
            uri = null;
        }
        if (uri == null) {
            try {
                if (Build.VERSION.SDK_INT < 24 || TextUtils.isEmpty(str)) {
                    return Uri.fromFile(file);
                }
                return FileProvider.getUriForFile(context, str, file);
            } catch (Throwable unused2) {
            }
        }
        return uri;
    }
}
