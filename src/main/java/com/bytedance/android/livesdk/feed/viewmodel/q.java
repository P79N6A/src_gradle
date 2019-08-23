package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.livesdk.feed.d.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class q implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14506a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedTabViewModel f14507b;

    q(FeedTabViewModel feedTabViewModel) {
        this.f14507b = feedTabViewModel;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14506a, false, 9019, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14506a, false, 9019, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        FeedTabViewModel feedTabViewModel = this.f14507b;
        long longValue = ((Long) obj).longValue();
        if (PatchProxy.isSupport(new Object[]{new Long(longValue)}, feedTabViewModel, FeedTabViewModel.f14463a, false, 9013, new Class[]{Long.TYPE}, Void.TYPE)) {
            FeedTabViewModel feedTabViewModel2 = feedTabViewModel;
            PatchProxy.accessDispatch(new Object[]{new Long(longValue)}, feedTabViewModel2, FeedTabViewModel.f14463a, false, 9013, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (feedTabViewModel.f14468f == null) {
            feedTabViewModel.h = longValue;
        } else {
            for (int i = 0; i < feedTabViewModel.f14468f.size(); i++) {
                g gVar = feedTabViewModel.f14468f.get(i);
                if (gVar != null && gVar.f14080b == longValue) {
                    feedTabViewModel.g = i;
                    feedTabViewModel.f14465c.onNext(Integer.valueOf(i));
                }
            }
        }
    }
}
