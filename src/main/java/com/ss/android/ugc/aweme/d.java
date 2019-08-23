package com.ss.android.ugc.aweme;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41031a;

    /* renamed from: b  reason: collision with root package name */
    static final Callable f41032b = new d();

    private d() {
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f41031a, false, 19416, new Class[0], Object.class)) {
            return AccountUserService.lambda$refreshPassportUserInfo$0$AccountUserService();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f41031a, false, 19416, new Class[0], Object.class);
    }
}
