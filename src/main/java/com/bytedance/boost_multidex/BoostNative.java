package com.bytedance.boost_multidex;

import android.os.Build;
import java.io.File;
import java.lang.reflect.Method;

public final class BoostNative {
    private static boolean mAlreadyInit;
    private static boolean supportFastLoadDex;

    static {
        Monitor.get().loadLibrary("boost_multidex");
    }

    BoostNative() {
    }

    private static void checkSupportFastLoad(Result result) {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class, String.class});
            if (Build.VERSION.SDK_INT >= 19) {
                String str = (String) declaredMethod.invoke(null, new Object[]{"persist.sys.dalvik.vm.lib", null});
                result.vmLibName = str;
                Monitor monitor = Monitor.get();
                monitor.logInfo("VM lib is " + str);
                if ("libart.so".equals(str)) {
                    Monitor.get().logWarning("VM lib is art, skip!");
                    return;
                }
            }
            String str2 = (String) declaredMethod.invoke(null, new Object[]{"ro.yunos.version", null});
            if ((str2 == null || str2.isEmpty()) && !new File("/system/lib/libvmkid_lemur.so").exists()) {
                supportFastLoadDex = initialize(Build.VERSION.SDK_INT, RuntimeException.class);
                result.supportFastLoadDex = supportFastLoadDex;
                return;
            }
            result.isYunOS = true;
            Monitor monitor2 = Monitor.get();
            monitor2.logWarning("Yun os is " + str2 + ", skip!");
        } catch (Throwable th) {
            result.addUnFatalThrowable(th);
            Monitor.get().logWarning("Fail to init", th);
        }
    }

    private static native boolean initialize(int i, Class<RuntimeException> cls);

    static synchronized boolean isSupportFastLoad() {
        boolean z;
        synchronized (BoostNative.class) {
            if (!mAlreadyInit) {
                checkSupportFastLoad(Result.get());
                mAlreadyInit = true;
            }
            z = supportFastLoadDex;
        }
        return z;
    }

    static native Object loadDirectDex(String str, byte[] bArr);

    static native long obtainCheckSum(String str);
}
