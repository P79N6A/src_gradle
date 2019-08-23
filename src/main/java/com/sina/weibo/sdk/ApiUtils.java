package com.sina.weibo.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.sina.weibo.sdk.utils.LogUtil;
import com.sina.weibo.sdk.utils.MD5;

public class ApiUtils {
    private static final String TAG = "com.sina.weibo.sdk.ApiUtils";

    public static boolean validateWeiboSign(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return containSign(context.getPackageManager().getPackageInfo(str, 64).signatures, "18da2bf10352443a00a5e046d9fca6bd");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private static boolean containSign(Signature[] signatureArr, String str) {
        if (signatureArr == null || str == null) {
            return false;
        }
        for (Signature byteArray : signatureArr) {
            if (str.equals(MD5.hexdigest(byteArray.toByteArray()))) {
                LogUtil.d(TAG, "check pass");
                return true;
            }
        }
        return false;
    }
}
