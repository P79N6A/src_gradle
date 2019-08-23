package com.ss.android.ugc.aweme.sdk.wallet.module.withdraw;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class AliPayAuth$$Lambda$0 implements Callable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final AliPayAuth arg$1;
    private final Activity arg$2;
    private final String arg$3;

    AliPayAuth$$Lambda$0(AliPayAuth aliPayAuth, Activity activity, String str) {
        this.arg$1 = aliPayAuth;
        this.arg$2 = activity;
        this.arg$3 = str;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71075, new Class[0], Object.class)) {
            return this.arg$1.lambda$auth$0$AliPayAuth(this.arg$2, this.arg$3);
        }
        return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71075, new Class[0], Object.class);
    }
}
