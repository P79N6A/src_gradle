package com.bytedance.android.live.core.paging.viewmodel;

import android.arch.lifecycle.Observer;
import android.arch.paging.PagedList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7982a;

    /* renamed from: b  reason: collision with root package name */
    private final PagingViewModel f7983b;

    c(PagingViewModel pagingViewModel) {
        this.f7983b = pagingViewModel;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7982a, false, 609, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f7982a, false, 609, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f7983b.h.postValue((PagedList) obj);
    }
}
