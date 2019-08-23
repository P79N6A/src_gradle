package com.ss.android.medialib.log;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ttve.nativePort.b;

@Keep
public class Log2ClientInvoker {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static native void nativeInit();

    public static native void nativeSetLog2ClientSwitch(boolean z);

    static {
        b.a();
    }

    public static void onNativeCallback_logToLocal(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, changeQuickRedirect, true, 17467, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, changeQuickRedirect, true, 17467, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, c.f29690a, true, 17466, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, c.f29690a, true, 17466, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (c.f29691b != null) {
            c.f29691b.a(i, str2);
        }
    }
}
