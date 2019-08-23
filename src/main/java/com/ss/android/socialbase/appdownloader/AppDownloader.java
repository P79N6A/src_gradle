package com.ss.android.socialbase.appdownloader;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.socialbase.appdownloader.depend.AbsAppDownloadDepend;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadDepend;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadEventHandler;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadEventListener;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadFileUriProvider;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadMonitorListener;
import com.ss.android.socialbase.appdownloader.depend.IDownloadNotificationBuilder;
import com.ss.android.socialbase.downloader.depend.u;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.b;
import com.ss.android.socialbase.downloader.downloader.k;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.File;
import java.util.List;

public class AppDownloader {
    public static final String TAG = "AppDownloader";

    /* renamed from: a  reason: collision with root package name */
    private static volatile AppDownloader f30750a;
    private static boolean l;
    private static boolean m;
    public IAppDownloadMonitorListener appDownloadMonitorListener;

    /* renamed from: b  reason: collision with root package name */
    private IAppDownloadDepend f30751b;

    /* renamed from: c  reason: collision with root package name */
    private IAppDownloadEventHandler f30752c;

    /* renamed from: d  reason: collision with root package name */
    private IDownloadNotificationBuilder f30753d;

    /* renamed from: e  reason: collision with root package name */
    private String f30754e;

    /* renamed from: f  reason: collision with root package name */
    private long f30755f = 43200000;
    private long g = 43200000;
    private int h = 2;
    private int i = 2;
    private String j;
    private DownloadReceiver k;
    private boolean n;
    private boolean o;
    private IAppDownloadFileUriProvider p;

    public IAppDownloadDepend getAppDownloadDepend() {
        return this.f30751b;
    }

    public IAppDownloadEventHandler getAppDownloadEventHandler() {
        return this.f30752c;
    }

    public IAppDownloadMonitorListener getAppDownloadMonitorListener() {
        return this.appDownloadMonitorListener;
    }

    public IDownloadNotificationBuilder getAppDownloadNotificationBuilder() {
        return this.f30753d;
    }

    public IAppDownloadFileUriProvider getAppFileUriProvider() {
        return this.p;
    }

    public String getFileProviderAuthority() {
        return this.j;
    }

    public int getMaxFailedNotificationShowCount() {
        return this.h;
    }

    public int getMaxUnInstallNotificationShowCount() {
        return this.i;
    }

    public long getMinResumeFailedIntervalTime() {
        return this.f30755f;
    }

    public long getMinResumeUnInstallIntervalTime() {
        return this.g;
    }

    public String getNotificationChannelId() {
        return this.f30754e;
    }

    public boolean isUsePackageFlagConfiguration() {
        return this.o;
    }

    public boolean useReflectParseRes() {
        return this.n;
    }

    private AppDownloader() {
    }

    public static AppDownloader getInstance() {
        if (f30750a == null) {
            synchronized (AppDownloader.class) {
                if (f30750a == null) {
                    f30750a = new AppDownloader();
                }
            }
        }
        return f30750a;
    }

    public void unRegisterDownloadReceiver() {
        try {
            if (m && this.k != null) {
                b.q().unregisterReceiver(this.k);
            }
        } catch (Exception unused) {
        }
    }

    private void a() {
        if (!m) {
            if (this.k == null) {
                this.k = new DownloadReceiver();
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.addAction("android.intent.action.BOOT_COMPLETED");
                intentFilter.addAction("android.ss.intent.action.DOWNLOAD_COMPLETE");
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter2.addDataScheme("package");
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.MEDIA_MOUNTED");
                intentFilter3.addDataScheme("file");
                b.q().registerReceiver(this.k, intentFilter);
                b.q().registerReceiver(this.k, intentFilter2);
                b.q().registerReceiver(this.k, intentFilter3);
                m = true;
            } catch (Exception unused) {
            }
        }
    }

    public void setAppDownloadEventHandler(IAppDownloadEventHandler iAppDownloadEventHandler) {
        this.f30752c = iAppDownloadEventHandler;
    }

    public void setAppDownloadMonitorListener(IAppDownloadMonitorListener iAppDownloadMonitorListener) {
        this.appDownloadMonitorListener = iAppDownloadMonitorListener;
    }

    public void setAppDownloadNotificationBuilder(IDownloadNotificationBuilder iDownloadNotificationBuilder) {
        this.f30753d = iDownloadNotificationBuilder;
    }

