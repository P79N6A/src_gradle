package com.ss.android.ugc.aweme.discover.hitrank;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42398a;

    /* renamed from: b  reason: collision with root package name */
    private final RankViewModel f42399b;

    /* renamed from: c  reason: collision with root package name */
    private final String f42400c;

    /* renamed from: d  reason: collision with root package name */
    private final String f42401d;

    g(RankViewModel rankViewModel, String str, String str2) {
        this.f42399b = rankViewModel;
        this.f42400c = str;
        this.f42401d = str2;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f42398a, false, 36413, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f42398a, false, 36413, new Class[0], Object.class);
        }
        RankViewModel rankViewModel = this.f42399b;
        return (HitNotice) rankViewModel.f42380c.getActivityInfo(this.f42400c, this.f42401d).get();
    }
}
