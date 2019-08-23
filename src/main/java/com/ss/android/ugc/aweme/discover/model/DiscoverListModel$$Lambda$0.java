package com.ss.android.ugc.aweme.discover.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class DiscoverListModel$$Lambda$0 implements g {
    static final g $instance = new DiscoverListModel$$Lambda$0();
    public static ChangeQuickRedirect changeQuickRedirect;

    private DiscoverListModel$$Lambda$0() {
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, changeQuickRedirect, false, 37030, new Class[]{i.class}, Object.class)) {
            return DiscoverListModel.lambda$loadList$0$DiscoverListModel(iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, changeQuickRedirect, false, 37030, new Class[]{i.class}, Object.class);
    }
}
