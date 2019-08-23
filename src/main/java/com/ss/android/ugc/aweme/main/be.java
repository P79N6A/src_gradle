package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;

public final /* synthetic */ class be implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54580a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54581b;

    be(MainPageFragment mainPageFragment) {
        this.f54581b = mainPageFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f54580a, false, 57556, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f54580a, false, 57556, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f54581b.lambda$initDataCenter$5$MainPageFragment((a) obj);
    }
}
