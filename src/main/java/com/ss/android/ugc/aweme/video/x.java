package com.ss.android.ugc.aweme.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class x implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76279a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoBitRateABManager f76280b;

    x(VideoBitRateABManager videoBitRateABManager) {
        this.f76280b = videoBitRateABManager;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f76279a, false, 89055, new Class[0], Object.class)) {
            return this.f76280b.d();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f76279a, false, 89055, new Class[0], Object.class);
    }
}
