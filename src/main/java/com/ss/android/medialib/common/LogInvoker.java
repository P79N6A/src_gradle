package com.ss.android.medialib.common;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ttve.nativePort.b;

@Keep
public class LogInvoker {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static native void nativeSetLogLevel(int i);

    static {
        b.a();
    }

    public static void setLogLevel(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 17072, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 17072, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        nativeSetLogLevel(i);
    }
}
