package com.bytedance.android.livesdk.feed.viewmodel;

import android.arch.lifecycle.Observer;
import com.bytedance.android.live.base.model.media.IPlayable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14481a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseFeedDataViewModel f14482b;

    b(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f14482b = baseFeedDataViewModel;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14481a, false, 8998, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14481a, false, 8998, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14482b.n.setValue((IPlayable) obj);
    }
}
