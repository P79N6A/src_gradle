package com.bytedance.usergrowth.data.deviceinfo;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.bytedance.usergrowth.data.deviceinfo.DeviceInfo;
import java.util.ArrayList;
import java.util.List;

public final class a {
    public static List<DeviceInfo.InstallApp> a(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
            if (installedPackages == null) {
                installedPackages = new ArrayList<>();
            }
            for (PackageInfo packageInfo : installedPackages) {
                arrayList.add(DeviceInfo.InstallApp.newBuilder().setFirstInstallTime(packageInfo.firstInstallTime).setPackageName(packageInfo.packageName).setLastUpdateTime(packageInfo.lastUpdateTime).build());
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }
}
