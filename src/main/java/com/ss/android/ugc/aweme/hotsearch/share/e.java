package com.ss.android.ugc.aweme.hotsearch.share;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49823a;

    /* renamed from: b  reason: collision with root package name */
    private final HotSearchRankingShareDialog f49824b;

    e(HotSearchRankingShareDialog hotSearchRankingShareDialog) {
        this.f49824b = hotSearchRankingShareDialog;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f49823a, false, 49767, new Class[0], Object.class)) {
            return this.f49824b.b();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f49823a, false, 49767, new Class[0], Object.class);
    }
}
