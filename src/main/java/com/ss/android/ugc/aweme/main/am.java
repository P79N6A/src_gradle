package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;

public final /* synthetic */ class am implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54340a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54341b;

    am(MainPageFragment mainPageFragment) {
        this.f54341b = mainPageFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f54340a, false, 57538, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f54340a, false, 57538, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f54341b.lambda$initDataCenter$1$MainPageFragment((a) obj);
    }
}
