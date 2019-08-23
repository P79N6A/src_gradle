package com.bytedance.ies.sdk.widgets;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class DataCenter$$Lambda$0 implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final DataCenter arg$1;
    private final Bundle arg$2;

    DataCenter$$Lambda$0(DataCenter dataCenter, Bundle bundle) {
        this.arg$1 = dataCenter;
        this.arg$2 = bundle;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15171, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15171, new Class[0], Void.TYPE);
            return;
        }
        this.arg$1.lambda$put$0$DataCenter(this.arg$2);
    }
}
