package com.ss.android.ugc.aweme.challenge.model.mixfeed;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ChallengeMixFeedModel$$Lambda$0 implements g {
    static final g $instance = new ChallengeMixFeedModel$$Lambda$0();
    public static ChangeQuickRedirect changeQuickRedirect;

    private ChallengeMixFeedModel$$Lambda$0() {
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, changeQuickRedirect, false, 25851, new Class[]{i.class}, Object.class)) {
            return ChallengeMixFeedModel.lambda$loadChallengeMixFeedList$0$ChallengeMixFeedModel(iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, changeQuickRedirect, false, 25851, new Class[]{i.class}, Object.class);
    }
}
