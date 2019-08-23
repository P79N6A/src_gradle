package com.bytedance.ies.sdk.widgets;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class DataCenter$$Lambda$1 implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final DataCenter arg$1;
    private final String arg$2;
    private final Object arg$3;

    DataCenter$$Lambda$1(DataCenter dataCenter, String str, Object obj) {
        this.arg$1 = dataCenter;
        this.arg$2 = str;
        this.arg$3 = obj;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15172, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15172, new Class[0], Void.TYPE);
            return;
        }
        this.arg$1.lambda$put$1$DataCenter(this.arg$2, this.arg$3);
    }
}
