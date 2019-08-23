package android.support.v4.content.pm;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.support.annotation.NonNull;

public final class PackageInfoCompat {
    private PackageInfoCompat() {
    }

    public static long getLongVersionCode(@NonNull PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return (long) packageInfo.versionCode;
    }
}