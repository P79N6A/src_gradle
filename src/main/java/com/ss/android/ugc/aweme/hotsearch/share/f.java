package com.ss.android.ugc.aweme.hotsearch.share;

import a.g;
import a.i;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49825a;

    /* renamed from: b  reason: collision with root package name */
    private final HotSearchRankingShareDialog f49826b;

    /* renamed from: c  reason: collision with root package name */
    private final a f49827c;

    f(HotSearchRankingShareDialog hotSearchRankingShareDialog, a aVar) {
        this.f49826b = hotSearchRankingShareDialog;
        this.f49827c = aVar;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f49825a, false, 49768, new Class[]{i.class}, Object.class)) {
            return this.f49826b.a(this.f49827c);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f49825a, false, 49768, new Class[]{i.class}, Object.class);
    }
}
