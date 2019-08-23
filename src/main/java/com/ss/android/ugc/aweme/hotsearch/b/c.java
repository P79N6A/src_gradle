package com.ss.android.ugc.aweme.hotsearch.b;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.hotsearch.api.RankingListApi;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49680a;

    /* renamed from: b  reason: collision with root package name */
    DataCenter f49681b;

    /* renamed from: c  reason: collision with root package name */
    public RankingListApi.API f49682c = RankingListApi.f49668a;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f49680a, false, 49725, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49680a, false, 49725, new Class[0], Void.TYPE);
            return;
        }
        this.f49682c.getHotSearchVideoList().a((g<TResult, TContinuationResult>) new f<TResult,TContinuationResult>(this), i.f1052b);
    }

    public c(DataCenter dataCenter) {
        this.f49681b = dataCenter;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f49680a, false, 49728, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f49680a, false, 49728, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f49682c.getWeeklyList(i).a((g<TResult, TContinuationResult>) new i<TResult,TContinuationResult>(this), i.f1052b);
    }

    public final void b(Integer num, String str) {
        if (PatchProxy.isSupport(new Object[]{num, str}, this, f49680a, false, 49727, new Class[]{Integer.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{num, str}, this, f49680a, false, 49727, new Class[]{Integer.class, String.class}, Void.TYPE);
            return;
        }
        this.f49682c.getHotSearchStarList(num, str).a((g<TResult, TContinuationResult>) new h<TResult,TContinuationResult>(this, str), i.f1052b);
    }

    public final void a(Integer num, String str) {
        if (PatchProxy.isSupport(new Object[]{num, str}, this, f49680a, false, 49726, new Class[]{Integer.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{num, str}, this, f49680a, false, 49726, new Class[]{Integer.class, String.class}, Void.TYPE);
            return;
        }
        this.f49682c.getHotSearchMusicList(num, str).a((g<TResult, TContinuationResult>) new g<TResult,TContinuationResult>(this, str), i.f1052b);
    }
}
