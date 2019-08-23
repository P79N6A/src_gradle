package com.bytedance.android.livesdk.feed.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;
import java.util.List;

public final /* synthetic */ class u implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14513a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedTabViewModel f14514b;

    u(FeedTabViewModel feedTabViewModel) {
        this.f14514b = feedTabViewModel;
    }

    public final boolean test(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14513a, false, 9022, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f14513a, false, 9022, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        FeedTabViewModel feedTabViewModel = this.f14514b;
        return !feedTabViewModel.f14467e.a((List) obj, (List) feedTabViewModel.f14464b.getValue());
    }
}
