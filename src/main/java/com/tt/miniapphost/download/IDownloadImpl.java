package com.tt.miniapphost.download;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.process.HostProcessBridge;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.miniapphost.process.callback.IpcCallback;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;

@MiniAppProcess
public class IDownloadImpl implements IDownloadInterface {
    private IpcCallback mBindDownloadIpcCallback;
    private IDownloadStatus mDownloadStatus;

    public IDownloadStatus getDownloadStatus() {
        return this.mDownloadStatus;
    }

    @MiniAppProcess
    public boolean isHostSupportDownloadFeature() {
        return HostProcessBridge.isDataHandlerExist("IDownload");
    }

    public void cancel(@NonNull String str) {
        HostProcessBridge.operateDownload(str, "cancelDownload", null);
    }

    @MiniAppProcess
    public void unbind(@NonNull String str) {
        HostProcessBridge.operateDownload(str, "unbind", null);
        if (this.mBindDownloadIpcCallback != null) {
            this.mBindDownloadIpcCallback.finishListenIpcCallback();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r0.equals("start") != false) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHostCall(@android.support.annotation.Nullable com.tt.miniapphost.process.data.CrossProcessDataEntity r6) {
        /*
            r5 = this;
            com.tt.miniapphost.download.IDownloadStatus r0 = r5.mDownloadStatus
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0012
            java.lang.String r6 = "IDownloadImpl"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "mDownloadStatus == null"
            r0[r2] = r1
            com.tt.miniapphost.AppBrandLogger.e(r6, r0)
            return
        L_0x0012:
            if (r6 != 0) goto L_0x0020
            java.lang.String r6 = "IDownloadImpl"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "callbackData == null"
            r0[r2] = r1
            com.tt.miniapphost.AppBrandLogger.e(r6, r0)
            return
        L_0x0020:
            java.lang.String r0 = "downloadStatus"
            java.lang.String r0 = r6.getString(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x0038
            java.lang.String r6 = "IDownloadImpl"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "adDownloadStatus is empty"
            r0[r2] = r1
            com.tt.miniapphost.AppBrandLogger.e(r6, r0)
            return
        L_0x0038:
            r3 = -1
            int r4 = r0.hashCode()
            switch(r4) {
                case -1422950650: goto L_0x0086;
                case -1274442605: goto L_0x007c;
                case -503430878: goto L_0x0072;
                case 3135262: goto L_0x0068;
                case 3227604: goto L_0x005e;
                case 106440182: goto L_0x0054;
                case 109757538: goto L_0x004b;
                case 1957569947: goto L_0x0041;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x0090
        L_0x0041:
            java.lang.String r1 = "install"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0090
            r1 = 4
            goto L_0x0091
        L_0x004b:
            java.lang.String r4 = "start"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0090
            goto L_0x0091
        L_0x0054:
            java.lang.String r1 = "pause"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0090
            r1 = 2
            goto L_0x0091
        L_0x005e:
            java.lang.String r1 = "idle"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0090
            r1 = 6
            goto L_0x0091
        L_0x0068:
            java.lang.String r1 = "fail"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0090
            r1 = 5
            goto L_0x0091
        L_0x0072:
            java.lang.String r1 = "cancelDownload"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0090
            r1 = 7
            goto L_0x0091
        L_0x007c:
            java.lang.String r1 = "finish"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0090
            r1 = 3
            goto L_0x0091
        L_0x0086:
            java.lang.String r1 = "active"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0090
            r1 = 0
            goto L_0x0091
        L_0x0090:
            r1 = -1
        L_0x0091:
            switch(r1) {
                case 0: goto L_0x00ce;
                case 1: goto L_0x00c8;
                case 2: goto L_0x00bc;
                case 3: goto L_0x00b6;
                case 4: goto L_0x00b0;
                case 5: goto L_0x00aa;
                case 6: goto L_0x00a4;
                case 7: goto L_0x0095;
                default: goto L_0x0094;
            }
        L_0x0094:
            goto L_0x00da
        L_0x0095:
            com.tt.miniapphost.download.IDownloadStatus r6 = r5.mDownloadStatus
            r6.onCancel()
            com.tt.miniapphost.process.callback.IpcCallback r6 = r5.mBindDownloadIpcCallback
            if (r6 == 0) goto L_0x00da
            com.tt.miniapphost.process.callback.IpcCallback r6 = r5.mBindDownloadIpcCallback
            r6.finishListenIpcCallback()
            goto L_0x00da
        L_0x00a4:
            com.tt.miniapphost.download.IDownloadStatus r6 = r5.mDownloadStatus
            r6.onIdle()
            return
        L_0x00aa:
            com.tt.miniapphost.download.IDownloadStatus r6 = r5.mDownloadStatus
            r6.onFail()
            return
        L_0x00b0:
            com.tt.miniapphost.download.IDownloadStatus r6 = r5.mDownloadStatus
            r6.onInstalled()
            return
        L_0x00b6:
            com.tt.miniapphost.download.IDownloadStatus r6 = r5.mDownloadStatus
            r6.onFinish()
            return
        L_0x00bc:
            com.tt.miniapphost.download.IDownloadStatus r0 = r5.mDownloadStatus
            java.lang.String r1 = "downloadPercent"
            int r6 = r6.getInt(r1, r2)
            r0.onPause(r6)
            return
        L_0x00c8:
            com.tt.miniapphost.download.IDownloadStatus r6 = r5.mDownloadStatus
            r6.onDownloadStart()
            return
        L_0x00ce:
            com.tt.miniapphost.download.IDownloadStatus r0 = r5.mDownloadStatus
            java.lang.String r1 = "downloadPercent"
            int r6 = r6.getInt(r1, r2)
            r0.onDownloading(r6)
            return
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.download.IDownloadImpl.onHostCall(com.tt.miniapphost.process.data.CrossProcessDataEntity):void");
    }

    @MiniAppProcess
    public void bindDl(@NonNull String str, @NonNull IDownloadStatus iDownloadStatus, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        if (iDownloadStatus != null) {
            this.mDownloadStatus = iDownloadStatus;
        }
        this.mBindDownloadIpcCallback = new IpcCallback() {
            public void onIpcCallback(@Nullable CrossProcessDataEntity crossProcessDataEntity) {
                IDownloadImpl.this.onHostCall(crossProcessDataEntity);
            }
        };
        HostProcessBridge.operateDownload(str, "download", str3, str4, this.mBindDownloadIpcCallback);
    }
}
