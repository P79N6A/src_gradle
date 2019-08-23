package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;

public final /* synthetic */ class ao implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54344a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54345b;

    ao(MainPageFragment mainPageFragment) {
        this.f54345b = mainPageFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f54344a, false, 57540, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f54344a, false, 57540, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f54345b.lambda$initDataCenter$11$MainPageFragment((a) obj);
    }
}
