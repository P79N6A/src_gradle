package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;

public final /* synthetic */ class bh implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54586a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54587b;

    bh(MainPageFragment mainPageFragment) {
        this.f54587b = mainPageFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f54586a, false, 57559, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f54586a, false, 57559, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f54587b.lambda$initDataCenter$8$MainPageFragment((a) obj);
    }
}
