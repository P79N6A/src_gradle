package com.ttnet.org.chromium.base.metrics;

import com.ttnet.org.chromium.base.ThreadUtils;
import com.ttnet.org.chromium.base.VisibleForTesting;
import com.ttnet.org.chromium.base.annotations.JNINamespace;

@JNINamespace("base::android")
public class RecordUserAction {
    private static boolean sIsDisabledForTests;

    @VisibleForTesting
    public static void disableForTests() {
        sIsDisabledForTests = true;
    }

    public static native void nativeRecordUserAction(String str);

    public static void record(final String str) {
        if (!sIsDisabledForTests) {
            if (ThreadUtils.runningOnUiThread()) {
                nativeRecordUserAction(str);
            } else {
                ThreadUtils.runOnUiThread((Runnable) new Runnable() {
                    public final void run() {
                        RecordUserAction.nativeRecordUserAction(str);
                    }
                });
            }
        }
    }
}
