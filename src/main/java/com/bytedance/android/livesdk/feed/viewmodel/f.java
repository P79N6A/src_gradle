package com.bytedance.android.livesdk.feed.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14488a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseFeedDataViewModel f14489b;

    f(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f14489b = baseFeedDataViewModel;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14488a, false, 9001, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14488a, false, 9001, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        BaseFeedDataViewModel baseFeedDataViewModel = this.f14489b;
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list}, baseFeedDataViewModel, BaseFeedDataViewModel.f14455a, false, 8988, new Class[]{List.class}, Void.TYPE)) {
            BaseFeedDataViewModel baseFeedDataViewModel2 = baseFeedDataViewModel;
            PatchProxy.accessDispatch(new Object[]{list}, baseFeedDataViewModel2, BaseFeedDataViewModel.f14455a, false, 8988, new Class[]{List.class}, Void.TYPE);
            return;
        }
        baseFeedDataViewModel.q.setValue(list);
    }
}
