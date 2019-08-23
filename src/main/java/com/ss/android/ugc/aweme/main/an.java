package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;

public final /* synthetic */ class an implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54342a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54343b;

    an(MainPageFragment mainPageFragment) {
        this.f54343b = mainPageFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f54342a, false, 57539, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f54342a, false, 57539, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f54343b.lambda$initDataCenter$10$MainPageFragment((a) obj);
    }
}
