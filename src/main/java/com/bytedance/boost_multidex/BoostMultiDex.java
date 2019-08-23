package com.bytedance.boost_multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.util.StringTokenizer;

public class BoostMultiDex {
    public static Result install(Context context) {
        return install(context, null);
    }

    public static Result install(Context context, Monitor monitor) {
        Monitor monitor2;
        String str;
        Monitor.init(monitor);
        Monitor.get().logInfo("BoostMultiDex Installing, version is 0.2.8");
        if (isVMMultidexCapable(System.getProperty("java.vm.version"))) {
            monitor2 = Monitor.get();
            str = "VM has support, BoostMultiDex support library is disabled.";
        } else if (Build.VERSION.SDK_INT < 14) {
            monitor2 = Monitor.get();
            str = "BoostMultiDex installation failed. SDK " + Build.VERSION.SDK_INT + " is unsupported. Min SDK version is 14" + ClassUtils.PACKAGE_SEPARATOR;
        } else {
            Result result = Result.get();
            try {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    new DexInstallProcessor(context).doInstallation(context, new File(applicationInfo.sourceDir), result);
                    Monitor.get().logInfo("install done");
                    return result;
                }
                throw new RuntimeException("No ApplicationInfo available, i.e. running on a test Context: BoostMultiDex support library is disabled.");
            } catch (Throwable th) {
                Monitor.get().logError("BoostMultiDex installation failure", th);
                result.setFatalThrowable(th);
            }
        }
        monitor2.logInfo(str);
        return null;
    }

    private static boolean isVMMultidexCapable(String str) {
        boolean z = false;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ClassUtils.PACKAGE_SEPARATOR);
            String str2 = null;
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreTokens()) {
                str2 = stringTokenizer.nextToken();
            }
            if (!(nextToken == null || str2 == null)) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(str2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 > 0)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        Monitor monitor = Monitor.get();
        StringBuilder sb = new StringBuilder("VM with version ");
        sb.append(str);
        sb.append(z ? " has support" : " does not have support");
        monitor.logInfo(sb.toString());
        return z;
    }
}
