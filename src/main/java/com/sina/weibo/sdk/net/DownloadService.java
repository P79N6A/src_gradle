package com.sina.weibo.sdk.net;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.sina.weibo.sdk.WbAppInstallActivator;
import com.sina.weibo.sdk.exception.WeiboException;
import com.sina.weibo.sdk.utils.LogUtil;
import com.sina.weibo.sdk.utils.NotificationHelper;
import java.io.File;

public class DownloadService extends IntentService {
    private static final String APK_SAVE_DIR = WbAppInstallActivator.WB_APK_FILE_DIR;
    private static final String TAG = DownloadService.class.getCanonicalName();

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
    }

    public DownloadService() {
        super(TAG);
    }

    private static String generateSaveFileName(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return str.substring(lastIndexOf + 1, str.length());
        }
        return "";
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        String str;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            stopSelf();
            return;
        }
        String string = extras.getString("download_url");
        String string2 = extras.getString("notification_content");
        String str2 = TAG;
        LogUtil.e(str2, "onHandleIntent downLoadUrl:" + string + "!!!!!");
        if (TextUtils.isEmpty(string)) {
            LogUtil.e(TAG, "downloadurl is null");
            stopSelf();
            return;
        }
        try {
            String openRedirectUrl4LocationUri = HttpManager.openRedirectUrl4LocationUri(getApplicationContext(), string, "GET", new WeiboParameters(""));
            String generateSaveFileName = generateSaveFileName(openRedirectUrl4LocationUri);
            if (!TextUtils.isEmpty(generateSaveFileName)) {
                if (generateSaveFileName.endsWith(".apk")) {
                    str = HttpManager.downloadFile(getApplicationContext(), openRedirectUrl4LocationUri, APK_SAVE_DIR, generateSaveFileName);
                    if (TextUtils.isEmpty(str)) {
                        LogUtil.e(TAG, "download failed!");
                    } else if (new File(str).exists()) {
                        LogUtil.e(TAG, "download successed!");
                        NotificationHelper.showNotification(getApplicationContext(), string2, str);
                        return;
                    }
                    return;
                }
            }
            LogUtil.e(TAG, "redirectDownloadUrl is illeagle");
            stopSelf();
        } catch (WeiboException unused) {
            str = "";
        }
    }

    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        if (intent != null) {
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