    public void setAppFileUriProvider(IAppDownloadFileUriProvider iAppDownloadFileUriProvider) {
        this.p = iAppDownloadFileUriProvider;
    }

    public void setNotificationChannelId(String str) {
        this.f30754e = str;
    }

    public void setUsePackageFlagConfiguration(boolean z) {
        this.o = z;
    }

    public void setUseReflectParseRes(boolean z) {
        this.n = z;
    }

    public void setAppDownloadDepend(IAppDownloadDepend iAppDownloadDepend) {
        if (iAppDownloadDepend != null) {
            this.f30751b = iAppDownloadDepend;
        }
    }

    public void setMaxResumeFailedNotificationShowCount(int i2) {
        if (i2 > 0) {
            this.h = i2;
        }
    }

    public void setMaxResumeUnInstallNotificationShowCount(int i2) {
        if (i2 > 0) {
            this.i = i2;
        }
    }

    private u a(final IAppDownloadEventListener iAppDownloadEventListener) {
        if (iAppDownloadEventListener == null) {
            return null;
        }
        return new u() {
            public final String a() {
                return iAppDownloadEventListener.getNotifyProcessName();
            }

            public final boolean a(boolean z) {
                return iAppDownloadEventListener.installIntercept(z);
            }

            public final void a(int i, DownloadInfo downloadInfo, String str, String str2) {
                if (!(i == 1 || i == 3)) {
                    switch (i) {
                        case 5:
                        case 6:
                        case e.l /*?: ONE_ARG  (7 int)*/:
                            break;
                        case 8:
                            iAppDownloadEventListener.onAppInstallError(i, downloadInfo.getPackageName(), str, str2);
                            return;
                        case 9:
                            iAppDownloadEventListener.onAppInstalled(b.q(), str);
                            return;
                        case 10:
                            iAppDownloadEventListener.onAppDownloadCancel(downloadInfo);
                            return;
                    }
                }
                iAppDownloadEventListener.onAppDownloadEvent(i, str, downloadInfo.getStatus(), downloadInfo.getDownloadTime());
            }
        };
    }

    public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(Context context) {
        return Downloader.getInstance(context).getDownloadingDownloadInfosWithMimeType("application/vnd.android.package-archive");
    }

    public List<DownloadInfo> getUnCompletedDownloadAppInfos(Context context) {
        return Downloader.getInstance(context).getUnCompletedDownloadInfosWithMimeType("application/vnd.android.package-archive");
    }

