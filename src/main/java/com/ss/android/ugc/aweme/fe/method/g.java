package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.zhima.a;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44588a;

    /* renamed from: b  reason: collision with root package name */
    private final ZhimaMethod f44589b;

    g(ZhimaMethod zhimaMethod) {
        this.f44589b = zhimaMethod;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f44588a, false, 39842, new Class[0], Object.class)) {
            return Boolean.valueOf(a.a((Context) this.f44589b.f3130b.get()));
        }
        return PatchProxy.accessDispatch(new Object[0], this, f44588a, false, 39842, new Class[0], Object.class);
    }
}
