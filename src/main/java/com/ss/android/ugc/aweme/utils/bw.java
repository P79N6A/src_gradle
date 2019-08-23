package com.ss.android.ugc.aweme.utils;

import com.bytedance.ies.geckoclient.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.Callable;

public final /* synthetic */ class bw implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75644a;

    /* renamed from: b  reason: collision with root package name */
    static final Callable f75645b = new bw();

    private bw() {
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f75644a, false, 88340, new Class[0], Object.class)) {
            return (f) ServiceManager.get().getService(f.class);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f75644a, false, 88340, new Class[0], Object.class);
    }
}
