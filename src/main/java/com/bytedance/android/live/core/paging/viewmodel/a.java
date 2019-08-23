package com.bytedance.android.live.core.paging.viewmodel;

import android.arch.lifecycle.Observer;
import com.bytedance.android.live.core.network.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7978a;

    /* renamed from: b  reason: collision with root package name */
    private final PagingViewModel f7979b;

    a(PagingViewModel pagingViewModel) {
        this.f7979b = pagingViewModel;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7978a, false, 607, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f7978a, false, 607, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f7979b.f7974c.postValue((d) obj);
    }
}
