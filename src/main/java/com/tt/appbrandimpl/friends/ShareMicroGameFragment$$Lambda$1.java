package com.tt.appbrandimpl.friends;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.b;
import java.util.concurrent.Callable;

public final /* synthetic */ class ShareMicroGameFragment$$Lambda$1 implements Callable {
    static final Callable $instance = new ShareMicroGameFragment$$Lambda$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    private ShareMicroGameFragment$$Lambda$1() {
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91930, new Class[0], Object.class)) {
            return b.a().getAllFriends();
        }
        return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91930, new Class[0], Object.class);
    }
}
