package com.bytedance.android.livesdk.feed.viewmodel;

import android.arch.lifecycle.Observer;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14483a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseFeedDataViewModel f14484b;

    c(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f14484b = baseFeedDataViewModel;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14483a, false, 8999, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14483a, false, 8999, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        BaseFeedDataViewModel baseFeedDataViewModel = this.f14484b;
        if (((BaseFeedRepository.a) obj) == BaseFeedRepository.a.SUCCESS) {
            Integer num = (Integer) baseFeedDataViewModel.p.getValue();
            if (num == null) {
                num = 0;
            }
            baseFeedDataViewModel.p.setValue(Integer.valueOf(num.intValue() + 1));
        }
    }
}
