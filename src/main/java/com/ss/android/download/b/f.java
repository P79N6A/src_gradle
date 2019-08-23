package com.ss.android.download.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bytedance.common.utility.StringUtils;
import java.io.File;

public final class f {
    public static boolean a(Context context, String str) {
        PackageInfo packageInfo;
        boolean z = false;
        if (context == null || str == null || StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 1);
                if (packageArchiveInfo == null) {
                    return false;
                }
                String str2 = packageArchiveInfo.packageName;
                int i = packageArchiveInfo.versionCode;
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str2, 1);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    if (i <= packageInfo.versionCode) {
                        z = true;
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return z;
    }
}
