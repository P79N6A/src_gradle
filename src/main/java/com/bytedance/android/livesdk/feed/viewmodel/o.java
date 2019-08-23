package com.bytedance.android.livesdk.feed.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class o implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14503a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedTabViewModel f14504b;

    o(FeedTabViewModel feedTabViewModel) {
        this.f14504b = feedTabViewModel;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14503a, false, 9018, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14503a, false, 9018, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        FeedTabViewModel feedTabViewModel = this.f14504b;
        if (PatchProxy.isSupport(new Object[0], feedTabViewModel, FeedTabViewModel.f14463a, false, 9010, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], feedTabViewModel, FeedTabViewModel.f14463a, false, 9010, new Class[0], Void.TYPE);
            return;
        }
        feedTabViewModel.a(feedTabViewModel.f14466d.a().filter(s.f14510b).map(t.f14512b).filter(new u(feedTabViewModel)).observeOn(AndroidSchedulers.mainThread()).subscribe(new v(feedTabViewModel), n.f14502b));
    }
}
