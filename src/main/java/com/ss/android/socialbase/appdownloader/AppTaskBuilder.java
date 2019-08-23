package com.ss.android.socialbase.appdownloader;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadEventListener;
import com.ss.android.socialbase.downloader.constants.EnqueueType;
import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.ss.android.socialbase.downloader.depend.n;
import com.ss.android.socialbase.downloader.depend.x;
import com.ss.android.socialbase.downloader.downloader.g;
import com.ss.android.socialbase.downloader.downloader.p;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.notification.a;
import java.util.List;

public class AppTaskBuilder {
    private Activity activity;
    private IAppDownloadEventListener appDownloadEventListener;
    private boolean autoInstallWithNotification = true;
    private boolean autoInstallWithoutNotification;
    private boolean autoResumed;
    private g chunkStrategy;
    private Context context;
    private IDownloadDepend depend;
    private EnqueueType enqueueType = EnqueueType.ENQUEUE_NONE;
    private String extra;
    private n fileUriProvider;
    private boolean force;
    private boolean headConnectionAvailable = true;
    private List<HttpHeader> headers;
    private IDownloadListener mainThreadListener;
    private int maxProgressCount;
    private String md5;
    private String mimeType = "application/vnd.android.package-archive";
    private int minProgressTimeMsInterval = 150;
    private IDownloadMonitorDepend monitorDepend;
    private String name;
    private boolean needDefaultHttpServiceBackUp;
    private boolean needHttpsToHttpRetry;
    private boolean needIndependentProcess;
    private boolean needNotificationPermission;
    private boolean needRetryDelay;
    private boolean needReuseChunkRunnable;
    private boolean needReuseFirstConnection;
    private boolean needWifi;
    private x notificationClickCallback;
    private a notificationItem;
    private IDownloadListener notificationListener;
    private String packageName;
    private p retryDelayTimeCalculator;
    private String saveName;
    private String savePath;
    private boolean showNotification = true;
    private boolean showNotificationForAutoResumed;
    private String url;

    public Activity getActivity() {
        return this.activity;
    }

    public IAppDownloadEventListener getAppDownloadEventListener() {
        return this.appDownloadEventListener;
    }

    public g getChunkStrategy() {
        return this.chunkStrategy;
    }

    public Context getContext() {
        return this.context;
    }

    public IDownloadDepend getDepend() {
        return this.depend;
    }

    public EnqueueType getEnqueueType() {
        return this.enqueueType;
    }

    public String getExtra() {
        return this.extra;
    }

    public n getFileUriProvider() {
        return this.fileUriProvider;
    }

    public List<HttpHeader> getHeaders() {
        return this.headers;
    }

    public IDownloadListener getMainThreadListener() {
        return this.mainThreadListener;
    }

