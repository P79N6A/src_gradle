package com.rocket.android.opensdk.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public class OpenSDKUtils {
    private static Signature[] getRawSignature(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.signatures;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static int getSDKVersionFromMetaData(Context context, int i) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.feiliao.flipchat.android", SearchJediMixFeedAdapter.f42517f);
            if (applicationInfo.metaData != null) {
                return applicationInfo.metaData.getInt("ROCKET_OPEN_SDK_SUPPORT_VERSION");
            }
            return i;
        } catch (PackageManager.NameNotFoundException unused) {
            return i;
        }
    }

    public static String getMD5Signature(Context context, String str) {
        Signature[] rawSignature = getRawSignature(context, str);
        if (rawSignature == null || rawSignature.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Signature byteArray : rawSignature) {
            sb.append(MD5.getMessageDigest(byteArray.toByteArray()));
        }
        return sb.toString();
    }
}
