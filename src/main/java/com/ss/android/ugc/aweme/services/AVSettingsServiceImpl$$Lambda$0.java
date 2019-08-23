package com.ss.android.ugc.aweme.services;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.a;
import java.util.concurrent.Callable;

public final /* synthetic */ class AVSettingsServiceImpl$$Lambda$0 implements Callable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final a arg$1;

    AVSettingsServiceImpl$$Lambda$0(a aVar) {
        this.arg$1 = aVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71317, new Class[0], Object.class)) {
            return AVSettingsServiceImpl.lambda$asynMonitorAwemeSetting$0$AVSettingsServiceImpl(this.arg$1);
        }
        return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71317, new Class[0], Object.class);
    }
}
