package com.ss.android.ugc.aweme.services;

import com.google.common.a.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class AVServiceImpl$$Lambda$0 implements s {
    static final s $instance = new AVServiceImpl$$Lambda$0();
    public static ChangeQuickRedirect changeQuickRedirect;

    private AVServiceImpl$$Lambda$0() {
    }

    public final Object get() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71253, new Class[0], Object.class)) {
            return AVServiceImpl.lambda$new$0$AVServiceImpl();
        }
        return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71253, new Class[0], Object.class);
    }
}
