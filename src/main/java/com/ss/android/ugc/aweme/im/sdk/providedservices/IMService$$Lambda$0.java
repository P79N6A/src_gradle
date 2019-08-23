package com.ss.android.ugc.aweme.im.sdk.providedservices;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class IMService$$Lambda$0 implements Callable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String arg$1;

    IMService$$Lambda$0(String str) {
        this.arg$1 = str;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52631, new Class[0], Object.class)) {
            return IMService.lambda$addGroupByPassword$0$IMService(this.arg$1);
        }
        return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52631, new Class[0], Object.class);
    }
}
