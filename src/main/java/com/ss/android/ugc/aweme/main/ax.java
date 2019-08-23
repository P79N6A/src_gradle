package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;

public final /* synthetic */ class ax implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54362a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54363b;

    ax(MainPageFragment mainPageFragment) {
        this.f54363b = mainPageFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f54362a, false, 57549, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f54362a, false, 57549, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f54363b.lambda$initDataCenter$2$MainPageFragment((a) obj);
    }
}
