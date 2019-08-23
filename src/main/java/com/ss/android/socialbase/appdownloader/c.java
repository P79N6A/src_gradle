package com.ss.android.socialbase.appdownloader;

import android.app.AlertDialog;
import android.support.v4.app.NotificationManagerCompat;
import com.ss.android.socialbase.appdownloader.depend.INotificationPermissionRequestCallback;
import com.ss.android.socialbase.appdownloader.view.a;
import com.ss.android.socialbase.downloader.downloader.b;
import java.util.ArrayList;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static AlertDialog f30783a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f30784b = "c";

    /* renamed from: c  reason: collision with root package name */
    private static List<INotificationPermissionRequestCallback> f30785c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private static a f30786d;

    public static boolean a() {
        try {
            return NotificationManagerCompat.from(b.q()).areNotificationsEnabled();
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(boolean r3) {
        /*
            java.lang.Class<com.ss.android.socialbase.appdownloader.c> r0 = com.ss.android.socialbase.appdownloader.c.class
            monitor-enter(r0)
            android.app.AlertDialog r1 = f30783a     // Catch:{ Throwable -> 0x0032, all -> 0x002f }
            if (r1 == 0) goto L_0x000f
            android.app.AlertDialog r1 = f30783a     // Catch:{ Throwable -> 0x0032, all -> 0x002f }
            r1.cancel()     // Catch:{ Throwable -> 0x0032, all -> 0x002f }
            r1 = 0
            f30783a = r1     // Catch:{ Throwable -> 0x0032, all -> 0x002f }
        L_0x000f:
            java.util.List<com.ss.android.socialbase.appdownloader.depend.INotificationPermissionRequestCallback> r1 = f30785c     // Catch:{ Throwable -> 0x0032, all -> 0x002f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Throwable -> 0x0032, all -> 0x002f }
        L_0x0015:
            boolean r2 = r1.hasNext()     // Catch:{ Throwable -> 0x0032, all -> 0x002f }
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r1.next()     // Catch:{ Throwable -> 0x0032, all -> 0x002f }
            com.ss.android.socialbase.appdownloader.depend.INotificationPermissionRequestCallback r2 = (com.ss.android.socialbase.appdownloader.depend.INotificationPermissionRequestCallback) r2     // Catch:{ Throwable -> 0x0032, all -> 0x002f }
            if (r2 == 0) goto L_0x0015
            if (r3 == 0) goto L_0x0029
            r2.onGranted()     // Catch:{ Throwable -> 0x0032, all -> 0x002f }
            goto L_0x0015
        L_0x0029:
            r2.onDenied()     // Catch:{ Throwable -> 0x0032, all -> 0x002f }
            goto L_0x0015
        L_0x002d:
            monitor-exit(r0)
            return
        L_0x002f:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x0032:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.c.a(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ae, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        a(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ba, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00b6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(@android.support.annotation.NonNull final android.app.Activity r7, @android.support.annotation.NonNull final com.ss.android.socialbase.appdownloader.depend.INotificationPermissionRequestCallback r8) {
        /*
            java.lang.Class<com.ss.android.socialbase.appdownloader.c> r0 = com.ss.android.socialbase.appdownloader.c.class
            monitor-enter(r0)
            r1 = 0
            if (r7 == 0) goto L_0x00b1
            boolean r2 = r7.isFinishing()     // Catch:{ Throwable -> 0x00b6 }
            if (r2 == 0) goto L_0x000e
            goto L_0x00b1
        L_0x000e:
            r2 = 2131558660(0x7f0d0104, float:1.8742642E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x00b6 }
            boolean r3 = r3.useReflectParseRes()     // Catch:{ Throwable -> 0x00b6 }
            if (r3 == 0) goto L_0x0025
            android.content.Context r2 = com.ss.android.socialbase.downloader.downloader.b.q()     // Catch:{ Throwable -> 0x00b6 }
            java.lang.String r3 = "appdownloader_notification_request_title"
            int r2 = com.ss.android.socialbase.appdownloader.d.b(r2, r3)     // Catch:{ Throwable -> 0x00b6 }
        L_0x0025:
            r3 = 2131558659(0x7f0d0103, float:1.874264E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x00b6 }
            boolean r4 = r4.useReflectParseRes()     // Catch:{ Throwable -> 0x00b6 }
            if (r4 == 0) goto L_0x003c
            android.content.Context r3 = com.ss.android.socialbase.downloader.downloader.b.q()     // Catch:{ Throwable -> 0x00b6 }
            java.lang.String r4 = "appdownloader_notification_request_message"
            int r3 = com.ss.android.socialbase.appdownloader.d.b(r3, r4)     // Catch:{ Throwable -> 0x00b6 }
        L_0x003c:
            r4 = 2131558658(0x7f0d0102, float:1.8742638E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r5 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x00b6 }
            boolean r5 = r5.useReflectParseRes()     // Catch:{ Throwable -> 0x00b6 }
            if (r5 == 0) goto L_0x0053
            android.content.Context r4 = com.ss.android.socialbase.downloader.downloader.b.q()     // Catch:{ Throwable -> 0x00b6 }
            java.lang.String r5 = "appdownloader_notification_request_btn_yes"
            int r4 = com.ss.android.socialbase.appdownloader.d.b(r4, r5)     // Catch:{ Throwable -> 0x00b6 }
        L_0x0053:
            r5 = 2131558657(0x7f0d0101, float:1.8742636E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r6 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x00b6 }
            boolean r6 = r6.useReflectParseRes()     // Catch:{ Throwable -> 0x00b6 }
            if (r6 == 0) goto L_0x006a
            android.content.Context r5 = com.ss.android.socialbase.downloader.downloader.b.q()     // Catch:{ Throwable -> 0x00b6 }
            java.lang.String r6 = "appdownloader_notification_request_btn_no"
            int r5 = com.ss.android.socialbase.appdownloader.d.b(r5, r6)     // Catch:{ Throwable -> 0x00b6 }
        L_0x006a:
            java.util.List<com.ss.android.socialbase.appdownloader.depend.INotificationPermissionRequestCallback> r6 = f30785c     // Catch:{ Throwable -> 0x00b6 }
            r6.add(r8)     // Catch:{ Throwable -> 0x00b6 }
            android.app.AlertDialog r6 = f30783a     // Catch:{ Throwable -> 0x00b6 }
            if (r6 == 0) goto L_0x007b
            android.app.AlertDialog r6 = f30783a     // Catch:{ Throwable -> 0x00b6 }
            boolean r6 = r6.isShowing()     // Catch:{ Throwable -> 0x00b6 }
            if (r6 != 0) goto L_0x00ad
        L_0x007b:
            android.app.AlertDialog$Builder r6 = new android.app.AlertDialog$Builder     // Catch:{ Throwable -> 0x00b6 }
            r6.<init>(r7)     // Catch:{ Throwable -> 0x00b6 }
            android.app.AlertDialog$Builder r2 = r6.setTitle(r2)     // Catch:{ Throwable -> 0x00b6 }
            android.app.AlertDialog$Builder r2 = r2.setMessage(r3)     // Catch:{ Throwable -> 0x00b6 }
            com.ss.android.socialbase.appdownloader.c$3 r3 = new com.ss.android.socialbase.appdownloader.c$3     // Catch:{ Throwable -> 0x00b6 }
            r3.<init>(r7, r8)     // Catch:{ Throwable -> 0x00b6 }
            android.app.AlertDialog$Builder r7 = r2.setPositiveButton(r4, r3)     // Catch:{ Throwable -> 0x00b6 }
            com.ss.android.socialbase.appdownloader.c$2 r8 = new com.ss.android.socialbase.appdownloader.c$2     // Catch:{ Throwable -> 0x00b6 }
            r8.<init>()     // Catch:{ Throwable -> 0x00b6 }
            android.app.AlertDialog$Builder r7 = r7.setNegativeButton(r5, r8)     // Catch:{ Throwable -> 0x00b6 }
            com.ss.android.socialbase.appdownloader.c$1 r8 = new com.ss.android.socialbase.appdownloader.c$1     // Catch:{ Throwable -> 0x00b6 }
            r8.<init>()     // Catch:{ Throwable -> 0x00b6 }
            android.app.AlertDialog$Builder r7 = r7.setOnKeyListener(r8)     // Catch:{ Throwable -> 0x00b6 }
            android.app.AlertDialog$Builder r7 = r7.setCancelable(r1)     // Catch:{ Throwable -> 0x00b6 }
            android.app.AlertDialog r7 = r7.show()     // Catch:{ Throwable -> 0x00b6 }
            f30783a = r7     // Catch:{ Throwable -> 0x00b6 }
        L_0x00ad:
            monitor-exit(r0)
            return
        L_0x00af:
            r7 = move-exception
            goto L_0x00bb
        L_0x00b1:
            r8.onDenied()     // Catch:{ Throwable -> 0x00b6 }
            monitor-exit(r0)
            return
        L_0x00b6:
            a(r1)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)
            return
        L_0x00bb:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.c.a(android.app.Activity, com.ss.android.socialbase.appdownloader.depend.INotificationPermissionRequestCallback):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:5|(3:7|8|9)|10|11|12|13|14|(1:16)(1:17)|18|55) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:47|48|49) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|20|(1:22)(3:23|(2:25|(1:27)(2:28|(2:30|(1:32)(1:33))(2:34|(1:38))))|39)|40) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:41|42|(1:44)(1:45)|46) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2 = r6.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r2 == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        if (android.text.TextUtils.isEmpty(android.os.Build.MANUFACTURER) == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        r3 = android.os.Build.MANUFACTURER.toLowerCase();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        if (r3.contains("oppo") != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        r3 = new android.content.Intent();
        r3.putExtra("packageName", r2.getPackageName());
        r3.setComponent(new android.content.ComponentName("com.color.safecenter", "com.color.safecenter.permission.PermissionManagerActivity"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b2, code lost:
        if (r3.contains("vivo") != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b4, code lost:
        r3 = new android.content.Intent();
        r3.putExtra("packagename", r2.getPackageName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c4, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 25) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c6, code lost:
        r3.setComponent(new android.content.ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d3, code lost:
        r3.setComponent(new android.content.ComponentName("com.iqoo.secure", "com.iqoo.secure.safeguard.SoftPermissionDetailActivity"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ec, code lost:
        r3 = new android.content.Intent("com.meizu.safe.security.SHOW_APPSEC");
        r3.putExtra("packageName", r2.getPackageName());
        r3.setComponent(new android.content.ComponentName("com.meizu.safe", "com.meizu.safe.security.AppSecActivity"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0109, code lost:
        r3 = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS", android.net.Uri.parse("package:" + r2.getPackageName()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0126, code lost:
        r6.startActivityForResult(r3, com.meizu.cloud.pushsdk.constants.PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012e, code lost:
        if (r6.a() == null) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0131, code lost:
        r0 = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS", android.net.Uri.parse("package:" + r2.getPackageName()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014f, code lost:
        r6.startActivityForResult(r0, com.meizu.cloud.pushsdk.constants.PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r6.startActivityForResult(new android.content.Intent("android.settings.APPLICATION_SETTINGS"), com.meizu.cloud.pushsdk.constants.PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x015d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r7.onGranted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0165, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0033 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x012a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0153 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0162 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e A[Catch:{ Throwable -> 0x006f }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040 A[Catch:{ Throwable -> 0x006f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(@android.support.annotation.NonNull android.app.Activity r6, @android.support.annotation.NonNull com.ss.android.socialbase.appdownloader.depend.INotificationPermissionRequestCallback r7) {
        /*
            if (r6 == 0) goto L_0x015e
            boolean r0 = r6.isFinishing()     // Catch:{ Throwable -> 0x0162 }
            if (r0 == 0) goto L_0x000a
            goto L_0x015e
        L_0x000a:
            android.app.FragmentManager r6 = r6.getFragmentManager()     // Catch:{ Throwable -> 0x0162 }
            java.lang.String r0 = f30784b     // Catch:{ Throwable -> 0x0162 }
            android.app.Fragment r0 = r6.findFragmentByTag(r0)     // Catch:{ Throwable -> 0x0162 }
            com.ss.android.socialbase.appdownloader.view.a r0 = (com.ss.android.socialbase.appdownloader.view.a) r0     // Catch:{ Throwable -> 0x0162 }
            f30786d = r0     // Catch:{ Throwable -> 0x0162 }
            if (r0 != 0) goto L_0x0033
            com.ss.android.socialbase.appdownloader.view.a r0 = new com.ss.android.socialbase.appdownloader.view.a     // Catch:{ Throwable -> 0x0162 }
            r0.<init>()     // Catch:{ Throwable -> 0x0162 }
            f30786d = r0     // Catch:{ Throwable -> 0x0162 }
            android.app.FragmentTransaction r0 = r6.beginTransaction()     // Catch:{ Throwable -> 0x0162 }
            com.ss.android.socialbase.appdownloader.view.a r1 = f30786d     // Catch:{ Throwable -> 0x0162 }
            java.lang.String r2 = f30784b     // Catch:{ Throwable -> 0x0162 }
            android.app.FragmentTransaction r0 = r0.add(r1, r2)     // Catch:{ Throwable -> 0x0162 }
            r0.commitAllowingStateLoss()     // Catch:{ Throwable -> 0x0162 }
            r6.executePendingTransactions()     // Catch:{ Throwable -> 0x0033 }
        L_0x0033:
            com.ss.android.socialbase.appdownloader.view.a r6 = f30786d     // Catch:{ Throwable -> 0x0162 }
            r0 = 0
            r1 = 1000(0x3e8, float:1.401E-42)
            android.content.Context r2 = r6.a()     // Catch:{ Throwable -> 0x006f }
            if (r2 != 0) goto L_0x0040
            r3 = r0
            goto L_0x006a
        L_0x0040:
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Throwable -> 0x006f }
            java.lang.String r4 = "android.settings.APP_NOTIFICATION_SETTINGS"
            r3.<init>(r4)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r4 = r2.getPackageName()     // Catch:{ Throwable -> 0x006f }
            java.lang.String r5 = "package"
            r3.putExtra(r5, r4)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r5 = "android.provider.extra.APP_PACKAGE"
            r3.putExtra(r5, r4)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r5 = "app_package"
            r3.putExtra(r5, r4)     // Catch:{ Throwable -> 0x006f }
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch:{ Throwable -> 0x006f }
            int r2 = r2.uid     // Catch:{ Throwable -> 0x006f }
            java.lang.String r4 = "uid"
            r3.putExtra(r4, r2)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r4 = "app_uid"
            r3.putExtra(r4, r2)     // Catch:{ Throwable -> 0x006f }
        L_0x006a:
            r6.startActivityForResult(r3, r1)     // Catch:{ Throwable -> 0x006f }
            goto L_0x0166
        L_0x006f:
            android.content.Context r2 = r6.a()     // Catch:{ Throwable -> 0x012a }
            if (r2 != 0) goto L_0x0078
            r3 = r0
            goto L_0x0126
        L_0x0078:
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch:{ Throwable -> 0x012a }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x012a }
            if (r3 != 0) goto L_0x0109
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch:{ Throwable -> 0x012a }
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ Throwable -> 0x012a }
            java.lang.String r4 = "oppo"
            boolean r4 = r3.contains(r4)     // Catch:{ Throwable -> 0x012a }
            if (r4 == 0) goto L_0x00aa
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Throwable -> 0x012a }
            r3.<init>()     // Catch:{ Throwable -> 0x012a }
            java.lang.String r4 = "packageName"
            java.lang.String r2 = r2.getPackageName()     // Catch:{ Throwable -> 0x012a }
            r3.putExtra(r4, r2)     // Catch:{ Throwable -> 0x012a }
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ Throwable -> 0x012a }
            java.lang.String r4 = "com.color.safecenter"
            java.lang.String r5 = "com.color.safecenter.permission.PermissionManagerActivity"
            r2.<init>(r4, r5)     // Catch:{ Throwable -> 0x012a }
            r3.setComponent(r2)     // Catch:{ Throwable -> 0x012a }
            goto L_0x0126
        L_0x00aa:
            java.lang.String r4 = "vivo"
            boolean r4 = r3.contains(r4)     // Catch:{ Throwable -> 0x012a }
            r5 = 25
            if (r4 == 0) goto L_0x00e0
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Throwable -> 0x012a }
            r3.<init>()     // Catch:{ Throwable -> 0x012a }
            java.lang.String r4 = "packagename"
            java.lang.String r2 = r2.getPackageName()     // Catch:{ Throwable -> 0x012a }
            r3.putExtra(r4, r2)     // Catch:{ Throwable -> 0x012a }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x012a }
            if (r2 < r5) goto L_0x00d3
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ Throwable -> 0x012a }
            java.lang.String r4 = "com.vivo.permissionmanager"
            java.lang.String r5 = "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"
            r2.<init>(r4, r5)     // Catch:{ Throwable -> 0x012a }
            r3.setComponent(r2)     // Catch:{ Throwable -> 0x012a }
            goto L_0x0126
        L_0x00d3:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ Throwable -> 0x012a }
            java.lang.String r4 = "com.iqoo.secure"
            java.lang.String r5 = "com.iqoo.secure.safeguard.SoftPermissionDetailActivity"
            r2.<init>(r4, r5)     // Catch:{ Throwable -> 0x012a }
            r3.setComponent(r2)     // Catch:{ Throwable -> 0x012a }
            goto L_0x0126
        L_0x00e0:
            java.lang.String r4 = "meizu"
            boolean r3 = r3.contains(r4)     // Catch:{ Throwable -> 0x012a }
            if (r3 == 0) goto L_0x0109
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x012a }
            if (r3 >= r5) goto L_0x0109
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Throwable -> 0x012a }
            java.lang.String r4 = "com.meizu.safe.security.SHOW_APPSEC"
            r3.<init>(r4)     // Catch:{ Throwable -> 0x012a }
            java.lang.String r4 = "packageName"
            java.lang.String r2 = r2.getPackageName()     // Catch:{ Throwable -> 0x012a }
            r3.putExtra(r4, r2)     // Catch:{ Throwable -> 0x012a }
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ Throwable -> 0x012a }
            java.lang.String r4 = "com.meizu.safe"
            java.lang.String r5 = "com.meizu.safe.security.AppSecActivity"
            r2.<init>(r4, r5)     // Catch:{ Throwable -> 0x012a }
            r3.setComponent(r2)     // Catch:{ Throwable -> 0x012a }
            goto L_0x0126
        L_0x0109:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x012a }
            java.lang.String r4 = "package:"
            r3.<init>(r4)     // Catch:{ Throwable -> 0x012a }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ Throwable -> 0x012a }
            r3.append(r2)     // Catch:{ Throwable -> 0x012a }
            java.lang.String r2 = r3.toString()     // Catch:{ Throwable -> 0x012a }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Throwable -> 0x012a }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Throwable -> 0x012a }
            java.lang.String r4 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r3.<init>(r4, r2)     // Catch:{ Throwable -> 0x012a }
        L_0x0126:
            r6.startActivityForResult(r3, r1)     // Catch:{ Throwable -> 0x012a }
            goto L_0x0166
        L_0x012a:
            android.content.Context r2 = r6.a()     // Catch:{ Throwable -> 0x0153 }
            if (r2 != 0) goto L_0x0131
            goto L_0x014f
        L_0x0131:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0153 }
            java.lang.String r3 = "package:"
            r0.<init>(r3)     // Catch:{ Throwable -> 0x0153 }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ Throwable -> 0x0153 }
            r0.append(r2)     // Catch:{ Throwable -> 0x0153 }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0153 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Throwable -> 0x0153 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Throwable -> 0x0153 }
            java.lang.String r3 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r2.<init>(r3, r0)     // Catch:{ Throwable -> 0x0153 }
            r0 = r2
        L_0x014f:
            r6.startActivityForResult(r0, r1)     // Catch:{ Throwable -> 0x0153 }
            goto L_0x0166
        L_0x0153:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Throwable -> 0x0162 }
            java.lang.String r2 = "android.settings.APPLICATION_SETTINGS"
            r0.<init>(r2)     // Catch:{ Throwable -> 0x0162 }
            r6.startActivityForResult(r0, r1)     // Catch:{ Throwable -> 0x0162 }
            return
        L_0x015e:
            r7.onGranted()     // Catch:{ Throwable -> 0x0162 }
            return
        L_0x0162:
            r7.onGranted()     // Catch:{ Throwable -> 0x0166 }
            return
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.c.b(android.app.Activity, com.ss.android.socialbase.appdownloader.depend.INotificationPermissionRequestCallback):void");
    }
}
