package com.tt.appbrandimpl.friends.viewholder;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.a;

public final /* synthetic */ class GameShareViewHolder$$Lambda$2 implements a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final GameShareViewHolder arg$1;

    GameShareViewHolder$$Lambda$2(GameShareViewHolder gameShareViewHolder) {
        this.arg$1 = gameShareViewHolder;
    }

    public final void run(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 91942, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 91942, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.arg$1.lambda$updateFollowStatus$2$GameShareViewHolder((Boolean) obj);
    }
}
