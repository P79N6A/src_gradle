package com.bytedance.android.live.core.paging.viewmodel;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7986a;

    /* renamed from: b  reason: collision with root package name */
    private final PagingViewModel f7987b;

    e(PagingViewModel pagingViewModel) {
        this.f7987b = pagingViewModel;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7986a, false, 611, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f7986a, false, 611, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f7987b.f7977f.postValue((Boolean) obj);
    }
}
