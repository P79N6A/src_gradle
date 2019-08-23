package com.ss.android.ugc.aweme.profile.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class SelelctCityModel$$Lambda$0 implements Callable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final boolean arg$1;

    SelelctCityModel$$Lambda$0(boolean z) {
        this.arg$1 = z;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 67507, new Class[0], Object.class)) {
            return SelelctCityModel.lambda$uploadLocation$0$SelelctCityModel(this.arg$1);
        }
        return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 67507, new Class[0], Object.class);
    }
}
