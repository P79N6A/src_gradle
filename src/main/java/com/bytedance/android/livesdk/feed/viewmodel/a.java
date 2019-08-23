package com.bytedance.android.livesdk.feed.viewmodel;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14479a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseFeedDataViewModel f14480b;

    a(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f14480b = baseFeedDataViewModel;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14479a, false, 8997, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14479a, false, 8997, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14480b.m.setValue((Integer) obj);
    }
}
