package com.sina.weibo.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import com.sina.weibo.sdk.WeiboAppManager;
import com.sina.weibo.sdk.exception.WeiboException;
import com.sina.weibo.sdk.net.AsyncWeiboRunner;
import com.sina.weibo.sdk.net.DownloadService;
import com.sina.weibo.sdk.net.RequestListener;
import com.sina.weibo.sdk.net.WeiboParameters;
import com.sina.weibo.sdk.utils.LogUtil;
import com.sina.weibo.sdk.utils.MD5;
import com.sina.weibo.sdk.utils.NetworkHelper;
import com.sina.weibo.sdk.utils.NotificationHelper;
import com.sina.weibo.sdk.utils.Utility;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

public class WbAppInstallActivator {
    public static final String TAG = "com.sina.weibo.sdk.WbAppInstallActivator";
    public static final String WB_APK_FILE_DIR = (Environment.getExternalStorageDirectory() + "/Android/org_share_data/");
    private static WbAppInstallActivator mInstance;
    public boolean isFree = true;
    private String mAppkey;
    public Context mContext;
    public CountDownLatch mCountDownlatch;
    public NotificationInfo mNotificationInfo;

    public static class NotificationInfo {
        public String downloadUrl;
        public String notificationContent;
        public int versionCode;

        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public String getNotificationContent() {
            return this.notificationContent;
        }

        public int getVersionCode() {
            return this.versionCode;
        }

        public boolean isNotificationInfoValid() {
            if (TextUtils.isEmpty(this.notificationContent)) {
                return false;
            }
            return true;
        }

        public void setDownloadUrl(String str) {
            this.downloadUrl = str;
        }

        public void setNotificationContent(String str) {
            this.notificationContent = str;
        }

        public void setVersionCode(int i) {
            this.versionCode = i;
        }

