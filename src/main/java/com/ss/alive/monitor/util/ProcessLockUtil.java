package com.ss.alive.monitor.util;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.tools.SafelyLibraryLoader;
import java.io.File;

public class ProcessLockUtil {

    /* renamed from: a  reason: collision with root package name */
    private static String f2408a = "process.lock";

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2409b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f2410c;

    private static native boolean isFirstProcess(String str);

    public static boolean a(Context context) {
        try {
            SafelyLibraryLoader.loadLibrary(context, "native-lib-process-lock");
            if (f2409b) {
                return f2410c;
            }
            f2409b = true;
            File file = new File(context.getFilesDir(), f2408a);
            if (!file.exists()) {
                file.createNewFile();
            }
            f2410c = isFirstProcess(file.getAbsolutePath());
            Logger.debug();
            return f2410c;
        } catch (Throwable unused) {
            f2410c = false;
            return false;
        }
    }
}
