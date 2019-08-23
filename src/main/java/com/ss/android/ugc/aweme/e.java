package com.ss.android.ugc.aweme;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class e implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43500a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f43501b = new e();

    private e() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f43500a, false, 19417, new Class[]{Object.class}, Object.class)) {
            return AccountUserService.lambda$refreshPassportUserInfo$1$AccountUserService((Throwable) obj);
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f43500a, false, 19417, new Class[]{Object.class}, Object.class);
    }
}
