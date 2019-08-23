package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;

public final /* synthetic */ class ap implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54346a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54347b;

    ap(MainPageFragment mainPageFragment) {
        this.f54347b = mainPageFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f54346a, false, 57541, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f54346a, false, 57541, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f54347b.lambda$initDataCenter$12$MainPageFragment((a) obj);
    }
}
