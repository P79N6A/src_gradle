package com.ss.android.ttve.log;

import android.support.annotation.Keep;
import com.ss.android.ttve.nativePort.b;

@Keep
public class TELog2ClientInvoker {
    public static native void nativeInit();

    public static native void nativeSetLog2ClientSwitch(boolean z);

    static {
        b.a();
    }

    public static void onNativeCallback_logToLocal(int i, String str) {
        a.a(i, str);
    }
}
