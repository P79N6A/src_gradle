package com.bytedance.android.live.core.paging.viewmodel;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7988a;

    /* renamed from: b  reason: collision with root package name */
    private final PagingViewModel f7989b;

    f(PagingViewModel pagingViewModel) {
        this.f7989b = pagingViewModel;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7988a, false, 612, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f7988a, false, 612, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f7989b.g.setValue((Integer) obj);
    }
}
