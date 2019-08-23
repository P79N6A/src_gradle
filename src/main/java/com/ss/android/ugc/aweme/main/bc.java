package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;

public final /* synthetic */ class bc implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54576a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54577b;

    bc(MainPageFragment mainPageFragment) {
        this.f54577b = mainPageFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f54576a, false, 57554, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f54576a, false, 57554, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f54577b.lambda$initDataCenter$3$MainPageFragment((a) obj);
    }
}
