package com.sina.weibo.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import com.sina.weibo.sdk.ApiUtils;
import com.sina.weibo.sdk.WeiboAppManager;

public class SecurityHelper {
    public static boolean containSign(Signature[] signatureArr, String str) {
        if (signatureArr == null || str == null) {
            return false;
        }
        for (Signature byteArray : signatureArr) {
            if (str.equals(MD5.hexdigest(byteArray.toByteArray()))) {
                return true;
            }
        }
        return false;
    }

    public static boolean validateAppSignatureForIntent(Context context, Intent intent) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        if (resolveActivity == null) {
            return false;
        }
        try {
            return containSign(packageManager.getPackageInfo(resolveActivity.activityInfo.packageName, 64).signatures, "18da2bf10352443a00a5e046d9fca6bd");
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }

    public static boolean checkResponseAppLegal(Context context, WeiboAppManager.WeiboInfo weiboInfo, Intent intent) {
        String str;
        if ((weiboInfo != null && weiboInfo.getSupportApi() <= 10352) || weiboInfo == null) {
            return true;
        }
        if (intent != null) {
            str = intent.getStringExtra("_weibo_appPackage");
        } else {
            str = null;
        }
        if (str == null || intent.getStringExtra("_weibo_transaction") == null || !ApiUtils.validateWeiboSign(context, str)) {
            return false;
        }
        return true;
    }
}
