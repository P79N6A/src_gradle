package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14491a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseFeedDataViewModel f14492b;

    h(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f14492b = baseFeedDataViewModel;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14491a, false, 9002, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14491a, false, 9002, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14492b.r.setValue((BaseFeedRepository.a) obj);
    }
}
