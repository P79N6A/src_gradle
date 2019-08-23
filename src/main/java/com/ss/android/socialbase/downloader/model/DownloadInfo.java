package com.ss.android.socialbase.downloader.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.socialbase.downloader.constants.EnqueueType;
import com.ss.android.socialbase.downloader.constants.f;
import com.ss.android.socialbase.downloader.constants.h;
import com.ss.android.socialbase.downloader.constants.i;
import com.ss.android.socialbase.downloader.e.d;
import com.ss.android.socialbase.downloader.exception.BaseException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class DownloadInfo implements Parcelable {
    public static final Parcelable.Creator<DownloadInfo> CREATOR = new Parcelable.Creator<DownloadInfo>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new DownloadInfo[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new DownloadInfo(parcel);
        }
    };
    private com.ss.android.socialbase.downloader.constants.a asyncHandleStatus;
    private boolean autoResumed;
    private boolean backUpUrlUsed;
    private List<String> backUpUrls;
    private int bindValueCount;
    private com.ss.android.socialbase.downloader.constants.b byteInvalidRetryStatus;
    private int chunkCount;
    private int curBackUpUrlIndex;
    private AtomicLong curBytes;
    private int curRetryTime;
    private long downloadTime;
    private String eTag;
    private EnqueueType enqueueType;
    private StringBuffer errorBytesLog;
    private String extra;
    private List<HttpHeader> extraHeaders;
    private List<String> forbiddenBackupUrls;
    private boolean force;
    private boolean forceIgnoreRecommendSize;
    private boolean headConnectionAvailable;
    private String headConnectionException;
    private int httpStatusCode;
    private String httpStatusMessage;
    private boolean httpsToHttpRetryUsed;
    private int id;
    private boolean ignoreDataVerify;
    private boolean isFirstDownload;
    private boolean isFirstSuccess;
    private volatile boolean isSaveTempFile;
    private AtomicLong lastNotifyProgressTime;
    private int maxBytes;
    private int maxProgressCount;
    private String md5;
    private String mimeType;
    private int minProgressTimeMsInterval;
    private String name;
    private boolean needDefaultHttpServiceBackUp;
    private boolean needHttpsToHttpRetry;
    private boolean needIndependentProcess;
    private boolean needPostProgress;
    private boolean needRetryDelay;
    private boolean needReuseChunkRunnable;
    private boolean needReuseFirstConnection;
    private String networkQuality;
    private int notificationVisibility;
    private boolean onlyWifi;
    private String[] outIp;
    private int[] outSize;
    private String packageName;
    private int retryCount;
    private i retryDelayStatus;
    private String savePath;
    private boolean showNotification;
    private boolean showNotificationForAutoResumed;
    private boolean showNotificationForNetworkResumed;
    private long startDownloadTime;
    private AtomicInteger status;
    private volatile List<b> tempFileSaveCompleteCallbacks;
    private String tempPath;
    private String title;
    private long totalBytes;
    private String url;

    public static class a {
        public boolean A;
        public boolean B;
        public boolean C;
        public EnqueueType D = EnqueueType.ENQUEUE_NONE;
        public boolean E;
        public boolean F;

        /* renamed from: a  reason: collision with root package name */
        public String f31046a;

        /* renamed from: b  reason: collision with root package name */
        public String f31047b;

        /* renamed from: c  reason: collision with root package name */
        public String f31048c;

        /* renamed from: d  reason: collision with root package name */
        public String f31049d;

        /* renamed from: e  reason: collision with root package name */
        public String f31050e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f31051f;
        public String g;
        public List<HttpHeader> h;
        public int i;
        public String[] j;
        public int[] k;
        public int l;
        public boolean m;
        public boolean n = true;
        public int o;
        public int p;
        public List<String> q;
        public boolean r;
        public String s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x;
        public String y;
        public String z;

        public final DownloadInfo a() {
            return new DownloadInfo(this);
        }

        public a() {
        }

        public final a a(String str) {
            this.f31046a = str;
            return this;
        }

        public final a b(String str) {
            this.g = str;
            return this;
        }

        public a(String str) {
            this.f31048c = str;
        }
    }

    public interface b {
        void a();

        void a(BaseException baseException);
    }

    public int describeContents() {
        return 0;
    }

    public com.ss.android.socialbase.downloader.constants.a getAsyncHandleStatus() {
        return this.asyncHandleStatus;
    }

    public List<String> getBackUpUrls() {
        return this.backUpUrls;
    }

    public int getBindValueCount() {
        return this.bindValueCount;
    }

    public com.ss.android.socialbase.downloader.constants.b getByteInvalidRetryStatus() {
        return this.byteInvalidRetryStatus;
    }

    public int getChunkCount() {
        return this.chunkCount;
    }

    public int getCurBackUpUrlIndex() {
        return this.curBackUpUrlIndex;
    }

    public int getCurRetryTime() {
        return this.curRetryTime;
    }

    public long getDownloadTime() {
        return this.downloadTime;
    }

    public EnqueueType getEnqueueType() {
        return this.enqueueType;
    }

    public String getExtra() {
        return this.extra;
    }

    public List<HttpHeader> getExtraHeaders() {
        return this.extraHeaders;
    }

    public List<String> getForbiddenBackupUrls() {
        return this.forbiddenBackupUrls;
    }

    public String getHeadConnectionException() {
        return this.headConnectionException;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public String getHttpStatusMessage() {
        return this.httpStatusMessage;
    }

    public boolean getIsFirstDownload() {
        return this.isFirstDownload;
    }

    public int getMaxBytes() {
        return this.maxBytes;
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

    public String getName() {
        return this.name;
    }

    public String getNetworkQuality() {
        return this.networkQuality;
    }

    public int getNotificationVisibility() {
        return this.notificationVisibility;
    }

    public String[] getOutIp() {
        return this.outIp;
    }

    public int[] getOutSize() {
        return this.outSize;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public i getRetryDelayStatus() {
        return this.retryDelayStatus;
    }

    public String getSavePath() {
        return this.savePath;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public String getUrl() {
        return this.url;
    }

    public String geteTag() {
        return this.eTag;
    }

    public boolean isAutoResumed() {
        return this.autoResumed;
    }

    public boolean isBackUpUrlUsed() {
        return this.backUpUrlUsed;
    }

    public boolean isFirstSuccess() {
        return this.isFirstSuccess;
    }

    public boolean isForce() {
        return this.force;
    }

    public boolean isForceIgnoreRecommendSize() {
        return this.forceIgnoreRecommendSize;
    }

    public boolean isHeadConnectionAvailable() {
        return this.headConnectionAvailable;
    }

    public boolean isHttpsToHttpRetryUsed() {
        return this.httpsToHttpRetryUsed;
    }

    public boolean isIgnoreDataVerify() {
        return this.ignoreDataVerify;
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

    public boolean isNeedPostProgress() {
        return this.needPostProgress;
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

    public boolean isOnlyWifi() {
        return this.onlyWifi;
    }

    public boolean isShowNotification() {
        return this.showNotification;
    }

    public boolean isShowNotificationForAutoResumed() {
        return this.showNotificationForAutoResumed;
    }

    public boolean isShowNotificationForNetworkResumed() {
        return this.showNotificationForNetworkResumed;
    }

    public boolean isChunked() {
        return d.a(this.totalBytes);
    }

    public synchronized boolean isSaveTempFile() {
        return this.isSaveTempFile;
    }

    public void updateStartDownloadTime() {
        this.startDownloadTime = SystemClock.uptimeMillis();
    }

    public h checkMd5Valid() {
        return d.a(getSavePath(), getName(), this.md5);
    }

    public long getCurBytes() {
        if (this.curBytes != null) {
            return this.curBytes.get();
        }
        return 0;
    }

    public int getId() {
        if (this.id == 0) {
            this.id = com.ss.android.socialbase.downloader.downloader.b.a(this);
        }
        return this.id;
    }

    public int getMinProgressTimeMsInterval() {
        int i = this.minProgressTimeMsInterval;
        if (i < 1000) {
            return PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        }
        return i;
    }

    public int getRealStatus() {
        if (this.status != null) {
            return this.status.get();
        }
        return 0;
    }

    public String getTargetFilePath() {
        return d.b(this.savePath, this.name);
    }

    public String getTitle() {
        if (TextUtils.isEmpty(this.title)) {
            return this.name;
        }
        return this.title;
    }

    public boolean isBreakpointAvailable() {
        if (!isFileDataValid()) {
            return false;
        }
        return isChunkBreakpointAvailable();
    }

    public boolean isDownloadOverStatus() {
        return f.a(getStatus());
    }

    public boolean isDownloaded() {
        return d.a(this, isForce(), getMd5());
    }

    public boolean isDownloadingStatus() {
        return f.b(getStatus());
    }

    public boolean isNewTask() {
        if (getStatus() == 0) {
            return true;
        }
        return false;
    }

    public void reset() {
        setCurBytes(0, true);
        this.totalBytes = 0;
        this.chunkCount = 1;
        this.downloadTime = 0;
    }

    public void setLastNotifyProgressTime() {
        this.lastNotifyProgressTime.set(SystemClock.uptimeMillis());
    }

    public boolean canNotifyProgress() {
        long j = this.lastNotifyProgressTime.get();
        if (j == 0 || SystemClock.uptimeMillis() - j > 20) {
            return true;
        }
        return false;
    }

    public boolean canReStartAsyncTask() {
        if (getStatus() == -3 || this.asyncHandleStatus != com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_WAITING) {
            return false;
        }
        return true;
    }

    public boolean canReplaceHttpForRetry() {
        if (TextUtils.isEmpty(this.url) || !this.url.startsWith("https") || !this.needHttpsToHttpRetry || this.httpsToHttpRetryUsed) {
            return false;
        }
        return true;
    }

    public boolean canShowNotification() {
        if ((this.autoResumed || !this.showNotification) && (!this.autoResumed || (!this.showNotificationForAutoResumed && !this.showNotificationForNetworkResumed))) {
            return false;
        }
        return true;
    }

    public boolean canStartRetryDelayTask() {
        if (!this.needRetryDelay || getStatus() == -3 || this.retryDelayStatus != i.DELAY_RETRY_WAITING) {
            return false;
        }
        return true;
    }

    public String getErrorBytesLog() {
        if (this.errorBytesLog == null || this.errorBytesLog.length() == 0) {
            return "";
        }
        return this.errorBytesLog.toString();
    }

    public int getStatus() {
        if (this.status == null) {
            return 0;
        }
        int i = this.status.get();
        if (i == -5) {
            i = -2;
        }
        return i;
    }

    public String getTempName() {
        String str = this.name;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return String.format("%s.temp", new Object[]{str});
    }

    public String getTempPath() {
        String str = this.savePath;
        String str2 = this.tempPath;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        return str;
    }

    public boolean isDownloadWithWifiValid() {
        if (!isOnlyWifi() || d.a(com.ss.android.socialbase.downloader.downloader.b.q())) {
            return true;
        }
        return false;
    }

    public boolean isEntityInvalid() {
        if (TextUtils.isEmpty(this.url) || TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.savePath)) {
            return true;
        }
        return false;
    }

    public void updateDownloadTime() {
        if (this.startDownloadTime != 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.startDownloadTime;
            if (this.downloadTime < 0) {
                this.downloadTime = 0;
            }
            if (uptimeMillis > 0) {
                this.downloadTime = uptimeMillis;
            }
        }
    }

    public DownloadInfo() {
        this.retryDelayStatus = i.DELAY_RETRY_NONE;
        this.asyncHandleStatus = com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_NONE;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = com.ss.android.socialbase.downloader.constants.b.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0);
        this.isSaveTempFile = false;
    }

    private void refreshBackupUrls() {
        if (this.forbiddenBackupUrls != null) {
            if (this.forbiddenBackupUrls.size() > 1) {
                if (this.backUpUrls == null) {
                    this.backUpUrls = new ArrayList();
                } else {
                    this.backUpUrls.clear();
                }
                this.backUpUrlUsed = false;
                this.curBackUpUrlIndex = 0;
                for (int i = 1; i < this.forbiddenBackupUrls.size(); i++) {
                    this.backUpUrls.add(this.forbiddenBackupUrls.get(i));
                }
            }
        }
    }

    public boolean canSkipStatusHandler() {
        int status2 = getStatus();
        if (status2 == 7 || this.retryDelayStatus == i.DELAY_RETRY_WAITING || status2 == 8 || this.asyncHandleStatus == com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_WAITING || this.asyncHandleStatus == com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_RESTART || this.byteInvalidRetryStatus == com.ss.android.socialbase.downloader.constants.b.BYTE_INVALID_RETRY_STATUS_RESTART) {
            return true;
        }
        return false;
    }

    public void changeSkipStatus() {
        int status2 = getStatus();
        if (status2 == 7 || this.retryDelayStatus == i.DELAY_RETRY_WAITING) {
            setRetryDelayStatus(i.DELAY_RETRY_DOWNLOADING);
        }
        if (status2 == 8 || this.asyncHandleStatus == com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_WAITING || this.asyncHandleStatus == com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_RESTART) {
            setAsyncHandleStatus(com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_DOWNLOADING);
        }
        if (this.byteInvalidRetryStatus == com.ss.android.socialbase.downloader.constants.b.BYTE_INVALID_RETRY_STATUS_RESTART) {
            setByteInvalidRetryStatus(com.ss.android.socialbase.downloader.constants.b.BYTE_INVALID_RETRY_STATUS_DOWNLOADING);
        }
    }

    public String getBackUpUrl() {
        if (!this.backUpUrlUsed || this.backUpUrls == null || this.backUpUrls.size() <= 0 || this.curBackUpUrlIndex < 0 || this.curBackUpUrlIndex >= this.backUpUrls.size()) {
            return "";
        }
        String str = this.backUpUrls.get(this.curBackUpUrlIndex);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return "";
    }

    public int getDownloadProcess() {
        if (this.totalBytes <= 0) {
            return 0;
        }
        if (getCurBytes() > this.totalBytes) {
            return 100;
        }
        return (int) ((getCurBytes() * 100) / this.totalBytes);
    }

    public String getTempFilePath() {
        String str;
        String str2 = this.savePath;
        String str3 = this.tempPath;
        String str4 = this.name;
        if ((TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) || TextUtils.isEmpty(str4)) {
            return null;
        }
        if (!TextUtils.isEmpty(str3)) {
            str = d.b(str3, str4);
        } else {
            str = d.b(str2, str4);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return String.format("%s.temp", new Object[]{str});
    }

    public boolean hasOtherBackupUrl() {
        if (this.backUpUrls == null || this.backUpUrls.size() <= 0 || (this.backUpUrlUsed && (this.curBackUpUrlIndex < 0 || this.curBackUpUrlIndex >= this.backUpUrls.size()))) {
            return false;
        }
        return true;
    }

    public boolean isCanResumeFromBreakPointStatus() {
        int status2 = getStatus();
        if (status2 == 4 || status2 == 3 || status2 == -1 || status2 == 5 || ((status2 == 1 || status2 == 2) && getCurBytes() > 0)) {
            return true;
        }
        return false;
    }

    public boolean isFirstDownload() {
        if (this.isFirstDownload && !TextUtils.isEmpty(getTempPath()) && !TextUtils.isEmpty(getTempName()) && !new File(getTempPath(), getTempName()).exists()) {
            return true;
        }
        return false;
    }

    public boolean canRetryWithBackUpUrl() {
        if (this.backUpUrlUsed) {
            this.curBackUpUrlIndex++;
        }
        if (this.backUpUrls == null || this.backUpUrls.size() == 0 || this.curBackUpUrlIndex < 0) {
            return false;
        }
        while (this.curBackUpUrlIndex < this.backUpUrls.size()) {
            if (!TextUtils.isEmpty(this.backUpUrls.get(this.curBackUpUrlIndex))) {
                this.backUpUrlUsed = true;
                return true;
            }
            this.curBackUpUrlIndex++;
        }
        return false;
    }

    public String getConnectionUrl() {
        String str = this.url;
        if (getStatus() == 8 && this.forbiddenBackupUrls != null && !this.forbiddenBackupUrls.isEmpty() && !this.backUpUrlUsed) {
            return this.forbiddenBackupUrls.get(0);
        }
        if (this.backUpUrlUsed && this.backUpUrls != null && this.backUpUrls.size() > 0 && this.curBackUpUrlIndex >= 0 && this.curBackUpUrlIndex < this.backUpUrls.size()) {
            String str2 = this.backUpUrls.get(this.curBackUpUrlIndex);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            return str;
        } else if (TextUtils.isEmpty(this.url) || !this.url.startsWith("https") || !this.needHttpsToHttpRetry || !this.httpsToHttpRetryUsed) {
            return str;
        } else {
            return this.url.replaceFirst("https", "http");
        }
    }

    public boolean isChunkBreakpointAvailable() {
        if (this.chunkCount > 1) {
            com.ss.android.socialbase.downloader.downloader.i i = com.ss.android.socialbase.downloader.downloader.b.i();
            if (i != null) {
                List<b> c2 = i.c(getId());
                if (c2 == null || c2.size() != this.chunkCount) {
                    return false;
                }
                long j = 0;
                for (b bVar : c2) {
                    if (bVar != null) {
                        j += bVar.j();
                    }
                }
                if (j != getCurBytes()) {
                    setCurBytes(j);
                }
            }
        }
        return true;
    }

    public boolean isFileDataValid() {
        if (isEntityInvalid()) {
            return false;
        }
        File file = new File(getTempPath(), getTempName());
        boolean exists = file.exists();
        boolean isDirectory = file.isDirectory();
        if (!exists || isDirectory) {
            return false;
        }
        long length = file.length();
        long curBytes2 = getCurBytes();
        if (length <= 0 || curBytes2 <= 0 || this.totalBytes <= 0 || this.chunkCount <= 0 || length < curBytes2 || length > this.totalBytes || curBytes2 >= this.totalBytes) {
            return false;
        }
        return true;
    }

    public ContentValues toContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(this.id));
        contentValues.put(PushConstants.WEB_URL, this.url);
        contentValues.put("savePath", this.savePath);
        contentValues.put("tempPath", this.tempPath);
        contentValues.put("name", this.name);
        contentValues.put("chunkCount", Integer.valueOf(this.chunkCount));
        contentValues.put("status", Integer.valueOf(getStatus()));
        contentValues.put("curBytes", Long.valueOf(getCurBytes()));
        contentValues.put("totalBytes", Long.valueOf(this.totalBytes));
        contentValues.put("eTag", this.eTag);
        contentValues.put("onlyWifi", Integer.valueOf(this.onlyWifi ? 1 : 0));
        contentValues.put("force", Integer.valueOf(this.force ? 1 : 0));
        contentValues.put("retryCount", Integer.valueOf(this.retryCount));
        contentValues.put(PushConstants.EXTRA, this.extra);
        contentValues.put("mimeType", this.mimeType);
        contentValues.put(PushConstants.TITLE, this.title);
        contentValues.put("notificationEnable", Integer.valueOf(this.showNotification ? 1 : 0));
        contentValues.put("notificationVisibility", Integer.valueOf(this.notificationVisibility));
        contentValues.put("isFirstDownload", Integer.valueOf(this.isFirstDownload ? 1 : 0));
        contentValues.put("isFirstSuccess", Integer.valueOf(this.isFirstSuccess ? 1 : 0));
        contentValues.put("needHttpsToHttpRetry", Integer.valueOf(this.needHttpsToHttpRetry ? 1 : 0));
        contentValues.put("downloadTime", Long.valueOf(this.downloadTime));
        contentValues.put("packageName", this.packageName);
        contentValues.put("md5", this.md5);
        contentValues.put("retryDelay", Integer.valueOf(this.needRetryDelay ? 1 : 0));
        contentValues.put("curRetryTime", Integer.valueOf(this.curRetryTime));
        contentValues.put("retryDelayStatus", Integer.valueOf(this.retryDelayStatus.ordinal()));
        contentValues.put("defaultHttpServiceBackUp", Integer.valueOf(this.needDefaultHttpServiceBackUp ? 1 : 0));
        contentValues.put("chunkRunnableReuse", Integer.valueOf(this.needReuseChunkRunnable ? 1 : 0));
        return contentValues;
    }

    public void setAsyncHandleStatus(com.ss.android.socialbase.downloader.constants.a aVar) {
        this.asyncHandleStatus = aVar;
    }

    public void setAutoResumed(boolean z) {
        this.autoResumed = z;
    }

    public void setByteInvalidRetryStatus(com.ss.android.socialbase.downloader.constants.b bVar) {
        this.byteInvalidRetryStatus = bVar;
    }

    public void setChunkCount(int i) {
        this.chunkCount = i;
    }

    public void setFirstDownload(boolean z) {
        this.isFirstDownload = z;
    }

    public void setFirstSuccess(boolean z) {
        this.isFirstSuccess = z;
    }

    public void setForceIgnoreRecommendSize(boolean z) {
        this.forceIgnoreRecommendSize = z;
    }

    public void setHeadConnectionException(String str) {
        this.headConnectionException = str;
    }

    public void setHttpStatusCode(int i) {
        this.httpStatusCode = i;
    }

    public void setHttpStatusMessage(String str) {
        this.httpStatusMessage = str;
    }

    public void setHttpsToHttpRetryUsed(boolean z) {
        this.httpsToHttpRetryUsed = z;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNetworkQuality(String str) {
        this.networkQuality = str;
    }

    public void setNotificationVisibility(int i) {
        this.notificationVisibility = i;
    }

    public void setRetryDelayStatus(i iVar) {
        this.retryDelayStatus = iVar;
    }

    public void setShowNotification(boolean z) {
        this.showNotification = z;
    }

    public void setShowNotificationForAutoResumed(boolean z) {
        this.showNotificationForAutoResumed = z;
    }

    public void setShowNotificationForNetworkResumed(boolean z) {
        this.showNotificationForNetworkResumed = z;
    }

    public void setTotalBytes(long j) {
        this.totalBytes = j;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void seteTag(String str) {
        this.eTag = str;
    }

    public void increaseCurBytes(long j) {
        this.curBytes.addAndGet(j);
    }

    public void setForbiddenBackupUrls(List<String> list) {
        this.forbiddenBackupUrls = list;
        refreshBackupUrls();
    }

    public synchronized void setIsSaveTempFile(boolean z) {
        this.isSaveTempFile = z;
    }

    public void setDownloadTime(long j) {
        if (j >= 0) {
            this.downloadTime = j;
        }
    }

    public void updateCurRetryTime(int i) {
        this.curRetryTime = this.retryCount - i;
        if (this.curRetryTime < 0) {
            this.curRetryTime = 0;
        }
    }

    private void convertEnqueueType(int i) {
        if (i == EnqueueType.ENQUEUE_HEAD.ordinal()) {
            this.enqueueType = EnqueueType.ENQUEUE_HEAD;
        } else if (i == EnqueueType.ENQUEUE_TAIL.ordinal()) {
            this.enqueueType = EnqueueType.ENQUEUE_TAIL;
        } else {
            this.enqueueType = EnqueueType.ENQUEUE_NONE;
        }
    }

    public long getMinByteIntervalForPostToMainThread(long j) {
        int i = this.maxProgressCount;
        if (i <= 0) {
            i = 100;
        }
        long j2 = j / ((long) (i + 1));
        if (j2 <= 0) {
            return 1048576;
        }
        return j2;
    }

    public void resetDataForEtagEndure(String str) {
        setCurBytes(0, true);
        setTotalBytes(0);
        seteTag(str);
        setChunkCount(1);
        this.downloadTime = 0;
    }

    public void setCurBytes(long j) {
        if (this.curBytes != null) {
            this.curBytes.set(j);
        } else {
            this.curBytes = new AtomicLong(j);
        }
    }

    public void setStatus(int i) {
        if (this.status != null) {
            this.status.set(i);
        } else {
            this.status = new AtomicInteger(i);
        }
    }

    private void convertRetryDelayStatus(int i) {
        if (i == i.DELAY_RETRY_WAITING.ordinal()) {
            this.retryDelayStatus = i.DELAY_RETRY_WAITING;
        } else if (i == i.DELAY_RETRY_DOWNLOADING.ordinal()) {
            this.retryDelayStatus = i.DELAY_RETRY_DOWNLOADING;
        } else if (i == i.DELAY_RETRY_DOWNLOADED.ordinal()) {
            this.retryDelayStatus = i.DELAY_RETRY_DOWNLOADED;
        } else {
            this.retryDelayStatus = i.DELAY_RETRY_NONE;
        }
    }

    public boolean equalsTask(DownloadInfo downloadInfo) {
        if (downloadInfo == null || this.url == null || !this.url.equals(downloadInfo.getUrl()) || this.savePath == null || !this.savePath.equals(downloadInfo.getSavePath())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void registerTempFileSaveCallback(com.ss.android.socialbase.downloader.model.DownloadInfo.b r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 != 0) goto L_0x0005
            monitor-exit(r4)
            return
        L_0x0005:
            java.util.List<com.ss.android.socialbase.downloader.model.DownloadInfo$b> r0 = r4.tempFileSaveCompleteCallbacks     // Catch:{ Throwable -> 0x0021 }
            if (r0 != 0) goto L_0x0010
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0021 }
            r0.<init>()     // Catch:{ Throwable -> 0x0021 }
            r4.tempFileSaveCompleteCallbacks = r0     // Catch:{ Throwable -> 0x0021 }
        L_0x0010:
            java.util.List<com.ss.android.socialbase.downloader.model.DownloadInfo$b> r0 = r4.tempFileSaveCompleteCallbacks     // Catch:{ Throwable -> 0x0021 }
            boolean r0 = r0.contains(r5)     // Catch:{ Throwable -> 0x0021 }
            if (r0 != 0) goto L_0x001d
            java.util.List<com.ss.android.socialbase.downloader.model.DownloadInfo$b> r0 = r4.tempFileSaveCompleteCallbacks     // Catch:{ Throwable -> 0x0021 }
            r0.add(r5)     // Catch:{ Throwable -> 0x0021 }
        L_0x001d:
            monitor-exit(r4)
            return
        L_0x001f:
            r5 = move-exception
            goto L_0x0034
        L_0x0021:
            r0 = move-exception
            com.ss.android.socialbase.downloader.exception.BaseException r1 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ all -> 0x001f }
            r2 = 1038(0x40e, float:1.455E-42)
            java.lang.String r3 = "registerTempFileSaveCallback"
            java.lang.String r0 = com.ss.android.socialbase.downloader.e.d.b((java.lang.Throwable) r0, (java.lang.String) r3)     // Catch:{ all -> 0x001f }
            r1.<init>((int) r2, (java.lang.String) r0)     // Catch:{ all -> 0x001f }
            r5.a(r1)     // Catch:{ all -> 0x001f }
            monitor-exit(r4)
            return
        L_0x0034:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.model.DownloadInfo.registerTempFileSaveCallback(com.ss.android.socialbase.downloader.model.DownloadInfo$b):void");
    }

    protected DownloadInfo(Parcel parcel) {
        this.retryDelayStatus = i.DELAY_RETRY_NONE;
        this.asyncHandleStatus = com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_NONE;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = com.ss.android.socialbase.downloader.constants.b.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0);
        this.isSaveTempFile = false;
        readFromParcel(parcel);
    }

    private DownloadInfo(a aVar) {
        this.retryDelayStatus = i.DELAY_RETRY_NONE;
        this.asyncHandleStatus = com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_NONE;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = com.ss.android.socialbase.downloader.constants.b.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0);
        this.isSaveTempFile = false;
        if (aVar != null) {
            this.name = aVar.f31046a;
            this.title = aVar.f31047b;
            this.url = aVar.f31048c;
            this.savePath = aVar.f31049d;
            this.tempPath = aVar.f31050e;
            this.status = new AtomicInteger(0);
            this.curBytes = new AtomicLong(0);
            this.extra = aVar.g;
            this.onlyWifi = aVar.f31051f;
            this.extraHeaders = aVar.h;
            this.maxBytes = aVar.i;
            this.retryCount = aVar.l;
            this.force = aVar.m;
            this.outIp = aVar.j;
            this.outSize = aVar.k;
            this.needPostProgress = aVar.n;
            this.maxProgressCount = aVar.o;
            this.minProgressTimeMsInterval = aVar.p;
            this.backUpUrls = aVar.q;
            this.showNotification = aVar.r;
            this.mimeType = aVar.s;
            this.needHttpsToHttpRetry = aVar.t;
            this.needRetryDelay = aVar.A;
            this.autoResumed = aVar.u;
            this.showNotificationForAutoResumed = aVar.v;
            this.needDefaultHttpServiceBackUp = aVar.w;
            this.needReuseChunkRunnable = aVar.x;
            this.packageName = aVar.y;
            this.md5 = aVar.z;
            this.needReuseFirstConnection = aVar.B;
            this.needIndependentProcess = aVar.C;
            this.enqueueType = aVar.D;
            this.headConnectionAvailable = aVar.E;
            this.ignoreDataVerify = aVar.F;
        }
    }

    public void bindValue(SQLiteStatement sQLiteStatement) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long j;
        long j2;
        String str6;
        String str7;
        String str8;
        long j3;
        long j4;
        long j5;
        long j6;
        String str9;
        String str10;
        long j7;
        long j8;
        if (sQLiteStatement != null) {
            this.bindValueCount = 0;
            sQLiteStatement.clearBindings();
            int i = this.bindValueCount + 1;
            this.bindValueCount = i;
            sQLiteStatement.bindLong(i, (long) this.id);
            int i2 = this.bindValueCount + 1;
            this.bindValueCount = i2;
            if (this.url == null) {
                str = "";
            } else {
                str = this.url;
            }
            sQLiteStatement.bindString(i2, str);
            int i3 = this.bindValueCount + 1;
            this.bindValueCount = i3;
            if (this.savePath == null) {
                str2 = "";
            } else {
                str2 = this.savePath;
            }
            sQLiteStatement.bindString(i3, str2);
            int i4 = this.bindValueCount + 1;
            this.bindValueCount = i4;
            if (this.tempPath == null) {
                str3 = "";
            } else {
                str3 = this.tempPath;
            }
            sQLiteStatement.bindString(i4, str3);
            int i5 = this.bindValueCount + 1;
            this.bindValueCount = i5;
            if (this.name == null) {
                str4 = "";
            } else {
                str4 = this.name;
            }
            sQLiteStatement.bindString(i5, str4);
            int i6 = this.bindValueCount + 1;
            this.bindValueCount = i6;
            sQLiteStatement.bindLong(i6, (long) this.chunkCount);
            int i7 = this.bindValueCount + 1;
            this.bindValueCount = i7;
            sQLiteStatement.bindLong(i7, (long) getStatus());
            int i8 = this.bindValueCount + 1;
            this.bindValueCount = i8;
            sQLiteStatement.bindLong(i8, getCurBytes());
            int i9 = this.bindValueCount + 1;
            this.bindValueCount = i9;
            sQLiteStatement.bindLong(i9, this.totalBytes);
            int i10 = this.bindValueCount + 1;
            this.bindValueCount = i10;
            if (this.eTag == null) {
                str5 = "";
            } else {
                str5 = this.eTag;
            }
            sQLiteStatement.bindString(i10, str5);
            int i11 = this.bindValueCount + 1;
            this.bindValueCount = i11;
            long j9 = 0;
            if (this.onlyWifi) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(i11, j);
            int i12 = this.bindValueCount + 1;
            this.bindValueCount = i12;
            if (this.force) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            sQLiteStatement.bindLong(i12, j2);
            int i13 = this.bindValueCount + 1;
            this.bindValueCount = i13;
            sQLiteStatement.bindLong(i13, (long) this.retryCount);
            int i14 = this.bindValueCount + 1;
            this.bindValueCount = i14;
            if (this.extra == null) {
                str6 = "";
            } else {
                str6 = this.extra;
            }
            sQLiteStatement.bindString(i14, str6);
            int i15 = this.bindValueCount + 1;
            this.bindValueCount = i15;
            if (this.mimeType == null) {
                str7 = "";
            } else {
                str7 = this.mimeType;
            }
            sQLiteStatement.bindString(i15, str7);
            int i16 = this.bindValueCount + 1;
            this.bindValueCount = i16;
            if (this.title == null) {
                str8 = "";
            } else {
                str8 = this.title;
            }
            sQLiteStatement.bindString(i16, str8);
            int i17 = this.bindValueCount + 1;
            this.bindValueCount = i17;
            if (this.showNotification) {
                j3 = 1;
            } else {
                j3 = 0;
            }
            sQLiteStatement.bindLong(i17, j3);
            int i18 = this.bindValueCount + 1;
            this.bindValueCount = i18;
            sQLiteStatement.bindLong(i18, (long) this.notificationVisibility);
            int i19 = this.bindValueCount + 1;
            this.bindValueCount = i19;
            if (this.isFirstDownload) {
                j4 = 1;
            } else {
                j4 = 0;
            }
            sQLiteStatement.bindLong(i19, j4);
            int i20 = this.bindValueCount + 1;
            this.bindValueCount = i20;
            if (this.isFirstSuccess) {
                j5 = 1;
            } else {
                j5 = 0;
            }
            sQLiteStatement.bindLong(i20, j5);
            int i21 = this.bindValueCount + 1;
            this.bindValueCount = i21;
            if (this.needHttpsToHttpRetry) {
                j6 = 1;
            } else {
                j6 = 0;
            }
            sQLiteStatement.bindLong(i21, j6);
            int i22 = this.bindValueCount + 1;
            this.bindValueCount = i22;
            sQLiteStatement.bindLong(i22, this.downloadTime);
            int i23 = this.bindValueCount + 1;
            this.bindValueCount = i23;
            if (this.packageName == null) {
                str9 = "";
            } else {
                str9 = this.packageName;
            }
            sQLiteStatement.bindString(i23, str9);
            int i24 = this.bindValueCount + 1;
            this.bindValueCount = i24;
            if (this.md5 == null) {
                str10 = "";
            } else {
                str10 = this.md5;
            }
            sQLiteStatement.bindString(i24, str10);
            int i25 = this.bindValueCount + 1;
            this.bindValueCount = i25;
            if (this.needRetryDelay) {
                j7 = 1;
            } else {
                j7 = 0;
            }
            sQLiteStatement.bindLong(i25, j7);
            int i26 = this.bindValueCount + 1;
            this.bindValueCount = i26;
            sQLiteStatement.bindLong(i26, (long) this.curRetryTime);
            int i27 = this.bindValueCount + 1;
            this.bindValueCount = i27;
            sQLiteStatement.bindLong(i27, (long) this.retryDelayStatus.ordinal());
            int i28 = this.bindValueCount + 1;
            this.bindValueCount = i28;
            if (this.needDefaultHttpServiceBackUp) {
                j8 = 1;
            } else {
                j8 = 0;
            }
            sQLiteStatement.bindLong(i28, j8);
            int i29 = this.bindValueCount + 1;
            this.bindValueCount = i29;
            if (this.needReuseChunkRunnable) {
                j9 = 1;
            }
            sQLiteStatement.bindLong(i29, j9);
        }
    }

    public void readFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        this.id = parcel.readInt();
        this.name = parcel.readString();
        this.title = parcel.readString();
        this.url = parcel.readString();
        this.savePath = parcel.readString();
        this.tempPath = parcel.readString();
        boolean z18 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.onlyWifi = z;
        this.extra = parcel.readString();
        this.extraHeaders = parcel.createTypedArrayList(HttpHeader.CREATOR);
        this.maxBytes = parcel.readInt();
        this.outIp = parcel.createStringArray();
        this.outSize = parcel.createIntArray();
        this.retryCount = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.force = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.needPostProgress = z3;
        this.maxProgressCount = parcel.readInt();
        this.minProgressTimeMsInterval = parcel.readInt();
        this.backUpUrls = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.showNotification = z4;
        this.mimeType = parcel.readString();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.needHttpsToHttpRetry = z5;
        this.packageName = parcel.readString();
        this.md5 = parcel.readString();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.needRetryDelay = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.needDefaultHttpServiceBackUp = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.needReuseChunkRunnable = z8;
        this.eTag = parcel.readString();
        this.curRetryTime = parcel.readInt();
        convertRetryDelayStatus(parcel.readInt());
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.needReuseFirstConnection = z9;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.forceIgnoreRecommendSize = z10;
        this.networkQuality = parcel.readString();
        this.curBackUpUrlIndex = parcel.readInt();
        this.notificationVisibility = parcel.readInt();
        this.chunkCount = parcel.readInt();
        setCurBytes(parcel.readLong());
        this.totalBytes = parcel.readLong();
        setStatus(parcel.readInt());
        this.downloadTime = parcel.readLong();
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.backUpUrlUsed = z11;
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.httpsToHttpRetryUsed = z12;
        try {
            if (this.errorBytesLog == null) {
                this.errorBytesLog = new StringBuffer(parcel.readString());
            } else {
                this.errorBytesLog.delete(0, this.errorBytesLog.length()).append(parcel.readString());
            }
        } catch (Exception unused) {
        }
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.autoResumed = z13;
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.showNotificationForAutoResumed = z14;
        if (parcel.readByte() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.showNotificationForNetworkResumed = z15;
        this.forbiddenBackupUrls = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.needIndependentProcess = z16;
        convertEnqueueType(parcel.readInt());
        if (parcel.readByte() != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.headConnectionAvailable = z17;
        this.httpStatusCode = parcel.readInt();
        this.httpStatusMessage = parcel.readString();
        if (parcel.readByte() == 0) {
            z18 = false;
        }
        this.isSaveTempFile = z18;
    }

    public DownloadInfo(Cursor cursor) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        this.retryDelayStatus = i.DELAY_RETRY_NONE;
        this.asyncHandleStatus = com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_NONE;
        boolean z9 = true;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = com.ss.android.socialbase.downloader.constants.b.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0);
        this.isSaveTempFile = false;
        if (cursor != null) {
            try {
                int columnIndex = cursor.getColumnIndex("_id");
                if (columnIndex != -1) {
                    this.id = cursor.getInt(columnIndex);
                }
                int columnIndex2 = cursor.getColumnIndex("name");
                if (columnIndex2 != -1) {
                    this.name = cursor.getString(columnIndex2);
                }
                int columnIndex3 = cursor.getColumnIndex(PushConstants.TITLE);
                if (columnIndex3 != -1) {
                    this.title = cursor.getString(columnIndex3);
                }
                int columnIndex4 = cursor.getColumnIndex(PushConstants.WEB_URL);
                if (columnIndex4 != -1) {
                    this.url = cursor.getString(columnIndex4);
                }
                int columnIndex5 = cursor.getColumnIndex("savePath");
                if (columnIndex5 != -1) {
                    this.savePath = cursor.getString(columnIndex5);
                }
                int columnIndex6 = cursor.getColumnIndex("tempPath");
                if (columnIndex6 != -1) {
                    this.tempPath = cursor.getString(columnIndex6);
                }
                int columnIndex7 = cursor.getColumnIndex("chunkCount");
                if (columnIndex7 != -1) {
                    this.chunkCount = cursor.getInt(columnIndex7);
                }
                int columnIndex8 = cursor.getColumnIndex("status");
                if (columnIndex8 != -1) {
                    this.status = new AtomicInteger(cursor.getInt(columnIndex8));
                } else {
                    this.status = new AtomicInteger(0);
                }
                int columnIndex9 = cursor.getColumnIndex("curBytes");
                if (columnIndex9 != -1) {
                    this.curBytes = new AtomicLong(cursor.getLong(columnIndex9));
                } else {
                    this.curBytes = new AtomicLong(0);
                }
                int columnIndex10 = cursor.getColumnIndex("totalBytes");
                if (columnIndex10 != -1) {
                    this.totalBytes = cursor.getLong(columnIndex10);
                }
                int columnIndex11 = cursor.getColumnIndex("eTag");
                if (columnIndex11 != -1) {
                    this.eTag = cursor.getString(columnIndex11);
                }
                int columnIndex12 = cursor.getColumnIndex("onlyWifi");
                if (columnIndex12 != -1) {
                    if (cursor.getInt(columnIndex12) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    this.onlyWifi = z8;
                }
                int columnIndex13 = cursor.getColumnIndex("force");
                if (columnIndex13 != -1) {
                    if (cursor.getInt(columnIndex13) != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    this.force = z7;
                }
                int columnIndex14 = cursor.getColumnIndex("retryCount");
                if (columnIndex14 != -1) {
                    this.retryCount = cursor.getInt(columnIndex14);
                }
                int columnIndex15 = cursor.getColumnIndex(PushConstants.EXTRA);
                if (columnIndex15 != -1) {
                    this.extra = cursor.getString(columnIndex15);
                }
                int columnIndex16 = cursor.getColumnIndex("mimeType");
                if (columnIndex16 != -1) {
                    this.mimeType = cursor.getString(columnIndex16);
                }
                int columnIndex17 = cursor.getColumnIndex("notificationEnable");
                if (columnIndex17 != -1) {
                    if (cursor.getInt(columnIndex17) != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    this.showNotification = z6;
                }
                int columnIndex18 = cursor.getColumnIndex("notificationVisibility");
                if (columnIndex18 != -1) {
                    this.notificationVisibility = cursor.getInt(columnIndex18);
                }
                int columnIndex19 = cursor.getColumnIndex("isFirstDownload");
                if (columnIndex19 != -1) {
                    if (cursor.getInt(columnIndex19) == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    this.isFirstDownload = z5;
                }
                int columnIndex20 = cursor.getColumnIndex("isFirstSuccess");
                if (columnIndex20 != -1) {
                    if (cursor.getInt(columnIndex20) == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.isFirstSuccess = z4;
                }
                int columnIndex21 = cursor.getColumnIndex("needHttpsToHttpRetry");
                if (columnIndex21 != -1) {
                    if (cursor.getInt(columnIndex21) == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.needHttpsToHttpRetry = z3;
                }
                int columnIndex22 = cursor.getColumnIndex("downloadTime");
                if (columnIndex22 != -1) {
                    this.downloadTime = cursor.getLong(columnIndex22);
                }
                int columnIndex23 = cursor.getColumnIndex("packageName");
                if (columnIndex23 != -1) {
                    this.packageName = cursor.getString(columnIndex23);
                }
                int columnIndex24 = cursor.getColumnIndex("md5");
                if (columnIndex24 != -1) {
                    this.md5 = cursor.getString(columnIndex24);
                }
                int columnIndex25 = cursor.getColumnIndex("retryDelay");
                if (columnIndex25 != -1) {
                    if (cursor.getInt(columnIndex25) == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.needRetryDelay = z2;
                }
                int columnIndex26 = cursor.getColumnIndex("curRetryTime");
                if (columnIndex26 != -1) {
                    this.curRetryTime = cursor.getInt(columnIndex26);
                }
                int columnIndex27 = cursor.getColumnIndex("retryDelayStatus");
                if (columnIndex27 != -1) {
                    int i = cursor.getInt(columnIndex27);
                    if (i == i.DELAY_RETRY_WAITING.ordinal()) {
                        this.retryDelayStatus = i.DELAY_RETRY_WAITING;
                    } else if (i == i.DELAY_RETRY_DOWNLOADING.ordinal()) {
                        this.retryDelayStatus = i.DELAY_RETRY_DOWNLOADING;
                    } else if (i == i.DELAY_RETRY_DOWNLOADED.ordinal()) {
                        this.retryDelayStatus = i.DELAY_RETRY_DOWNLOADED;
                    } else {
                        this.retryDelayStatus = i.DELAY_RETRY_NONE;
                    }
                }
                int columnIndex28 = cursor.getColumnIndex("defaultHttpServiceBackUp");
                if (columnIndex28 != -1) {
                    if (cursor.getInt(columnIndex28) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.needDefaultHttpServiceBackUp = z;
                }
                int columnIndex29 = cursor.getColumnIndex("chunkRunnableReuse");
                if (columnIndex29 != -1) {
                    if (cursor.getInt(columnIndex29) != 1) {
                        z9 = false;
                    }
                    this.needReuseChunkRunnable = z9;
                }
            } catch (Exception unused) {
            }
        }
    }

    public void setCurBytes(long j, boolean z) {
        if (z) {
            setCurBytes(j);
            return;
        }
        if (j > getCurBytes()) {
            setCurBytes(j);
        }
    }

    public void copyFromCacheData(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo != null) {
            setChunkCount(downloadInfo.getChunkCount());
            setTotalBytes(downloadInfo.getTotalBytes());
            setCurBytes(downloadInfo.getCurBytes(), true);
            if (downloadInfo.canSkipStatusHandler() || canSkipStatusHandler()) {
                this.curRetryTime = downloadInfo.getCurRetryTime();
            } else {
                this.curRetryTime = 0;
            }
            seteTag(downloadInfo.geteTag());
            if (z) {
                setStatus(downloadInfo.getStatus());
            }
            this.isFirstDownload = downloadInfo.getIsFirstDownload();
            this.isFirstSuccess = downloadInfo.isFirstSuccess();
            this.retryDelayStatus = downloadInfo.getRetryDelayStatus();
        }
    }

    public synchronized void handleTempSaveCallback(boolean z, BaseException baseException) {
        this.isSaveTempFile = false;
        if (this.tempFileSaveCompleteCallbacks != null) {
            StringBuilder sb = new StringBuilder("handleTempSaveCallback isSuccess ");
            sb.append(z);
            sb.append(" callback size:");
            sb.append(this.tempFileSaveCompleteCallbacks.size());
            for (b next : this.tempFileSaveCompleteCallbacks) {
                if (next != null) {
                    if (z) {
                        next.a();
                    } else {
                        next.a(baseException);
                    }
                }
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.savePath);
        parcel.writeString(this.tempPath);
        parcel.writeByte(this.onlyWifi ? (byte) 1 : 0);
        parcel.writeString(this.extra);
        parcel.writeTypedList(this.extraHeaders);
        parcel.writeInt(this.maxBytes);
        parcel.writeStringArray(this.outIp);
        parcel.writeIntArray(this.outSize);
        parcel.writeInt(this.retryCount);
        parcel.writeByte(this.force ? (byte) 1 : 0);
        parcel.writeByte(this.needPostProgress ? (byte) 1 : 0);
        parcel.writeInt(this.maxProgressCount);
        parcel.writeInt(this.minProgressTimeMsInterval);
        parcel.writeStringList(this.backUpUrls);
        parcel.writeByte(this.showNotification ? (byte) 1 : 0);
        parcel.writeString(this.mimeType);
        parcel.writeByte(this.needHttpsToHttpRetry ? (byte) 1 : 0);
        parcel.writeString(this.packageName);
        parcel.writeString(this.md5);
        parcel.writeByte(this.needRetryDelay ? (byte) 1 : 0);
        parcel.writeByte(this.needDefaultHttpServiceBackUp ? (byte) 1 : 0);
        parcel.writeByte(this.needReuseChunkRunnable ? (byte) 1 : 0);
        parcel.writeString(this.eTag);
        parcel.writeInt(this.curRetryTime);
        parcel.writeInt(this.retryDelayStatus.ordinal());
        parcel.writeByte(this.needReuseFirstConnection ? (byte) 1 : 0);
        parcel.writeByte(this.forceIgnoreRecommendSize ? (byte) 1 : 0);
        parcel.writeString(this.networkQuality);
        parcel.writeInt(this.curBackUpUrlIndex);
        parcel.writeInt(this.notificationVisibility);
        parcel.writeInt(this.chunkCount);
        parcel.writeLong(getCurBytes());
        parcel.writeLong(this.totalBytes);
        parcel.writeInt(getRealStatus());
        parcel.writeLong(this.downloadTime);
        parcel.writeByte(this.backUpUrlUsed ? (byte) 1 : 0);
        parcel.writeByte(this.httpsToHttpRetryUsed ? (byte) 1 : 0);
        String str = "";
        if (this.errorBytesLog != null) {
            str = this.errorBytesLog.toString();
        }
        parcel.writeString(str);
        parcel.writeByte(this.autoResumed ? (byte) 1 : 0);
        parcel.writeByte(this.showNotificationForAutoResumed ? (byte) 1 : 0);
        parcel.writeByte(this.showNotificationForNetworkResumed ? (byte) 1 : 0);
        parcel.writeStringList(this.forbiddenBackupUrls);
        parcel.writeByte(this.needIndependentProcess ? (byte) 1 : 0);
        parcel.writeInt(this.enqueueType.ordinal());
        parcel.writeByte(this.headConnectionAvailable ? (byte) 1 : 0);
        parcel.writeInt(this.httpStatusCode);
        parcel.writeString(this.httpStatusMessage);
        parcel.writeByte(this.isSaveTempFile ? (byte) 1 : 0);
    }

    public void addErrorBytesLog(long j, int i, String str) {
        try {
            if (com.ss.android.socialbase.downloader.b.a.a()) {
                if (this.errorBytesLog == null) {
                    this.errorBytesLog = new StringBuffer();
                }
                if (this.errorBytesLog.length() != 0) {
                    this.errorBytesLog.append(",");
                }
                StringBuffer stringBuffer = this.errorBytesLog;
                stringBuffer.append("[type:");
                stringBuffer.append(i);
                stringBuffer.append(",bytes:");
                stringBuffer.append(j);
                stringBuffer.append(",method:");
                stringBuffer.append(str);
                stringBuffer.append("]");
            }
        } catch (Exception unused) {
        }
    }
}
