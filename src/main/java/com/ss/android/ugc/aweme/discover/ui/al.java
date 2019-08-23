package com.ss.android.ugc.aweme.discover.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class al implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43122a;

    /* renamed from: b  reason: collision with root package name */
    private final SearchContainerFragment f43123b;

    al(SearchContainerFragment searchContainerFragment) {
        this.f43123b = searchContainerFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43122a, false, 37838, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43122a, false, 37838, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        SearchContainerFragment searchContainerFragment = this.f43123b;
        Integer num = (Integer) obj;
        if (!(num == null || num.intValue() == searchContainerFragment.a())) {
            searchContainerFragment.f3057b.setCurrentItem(num.intValue(), false);
        }
    }
}
