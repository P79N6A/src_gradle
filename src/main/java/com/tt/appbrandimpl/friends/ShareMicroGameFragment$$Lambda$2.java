package com.tt.appbrandimpl.friends;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ShareMicroGameFragment$$Lambda$2 implements g {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ShareMicroGameFragment arg$1;

    ShareMicroGameFragment$$Lambda$2(ShareMicroGameFragment shareMicroGameFragment) {
        this.arg$1 = shareMicroGameFragment;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, changeQuickRedirect, false, 91931, new Class[]{i.class}, Object.class)) {
            return this.arg$1.lambda$getIMFollowUsers$2$ShareMicroGameFragment(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, changeQuickRedirect, false, 91931, new Class[]{i.class}, Object.class);
    }
}
