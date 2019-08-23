package com.ss.android.downloadlib.b;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.download.api.b.a.a;
import com.ss.android.downloadlib.addownload.d;
import com.ss.android.downloadlib.addownload.j;
import com.ss.android.downloadlib.c.f;
import com.ss.android.downloadlib.c.k;
import com.ss.android.downloadlib.e;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadEventHandler;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.Iterator;
import org.json.JSONObject;

public class b implements IAppDownloadEventHandler {

    /* renamed from: a  reason: collision with root package name */
    public Context f28858a;

    public boolean isForbidInvalidatePackageInstall() {
        d.a();
        return d.b();
    }

    public b(Context context) {
        this.f28858a = context.getApplicationContext();
    }

    public void handleDownloadCancel(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            for (a a2 : e.a().f29049b) {
                a2.a(downloadInfo);
            }
            try {
                String extra = downloadInfo.getExtra();
                long j = 0;
                if (!TextUtils.isEmpty(extra)) {
                    j = k.a(new JSONObject(extra), PushConstants.EXTRA);
                }
                com.ss.android.downloadlib.a.a();
                com.ss.android.downloadlib.a.a(j, 1012, null, downloadInfo.getDownloadTime(), false);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(DownloadInfo downloadInfo, String str) {
        Iterator<a> it2 = e.a().f29049b.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    private static void b(DownloadInfo downloadInfo, String str) {
        for (a a2 : e.a().f29049b) {
            a2.a(downloadInfo, str);
        }
    }

    public boolean installIntercept(int i, boolean z) {
        if (com.ss.android.downloadlib.addownload.k.k() != null) {
            return com.ss.android.downloadlib.addownload.k.k().a();
        }
        return false;
    }

    public void handleAppInstalled(final Context context, final String str) {
        if (f.a()) {
            new StringBuilder("DownloadReceiver packageName = ").append(str);
        }
        com.ss.android.downloadlib.c.a.a.a(new AsyncTask<Void, Void, DownloadInfo>() {
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
                if (com.ss.android.downloadlib.c.k.a(r4, r2.getSavePath() + java.io.File.separator + r2.getName(), r3) != false) goto L_0x00b6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b2, code lost:
                if (r3 != false) goto L_0x00b6;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private com.ss.android.socialbase.downloader.model.DownloadInfo a() {
                /*
                    r15 = this;
                    android.content.Context r0 = r3
                    r1 = 0
                    if (r0 == 0) goto L_0x0157
                    java.lang.String r0 = r4
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L_0x000f
                    goto L_0x0157
                L_0x000f:
                    com.ss.android.downloadlib.b.b r0 = com.ss.android.downloadlib.b.b.this
                    android.content.Context r0 = r0.f28858a
                    com.ss.android.socialbase.downloader.downloader.Downloader r0 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r0)
                    java.lang.String r2 = "application/vnd.android.package-archive"
                    java.util.List r0 = r0.getSuccessedDownloadInfosWithMimeType(r2)
                    if (r0 == 0) goto L_0x0156
                    boolean r2 = r0.isEmpty()
                    if (r2 == 0) goto L_0x0027
                    goto L_0x0156
                L_0x0027:
                    java.util.Iterator r0 = r0.iterator()
                L_0x002b:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L_0x0155
                    java.lang.Object r2 = r0.next()
                    com.ss.android.socialbase.downloader.model.DownloadInfo r2 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r2
                    if (r2 == 0) goto L_0x002b
                    boolean r3 = com.ss.android.downloadlib.c.f.a()
                    if (r3 == 0) goto L_0x004d
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    java.lang.String r4 = "handleAppInstalled id = "
                    r3.<init>(r4)
                    int r4 = r2.getId()
                    r3.append(r4)
                L_0x004d:
                    java.lang.String r3 = r4
                    java.lang.String r4 = r2.getPackageName()
                    boolean r4 = r3.equals(r4)
                    r5 = 0
                    r6 = 1
                    if (r4 == 0) goto L_0x005c
                    goto L_0x00b6
                L_0x005c:
                    java.lang.String r4 = r2.getName()
                    boolean r4 = android.text.TextUtils.isEmpty(r4)
                    if (r4 != 0) goto L_0x008b
                    android.content.Context r4 = r3
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r8 = r2.getSavePath()
                    r7.append(r8)
                    java.lang.String r8 = java.io.File.separator
                    r7.append(r8)
                    java.lang.String r8 = r2.getName()
                    r7.append(r8)
                    java.lang.String r7 = r7.toString()
                    boolean r3 = com.ss.android.downloadlib.c.k.a((android.content.Context) r4, (java.lang.String) r7, (java.lang.String) r3)
                    if (r3 == 0) goto L_0x008b
                    goto L_0x00b6
                L_0x008b:
                    com.ss.android.downloadlib.addownload.d.b r3 = com.ss.android.downloadlib.c.b.a(r2)
                    if (r3 == 0) goto L_0x00b5
                    com.ss.android.downloadlib.b.a r4 = com.ss.android.downloadlib.b.a.a()
                    long r7 = r3.f28760a
                    java.lang.Long r3 = java.lang.Long.valueOf(r7)
                    java.lang.String r7 = r4
                    java.util.Map<java.lang.Long, com.ss.android.downloadlib.addownload.d.c> r4 = r4.f28856a
                    java.lang.Object r3 = r4.get(r3)
                    com.ss.android.downloadlib.addownload.d.c r3 = (com.ss.android.downloadlib.addownload.d.c) r3
                    if (r3 == 0) goto L_0x00b1
                    java.lang.String r3 = r3.f28769b
                    boolean r3 = android.text.TextUtils.equals(r7, r3)
                    if (r3 == 0) goto L_0x00b1
                    r3 = 1
                    goto L_0x00b2
                L_0x00b1:
                    r3 = 0
                L_0x00b2:
                    if (r3 == 0) goto L_0x00b5
                    goto L_0x00b6
                L_0x00b5:
                    r6 = 0
                L_0x00b6:
                    if (r6 == 0) goto L_0x002b
                    com.ss.android.downloadlib.b.b r7 = com.ss.android.downloadlib.b.b.this
                    int r8 = r2.getId()
                    r9 = 4
                    java.lang.String r10 = r4
                    r11 = -3
                    long r12 = r2.getDownloadTime()
                    r7.handleDownloadEvent(r8, r9, r10, r11, r12)
                    com.ss.android.socialbase.downloader.notification.DownloadNotificationManager r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationManager.getInstance()
                    int r1 = r2.getId()
                    r0.hideNotification(r1)
                    java.lang.String r0 = r4
                    com.ss.android.downloadlib.b.b.a(r2, r0)
                    java.lang.String r0 = r2.getPackageName()
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto L_0x0136
                    java.lang.String r0 = r4
                    java.lang.String r1 = r2.getPackageName()
                    boolean r0 = r0.equals(r1)
                    if (r0 != 0) goto L_0x0136
                    com.ss.android.downloadlib.b.b r0 = com.ss.android.downloadlib.b.b.this
                    int r1 = r2.getId()
                    java.lang.String r3 = r4
                    java.lang.String r4 = r2.getPackageName()
                    android.content.Context r0 = r0.f28858a
                    if (r0 == 0) goto L_0x0136
                    com.ss.android.socialbase.downloader.downloader.Downloader r0 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r0)     // Catch:{ Exception -> 0x0135 }
                    com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r0.getDownloadInfo(r1)     // Catch:{ Exception -> 0x0135 }
                    if (r0 == 0) goto L_0x0136
                    int r1 = r0.getStatus()     // Catch:{ Exception -> 0x0135 }
                    if (r1 != 0) goto L_0x0110
                    goto L_0x0136
                L_0x0110:
                    com.ss.android.downloadlib.addownload.d.b r0 = com.ss.android.downloadlib.c.b.a(r0)     // Catch:{ Exception -> 0x0135 }
                    org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Exception -> 0x0135 }
                    r13.<init>()     // Catch:{ Exception -> 0x0135 }
                    java.lang.String r1 = "package_name"
                    r13.put(r1, r3)     // Catch:{ Exception -> 0x0135 }
                    java.lang.String r1 = "input_package_name"
                    r13.put(r1, r4)     // Catch:{ Exception -> 0x0135 }
                    java.lang.String r5 = com.ss.android.downloadlib.addownload.k.l()     // Catch:{ Exception -> 0x0135 }
                    java.lang.String r6 = "deeplink_installed_package_name_match_fail"
                    r7 = 1
                    long r8 = r0.f28760a     // Catch:{ Exception -> 0x0135 }
                    java.lang.String r10 = r0.f28762c     // Catch:{ Exception -> 0x0135 }
                    long r11 = r0.f28761b     // Catch:{ Exception -> 0x0135 }
                    r14 = 2
                    com.ss.android.downloadlib.addownload.j.a(r5, r6, r7, r8, r10, r11, r13, r14)     // Catch:{ Exception -> 0x0135 }
                    goto L_0x0136
                L_0x0135:
                L_0x0136:
                    com.ss.android.downloadlib.addownload.d.b r0 = com.ss.android.downloadlib.c.b.a(r2)
                    if (r0 != 0) goto L_0x013d
                    goto L_0x0151
                L_0x013d:
                    com.ss.android.downloadlib.b.a r1 = com.ss.android.downloadlib.b.a.a()
                    long r3 = r0.f28760a
                    java.lang.Long r0 = java.lang.Long.valueOf(r3)
                    java.util.Map<java.lang.Long, com.ss.android.downloadlib.addownload.d.c> r3 = r1.f28856a
                    if (r3 != 0) goto L_0x014c
                    goto L_0x0151
                L_0x014c:
                    java.util.Map<java.lang.Long, com.ss.android.downloadlib.addownload.d.c> r1 = r1.f28856a
                    r1.remove(r0)
                L_0x0151:
                    com.ss.android.downloadlib.addownload.e.b.a(r2)
                    return r2
                L_0x0155:
                    return r1
                L_0x0156:
                    return r1
                L_0x0157:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.b.b.AnonymousClass1.a():com.ss.android.socialbase.downloader.model.DownloadInfo");
            }

            /* access modifiers changed from: protected */
            public final /* synthetic */ Object doInBackground(Object[] objArr) {
                return a();
            }

            /* access modifiers changed from: protected */
            public final /* synthetic */ void onPostExecute(Object obj) {
                DownloadInfo downloadInfo = (DownloadInfo) obj;
                super.onPostExecute(downloadInfo);
                if (downloadInfo == null) {
                    b.a(null, str);
                } else {
                    com.ss.android.downloadlib.addownload.b.a().a(str);
                }
            }
        }, new Void[0]);
        com.ss.android.downloadlib.addownload.a.a().a(str);
    }

    public void handleAppInstallError(int i, int i2, String str, String str2, String str3) {
        if (this.f28858a != null) {
            DownloadInfo downloadInfo = Downloader.getInstance(this.f28858a).getDownloadInfo(i);
            if (downloadInfo != null && downloadInfo.getStatus() == -3) {
                long a2 = j.a(downloadInfo);
                if (a2 > 0) {
                    com.ss.android.downloadlib.a.a();
                    com.ss.android.downloadlib.a.a(a2, 1);
                }
                d.a().a(this.f28858a, downloadInfo);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0176, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleDownloadEvent(int r16, int r17, java.lang.String r18, int r19, long r20) {
        /*
            r15 = this;
            r11 = r18
            r12 = r15
            android.content.Context r0 = r12.f28858a
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            com.ss.android.socialbase.downloader.downloader.Downloader r1 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r0)     // Catch:{ Exception -> 0x0178 }
            r2 = r16
            com.ss.android.socialbase.downloader.model.DownloadInfo r13 = r1.getDownloadInfo(r2)     // Catch:{ Exception -> 0x0178 }
            if (r13 == 0) goto L_0x0177
            int r1 = r13.getStatus()     // Catch:{ Exception -> 0x0178 }
            if (r1 != 0) goto L_0x001c
            goto L_0x0177
        L_0x001c:
            com.ss.android.downloadlib.addownload.d.b r14 = com.ss.android.downloadlib.c.b.a(r13)     // Catch:{ Exception -> 0x0178 }
            r1 = 0
            switch(r17) {
                case 1: goto L_0x00be;
                case 2: goto L_0x00a7;
                case 3: goto L_0x0085;
                case 4: goto L_0x006c;
                case 5: goto L_0x0055;
                case 6: goto L_0x003e;
                case 7: goto L_0x0027;
                default: goto L_0x0025;
            }     // Catch:{ Exception -> 0x0178 }
        L_0x0025:
            goto L_0x0176
        L_0x0027:
            long r3 = r14.f28760a     // Catch:{ Exception -> 0x0178 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0176
            java.lang.String r1 = "download_notificaion"
            java.lang.String r2 = "click_item"
            r3 = 1
            long r4 = r14.f28760a     // Catch:{ Exception -> 0x0178 }
            java.lang.String r6 = r14.f28762c     // Catch:{ Exception -> 0x0178 }
            long r7 = r14.f28761b     // Catch:{ Exception -> 0x0178 }
            r9 = 1
            com.ss.android.downloadlib.addownload.j.a(r1, r2, r3, r4, r6, r7, r9)     // Catch:{ Exception -> 0x0178 }
            goto L_0x0176
        L_0x003e:
            long r3 = r14.f28760a     // Catch:{ Exception -> 0x0178 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0176
            java.lang.String r1 = "download_notificaion"
            java.lang.String r2 = "click_continue"
            r3 = 1
            long r4 = r14.f28760a     // Catch:{ Exception -> 0x0178 }
            java.lang.String r6 = r14.f28762c     // Catch:{ Exception -> 0x0178 }
            long r7 = r14.f28761b     // Catch:{ Exception -> 0x0178 }
            r9 = 1
            com.ss.android.downloadlib.addownload.j.a(r1, r2, r3, r4, r6, r7, r9)     // Catch:{ Exception -> 0x0178 }
            goto L_0x0178
        L_0x0055:
            long r3 = r14.f28760a     // Catch:{ Exception -> 0x0178 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0176
            java.lang.String r1 = "download_notificaion"
            java.lang.String r2 = "click_pause"
            r3 = 1
            long r4 = r14.f28760a     // Catch:{ Exception -> 0x0178 }
            java.lang.String r6 = r14.f28762c     // Catch:{ Exception -> 0x0178 }
            long r7 = r14.f28761b     // Catch:{ Exception -> 0x0178 }
            r9 = 1
            com.ss.android.downloadlib.addownload.j.a(r1, r2, r3, r4, r6, r7, r9)     // Catch:{ Exception -> 0x0178 }
            goto L_0x0178
        L_0x006c:
            com.ss.android.downloadlib.addownload.a r1 = com.ss.android.downloadlib.addownload.a.a()     // Catch:{ Exception -> 0x0178 }
            long r2 = r14.f28760a     // Catch:{ Exception -> 0x0178 }
            r1.a((java.lang.String) r11, (long) r2)     // Catch:{ Exception -> 0x0178 }
            com.ss.android.downloadlib.addownload.a r1 = com.ss.android.downloadlib.addownload.a.a()     // Catch:{ Exception -> 0x0178 }
            r1.a((android.content.Context) r0, (java.lang.String) r11)     // Catch:{ Exception -> 0x0178 }
            com.ss.android.downloadlib.addownload.a.a r0 = com.ss.android.downloadlib.addownload.a.a.a()     // Catch:{ Exception -> 0x0178 }
            r0.a(r11)     // Catch:{ Exception -> 0x0178 }
            goto L_0x0178
        L_0x0085:
            long r3 = r14.f28760a     // Catch:{ Exception -> 0x0178 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0176
            java.lang.String r1 = "download_notificaion"
            java.lang.String r2 = "click_install"
            r3 = 1
            long r4 = r14.f28760a     // Catch:{ Exception -> 0x0178 }
            java.lang.String r6 = r14.f28762c     // Catch:{ Exception -> 0x0178 }
            long r7 = r14.f28761b     // Catch:{ Exception -> 0x0178 }
            r9 = 1
            com.ss.android.downloadlib.addownload.j.a(r1, r2, r3, r4, r6, r7, r9)     // Catch:{ Exception -> 0x0178 }
            com.ss.android.downloadlib.a r0 = com.ss.android.downloadlib.a.a()     // Catch:{ Exception -> 0x0178 }
            java.lang.String r1 = "download_notificaion"
            java.lang.String r2 = "install_window_show"
            r0.a((com.ss.android.downloadlib.addownload.d.b) r14, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0178 }
            goto L_0x0178
        L_0x00a7:
            long r3 = r14.f28760a     // Catch:{ Exception -> 0x0178 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0176
            java.lang.String r1 = "download_notificaion"
            java.lang.String r2 = "click_open"
            r3 = 1
            long r4 = r14.f28760a     // Catch:{ Exception -> 0x0178 }
            java.lang.String r6 = r14.f28762c     // Catch:{ Exception -> 0x0178 }
            long r7 = r14.f28761b     // Catch:{ Exception -> 0x0178 }
            r9 = 1
            com.ss.android.downloadlib.addownload.j.a(r1, r2, r3, r4, r6, r7, r9)     // Catch:{ Exception -> 0x0178 }
            goto L_0x0178
        L_0x00be:
            long r3 = r14.f28760a     // Catch:{ Exception -> 0x0178 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0172
            com.ss.android.downloadlib.a r0 = com.ss.android.downloadlib.a.a()     // Catch:{ Exception -> 0x0178 }
            long r3 = r14.f28760a     // Catch:{ Exception -> 0x0178 }
            r0.a((com.ss.android.socialbase.downloader.model.DownloadInfo) r13, (long) r3)     // Catch:{ Exception -> 0x0178 }
            com.ss.android.downloadlib.a r0 = com.ss.android.downloadlib.a.a()     // Catch:{ Exception -> 0x0178 }
            long r3 = r14.f28760a     // Catch:{ Exception -> 0x0178 }
            r0.a((long) r3, (java.lang.String) r11)     // Catch:{ Exception -> 0x0178 }
            com.ss.android.downloadlib.a r0 = com.ss.android.downloadlib.a.a()     // Catch:{ Exception -> 0x0178 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0178 }
            r3.<init>()     // Catch:{ Exception -> 0x0178 }
            java.lang.String r4 = r13.getSavePath()     // Catch:{ Exception -> 0x0178 }
            r3.append(r4)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r4 = java.io.File.separator     // Catch:{ Exception -> 0x0178 }
            r3.append(r4)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r4 = r13.getName()     // Catch:{ Exception -> 0x0178 }
            r3.append(r4)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0178 }
            long r4 = r14.f28760a     // Catch:{ Exception -> 0x0178 }
            org.json.JSONObject r6 = com.ss.android.downloadlib.addownload.k.g()     // Catch:{ Exception -> 0x0178 }
            java.lang.String r7 = "check_hijack"
            r8 = 0
            int r6 = r6.optInt(r7, r8)     // Catch:{ Exception -> 0x0178 }
            if (r6 == 0) goto L_0x011a
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0178 }
            if (r6 != 0) goto L_0x011a
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 > 0) goto L_0x0110
            goto L_0x011a
        L_0x0110:
            java.util.concurrent.ExecutorService r1 = r0.f28683b     // Catch:{ Exception -> 0x0178 }
            com.ss.android.downloadlib.a$2 r2 = new com.ss.android.downloadlib.a$2     // Catch:{ Exception -> 0x0178 }
            r2.<init>(r3, r4)     // Catch:{ Exception -> 0x0178 }
            r1.submit(r2)     // Catch:{ Exception -> 0x0178 }
        L_0x011a:
            com.ss.android.downloadlib.b.a r0 = com.ss.android.downloadlib.b.a.a()     // Catch:{ Exception -> 0x0178 }
            long r1 = r14.f28760a     // Catch:{ Exception -> 0x0178 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x0178 }
            r0.a(r1, r11)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r0 = r14.f28762c     // Catch:{ Exception -> 0x0178 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0178 }
            if (r0 != 0) goto L_0x0172
            boolean r0 = r14.f28763d     // Catch:{ Exception -> 0x0178 }
            if (r0 == 0) goto L_0x014f
            com.ss.android.downloadlib.addownload.a.a r0 = com.ss.android.downloadlib.addownload.a.a.a()     // Catch:{ Exception -> 0x0178 }
            int r1 = r13.getId()     // Catch:{ Exception -> 0x0178 }
            long r1 = (long) r1     // Catch:{ Exception -> 0x0178 }
            long r3 = r14.f28760a     // Catch:{ Exception -> 0x0178 }
            long r5 = r14.f28761b     // Catch:{ Exception -> 0x0178 }
            java.lang.String r8 = r13.getTitle()     // Catch:{ Exception -> 0x0178 }
            java.lang.String r9 = r14.f28762c     // Catch:{ Exception -> 0x0178 }
            java.lang.String r10 = r13.getTargetFilePath()     // Catch:{ Exception -> 0x0178 }
            r7 = r18
            r0.a(r1, r3, r5, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0178 }
        L_0x014f:
            com.ss.android.downloadlib.addownload.b r0 = com.ss.android.downloadlib.addownload.b.a()     // Catch:{ Exception -> 0x0178 }
            int r1 = r13.getId()     // Catch:{ Exception -> 0x0178 }
            long r1 = (long) r1     // Catch:{ Exception -> 0x0178 }
            long r3 = r14.f28760a     // Catch:{ Exception -> 0x0178 }
            long r5 = r14.f28761b     // Catch:{ Exception -> 0x0178 }
            java.lang.String r8 = r13.getTitle()     // Catch:{ Exception -> 0x0178 }
            java.lang.String r9 = r14.f28762c     // Catch:{ Exception -> 0x0178 }
            java.lang.String r10 = r13.getTargetFilePath()     // Catch:{ Exception -> 0x0178 }
            r7 = r18
            r0.a(r1, r3, r5, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0178 }
            long r0 = r14.f28760a     // Catch:{ Exception -> 0x0178 }
            java.lang.String r2 = r14.f28762c     // Catch:{ Exception -> 0x0178 }
            com.ss.android.downloadlib.addownload.f.a.a(r13, r0, r2, r11)     // Catch:{ Exception -> 0x0178 }
        L_0x0172:
            b(r13, r11)     // Catch:{ Exception -> 0x0178 }
            goto L_0x0178
        L_0x0176:
            return
        L_0x0177:
            return
        L_0x0178:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.b.b.handleDownloadEvent(int, int, java.lang.String, int, long):void");
    }
}