    public void setFileProviderAuthority(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.j = str;
        }
    }

    public void setMinResumeFailedIntervalTime(long j2) {
        if (j2 > 0) {
            this.f30755f = j2;
        }
    }

    public void setMinResumeUnInstallIntervalTime(long j2) {
        if (j2 > 0) {
            this.g = j2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(20:50|(1:57)(1:56)|58|(2:64|(1:66)(16:68|69|(1:71)|72|73|74|(1:76)(1:77)|78|79|80|81|(2:83|(1:85)(4:86|88|(3:90|(3:92|93|(1:101))|104)|105))|87|88|(0)|105))|67|69|(0)|72|73|74|(0)(0)|78|79|80|81|(0)|87|88|(0)|105) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x0180 */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014f A[Catch:{ Throwable -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015e A[Catch:{ Throwable -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0164 A[Catch:{ Throwable -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0186 A[Catch:{ Throwable -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x027f A[Catch:{ Throwable -> 0x02bf }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int addDownloadTask(com.ss.android.socialbase.appdownloader.AppTaskBuilder r20) {
        /*
            r19 = this;
            r1 = r19
            r2 = 0
            if (r20 == 0) goto L_0x02e5
            android.content.Context r0 = r20.getContext()
            if (r0 != 0) goto L_0x000d
            goto L_0x02e5
        L_0x000d:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Throwable -> 0x02bf }
            r0.<init>()     // Catch:{ Throwable -> 0x02bf }
            java.util.List r6 = r20.getHeaders()     // Catch:{ Throwable -> 0x02bf }
            if (r6 == 0) goto L_0x0063
            int r7 = r6.size()     // Catch:{ Throwable -> 0x02bf }
            if (r7 <= 0) goto L_0x0063
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Throwable -> 0x02bf }
            r7 = 0
        L_0x0023:
            boolean r8 = r6.hasNext()     // Catch:{ Throwable -> 0x02bf }
            if (r8 == 0) goto L_0x0064
            java.lang.Object r8 = r6.next()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.HttpHeader r8 = (com.ss.android.socialbase.downloader.model.HttpHeader) r8     // Catch:{ Throwable -> 0x02bf }
            if (r8 == 0) goto L_0x0023
            java.lang.String r9 = r8.getName()     // Catch:{ Throwable -> 0x02bf }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x02bf }
            if (r9 != 0) goto L_0x0023
            java.lang.String r9 = r8.getValue()     // Catch:{ Throwable -> 0x02bf }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x02bf }
            if (r9 != 0) goto L_0x0023
            java.lang.String r9 = r8.getName()     // Catch:{ Throwable -> 0x02bf }
            java.lang.String r10 = "User-Agent"
            boolean r9 = r9.equals(r10)     // Catch:{ Throwable -> 0x02bf }
            if (r9 == 0) goto L_0x0052
            r7 = 1
        L_0x0052:
            com.ss.android.socialbase.downloader.model.HttpHeader r9 = new com.ss.android.socialbase.downloader.model.HttpHeader     // Catch:{ Throwable -> 0x02bf }
            java.lang.String r10 = r8.getName()     // Catch:{ Throwable -> 0x02bf }
            java.lang.String r8 = r8.getValue()     // Catch:{ Throwable -> 0x02bf }
            r9.<init>(r10, r8)     // Catch:{ Throwable -> 0x02bf }
            r0.add(r9)     // Catch:{ Throwable -> 0x02bf }
            goto L_0x0023
        L_0x0063:
            r7 = 0
        L_0x0064:
            if (r7 != 0) goto L_0x0072
            com.ss.android.socialbase.downloader.model.HttpHeader r6 = new com.ss.android.socialbase.downloader.model.HttpHeader     // Catch:{ Throwable -> 0x02bf }
            java.lang.String r7 = "User-Agent"
            java.lang.String r8 = com.ss.android.socialbase.appdownloader.constants.Constants.DEFAULT_USER_AGENT     // Catch:{ Throwable -> 0x02bf }
            r6.<init>(r7, r8)     // Catch:{ Throwable -> 0x02bf }
            r0.add(r6)     // Catch:{ Throwable -> 0x02bf }
        L_0x0072:
            java.lang.String r6 = r20.getUrl()     // Catch:{ Throwable -> 0x02bf }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x02bf }
            if (r7 == 0) goto L_0x007d
            return r2
        L_0x007d:
            java.lang.String r7 = r20.getSaveName()     // Catch:{ Throwable -> 0x02bf }
            java.lang.String r8 = r20.getName()     // Catch:{ Throwable -> 0x02bf }
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x02bf }
            if (r9 == 0) goto L_0x0093
            java.lang.String r7 = r20.getMimeType()     // Catch:{ Throwable -> 0x02bf }
            java.lang.String r7 = com.ss.android.socialbase.appdownloader.AppDownloadUtils.getValidName(r6, r8, r7)     // Catch:{ Throwable -> 0x02bf }
        L_0x0093:
            int r9 = r7.length()     // Catch:{ Throwable -> 0x02bf }
            r10 = 255(0xff, float:3.57E-43)
            if (r9 <= r10) goto L_0x00a4
            int r9 = r7.length()     // Catch:{ Throwable -> 0x02bf }
            int r9 = r9 - r10
            java.lang.String r7 = r7.substring(r9)     // Catch:{ Throwable -> 0x02bf }
        L_0x00a4:
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x02bf }
            if (r9 == 0) goto L_0x00ab
            r8 = r7
        L_0x00ab:
            java.lang.String r9 = r20.getMimeType()     // Catch:{ Throwable -> 0x02bf }
            java.lang.String r10 = ".apk"
            boolean r10 = r7.endsWith(r10)     // Catch:{ Throwable -> 0x02bf }
            if (r10 == 0) goto L_0x00c3
            java.lang.String r10 = r20.getMimeType()     // Catch:{ Throwable -> 0x02bf }
            boolean r10 = com.ss.android.socialbase.appdownloader.AppDownloadUtils.isApkMineType(r10)     // Catch:{ Throwable -> 0x02bf }
            if (r10 != 0) goto L_0x00c3
            java.lang.String r9 = "application/vnd.android.package-archive"
        L_0x00c3:
            r15 = r9
            java.lang.String r9 = r20.getSavePath()     // Catch:{ Throwable -> 0x02bf }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x02bf }
            if (r10 == 0) goto L_0x00d6
            android.content.Context r9 = r20.getContext()     // Catch:{ Throwable -> 0x02bf }
            java.lang.String r9 = com.ss.android.socialbase.appdownloader.AppDownloadUtils.getAppDownloadPath(r9)     // Catch:{ Throwable -> 0x02bf }
        L_0x00d6:
            r14 = r9
            boolean r9 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Throwable -> 0x02bf }
            if (r9 != 0) goto L_0x02be
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x02bf }
            if (r9 == 0) goto L_0x00e5
            goto L_0x02be
        L_0x00e5:
            int r13 = com.ss.android.socialbase.downloader.downloader.b.a((java.lang.String) r6, (java.lang.String) r14)     // Catch:{ Throwable -> 0x02bf }
            boolean r9 = r20.isForce()     // Catch:{ Throwable -> 0x02bf }
            if (r9 != 0) goto L_0x0105
            boolean r10 = com.ss.android.socialbase.downloader.e.d.c(r14, r7)     // Catch:{ Throwable -> 0x02bf }
            if (r10 == 0) goto L_0x0105
            android.content.Context r10 = r20.getContext()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.downloader.Downloader r10 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r10)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r10.getDownloadInfo(r13)     // Catch:{ Throwable -> 0x02bf }
            if (r10 != 0) goto L_0x0105
            r12 = 1
            goto L_0x0106
        L_0x0105:
            r12 = r9
        L_0x0106:
            com.ss.android.socialbase.downloader.depend.IDownloadListener r9 = r20.getNotificationListener()     // Catch:{ Throwable -> 0x02bf }
            if (r9 != 0) goto L_0x0127
            boolean r10 = r20.isShowNotification()     // Catch:{ Throwable -> 0x02bf }
            if (r10 != 0) goto L_0x0118
            boolean r10 = r20.isAutoInstallWithoutNotification()     // Catch:{ Throwable -> 0x02bf }
            if (r10 == 0) goto L_0x0127
        L_0x0118:
            com.ss.android.socialbase.downloader.notification.a r9 = r20.getNotificationItem()     // Catch:{ Throwable -> 0x02bf }
            if (r9 == 0) goto L_0x012d
            com.ss.android.socialbase.appdownloader.DownloadNotificationListener r9 = new com.ss.android.socialbase.appdownloader.DownloadNotificationListener     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.notification.a r10 = r20.getNotificationItem()     // Catch:{ Throwable -> 0x02bf }
            r9.<init>(r10)     // Catch:{ Throwable -> 0x02bf }
        L_0x0127:
            r4 = r12
            r18 = r13
            r5 = r14
            r2 = r15
            goto L_0x0149
        L_0x012d:
            com.ss.android.socialbase.appdownloader.DownloadNotificationListener r16 = new com.ss.android.socialbase.appdownloader.DownloadNotificationListener     // Catch:{ Throwable -> 0x02bf }
            android.content.Context r10 = r20.getContext()     // Catch:{ Throwable -> 0x02bf }
            java.lang.String r17 = r20.getExtra()     // Catch:{ Throwable -> 0x02bf }
            r9 = r16
            r11 = r13
            r4 = r12
            r12 = r8
            r18 = r13
            r13 = r14
            r5 = r14
            r14 = r7
            r2 = r15
            r15 = r17
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ Throwable -> 0x02bf }
            r9 = r16
        L_0x0149:
            com.ss.android.socialbase.downloader.depend.IDownloadDepend r10 = r20.getDepend()     // Catch:{ Throwable -> 0x02bf }
            if (r10 != 0) goto L_0x0154
            com.ss.android.socialbase.appdownloader.AppDownloader$1 r10 = new com.ss.android.socialbase.appdownloader.AppDownloader$1     // Catch:{ Throwable -> 0x02bf }
            r10.<init>()     // Catch:{ Throwable -> 0x02bf }
        L_0x0154:
            java.lang.String r11 = r20.getExtra()     // Catch:{ Throwable -> 0x02bf }
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Throwable -> 0x0180 }
            if (r12 != 0) goto L_0x0164
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0180 }
            r12.<init>(r11)     // Catch:{ Throwable -> 0x0180 }
            goto L_0x0169
        L_0x0164:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0180 }
            r12.<init>()     // Catch:{ Throwable -> 0x0180 }
        L_0x0169:
            java.lang.String r13 = "auto_install_with_notification"
            boolean r14 = r20.isAutoInstallWithNotification()     // Catch:{ Throwable -> 0x0180 }
            r12.put(r13, r14)     // Catch:{ Throwable -> 0x0180 }
            java.lang.String r13 = "auto_install_without_notification"
            boolean r14 = r20.isAutoInstallWithoutNotification()     // Catch:{ Throwable -> 0x0180 }
            r12.put(r13, r14)     // Catch:{ Throwable -> 0x0180 }
            java.lang.String r12 = r12.toString()     // Catch:{ Throwable -> 0x0180 }
            r11 = r12
        L_0x0180:
            boolean r12 = r20.isShowNotification()     // Catch:{ Throwable -> 0x02bf }
            if (r12 != 0) goto L_0x018f
            boolean r12 = r20.isAutoInstallWithoutNotification()     // Catch:{ Throwable -> 0x02bf }
            if (r12 == 0) goto L_0x018d
            goto L_0x018f
        L_0x018d:
            r12 = 0
            goto L_0x0190
        L_0x018f:
            r12 = 1
        L_0x0190:
            android.content.Context r13 = r20.getContext()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r13 = com.ss.android.socialbase.downloader.downloader.Downloader.with(r13)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r6 = r13.url(r6)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r6 = r6.name(r7)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r6 = r6.title(r8)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r5 = r6.savePath(r5)     // Catch:{ Throwable -> 0x02bf }
            boolean r6 = r20.isNeedWifi()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r5 = r5.onlyWifi(r6)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r5.extraHeaders(r0)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.depend(r10)     // Catch:{ Throwable -> 0x02bf }
            r5 = 5
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.retryCount(r5)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.showNotification(r12)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.extra(r11)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.mimeType(r2)     // Catch:{ Throwable -> 0x02bf }
            int r2 = r20.getMinProgressTimeMsInterval()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.minProgressTimeMsInterval(r2)     // Catch:{ Throwable -> 0x02bf }
            int r2 = r20.getMaxProgressCount()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.maxProgressCount(r2)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.depend.IDownloadListener r2 = r20.getMainThreadListener()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.mainThreadListener(r2)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.notificationListener(r9)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.appdownloader.depend.IAppDownloadEventListener r2 = r20.getAppDownloadEventListener()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.depend.u r2 = r1.a(r2)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.notificationEventListener(r2)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.force(r4)     // Catch:{ Throwable -> 0x02bf }
            boolean r2 = r20.isAutoResumed()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.autoResumed(r2)     // Catch:{ Throwable -> 0x02bf }
            boolean r2 = r20.isShowNotificationForAutoResumed()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.showNotificationForAutoResumed(r2)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.downloader.g r2 = r20.getChunkStrategy()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.chunkStategy(r2)     // Catch:{ Throwable -> 0x02bf }
            boolean r2 = r20.isNeedHttpsToHttpRetry()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.needHttpsToHttpRetry(r2)     // Catch:{ Throwable -> 0x02bf }
            java.lang.String r2 = r20.getPackageName()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.packageName(r2)     // Catch:{ Throwable -> 0x02bf }
            java.lang.String r2 = r20.getMd5()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.md5(r2)     // Catch:{ Throwable -> 0x02bf }
            boolean r2 = r20.isNeedRetryDelay()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.needRetryDelay(r2)     // Catch:{ Throwable -> 0x02bf }
            boolean r2 = r20.isNeedDefaultHttpServiceBackUp()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.needDefaultHttpServiceBackUp(r2)     // Catch:{ Throwable -> 0x02bf }
            boolean r2 = r20.isNeedReuseFirstConnection()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.needReuseFirstConnection(r2)     // Catch:{ Throwable -> 0x02bf }
            boolean r2 = r20.isNeedReuseChunkRunnable()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.needReuseChunkRunnable(r2)     // Catch:{ Throwable -> 0x02bf }
            boolean r2 = r20.isNeedIndependentProcess()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.needIndependentProcess(r2)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.constants.EnqueueType r2 = r20.getEnqueueType()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.enqueueType(r2)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend r2 = r20.getMonitorDepend()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.monitorDepend(r2)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.downloader.p r2 = r20.getRetryDelayTimeCalculator()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.retryDelayTimeCalculator(r2)     // Catch:{ Throwable -> 0x02bf }
            boolean r2 = r20.isHeadConnectionAvailable()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.headConnectionAvailable(r2)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.depend.n r2 = r20.getFileUriProvider()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.fileUriProvider(r2)     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.depend.x r2 = r20.getNotificationClickCallback()     // Catch:{ Throwable -> 0x02bf }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.notificationClickCallback(r2)     // Catch:{ Throwable -> 0x02bf }
            if (r0 == 0) goto L_0x02bd
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r0.getDownloadInfo()     // Catch:{ Throwable -> 0x02bf }
            if (r12 == 0) goto L_0x02b0
            boolean r2 = r20.isNeedNotificationPermission()     // Catch:{ Throwable -> 0x02ae }
            if (r2 == 0) goto L_0x02b0
            android.app.Activity r2 = r20.getActivity()     // Catch:{ Throwable -> 0x02ae }
            if (r2 == 0) goto L_0x02b0
            android.app.Activity r2 = r20.getActivity()     // Catch:{ Throwable -> 0x02ae }
            boolean r2 = r2.isFinishing()     // Catch:{ Throwable -> 0x02ae }
            if (r2 != 0) goto L_0x02b0
            boolean r2 = com.ss.android.socialbase.appdownloader.c.a()     // Catch:{ Throwable -> 0x02ae }
            if (r2 != 0) goto L_0x02b0
            android.app.Activity r2 = r20.getActivity()     // Catch:{ Throwable -> 0x02ae }
            com.ss.android.socialbase.appdownloader.AppDownloader$2 r5 = new com.ss.android.socialbase.appdownloader.AppDownloader$2     // Catch:{ Throwable -> 0x02ae }
            r5.<init>(r8, r0)     // Catch:{ Throwable -> 0x02ae }
            com.ss.android.socialbase.appdownloader.c.a(r2, r5)     // Catch:{ Throwable -> 0x02ae }
            goto L_0x02bd
        L_0x02ae:
            r0 = move-exception
            goto L_0x02c1
        L_0x02b0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x02ae }
            java.lang.String r5 = "notification permission need not request, start download :"
            r2.<init>(r5)     // Catch:{ Throwable -> 0x02ae }
            r2.append(r8)     // Catch:{ Throwable -> 0x02ae }
            r0.download()     // Catch:{ Throwable -> 0x02ae }
        L_0x02bd:
            return r18
        L_0x02be:
            return r2
        L_0x02bf:
            r0 = move-exception
            r4 = 0
        L_0x02c1:
            com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend r2 = r20.getMonitorDepend()
            com.ss.android.socialbase.downloader.exception.BaseException r3 = new com.ss.android.socialbase.downloader.exception.BaseException
            r5 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r6 = "addDownloadTask"
            java.lang.String r6 = com.ss.android.socialbase.downloader.e.d.b((java.lang.Throwable) r0, (java.lang.String) r6)
            r3.<init>((int) r5, (java.lang.String) r6)
            r5 = 0
            com.ss.android.socialbase.downloader.c.a.a((com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend) r2, (com.ss.android.socialbase.downloader.model.DownloadInfo) r4, (com.ss.android.socialbase.downloader.exception.BaseException) r3, (int) r5)
            java.lang.String r2 = "add download task error:%s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r3[r5] = r0
            java.lang.String.format(r2, r3)
            return r5
        L_0x02e5:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.AppDownloader.addDownloadTask(com.ss.android.socialbase.appdownloader.AppTaskBuilder):int");
    }

    public void init(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.j = str;
        }
        if (context != null && !l) {
            b.a(context);
            b.a((k) new com.ss.android.socialbase.appdownloader.a.b());
            a();
            l = true;
        }
    }

    public void setAppDownloadEventListener(int i2, IAppDownloadEventListener iAppDownloadEventListener) {
        if (iAppDownloadEventListener != null) {
            Downloader.getInstance(b.q()).setDownloadNotificationEventListener(i2, a(iAppDownloadEventListener));
        }
    }

    public DownloadInfo getAppDownloadInfo(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return null;
        }
        try {
            String appDownloadPath = AppDownloadUtils.getAppDownloadPath(context);
            if (TextUtils.isEmpty(appDownloadPath)) {
                return null;
            }
            return Downloader.getInstance(context).getDownloadInfo(str, appDownloadPath);
        } catch (Throwable th) {
            String.format("getAppDownloadInfo error:%s", new Object[]{th.getMessage()});
            return null;
        }
    }

    public int getDownloadId(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return 0;
        }
        try {
            String appDownloadPath = AppDownloadUtils.getAppDownloadPath(context);
            if (TextUtils.isEmpty(appDownloadPath)) {
                return 0;
            }
            return Downloader.getInstance(context).getDownloadId(str, appDownloadPath);
        } catch (Throwable th) {
            String.format("getAppDownloadInfo error:%s", new Object[]{th.getMessage()});
            return 0;
        }
    }

    public static boolean startInstall(Context context, int i2) {
        boolean z;
        DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i2);
        if (downloadInfo == null || TextUtils.isEmpty(downloadInfo.getSavePath()) || TextUtils.isEmpty(downloadInfo.getName()) || AppDownloadUtils.isApkInstalled(context, downloadInfo.getSavePath(), downloadInfo.getName())) {
            return false;
        }
        File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
        Uri uriForFile = AppDownloadUtils.getUriForFile(i2, Downloader.getInstance(context).getDownloadFileUriProvider(i2), context, getInstance().getFileProviderAuthority(), file);
        if (uriForFile == null || !file.exists()) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        int i3 = 268435456;
        IAppDownloadDepend appDownloadDepend = getInstance().getAppDownloadDepend();
        if (appDownloadDepend == null || !(appDownloadDepend instanceof AbsAppDownloadDepend)) {
            z = true;
        } else {
            z = ((AbsAppDownloadDepend) appDownloadDepend).needClearWhenTaskReset();
        }
        if (z) {
            i3 = 268959744;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            i3 |= 1;
        }
        intent.addFlags(i3);
        context.startActivity(intent);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleStatusClick(android.content.Context r1, int r2, int r3) {
        /*
            r0 = this;
            switch(r3) {
                case -4: goto L_0x0019;
                case -3: goto L_0x0014;
                case -2: goto L_0x000c;
                case -1: goto L_0x0019;
                case 0: goto L_0x0003;
                case 1: goto L_0x0004;
                case 2: goto L_0x0004;
                case 3: goto L_0x0004;
                case 4: goto L_0x0004;
                case 5: goto L_0x0004;
                case 6: goto L_0x0003;
                case 7: goto L_0x0004;
                case 8: goto L_0x0004;
                default: goto L_0x0003;
            }
        L_0x0003:
            goto L_0x0021
        L_0x0004:
            com.ss.android.socialbase.downloader.downloader.Downloader r1 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r1)     // Catch:{ Exception -> 0x0020 }
            r1.pause(r2)     // Catch:{ Exception -> 0x0020 }
            goto L_0x0020
        L_0x000c:
            com.ss.android.socialbase.downloader.downloader.Downloader r1 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r1)     // Catch:{ Exception -> 0x0020 }
            r1.resume(r2)     // Catch:{ Exception -> 0x0020 }
            goto L_0x0020
        L_0x0014:
            r3 = 1
            com.ss.android.socialbase.appdownloader.AppDownloadUtils.startViewIntent(r1, r2, r3)     // Catch:{ Exception -> 0x0020 }
            goto L_0x0021
        L_0x0019:
            com.ss.android.socialbase.downloader.downloader.Downloader r1 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r1)     // Catch:{ Exception -> 0x0020 }
            r1.restart(r2)     // Catch:{ Exception -> 0x0020 }
        L_0x0020:
            return
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.AppDownloader.handleStatusClick(android.content.Context, int, int):void");
    }

    @Deprecated
    public void init(Context context, String str, IAppDownloadDepend iAppDownloadDepend, IAppDownloadEventHandler iAppDownloadEventHandler, IAppDownloadMonitorListener iAppDownloadMonitorListener) {
        if (iAppDownloadDepend != null) {
            this.f30751b = iAppDownloadDepend;
        }
        if (iAppDownloadEventHandler != null) {
            this.f30752c = iAppDownloadEventHandler;
        }
        if (iAppDownloadMonitorListener != null) {
            this.appDownloadMonitorListener = iAppDownloadMonitorListener;
        }
        if (context != null && !l) {
            b.a(context);
            b.a((k) new com.ss.android.socialbase.appdownloader.a.b());
            a();
            l = true;
        }
    }
}
