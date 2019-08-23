package com.ss.android.ugc.aweme.sdk.wallet.module.withdraw;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sdk.IWalletService;

public final /* synthetic */ class AliPayAuth$$Lambda$1 implements g {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final IWalletService.a arg$1;

    AliPayAuth$$Lambda$1(IWalletService.a aVar) {
        this.arg$1 = aVar;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, changeQuickRedirect, false, 71076, new Class[]{i.class}, Object.class)) {
            return AliPayAuth.lambda$auth$1$AliPayAuth(this.arg$1, iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, changeQuickRedirect, false, 71076, new Class[]{i.class}, Object.class);
    }
}
