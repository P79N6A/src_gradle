package com.bytedance.android.live.core.paging.viewmodel;

import android.arch.lifecycle.Observer;
import com.bytedance.android.live.core.network.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7980a;

    /* renamed from: b  reason: collision with root package name */
    private final PagingViewModel f7981b;

    b(PagingViewModel pagingViewModel) {
        this.f7981b = pagingViewModel;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7980a, false, 608, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f7980a, false, 608, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f7981b.f7975d.postValue((d) obj);
    }
}
