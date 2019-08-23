package com.ttnet.org.chromium.base.multidex;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ttnet.org.chromium.base.VisibleForTesting;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

public class ChromiumMultiDexInstaller {
    @VisibleForTesting
    public static void install(Context context) {
    }

    private static String getProcessName(Context context) {
        String str;
        try {
            int myPid = Process.myPid();
            Iterator<ActivityManager.RunningAppProcessInfo> it2 = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    str = null;
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it2.next();
                if (next.pid == myPid) {
                    str = next.processName;
                    break;
                }
            }
            return str;
        } catch (SecurityException unused) {
            return null;
        }
    }

    private static boolean shouldInstallMultiDex(Context context) {
        try {
            Object invoke = Process.class.getMethod("isIsolated", new Class[0]).invoke(null, new Object[0]);
            if (invoke != null && (invoke instanceof Boolean) && ((Boolean) invoke).booleanValue()) {
                return false;
            }
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
        }
        String processName = getProcessName(context);
        if (processName == null) {
            return true;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (applicationInfo != null) {
                if (applicationInfo.metaData != null) {
                    Bundle bundle = applicationInfo.metaData;
                    if (!bundle.getBoolean(processName + ".ignore_multidex", false)) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused2) {
            return true;
        }
    }
}
