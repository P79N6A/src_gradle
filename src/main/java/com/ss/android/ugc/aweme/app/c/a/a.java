package com.ss.android.ugc.aweme.app.c.a;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.downloadlib.b;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.base.n;
import org.json.JSONObject;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33980a;

    public final void onAppDownloadMonitorSend(DownloadInfo downloadInfo, BaseException baseException, int i) {
        long j;
        String str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{downloadInfo, baseException, Integer.valueOf(i)}, this, f33980a, false, 23362, new Class[]{DownloadInfo.class, BaseException.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{downloadInfo, baseException, Integer.valueOf(i)}, this, f33980a, false, 23362, new Class[]{DownloadInfo.class, BaseException.class, Integer.TYPE}, Void.TYPE);
        } else if (downloadInfo != null) {
            super.onAppDownloadMonitorSend(downloadInfo, baseException, i);
            if (i2 == -1 || i2 == -3) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    String extra = downloadInfo.getExtra();
                    long j2 = 0;
                    if (!TextUtils.isEmpty(extra)) {
                        JSONObject jSONObject2 = new JSONObject(extra);
                        j = jSONObject2.optLong(PushConstants.EXTRA);
                        str = jSONObject2.optString("log_extra");
                        if (j > 0) {
                            if (!TextUtils.isEmpty(str)) {
                                j2 = jSONObject2.optLong("ext_value");
                            }
                        }
                        return;
                    }
                    str = "";
                    j = 0;
                    jSONObject.put("app_name", downloadInfo.getTitle());
                    jSONObject.put("status_value", i2);
                    jSONObject.put("download_url", downloadInfo.getUrl());
                    jSONObject.put("ad_id", j);
                    jSONObject.put("ext_value", j2);
                    jSONObject.put("log_extra", str);
                    jSONObject.put("download_id", downloadInfo.getId());
                    jSONObject.put("cur_bytes", downloadInfo.getCurBytes());
                    jSONObject.put("total_bytes", downloadInfo.getTotalBytes());
                    jSONObject.put("chunk_count", downloadInfo.getChunkCount());
                    jSONObject.put("network_quality", downloadInfo.getNetworkQuality());
                    jSONObject.put("download_time", downloadInfo.getDownloadTime());
                    if (i2 == -1) {
                        if (baseException != null && !TextUtils.isEmpty(baseException.getMessage())) {
                            jSONObject.put("error_code", baseException.getErrorCode());
                            jSONObject.put("message", baseException.getMessage());
                            jSONObject.put("retry_count", downloadInfo.getRetryCount());
                            String backUpUrl = downloadInfo.getBackUpUrl();
                            if (TextUtils.isEmpty(backUpUrl) && downloadInfo.isBackUpUrlUsed()) {
                                backUpUrl = "all backUrl used";
                            }
                            jSONObject.put("cur_backup_url", backUpUrl);
                            jSONObject.put("temp_path", downloadInfo.getTempFilePath());
                        }
                        n.a("aweme_ad_apk_download_error_rate", 1, jSONObject);
                        n.a("aweme_ad_apk_download_error", 1, jSONObject);
                        n.a("apk_download_error_rate", 0, jSONObject);
                        return;
                    }
                    n.a("aweme_ad_apk_download_error_rate", 0, jSONObject);
                    n.a("apk_download_error_rate", 1, jSONObject);
                } catch (Exception unused) {
                }
            }
        }
    }
}
