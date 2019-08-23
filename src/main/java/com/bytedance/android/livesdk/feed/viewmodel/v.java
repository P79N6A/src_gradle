package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.livesdk.feed.d.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class v implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14515a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedTabViewModel f14516b;

    v(FeedTabViewModel feedTabViewModel) {
        this.f14516b = feedTabViewModel;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14515a, false, 9023, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14515a, false, 9023, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        FeedTabViewModel feedTabViewModel = this.f14516b;
        List<g> list = (List) obj;
        feedTabViewModel.f14468f = list;
        feedTabViewModel.f14464b.onNext(list);
    }
}
