package com.ss.android.ugc.aweme.services.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class AVPublishServiceImpl$$Lambda$0 implements Callable {
    static final Callable $instance = new AVPublishServiceImpl$$Lambda$0();
    public static ChangeQuickRedirect changeQuickRedirect;

    private AVPublishServiceImpl$$Lambda$0() {
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71616, new Class[0], Object.class)) {
            return AVPublishServiceImpl.lambda$tryRestorePublish$0$AVPublishServiceImpl();
        }
        return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71616, new Class[0], Object.class);
    }
}
