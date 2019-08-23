package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;

public final /* synthetic */ class bd implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54578a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54579b;

    bd(MainPageFragment mainPageFragment) {
        this.f54579b = mainPageFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f54578a, false, 57555, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f54578a, false, 57555, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f54579b.lambda$initDataCenter$4$MainPageFragment((a) obj);
    }
}