        public NotificationInfo(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("error")) {
                    if (!jSONObject.has("error_code")) {
                        this.downloadUrl = jSONObject.optString("sdk_url", "");
                        this.notificationContent = jSONObject.optString("sdk_push", "");
                        this.versionCode = jSONObject.optInt("version_code");
                        return;
                    }
                }
                LogUtil.d(WbAppInstallActivator.TAG, "parse NotificationInfo error !!!");
            } catch (JSONException e2) {
                String str2 = WbAppInstallActivator.TAG;
                LogUtil.d(str2, "parse NotificationInfo error: " + e2.getMessage());
            }
        }
    }

    private void loadNotificationInfo() {
        requestNotificationInfo(this.mContext, this.mAppkey, new RequestListener() {
            public void onComplete(String str) {
                WbAppInstallActivator.this.mNotificationInfo = new NotificationInfo(str);
                WbAppInstallActivator.this.mCountDownlatch.countDown();
            }

            public void onWeiboException(WeiboException weiboException) {
                String str = WbAppInstallActivator.TAG;
                LogUtil.d(str, "requestNotificationInfo WeiboException Msg : " + weiboException.getMessage());
                WbAppInstallActivator.this.mCountDownlatch.countDown();
            }
        });
    }

    public void activateWeiboInstall() {
        boolean z;
        WeiboAppManager.WeiboInfo weiboInfo = WeiboAppManager.getInstance(this.mContext).getWeiboInfo();
        if (weiboInfo == null || !weiboInfo.isLegal()) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.isFree) {
            this.isFree = false;
            this.mCountDownlatch = new CountDownLatch(1);
            loadNotificationInfo();
            final String str = WB_APK_FILE_DIR;
            new Thread(new Runnable() {
                public void run() {
                    Pair<Integer, File> walkDir = WbAppInstallActivator.walkDir(WbAppInstallActivator.this.mContext, str);
                    try {
                        WbAppInstallActivator.this.mCountDownlatch.await();
                        if (WbAppInstallActivator.this.mNotificationInfo != null && WbAppInstallActivator.this.mNotificationInfo.isNotificationInfoValid()) {
                            String str = WbAppInstallActivator.this.mNotificationInfo.downloadUrl;
                            String str2 = WbAppInstallActivator.this.mNotificationInfo.notificationContent;
                            if (walkDir != null && walkDir.second != null && ((Integer) walkDir.first).intValue() >= WbAppInstallActivator.this.mNotificationInfo.versionCode) {
                                WbAppInstallActivator.showNotification(WbAppInstallActivator.this.mContext, str2, ((File) walkDir.second).getAbsolutePath());
                            } else if (NetworkHelper.isWifiValid(WbAppInstallActivator.this.mContext) && !TextUtils.isEmpty(str)) {
                                WbAppInstallActivator.startDownloadService(WbAppInstallActivator.this.mContext, str2, str);
                            }
                        }
                    } catch (InterruptedException unused) {
                    } finally {
                        WbAppInstallActivator.this.isFree = true;
                    }
                }
            }).start();
        }
    }

    private static boolean isWeiboApk(PackageInfo packageInfo) {
        if (!checkPackageName(packageInfo) || !checkApkSign(packageInfo)) {
            return false;
        }
        return true;
    }

    private static boolean checkPackageName(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        String str = packageInfo.packageName;
        if ("com.sina.weibo".equals(str) || "com.sina.weibog3".equals(str)) {
            return true;
        }
        return false;
    }

    private static boolean checkApkSign(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (packageInfo.signatures != null) {
            String str = "";
            for (Signature byteArray : packageInfo.signatures) {
                byte[] byteArray2 = byteArray.toByteArray();
                if (byteArray2 != null) {
                    str = MD5.hexdigest(byteArray2);
                }
            }
            return "18da2bf10352443a00a5e046d9fca6bd".equals(str);
        } else if (Build.VERSION.SDK_INT < 11) {
            return true;
        } else {
            return false;
        }
    }

    private WbAppInstallActivator(Context context, String str) {
        this.mContext = context.getApplicationContext();
        this.mAppkey = str;
    }

    public static synchronized WbAppInstallActivator getInstance(Context context, String str) {
        WbAppInstallActivator wbAppInstallActivator;
        synchronized (WbAppInstallActivator.class) {
            if (mInstance == null) {
                mInstance = new WbAppInstallActivator(context, str);
            }
            wbAppInstallActivator = mInstance;
        }
        return wbAppInstallActivator;
    }

    public static Pair<Integer, File> walkDir(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return null;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return null;
        }
        File file2 = null;
        int i = 0;
        for (File file3 : listFiles) {
            String name = file3.getName();
            if (file3.isFile() && name.endsWith(".apk")) {
                PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file3.getAbsolutePath(), 64);
                if (isWeiboApk(packageArchiveInfo) && packageArchiveInfo.versionCode > i) {
                    i = packageArchiveInfo.versionCode;
                    file2 = file3;
                }
            }
        }
        return new Pair<>(Integer.valueOf(i), file2);
    }

    public static void showNotification(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            NotificationHelper.showNotification(context, str, str2);
        }
    }

    public static void startDownloadService(Context context, String str, String str2) {
        Intent intent = new Intent(context, DownloadService.class);
        Bundle bundle = new Bundle();
        bundle.putString("notification_content", str);
        bundle.putString("download_url", str2);
        intent.putExtras(bundle);
        context.startService(intent);
    }

    private static void requestNotificationInfo(Context context, String str, RequestListener requestListener) {
        String packageName = context.getPackageName();
        String sign = Utility.getSign(context, packageName);
        WeiboParameters weiboParameters = new WeiboParameters(str);
        weiboParameters.put("appkey", str);
        weiboParameters.put("packagename", packageName);
        weiboParameters.put("key_hash", sign);
        new AsyncWeiboRunner(context).requestAsync("http://api.weibo.cn/2/client/common_config", weiboParameters, "GET", requestListener);
    }
}
