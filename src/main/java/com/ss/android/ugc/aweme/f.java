package com.ss.android.ugc.aweme;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43882a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f43883b = new f();

    private f() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43882a, false, 19418, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43882a, false, 19418, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        AccountUserService.lambda$refreshPassportUserInfo$2$AccountUserService((String) obj);
    }
}
