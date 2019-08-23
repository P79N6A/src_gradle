package com.ss.android.ugc.aweme.fe.method;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.verify.api.ZhimaVerifyApi;
import java.util.concurrent.Callable;

public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44594a;

    /* renamed from: b  reason: collision with root package name */
    static final Callable f44595b = new i();

    private i() {
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f44594a, false, 39844, new Class[0], Object.class)) {
            return ZhimaVerifyApi.a();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f44594a, false, 39844, new Class[0], Object.class);
    }
}
