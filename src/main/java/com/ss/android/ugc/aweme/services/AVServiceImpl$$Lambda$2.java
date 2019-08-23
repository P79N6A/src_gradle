package com.ss.android.ugc.aweme.services;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class AVServiceImpl$$Lambda$2 implements Callable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final AVServiceImpl arg$1;
    private final String arg$2;

    AVServiceImpl$$Lambda$2(AVServiceImpl aVServiceImpl, String str) {
        this.arg$1 = aVServiceImpl;
        this.arg$2 = str;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71255, new Class[0], Object.class)) {
            return this.arg$1.lambda$getMusicWaveBean$2$AVServiceImpl(this.arg$2);
        }
        return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71255, new Class[0], Object.class);
    }
}
