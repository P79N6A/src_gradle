package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;

public final /* synthetic */ class aq implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54348a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54349b;

    aq(MainPageFragment mainPageFragment) {
        this.f54349b = mainPageFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f54348a, false, 57542, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f54348a, false, 57542, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f54349b.lambda$initDataCenter$13$MainPageFragment((a) obj);
    }
}
