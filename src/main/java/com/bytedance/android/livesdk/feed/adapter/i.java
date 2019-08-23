package com.bytedance.android.livesdk.feed.adapter;

import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class i implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13976a;

    /* renamed from: b  reason: collision with root package name */
    private final c f13977b;

    public i(c cVar) {
        this.f13977b = cVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13976a, false, 8500, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13976a, false, 8500, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c cVar = this.f13977b;
        if (PatchProxy.isSupport(new Object[0], cVar, c.f13952a, false, 8494, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cVar, c.f13952a, false, 8494, new Class[0], Void.TYPE);
            return;
        }
        cVar.m = false;
        if (cVar.f13955d != null) {
            BaseFeedDataViewModel baseFeedDataViewModel = cVar.f13955d;
            if (PatchProxy.isSupport(new Object[]{null, "feed_loadmore"}, baseFeedDataViewModel, BaseFeedDataViewModel.f14455a, false, 8995, new Class[]{String.class, String.class}, Void.TYPE)) {
                BaseFeedDataViewModel baseFeedDataViewModel2 = baseFeedDataViewModel;
                PatchProxy.accessDispatch(new Object[]{null, "feed_loadmore"}, baseFeedDataViewModel2, BaseFeedDataViewModel.f14455a, false, 8995, new Class[]{String.class, String.class}, Void.TYPE);
            } else if (baseFeedDataViewModel.l != null) {
                baseFeedDataViewModel.l.a(null, "feed_loadmore");
            }
        }
    }
}
