package com.bytedance.android.live.core.paging.viewmodel;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7984a;

    /* renamed from: b  reason: collision with root package name */
    private final PagingViewModel f7985b;

    d(PagingViewModel pagingViewModel) {
        this.f7985b = pagingViewModel;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7984a, false, 610, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f7984a, false, 610, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f7985b.f7976e.postValue((Boolean) obj);
    }
}