    public int getMaxProgressCount() {
        return this.maxProgressCount;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public int getMinProgressTimeMsInterval() {
        return this.minProgressTimeMsInterval;
    }

    public IDownloadMonitorDepend getMonitorDepend() {
        return this.monitorDepend;
    }

    public String getName() {
        return this.name;
    }

    public x getNotificationClickCallback() {
        return this.notificationClickCallback;
    }

    public a getNotificationItem() {
        return this.notificationItem;
    }

    public IDownloadListener getNotificationListener() {
        return this.notificationListener;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public p getRetryDelayTimeCalculator() {
        return this.retryDelayTimeCalculator;
    }

    public String getSaveName() {
        return this.saveName;
    }

    public String getSavePath() {
        return this.savePath;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isAutoInstallWithNotification() {
        return this.autoInstallWithNotification;
    }

    public boolean isAutoInstallWithoutNotification() {
        return this.autoInstallWithoutNotification;
    }

    public boolean isAutoResumed() {
        return this.autoResumed;
    }

    public boolean isForce() {
        return this.force;
    }

    public boolean isHeadConnectionAvailable() {
        return this.headConnectionAvailable;
    }

    public boolean isNeedDefaultHttpServiceBackUp() {
        return this.needDefaultHttpServiceBackUp;
    }

    public boolean isNeedHttpsToHttpRetry() {
        return this.needHttpsToHttpRetry;
    }

    public boolean isNeedIndependentProcess() {
        return this.needIndependentProcess;
    }

    public boolean isNeedNotificationPermission() {
        return this.needNotificationPermission;
    }

    public boolean isNeedRetryDelay() {
        return this.needRetryDelay;
    }

    public boolean isNeedReuseChunkRunnable() {
        return this.needReuseChunkRunnable;
    }

    public boolean isNeedReuseFirstConnection() {
        return this.needReuseFirstConnection;
    }

    public boolean isNeedWifi() {
        return this.needWifi;
    }

    public boolean isShowNotification() {
        return this.showNotification;
    }

    public boolean isShowNotificationForAutoResumed() {
        return this.showNotificationForAutoResumed;
    }

    public AppTaskBuilder activity(Activity activity2) {
        this.activity = activity2;
        return this;
    }

    public AppTaskBuilder appDownloadEventListener(IAppDownloadEventListener iAppDownloadEventListener) {
        this.appDownloadEventListener = iAppDownloadEventListener;
        return this;
    }

    public AppTaskBuilder autoInstallWithNotification(boolean z) {
        this.autoInstallWithNotification = z;
        return this;
    }

    public AppTaskBuilder autoInstallWithoutNotification(boolean z) {
        this.autoInstallWithoutNotification = z;
        return this;
    }

    public AppTaskBuilder autoResumed(boolean z) {
        this.autoResumed = z;
        return this;
    }

    public AppTaskBuilder chunkStrategy(g gVar) {
        this.chunkStrategy = gVar;
        return this;
    }

    public AppTaskBuilder depend(IDownloadDepend iDownloadDepend) {
        this.depend = iDownloadDepend;
        return this;
    }

    public AppTaskBuilder enqueueType(EnqueueType enqueueType2) {
        this.enqueueType = enqueueType2;
        return this;
    }

    public AppTaskBuilder extra(String str) {
        this.extra = str;
        return this;
    }

    public AppTaskBuilder fileUriProvider(n nVar) {
        this.fileUriProvider = nVar;
        return this;
    }

    public AppTaskBuilder force(boolean z) {
        this.force = z;
        return this;
    }

    public AppTaskBuilder headConnectionAvailable(boolean z) {
        this.headConnectionAvailable = z;
        return this;
    }

    public AppTaskBuilder headers(List<HttpHeader> list) {
        this.headers = list;
        return this;
    }

    public AppTaskBuilder mainThreadListener(IDownloadListener iDownloadListener) {
        this.mainThreadListener = iDownloadListener;
        return this;
    }

    public AppTaskBuilder maxProgressCount(int i) {
        this.maxProgressCount = i;
        return this;
    }

    public AppTaskBuilder md5(String str) {
        this.md5 = str;
        return this;
    }

    public AppTaskBuilder mimeType(String str) {
        this.mimeType = str;
        return this;
    }

    public AppTaskBuilder minProgressTimeMsInterval(int i) {
        this.minProgressTimeMsInterval = i;
        return this;
    }

    public AppTaskBuilder monitorDepend(IDownloadMonitorDepend iDownloadMonitorDepend) {
        this.monitorDepend = iDownloadMonitorDepend;
        return this;
    }

    public AppTaskBuilder name(String str) {
        this.name = str;
        return this;
    }

    public AppTaskBuilder needDefaultHttpServiceBackUp(boolean z) {
        this.needDefaultHttpServiceBackUp = z;
        return this;
    }

    public AppTaskBuilder needHttpsToHttpRetry(boolean z) {
        this.needHttpsToHttpRetry = z;
        return this;
    }

    public AppTaskBuilder needIndependentProcess(boolean z) {
        this.needIndependentProcess = z;
        return this;
    }

    public AppTaskBuilder needNotificationPermission(boolean z) {
        this.needNotificationPermission = z;
        return this;
    }

    public AppTaskBuilder needRetryDelay(boolean z) {
        this.needRetryDelay = z;
        return this;
    }

    public AppTaskBuilder needReuseChunkRunnable(boolean z) {
        this.needReuseChunkRunnable = z;
        return this;
    }

    public AppTaskBuilder needReuseFirstConnection(boolean z) {
        this.needReuseFirstConnection = z;
        return this;
    }

    public AppTaskBuilder needWifi(boolean z) {
        this.needWifi = z;
        return this;
    }

    public AppTaskBuilder notificationClickCallback(x xVar) {
        this.notificationClickCallback = xVar;
        return this;
    }

    public AppTaskBuilder notificationItem(a aVar) {
        this.notificationItem = aVar;
        return this;
    }

    public AppTaskBuilder notificationListener(IDownloadListener iDownloadListener) {
        this.notificationListener = iDownloadListener;
        return this;
    }

    public AppTaskBuilder packageName(String str) {
        this.packageName = str;
        return this;
    }

    public AppTaskBuilder retryDelayTimeCalculator(p pVar) {
        this.retryDelayTimeCalculator = pVar;
        return this;
    }

    public AppTaskBuilder saveName(String str) {
        this.saveName = str;
        return this;
    }

    public AppTaskBuilder savePath(@NonNull String str) {
        this.savePath = str;
        return this;
    }

    public AppTaskBuilder showNotification(boolean z) {
        this.showNotification = z;
        return this;
    }

    public AppTaskBuilder showNotificationForAutoResumed(boolean z) {
        this.showNotificationForAutoResumed = z;
        return this;
    }

    public AppTaskBuilder(@NonNull Context context2, @NonNull String str) {
        this.context = context2.getApplicationContext();
        this.url = str;
    }
}
