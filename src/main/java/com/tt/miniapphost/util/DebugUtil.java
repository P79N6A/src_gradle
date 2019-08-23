package com.tt.miniapphost.util;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;

public class DebugUtil {
    public static void outputError(@NonNull String str, @NonNull String str2) {
        outputError(str, str2, null);
    }

    public static void outputError(@NonNull String str, @NonNull String str2, @Nullable Throwable th) {
        if (AppBrandLogger.debug()) {
            HostDependManager inst = HostDependManager.getInst();
            Application applicationContext = AppbrandContext.getInst().getApplicationContext();
            inst.showToast(applicationContext, null, "小程序调试信息：" + str2, 1, null);
        }
        AppBrandLogger.eWithThrowable(str, str2, th);
    }
}
