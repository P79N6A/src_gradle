package com.bytedance.android.livesdk.feed.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14485a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseFeedDataViewModel f14486b;

    d(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f14486b = baseFeedDataViewModel;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14485a, false, 9000, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14485a, false, 9000, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14486b.b((String) obj);
    }
}
